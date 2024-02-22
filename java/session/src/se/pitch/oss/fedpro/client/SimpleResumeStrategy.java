/*
 *  Copyright (C) 2022 Pitch Technologies AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package se.pitch.oss.fedpro.client;

/**
 * This resume strategy keeps trying to resume a dropped session at a fixed interval, up to a specified limit.
 */
public class SimpleResumeStrategy implements ResumeStrategy {

   private final long _reconnectDelayMillis;
   private final long _reconnectLimitMillis;

   public SimpleResumeStrategy(
         long reconnectDelayMillis,
         long reconnectLimitMillis)
   {
      _reconnectDelayMillis = reconnectDelayMillis;
      _reconnectLimitMillis = reconnectLimitMillis;
   }

   @Override
   public boolean shouldRetry(long timeSinceDisconnectMillis)
   {
      return timeSinceDisconnectMillis < _reconnectLimitMillis;
   }

   @Override
   public long getRetryDelay(long timeSinceDisconnectMillis)
   {
      return _reconnectDelayMillis;
   }

   @Override
   public long getRetryLimitMillis()
   {
      return _reconnectLimitMillis;
   }
}

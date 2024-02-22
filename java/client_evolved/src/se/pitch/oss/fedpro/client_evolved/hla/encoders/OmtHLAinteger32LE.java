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

package se.pitch.oss.fedpro.client_evolved.hla.encoders;

import hla.rti1516e.encoding.ByteWrapper;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.encoding.HLAinteger32LE;

class OmtHLAinteger32LE extends AbstractDataElement implements HLAinteger32LE {
   private int _value;

   OmtHLAinteger32LE()
   {
      _value = 0;
   }

   OmtHLAinteger32LE(int value)
   {
      _value = value;
   }

   public int getOctetBoundary()
   {
      return 4;
   }

   /**
    * @noinspection PointlessBitwiseExpression
    */
   public void encode(ByteWrapper byteWrapper)
   throws EncoderException
   {
      try {
         byteWrapper.align(getOctetBoundary());
         final int value = _value;
         byteWrapper.put((value >>> 0) & 0xFF);
         byteWrapper.put((value >>> 8) & 0xFF);
         byteWrapper.put((value >>> 16) & 0xFF);
         byteWrapper.put((value >>> 24) & 0xFF);
      } catch (ArrayIndexOutOfBoundsException e) {
         throw new EncoderException("Failed to encode HLAinteger32LE");
      }
   }

   public int getEncodedLength()
   {
      return 4;
   }

   /**
    * @noinspection PointlessBitwiseExpression
    */
   public void decode(ByteWrapper byteWrapper)
   throws DecoderException
   {
      try {
         byteWrapper.align(getOctetBoundary());
         int value = 0;
         value += (short) byteWrapper.get() << 0;
         value += (short) byteWrapper.get() << 8;
         value += (short) byteWrapper.get() << 16;
         value += (short) byteWrapper.get() << 24;
         _value = value;
      } catch (ArrayIndexOutOfBoundsException e) {
         throw new DecoderException("Failed to decode HLAinteger32LE", e);
      }
   }

   public int getValue()
   {
      return _value;
   }

   public void setValue(int value)
   {
      _value = value;
   }

   /**
    * @noinspection RedundantIfStatement
    */
   @Override
   public boolean equals(Object o)
   {
      if (this == o) {
         return true;
      }
      if (!(o instanceof OmtHLAinteger32LE)) {
         return false;
      }

      final OmtHLAinteger32LE other = (OmtHLAinteger32LE) o;

      if (_value != other._value) {
         return false;
      }

      return true;
   }

   @Override
   public int hashCode()
   {
      return _value;
   }

   @Override
   public String toString()
   {
      return "HLAinteger32LE<" + _value + ">";
   }
}

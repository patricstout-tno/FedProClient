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

package se.pitch.oss.fedpro.client.hla.encoders;

import hla.rti1516_202X.encoding.ByteWrapper;
import hla.rti1516_202X.encoding.DecoderException;
import hla.rti1516_202X.encoding.EncoderException;
import hla.rti1516_202X.encoding.HLAunsignedInteger16LE;

class OmtHLAunsignedInteger16LE extends AbstractDataElement implements HLAunsignedInteger16LE {
   private short _value;

   OmtHLAunsignedInteger16LE(short value)
   {
      _value = value;
   }

   OmtHLAunsignedInteger16LE()
   {
      _value = 0;
   }

   public int getOctetBoundary()
   {
      return 2;
   }

   /**
    * @noinspection PointlessBitwiseExpression
    */
   public void encode(ByteWrapper byteWrapper)
   throws EncoderException
   {
      try {
         byteWrapper.align(getOctetBoundary());
         byteWrapper.put((_value >>> 0) & 0xFF);
         byteWrapper.put((_value >>> 8) & 0xFF);
      } catch (ArrayIndexOutOfBoundsException e) {
         throw new EncoderException("Failed to encode HLAinteger16LE");
      }
   }

   public int getEncodedLength()
   {
      return 2;
   }

   /**
    * @noinspection PointlessBitwiseExpression
    */
   public final HLAunsignedInteger16LE decode(ByteWrapper byteWrapper)
   throws DecoderException
   {
      try {
         byteWrapper.align(getOctetBoundary());
         short value = 0;
         value += (short) byteWrapper.get() << 0;
         value += (short) byteWrapper.get() << 8;
         _value = value;
      } catch (ArrayIndexOutOfBoundsException e) {
         throw new DecoderException("Failed to decode HLAinteger16LE", e);
      }
      return this;
   }

   @Override
   public HLAunsignedInteger16LE decode(byte[] bytes)
   throws DecoderException
   {
      super.decode(bytes);
      return this;
   }

   public short getValue()
   {
      return _value;
   }

   public HLAunsignedInteger16LE setValue(short value)
   {
      _value = value;
      return this;
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
      if (!(o instanceof OmtHLAunsignedInteger16LE)) {
         return false;
      }

      final OmtHLAunsignedInteger16LE omtHLAinteger16LE = (OmtHLAunsignedInteger16LE) o;

      if (_value != omtHLAinteger16LE._value) {
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
      return "HLAinteger16LE<" + _value + ">";
   }
}

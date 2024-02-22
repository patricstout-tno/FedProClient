/*
 * The IEEE hereby grants a general, royalty-free license to copy, distribute,
 * display and make derivative works from this material, for all purposes,
 * provided that any use of the material contains the following
 * attribution: "Reprinted with permission from IEEE 1516.1(TM)-202X".
 * Should you require additional information, contact the Manager, Standards
 * Intellectual Property, IEEE Standards Association (stds-ipr@ieee.org).
 */

package hla.rti1516_202X.encoding;

/**
 * Interface provided by all HLA data elements.
 */
public interface DataElement {
   /**
    * Returns the octet boundary of this element.
    *
    * @return the octet boundary of this element
    */
   int getOctetBoundary();

   /**
    * Encodes this element into the specified ByteWrapper.
    *
    * @param byteWrapper destination for the encoded element
    *
    * @throws EncoderException if the element can not be encoded
    */
   void encode(ByteWrapper byteWrapper)
      throws EncoderException;

   /**
    * Returns a ByteWrapper with this element encoded.
    *
    * @return  byteWrapper with encoded element
    *
    * @throws EncoderException if the element can not be encoded
    */
   ByteWrapper encode()
      throws EncoderException;

   /**
    * Returns the size in bytes of this element's encoding.
    *
    * @return the size in bytes of this element's encoding
    *
    * @throws EncoderException if the element can not be encoded
    */
   int getEncodedLength()
      throws EncoderException;

   /**
    * Returns a byte array with this element encoded.
    *
    * @return byte array with encoded element
    *
    * @throws EncoderException if the element can not be encoded
    */
   byte[] toByteArray()
      throws EncoderException;

   /**
    * Decodes this element from the ByteWrapper.
    *
    * @param byteWrapper source for the decoding of this element
    *
    * @throws DecoderException if the element can not be decoded
    */
   DataElement decode(ByteWrapper byteWrapper)
      throws DecoderException;

   /**
    * Decodes this element from the byte array.
    *
    * @param bytes source for the decoding of this element
    * 
    * @throws DecoderException if the element can not be decoded
    */
   DataElement decode(byte[] bytes)
      throws DecoderException;
}

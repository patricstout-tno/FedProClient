// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RTIambassador.proto

package hla.rti1516_202X.fedpro;

public interface UpdateAttributeValuesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_202X.fedpro.UpdateAttributeValuesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   * @return Whether the objectInstance field is set.
   */
  boolean hasObjectInstance();
  /**
   * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   * @return The objectInstance.
   */
  hla.rti1516_202X.fedpro.ObjectInstanceHandle getObjectInstance();
  /**
   * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   */
  hla.rti1516_202X.fedpro.ObjectInstanceHandleOrBuilder getObjectInstanceOrBuilder();

  /**
   * <code>.rti1516_202X.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
   * @return Whether the attributeValues field is set.
   */
  boolean hasAttributeValues();
  /**
   * <code>.rti1516_202X.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
   * @return The attributeValues.
   */
  hla.rti1516_202X.fedpro.AttributeHandleValueMap getAttributeValues();
  /**
   * <code>.rti1516_202X.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
   */
  hla.rti1516_202X.fedpro.AttributeHandleValueMapOrBuilder getAttributeValuesOrBuilder();

  /**
   * <code>bytes userSuppliedTag = 3;</code>
   * @return The userSuppliedTag.
   */
  com.google.protobuf.ByteString getUserSuppliedTag();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RTIambassador.proto

package hla.rti1516_202X.fedpro;

public interface RequestClassAttributeValueUpdateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_202X.fedpro.RequestClassAttributeValueUpdateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
   * @return Whether the objectClass field is set.
   */
  boolean hasObjectClass();
  /**
   * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
   * @return The objectClass.
   */
  hla.rti1516_202X.fedpro.ObjectClassHandle getObjectClass();
  /**
   * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
   */
  hla.rti1516_202X.fedpro.ObjectClassHandleOrBuilder getObjectClassOrBuilder();

  /**
   * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
   * @return Whether the attributes field is set.
   */
  boolean hasAttributes();
  /**
   * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
   * @return The attributes.
   */
  hla.rti1516_202X.fedpro.AttributeHandleSet getAttributes();
  /**
   * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
   */
  hla.rti1516_202X.fedpro.AttributeHandleSetOrBuilder getAttributesOrBuilder();

  /**
   * <code>bytes userSuppliedTag = 3;</code>
   * @return The userSuppliedTag.
   */
  com.google.protobuf.ByteString getUserSuppliedTag();
}
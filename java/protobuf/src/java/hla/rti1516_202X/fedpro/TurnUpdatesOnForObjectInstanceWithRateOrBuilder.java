// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FederateAmbassador.proto

package hla.rti1516_202X.fedpro;

public interface TurnUpdatesOnForObjectInstanceWithRateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_202X.fedpro.TurnUpdatesOnForObjectInstanceWithRate)
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
   * <code>string updateRateDesignator = 3;</code>
   * @return The updateRateDesignator.
   */
  java.lang.String getUpdateRateDesignator();
  /**
   * <code>string updateRateDesignator = 3;</code>
   * @return The bytes for updateRateDesignator.
   */
  com.google.protobuf.ByteString
      getUpdateRateDesignatorBytes();
}
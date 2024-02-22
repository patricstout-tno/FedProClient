// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FederateAmbassador.proto

package hla.rti1516_202X.fedpro;

public interface DiscoverObjectInstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_202X.fedpro.DiscoverObjectInstance)
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
   * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 2;</code>
   * @return Whether the objectClass field is set.
   */
  boolean hasObjectClass();
  /**
   * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 2;</code>
   * @return The objectClass.
   */
  hla.rti1516_202X.fedpro.ObjectClassHandle getObjectClass();
  /**
   * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 2;</code>
   */
  hla.rti1516_202X.fedpro.ObjectClassHandleOrBuilder getObjectClassOrBuilder();

  /**
   * <code>string objectInstanceName = 3;</code>
   * @return The objectInstanceName.
   */
  java.lang.String getObjectInstanceName();
  /**
   * <code>string objectInstanceName = 3;</code>
   * @return The bytes for objectInstanceName.
   */
  com.google.protobuf.ByteString
      getObjectInstanceNameBytes();

  /**
   * <code>.rti1516_202X.fedpro.FederateHandle producingFederate = 4;</code>
   * @return Whether the producingFederate field is set.
   */
  boolean hasProducingFederate();
  /**
   * <code>.rti1516_202X.fedpro.FederateHandle producingFederate = 4;</code>
   * @return The producingFederate.
   */
  hla.rti1516_202X.fedpro.FederateHandle getProducingFederate();
  /**
   * <code>.rti1516_202X.fedpro.FederateHandle producingFederate = 4;</code>
   */
  hla.rti1516_202X.fedpro.FederateHandleOrBuilder getProducingFederateOrBuilder();
}

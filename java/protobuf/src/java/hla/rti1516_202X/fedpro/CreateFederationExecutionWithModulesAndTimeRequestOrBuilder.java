// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RTIambassador.proto

package hla.rti1516_202X.fedpro;

public interface CreateFederationExecutionWithModulesAndTimeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_202X.fedpro.CreateFederationExecutionWithModulesAndTimeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string federationName = 1;</code>
   * @return The federationName.
   */
  java.lang.String getFederationName();
  /**
   * <code>string federationName = 1;</code>
   * @return The bytes for federationName.
   */
  com.google.protobuf.ByteString
      getFederationNameBytes();

  /**
   * <code>.rti1516_202X.fedpro.FomModuleSet fomModules = 2;</code>
   * @return Whether the fomModules field is set.
   */
  boolean hasFomModules();
  /**
   * <code>.rti1516_202X.fedpro.FomModuleSet fomModules = 2;</code>
   * @return The fomModules.
   */
  hla.rti1516_202X.fedpro.FomModuleSet getFomModules();
  /**
   * <code>.rti1516_202X.fedpro.FomModuleSet fomModules = 2;</code>
   */
  hla.rti1516_202X.fedpro.FomModuleSetOrBuilder getFomModulesOrBuilder();

  /**
   * <code>string logicalTimeImplementationName = 3;</code>
   * @return The logicalTimeImplementationName.
   */
  java.lang.String getLogicalTimeImplementationName();
  /**
   * <code>string logicalTimeImplementationName = 3;</code>
   * @return The bytes for logicalTimeImplementationName.
   */
  com.google.protobuf.ByteString
      getLogicalTimeImplementationNameBytes();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RTIambassador.proto

package hla.rti1516_202X.fedpro;

public interface SendInteractionWithRegionsAndTimeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_202X.fedpro.SendInteractionWithRegionsAndTimeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
   * @return Whether the interactionClass field is set.
   */
  boolean hasInteractionClass();
  /**
   * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
   * @return The interactionClass.
   */
  hla.rti1516_202X.fedpro.InteractionClassHandle getInteractionClass();
  /**
   * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
   */
  hla.rti1516_202X.fedpro.InteractionClassHandleOrBuilder getInteractionClassOrBuilder();

  /**
   * <code>.rti1516_202X.fedpro.ParameterHandleValueMap parameterValues = 2;</code>
   * @return Whether the parameterValues field is set.
   */
  boolean hasParameterValues();
  /**
   * <code>.rti1516_202X.fedpro.ParameterHandleValueMap parameterValues = 2;</code>
   * @return The parameterValues.
   */
  hla.rti1516_202X.fedpro.ParameterHandleValueMap getParameterValues();
  /**
   * <code>.rti1516_202X.fedpro.ParameterHandleValueMap parameterValues = 2;</code>
   */
  hla.rti1516_202X.fedpro.ParameterHandleValueMapOrBuilder getParameterValuesOrBuilder();

  /**
   * <code>.rti1516_202X.fedpro.RegionHandleSet regions = 3;</code>
   * @return Whether the regions field is set.
   */
  boolean hasRegions();
  /**
   * <code>.rti1516_202X.fedpro.RegionHandleSet regions = 3;</code>
   * @return The regions.
   */
  hla.rti1516_202X.fedpro.RegionHandleSet getRegions();
  /**
   * <code>.rti1516_202X.fedpro.RegionHandleSet regions = 3;</code>
   */
  hla.rti1516_202X.fedpro.RegionHandleSetOrBuilder getRegionsOrBuilder();

  /**
   * <code>bytes userSuppliedTag = 4;</code>
   * @return The userSuppliedTag.
   */
  com.google.protobuf.ByteString getUserSuppliedTag();

  /**
   * <code>.rti1516_202X.fedpro.LogicalTime time = 5;</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.rti1516_202X.fedpro.LogicalTime time = 5;</code>
   * @return The time.
   */
  hla.rti1516_202X.fedpro.LogicalTime getTime();
  /**
   * <code>.rti1516_202X.fedpro.LogicalTime time = 5;</code>
   */
  hla.rti1516_202X.fedpro.LogicalTimeOrBuilder getTimeOrBuilder();
}

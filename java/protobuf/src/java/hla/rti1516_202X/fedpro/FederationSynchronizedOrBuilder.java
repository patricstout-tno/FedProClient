// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FederateAmbassador.proto

package hla.rti1516_202X.fedpro;

public interface FederationSynchronizedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_202X.fedpro.FederationSynchronized)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string synchronizationPointLabel = 1;</code>
   * @return The synchronizationPointLabel.
   */
  java.lang.String getSynchronizationPointLabel();
  /**
   * <code>string synchronizationPointLabel = 1;</code>
   * @return The bytes for synchronizationPointLabel.
   */
  com.google.protobuf.ByteString
      getSynchronizationPointLabelBytes();

  /**
   * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
   * @return Whether the failedToSyncSet field is set.
   */
  boolean hasFailedToSyncSet();
  /**
   * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
   * @return The failedToSyncSet.
   */
  hla.rti1516_202X.fedpro.FederateHandleSet getFailedToSyncSet();
  /**
   * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
   */
  hla.rti1516_202X.fedpro.FederateHandleSetOrBuilder getFailedToSyncSetOrBuilder();
}

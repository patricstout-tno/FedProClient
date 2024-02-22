// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RTIambassador.proto

package hla.rti1516_202X.fedpro;

/**
 * Protobuf type {@code rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest}
 */
public final class RegisterFederationSynchronizationPointWithSetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest)
    RegisterFederationSynchronizationPointWithSetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisterFederationSynchronizationPointWithSetRequest.newBuilder() to construct.
  private RegisterFederationSynchronizationPointWithSetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterFederationSynchronizationPointWithSetRequest() {
    synchronizationPointLabel_ = "";
    userSuppliedTag_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegisterFederationSynchronizationPointWithSetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_RegisterFederationSynchronizationPointWithSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_RegisterFederationSynchronizationPointWithSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest.class, hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest.Builder.class);
  }

  public static final int SYNCHRONIZATIONPOINTLABEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object synchronizationPointLabel_;
  /**
   * <code>string synchronizationPointLabel = 1;</code>
   * @return The synchronizationPointLabel.
   */
  @java.lang.Override
  public java.lang.String getSynchronizationPointLabel() {
    java.lang.Object ref = synchronizationPointLabel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      synchronizationPointLabel_ = s;
      return s;
    }
  }
  /**
   * <code>string synchronizationPointLabel = 1;</code>
   * @return The bytes for synchronizationPointLabel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSynchronizationPointLabelBytes() {
    java.lang.Object ref = synchronizationPointLabel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      synchronizationPointLabel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERSUPPLIEDTAG_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString userSuppliedTag_;
  /**
   * <code>bytes userSuppliedTag = 2;</code>
   * @return The userSuppliedTag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUserSuppliedTag() {
    return userSuppliedTag_;
  }

  public static final int SYNCHRONIZATIONSET_FIELD_NUMBER = 3;
  private hla.rti1516_202X.fedpro.FederateHandleSet synchronizationSet_;
  /**
   * <code>.rti1516_202X.fedpro.FederateHandleSet synchronizationSet = 3;</code>
   * @return Whether the synchronizationSet field is set.
   */
  @java.lang.Override
  public boolean hasSynchronizationSet() {
    return synchronizationSet_ != null;
  }
  /**
   * <code>.rti1516_202X.fedpro.FederateHandleSet synchronizationSet = 3;</code>
   * @return The synchronizationSet.
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.FederateHandleSet getSynchronizationSet() {
    return synchronizationSet_ == null ? hla.rti1516_202X.fedpro.FederateHandleSet.getDefaultInstance() : synchronizationSet_;
  }
  /**
   * <code>.rti1516_202X.fedpro.FederateHandleSet synchronizationSet = 3;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.FederateHandleSetOrBuilder getSynchronizationSetOrBuilder() {
    return getSynchronizationSet();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(synchronizationPointLabel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, synchronizationPointLabel_);
    }
    if (!userSuppliedTag_.isEmpty()) {
      output.writeBytes(2, userSuppliedTag_);
    }
    if (synchronizationSet_ != null) {
      output.writeMessage(3, getSynchronizationSet());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(synchronizationPointLabel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, synchronizationPointLabel_);
    }
    if (!userSuppliedTag_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, userSuppliedTag_);
    }
    if (synchronizationSet_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSynchronizationSet());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest other = (hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest) obj;

    if (!getSynchronizationPointLabel()
        .equals(other.getSynchronizationPointLabel())) return false;
    if (!getUserSuppliedTag()
        .equals(other.getUserSuppliedTag())) return false;
    if (hasSynchronizationSet() != other.hasSynchronizationSet()) return false;
    if (hasSynchronizationSet()) {
      if (!getSynchronizationSet()
          .equals(other.getSynchronizationSet())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SYNCHRONIZATIONPOINTLABEL_FIELD_NUMBER;
    hash = (53 * hash) + getSynchronizationPointLabel().hashCode();
    hash = (37 * hash) + USERSUPPLIEDTAG_FIELD_NUMBER;
    hash = (53 * hash) + getUserSuppliedTag().hashCode();
    if (hasSynchronizationSet()) {
      hash = (37 * hash) + SYNCHRONIZATIONSET_FIELD_NUMBER;
      hash = (53 * hash) + getSynchronizationSet().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest)
      hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_RegisterFederationSynchronizationPointWithSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_RegisterFederationSynchronizationPointWithSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest.class, hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      synchronizationPointLabel_ = "";

      userSuppliedTag_ = com.google.protobuf.ByteString.EMPTY;

      if (synchronizationSetBuilder_ == null) {
        synchronizationSet_ = null;
      } else {
        synchronizationSet_ = null;
        synchronizationSetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_RegisterFederationSynchronizationPointWithSetRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest build() {
      hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest buildPartial() {
      hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest result = new hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest(this);
      result.synchronizationPointLabel_ = synchronizationPointLabel_;
      result.userSuppliedTag_ = userSuppliedTag_;
      if (synchronizationSetBuilder_ == null) {
        result.synchronizationSet_ = synchronizationSet_;
      } else {
        result.synchronizationSet_ = synchronizationSetBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest) {
        return mergeFrom((hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest other) {
      if (other == hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest.getDefaultInstance()) return this;
      if (!other.getSynchronizationPointLabel().isEmpty()) {
        synchronizationPointLabel_ = other.synchronizationPointLabel_;
        onChanged();
      }
      if (other.getUserSuppliedTag() != com.google.protobuf.ByteString.EMPTY) {
        setUserSuppliedTag(other.getUserSuppliedTag());
      }
      if (other.hasSynchronizationSet()) {
        mergeSynchronizationSet(other.getSynchronizationSet());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              synchronizationPointLabel_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              userSuppliedTag_ = input.readBytes();

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getSynchronizationSetFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object synchronizationPointLabel_ = "";
    /**
     * <code>string synchronizationPointLabel = 1;</code>
     * @return The synchronizationPointLabel.
     */
    public java.lang.String getSynchronizationPointLabel() {
      java.lang.Object ref = synchronizationPointLabel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        synchronizationPointLabel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string synchronizationPointLabel = 1;</code>
     * @return The bytes for synchronizationPointLabel.
     */
    public com.google.protobuf.ByteString
        getSynchronizationPointLabelBytes() {
      java.lang.Object ref = synchronizationPointLabel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        synchronizationPointLabel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string synchronizationPointLabel = 1;</code>
     * @param value The synchronizationPointLabel to set.
     * @return This builder for chaining.
     */
    public Builder setSynchronizationPointLabel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      synchronizationPointLabel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string synchronizationPointLabel = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSynchronizationPointLabel() {
      
      synchronizationPointLabel_ = getDefaultInstance().getSynchronizationPointLabel();
      onChanged();
      return this;
    }
    /**
     * <code>string synchronizationPointLabel = 1;</code>
     * @param value The bytes for synchronizationPointLabel to set.
     * @return This builder for chaining.
     */
    public Builder setSynchronizationPointLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      synchronizationPointLabel_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString userSuppliedTag_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes userSuppliedTag = 2;</code>
     * @return The userSuppliedTag.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getUserSuppliedTag() {
      return userSuppliedTag_;
    }
    /**
     * <code>bytes userSuppliedTag = 2;</code>
     * @param value The userSuppliedTag to set.
     * @return This builder for chaining.
     */
    public Builder setUserSuppliedTag(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userSuppliedTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes userSuppliedTag = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserSuppliedTag() {
      
      userSuppliedTag_ = getDefaultInstance().getUserSuppliedTag();
      onChanged();
      return this;
    }

    private hla.rti1516_202X.fedpro.FederateHandleSet synchronizationSet_;
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.FederateHandleSet, hla.rti1516_202X.fedpro.FederateHandleSet.Builder, hla.rti1516_202X.fedpro.FederateHandleSetOrBuilder> synchronizationSetBuilder_;
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet synchronizationSet = 3;</code>
     * @return Whether the synchronizationSet field is set.
     */
    public boolean hasSynchronizationSet() {
      return synchronizationSetBuilder_ != null || synchronizationSet_ != null;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet synchronizationSet = 3;</code>
     * @return The synchronizationSet.
     */
    public hla.rti1516_202X.fedpro.FederateHandleSet getSynchronizationSet() {
      if (synchronizationSetBuilder_ == null) {
        return synchronizationSet_ == null ? hla.rti1516_202X.fedpro.FederateHandleSet.getDefaultInstance() : synchronizationSet_;
      } else {
        return synchronizationSetBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet synchronizationSet = 3;</code>
     */
    public Builder setSynchronizationSet(hla.rti1516_202X.fedpro.FederateHandleSet value) {
      if (synchronizationSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        synchronizationSet_ = value;
        onChanged();
      } else {
        synchronizationSetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet synchronizationSet = 3;</code>
     */
    public Builder setSynchronizationSet(
        hla.rti1516_202X.fedpro.FederateHandleSet.Builder builderForValue) {
      if (synchronizationSetBuilder_ == null) {
        synchronizationSet_ = builderForValue.build();
        onChanged();
      } else {
        synchronizationSetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet synchronizationSet = 3;</code>
     */
    public Builder mergeSynchronizationSet(hla.rti1516_202X.fedpro.FederateHandleSet value) {
      if (synchronizationSetBuilder_ == null) {
        if (synchronizationSet_ != null) {
          synchronizationSet_ =
            hla.rti1516_202X.fedpro.FederateHandleSet.newBuilder(synchronizationSet_).mergeFrom(value).buildPartial();
        } else {
          synchronizationSet_ = value;
        }
        onChanged();
      } else {
        synchronizationSetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet synchronizationSet = 3;</code>
     */
    public Builder clearSynchronizationSet() {
      if (synchronizationSetBuilder_ == null) {
        synchronizationSet_ = null;
        onChanged();
      } else {
        synchronizationSet_ = null;
        synchronizationSetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet synchronizationSet = 3;</code>
     */
    public hla.rti1516_202X.fedpro.FederateHandleSet.Builder getSynchronizationSetBuilder() {
      
      onChanged();
      return getSynchronizationSetFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet synchronizationSet = 3;</code>
     */
    public hla.rti1516_202X.fedpro.FederateHandleSetOrBuilder getSynchronizationSetOrBuilder() {
      if (synchronizationSetBuilder_ != null) {
        return synchronizationSetBuilder_.getMessageOrBuilder();
      } else {
        return synchronizationSet_ == null ?
            hla.rti1516_202X.fedpro.FederateHandleSet.getDefaultInstance() : synchronizationSet_;
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet synchronizationSet = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.FederateHandleSet, hla.rti1516_202X.fedpro.FederateHandleSet.Builder, hla.rti1516_202X.fedpro.FederateHandleSetOrBuilder> 
        getSynchronizationSetFieldBuilder() {
      if (synchronizationSetBuilder_ == null) {
        synchronizationSetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            hla.rti1516_202X.fedpro.FederateHandleSet, hla.rti1516_202X.fedpro.FederateHandleSet.Builder, hla.rti1516_202X.fedpro.FederateHandleSetOrBuilder>(
                getSynchronizationSet(),
                getParentForChildren(),
                isClean());
        synchronizationSet_ = null;
      }
      return synchronizationSetBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest)
  private static final hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest();
  }

  public static hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterFederationSynchronizationPointWithSetRequest>
      PARSER = new com.google.protobuf.AbstractParser<RegisterFederationSynchronizationPointWithSetRequest>() {
    @java.lang.Override
    public RegisterFederationSynchronizationPointWithSetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RegisterFederationSynchronizationPointWithSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterFederationSynchronizationPointWithSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.RegisterFederationSynchronizationPointWithSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

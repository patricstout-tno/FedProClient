// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FederateAmbassador.proto

package hla.rti1516_202X.fedpro;

/**
 * Protobuf type {@code rti1516_202X.fedpro.FederationSynchronized}
 */
public final class FederationSynchronized extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.FederationSynchronized)
    FederationSynchronizedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FederationSynchronized.newBuilder() to construct.
  private FederationSynchronized(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FederationSynchronized() {
    synchronizationPointLabel_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FederationSynchronized();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_FederationSynchronized_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_FederationSynchronized_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.FederationSynchronized.class, hla.rti1516_202X.fedpro.FederationSynchronized.Builder.class);
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

  public static final int FAILEDTOSYNCSET_FIELD_NUMBER = 2;
  private hla.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet_;
  /**
   * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
   * @return Whether the failedToSyncSet field is set.
   */
  @java.lang.Override
  public boolean hasFailedToSyncSet() {
    return failedToSyncSet_ != null;
  }
  /**
   * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
   * @return The failedToSyncSet.
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.FederateHandleSet getFailedToSyncSet() {
    return failedToSyncSet_ == null ? hla.rti1516_202X.fedpro.FederateHandleSet.getDefaultInstance() : failedToSyncSet_;
  }
  /**
   * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.FederateHandleSetOrBuilder getFailedToSyncSetOrBuilder() {
    return getFailedToSyncSet();
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
    if (failedToSyncSet_ != null) {
      output.writeMessage(2, getFailedToSyncSet());
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
    if (failedToSyncSet_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFailedToSyncSet());
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
    if (!(obj instanceof hla.rti1516_202X.fedpro.FederationSynchronized)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.FederationSynchronized other = (hla.rti1516_202X.fedpro.FederationSynchronized) obj;

    if (!getSynchronizationPointLabel()
        .equals(other.getSynchronizationPointLabel())) return false;
    if (hasFailedToSyncSet() != other.hasFailedToSyncSet()) return false;
    if (hasFailedToSyncSet()) {
      if (!getFailedToSyncSet()
          .equals(other.getFailedToSyncSet())) return false;
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
    if (hasFailedToSyncSet()) {
      hash = (37 * hash) + FAILEDTOSYNCSET_FIELD_NUMBER;
      hash = (53 * hash) + getFailedToSyncSet().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.FederationSynchronized parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.FederationSynchronized parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederationSynchronized parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.FederationSynchronized parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederationSynchronized parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.FederationSynchronized parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederationSynchronized parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.FederationSynchronized parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederationSynchronized parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.FederationSynchronized parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederationSynchronized parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.FederationSynchronized parseFrom(
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
  public static Builder newBuilder(hla.rti1516_202X.fedpro.FederationSynchronized prototype) {
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
   * Protobuf type {@code rti1516_202X.fedpro.FederationSynchronized}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.FederationSynchronized)
      hla.rti1516_202X.fedpro.FederationSynchronizedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_FederationSynchronized_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_FederationSynchronized_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.FederationSynchronized.class, hla.rti1516_202X.fedpro.FederationSynchronized.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.FederationSynchronized.newBuilder()
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

      if (failedToSyncSetBuilder_ == null) {
        failedToSyncSet_ = null;
      } else {
        failedToSyncSet_ = null;
        failedToSyncSetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_FederationSynchronized_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.FederationSynchronized getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.FederationSynchronized.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.FederationSynchronized build() {
      hla.rti1516_202X.fedpro.FederationSynchronized result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.FederationSynchronized buildPartial() {
      hla.rti1516_202X.fedpro.FederationSynchronized result = new hla.rti1516_202X.fedpro.FederationSynchronized(this);
      result.synchronizationPointLabel_ = synchronizationPointLabel_;
      if (failedToSyncSetBuilder_ == null) {
        result.failedToSyncSet_ = failedToSyncSet_;
      } else {
        result.failedToSyncSet_ = failedToSyncSetBuilder_.build();
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
      if (other instanceof hla.rti1516_202X.fedpro.FederationSynchronized) {
        return mergeFrom((hla.rti1516_202X.fedpro.FederationSynchronized)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.FederationSynchronized other) {
      if (other == hla.rti1516_202X.fedpro.FederationSynchronized.getDefaultInstance()) return this;
      if (!other.getSynchronizationPointLabel().isEmpty()) {
        synchronizationPointLabel_ = other.synchronizationPointLabel_;
        onChanged();
      }
      if (other.hasFailedToSyncSet()) {
        mergeFailedToSyncSet(other.getFailedToSyncSet());
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
              input.readMessage(
                  getFailedToSyncSetFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
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

    private hla.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet_;
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.FederateHandleSet, hla.rti1516_202X.fedpro.FederateHandleSet.Builder, hla.rti1516_202X.fedpro.FederateHandleSetOrBuilder> failedToSyncSetBuilder_;
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     * @return Whether the failedToSyncSet field is set.
     */
    public boolean hasFailedToSyncSet() {
      return failedToSyncSetBuilder_ != null || failedToSyncSet_ != null;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     * @return The failedToSyncSet.
     */
    public hla.rti1516_202X.fedpro.FederateHandleSet getFailedToSyncSet() {
      if (failedToSyncSetBuilder_ == null) {
        return failedToSyncSet_ == null ? hla.rti1516_202X.fedpro.FederateHandleSet.getDefaultInstance() : failedToSyncSet_;
      } else {
        return failedToSyncSetBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    public Builder setFailedToSyncSet(hla.rti1516_202X.fedpro.FederateHandleSet value) {
      if (failedToSyncSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        failedToSyncSet_ = value;
        onChanged();
      } else {
        failedToSyncSetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    public Builder setFailedToSyncSet(
        hla.rti1516_202X.fedpro.FederateHandleSet.Builder builderForValue) {
      if (failedToSyncSetBuilder_ == null) {
        failedToSyncSet_ = builderForValue.build();
        onChanged();
      } else {
        failedToSyncSetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    public Builder mergeFailedToSyncSet(hla.rti1516_202X.fedpro.FederateHandleSet value) {
      if (failedToSyncSetBuilder_ == null) {
        if (failedToSyncSet_ != null) {
          failedToSyncSet_ =
            hla.rti1516_202X.fedpro.FederateHandleSet.newBuilder(failedToSyncSet_).mergeFrom(value).buildPartial();
        } else {
          failedToSyncSet_ = value;
        }
        onChanged();
      } else {
        failedToSyncSetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    public Builder clearFailedToSyncSet() {
      if (failedToSyncSetBuilder_ == null) {
        failedToSyncSet_ = null;
        onChanged();
      } else {
        failedToSyncSet_ = null;
        failedToSyncSetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    public hla.rti1516_202X.fedpro.FederateHandleSet.Builder getFailedToSyncSetBuilder() {
      
      onChanged();
      return getFailedToSyncSetFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    public hla.rti1516_202X.fedpro.FederateHandleSetOrBuilder getFailedToSyncSetOrBuilder() {
      if (failedToSyncSetBuilder_ != null) {
        return failedToSyncSetBuilder_.getMessageOrBuilder();
      } else {
        return failedToSyncSet_ == null ?
            hla.rti1516_202X.fedpro.FederateHandleSet.getDefaultInstance() : failedToSyncSet_;
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.FederateHandleSet, hla.rti1516_202X.fedpro.FederateHandleSet.Builder, hla.rti1516_202X.fedpro.FederateHandleSetOrBuilder> 
        getFailedToSyncSetFieldBuilder() {
      if (failedToSyncSetBuilder_ == null) {
        failedToSyncSetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            hla.rti1516_202X.fedpro.FederateHandleSet, hla.rti1516_202X.fedpro.FederateHandleSet.Builder, hla.rti1516_202X.fedpro.FederateHandleSetOrBuilder>(
                getFailedToSyncSet(),
                getParentForChildren(),
                isClean());
        failedToSyncSet_ = null;
      }
      return failedToSyncSetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.FederationSynchronized)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.FederationSynchronized)
  private static final hla.rti1516_202X.fedpro.FederationSynchronized DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.FederationSynchronized();
  }

  public static hla.rti1516_202X.fedpro.FederationSynchronized getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FederationSynchronized>
      PARSER = new com.google.protobuf.AbstractParser<FederationSynchronized>() {
    @java.lang.Override
    public FederationSynchronized parsePartialFrom(
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

  public static com.google.protobuf.Parser<FederationSynchronized> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FederationSynchronized> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.FederationSynchronized getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datatypes.proto

package hla.rti1516_202X.fedpro;

/**
 * Protobuf type {@code rti1516_202X.fedpro.FederateRestoreStatusArray}
 */
public final class FederateRestoreStatusArray extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.FederateRestoreStatusArray)
    FederateRestoreStatusArrayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FederateRestoreStatusArray.newBuilder() to construct.
  private FederateRestoreStatusArray(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FederateRestoreStatusArray() {
    federateRestoreStatus_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FederateRestoreStatusArray();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FederateRestoreStatusArray_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FederateRestoreStatusArray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.FederateRestoreStatusArray.class, hla.rti1516_202X.fedpro.FederateRestoreStatusArray.Builder.class);
  }

  public static final int FEDERATERESTORESTATUS_FIELD_NUMBER = 1;
  private java.util.List<hla.rti1516_202X.fedpro.FederateRestoreStatus> federateRestoreStatus_;
  /**
   * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
   */
  @java.lang.Override
  public java.util.List<hla.rti1516_202X.fedpro.FederateRestoreStatus> getFederateRestoreStatusList() {
    return federateRestoreStatus_;
  }
  /**
   * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends hla.rti1516_202X.fedpro.FederateRestoreStatusOrBuilder> 
      getFederateRestoreStatusOrBuilderList() {
    return federateRestoreStatus_;
  }
  /**
   * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
   */
  @java.lang.Override
  public int getFederateRestoreStatusCount() {
    return federateRestoreStatus_.size();
  }
  /**
   * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.FederateRestoreStatus getFederateRestoreStatus(int index) {
    return federateRestoreStatus_.get(index);
  }
  /**
   * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.FederateRestoreStatusOrBuilder getFederateRestoreStatusOrBuilder(
      int index) {
    return federateRestoreStatus_.get(index);
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
    for (int i = 0; i < federateRestoreStatus_.size(); i++) {
      output.writeMessage(1, federateRestoreStatus_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < federateRestoreStatus_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, federateRestoreStatus_.get(i));
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
    if (!(obj instanceof hla.rti1516_202X.fedpro.FederateRestoreStatusArray)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.FederateRestoreStatusArray other = (hla.rti1516_202X.fedpro.FederateRestoreStatusArray) obj;

    if (!getFederateRestoreStatusList()
        .equals(other.getFederateRestoreStatusList())) return false;
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
    if (getFederateRestoreStatusCount() > 0) {
      hash = (37 * hash) + FEDERATERESTORESTATUS_FIELD_NUMBER;
      hash = (53 * hash) + getFederateRestoreStatusList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.FederateRestoreStatusArray parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.FederateRestoreStatusArray parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederateRestoreStatusArray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.FederateRestoreStatusArray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederateRestoreStatusArray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.FederateRestoreStatusArray parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederateRestoreStatusArray parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.FederateRestoreStatusArray parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederateRestoreStatusArray parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.FederateRestoreStatusArray parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederateRestoreStatusArray parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.FederateRestoreStatusArray parseFrom(
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
  public static Builder newBuilder(hla.rti1516_202X.fedpro.FederateRestoreStatusArray prototype) {
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
   * Protobuf type {@code rti1516_202X.fedpro.FederateRestoreStatusArray}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.FederateRestoreStatusArray)
      hla.rti1516_202X.fedpro.FederateRestoreStatusArrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FederateRestoreStatusArray_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FederateRestoreStatusArray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.FederateRestoreStatusArray.class, hla.rti1516_202X.fedpro.FederateRestoreStatusArray.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.FederateRestoreStatusArray.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (federateRestoreStatusBuilder_ == null) {
        federateRestoreStatus_ = java.util.Collections.emptyList();
      } else {
        federateRestoreStatus_ = null;
        federateRestoreStatusBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FederateRestoreStatusArray_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.FederateRestoreStatusArray getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.FederateRestoreStatusArray.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.FederateRestoreStatusArray build() {
      hla.rti1516_202X.fedpro.FederateRestoreStatusArray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.FederateRestoreStatusArray buildPartial() {
      hla.rti1516_202X.fedpro.FederateRestoreStatusArray result = new hla.rti1516_202X.fedpro.FederateRestoreStatusArray(this);
      int from_bitField0_ = bitField0_;
      if (federateRestoreStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          federateRestoreStatus_ = java.util.Collections.unmodifiableList(federateRestoreStatus_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.federateRestoreStatus_ = federateRestoreStatus_;
      } else {
        result.federateRestoreStatus_ = federateRestoreStatusBuilder_.build();
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
      if (other instanceof hla.rti1516_202X.fedpro.FederateRestoreStatusArray) {
        return mergeFrom((hla.rti1516_202X.fedpro.FederateRestoreStatusArray)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.FederateRestoreStatusArray other) {
      if (other == hla.rti1516_202X.fedpro.FederateRestoreStatusArray.getDefaultInstance()) return this;
      if (federateRestoreStatusBuilder_ == null) {
        if (!other.federateRestoreStatus_.isEmpty()) {
          if (federateRestoreStatus_.isEmpty()) {
            federateRestoreStatus_ = other.federateRestoreStatus_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFederateRestoreStatusIsMutable();
            federateRestoreStatus_.addAll(other.federateRestoreStatus_);
          }
          onChanged();
        }
      } else {
        if (!other.federateRestoreStatus_.isEmpty()) {
          if (federateRestoreStatusBuilder_.isEmpty()) {
            federateRestoreStatusBuilder_.dispose();
            federateRestoreStatusBuilder_ = null;
            federateRestoreStatus_ = other.federateRestoreStatus_;
            bitField0_ = (bitField0_ & ~0x00000001);
            federateRestoreStatusBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFederateRestoreStatusFieldBuilder() : null;
          } else {
            federateRestoreStatusBuilder_.addAllMessages(other.federateRestoreStatus_);
          }
        }
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
              hla.rti1516_202X.fedpro.FederateRestoreStatus m =
                  input.readMessage(
                      hla.rti1516_202X.fedpro.FederateRestoreStatus.parser(),
                      extensionRegistry);
              if (federateRestoreStatusBuilder_ == null) {
                ensureFederateRestoreStatusIsMutable();
                federateRestoreStatus_.add(m);
              } else {
                federateRestoreStatusBuilder_.addMessage(m);
              }
              break;
            } // case 10
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
    private int bitField0_;

    private java.util.List<hla.rti1516_202X.fedpro.FederateRestoreStatus> federateRestoreStatus_ =
      java.util.Collections.emptyList();
    private void ensureFederateRestoreStatusIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        federateRestoreStatus_ = new java.util.ArrayList<hla.rti1516_202X.fedpro.FederateRestoreStatus>(federateRestoreStatus_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        hla.rti1516_202X.fedpro.FederateRestoreStatus, hla.rti1516_202X.fedpro.FederateRestoreStatus.Builder, hla.rti1516_202X.fedpro.FederateRestoreStatusOrBuilder> federateRestoreStatusBuilder_;

    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public java.util.List<hla.rti1516_202X.fedpro.FederateRestoreStatus> getFederateRestoreStatusList() {
      if (federateRestoreStatusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(federateRestoreStatus_);
      } else {
        return federateRestoreStatusBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public int getFederateRestoreStatusCount() {
      if (federateRestoreStatusBuilder_ == null) {
        return federateRestoreStatus_.size();
      } else {
        return federateRestoreStatusBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public hla.rti1516_202X.fedpro.FederateRestoreStatus getFederateRestoreStatus(int index) {
      if (federateRestoreStatusBuilder_ == null) {
        return federateRestoreStatus_.get(index);
      } else {
        return federateRestoreStatusBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public Builder setFederateRestoreStatus(
        int index, hla.rti1516_202X.fedpro.FederateRestoreStatus value) {
      if (federateRestoreStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFederateRestoreStatusIsMutable();
        federateRestoreStatus_.set(index, value);
        onChanged();
      } else {
        federateRestoreStatusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public Builder setFederateRestoreStatus(
        int index, hla.rti1516_202X.fedpro.FederateRestoreStatus.Builder builderForValue) {
      if (federateRestoreStatusBuilder_ == null) {
        ensureFederateRestoreStatusIsMutable();
        federateRestoreStatus_.set(index, builderForValue.build());
        onChanged();
      } else {
        federateRestoreStatusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public Builder addFederateRestoreStatus(hla.rti1516_202X.fedpro.FederateRestoreStatus value) {
      if (federateRestoreStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFederateRestoreStatusIsMutable();
        federateRestoreStatus_.add(value);
        onChanged();
      } else {
        federateRestoreStatusBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public Builder addFederateRestoreStatus(
        int index, hla.rti1516_202X.fedpro.FederateRestoreStatus value) {
      if (federateRestoreStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFederateRestoreStatusIsMutable();
        federateRestoreStatus_.add(index, value);
        onChanged();
      } else {
        federateRestoreStatusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public Builder addFederateRestoreStatus(
        hla.rti1516_202X.fedpro.FederateRestoreStatus.Builder builderForValue) {
      if (federateRestoreStatusBuilder_ == null) {
        ensureFederateRestoreStatusIsMutable();
        federateRestoreStatus_.add(builderForValue.build());
        onChanged();
      } else {
        federateRestoreStatusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public Builder addFederateRestoreStatus(
        int index, hla.rti1516_202X.fedpro.FederateRestoreStatus.Builder builderForValue) {
      if (federateRestoreStatusBuilder_ == null) {
        ensureFederateRestoreStatusIsMutable();
        federateRestoreStatus_.add(index, builderForValue.build());
        onChanged();
      } else {
        federateRestoreStatusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public Builder addAllFederateRestoreStatus(
        java.lang.Iterable<? extends hla.rti1516_202X.fedpro.FederateRestoreStatus> values) {
      if (federateRestoreStatusBuilder_ == null) {
        ensureFederateRestoreStatusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, federateRestoreStatus_);
        onChanged();
      } else {
        federateRestoreStatusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public Builder clearFederateRestoreStatus() {
      if (federateRestoreStatusBuilder_ == null) {
        federateRestoreStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        federateRestoreStatusBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public Builder removeFederateRestoreStatus(int index) {
      if (federateRestoreStatusBuilder_ == null) {
        ensureFederateRestoreStatusIsMutable();
        federateRestoreStatus_.remove(index);
        onChanged();
      } else {
        federateRestoreStatusBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public hla.rti1516_202X.fedpro.FederateRestoreStatus.Builder getFederateRestoreStatusBuilder(
        int index) {
      return getFederateRestoreStatusFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public hla.rti1516_202X.fedpro.FederateRestoreStatusOrBuilder getFederateRestoreStatusOrBuilder(
        int index) {
      if (federateRestoreStatusBuilder_ == null) {
        return federateRestoreStatus_.get(index);  } else {
        return federateRestoreStatusBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public java.util.List<? extends hla.rti1516_202X.fedpro.FederateRestoreStatusOrBuilder> 
         getFederateRestoreStatusOrBuilderList() {
      if (federateRestoreStatusBuilder_ != null) {
        return federateRestoreStatusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(federateRestoreStatus_);
      }
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public hla.rti1516_202X.fedpro.FederateRestoreStatus.Builder addFederateRestoreStatusBuilder() {
      return getFederateRestoreStatusFieldBuilder().addBuilder(
          hla.rti1516_202X.fedpro.FederateRestoreStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public hla.rti1516_202X.fedpro.FederateRestoreStatus.Builder addFederateRestoreStatusBuilder(
        int index) {
      return getFederateRestoreStatusFieldBuilder().addBuilder(
          index, hla.rti1516_202X.fedpro.FederateRestoreStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FederateRestoreStatus federateRestoreStatus = 1;</code>
     */
    public java.util.List<hla.rti1516_202X.fedpro.FederateRestoreStatus.Builder> 
         getFederateRestoreStatusBuilderList() {
      return getFederateRestoreStatusFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        hla.rti1516_202X.fedpro.FederateRestoreStatus, hla.rti1516_202X.fedpro.FederateRestoreStatus.Builder, hla.rti1516_202X.fedpro.FederateRestoreStatusOrBuilder> 
        getFederateRestoreStatusFieldBuilder() {
      if (federateRestoreStatusBuilder_ == null) {
        federateRestoreStatusBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            hla.rti1516_202X.fedpro.FederateRestoreStatus, hla.rti1516_202X.fedpro.FederateRestoreStatus.Builder, hla.rti1516_202X.fedpro.FederateRestoreStatusOrBuilder>(
                federateRestoreStatus_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        federateRestoreStatus_ = null;
      }
      return federateRestoreStatusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.FederateRestoreStatusArray)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.FederateRestoreStatusArray)
  private static final hla.rti1516_202X.fedpro.FederateRestoreStatusArray DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.FederateRestoreStatusArray();
  }

  public static hla.rti1516_202X.fedpro.FederateRestoreStatusArray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FederateRestoreStatusArray>
      PARSER = new com.google.protobuf.AbstractParser<FederateRestoreStatusArray>() {
    @java.lang.Override
    public FederateRestoreStatusArray parsePartialFrom(
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

  public static com.google.protobuf.Parser<FederateRestoreStatusArray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FederateRestoreStatusArray> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.FederateRestoreStatusArray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


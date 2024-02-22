// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datatypes.proto

package hla.rti1516_202X.fedpro;

/**
 * Protobuf type {@code rti1516_202X.fedpro.FederateHandleSaveStatusPair}
 */
public final class FederateHandleSaveStatusPair extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.FederateHandleSaveStatusPair)
    FederateHandleSaveStatusPairOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FederateHandleSaveStatusPair.newBuilder() to construct.
  private FederateHandleSaveStatusPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FederateHandleSaveStatusPair() {
    saveStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FederateHandleSaveStatusPair();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FederateHandleSaveStatusPair_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FederateHandleSaveStatusPair_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair.class, hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair.Builder.class);
  }

  public static final int FEDERATEHANDLE_FIELD_NUMBER = 1;
  private hla.rti1516_202X.fedpro.FederateHandle federateHandle_;
  /**
   * <code>.rti1516_202X.fedpro.FederateHandle federateHandle = 1;</code>
   * @return Whether the federateHandle field is set.
   */
  @java.lang.Override
  public boolean hasFederateHandle() {
    return federateHandle_ != null;
  }
  /**
   * <code>.rti1516_202X.fedpro.FederateHandle federateHandle = 1;</code>
   * @return The federateHandle.
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.FederateHandle getFederateHandle() {
    return federateHandle_ == null ? hla.rti1516_202X.fedpro.FederateHandle.getDefaultInstance() : federateHandle_;
  }
  /**
   * <code>.rti1516_202X.fedpro.FederateHandle federateHandle = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.FederateHandleOrBuilder getFederateHandleOrBuilder() {
    return getFederateHandle();
  }

  public static final int SAVESTATUS_FIELD_NUMBER = 2;
  private int saveStatus_;
  /**
   * <code>.rti1516_202X.fedpro.SaveStatus saveStatus = 2;</code>
   * @return The enum numeric value on the wire for saveStatus.
   */
  @java.lang.Override public int getSaveStatusValue() {
    return saveStatus_;
  }
  /**
   * <code>.rti1516_202X.fedpro.SaveStatus saveStatus = 2;</code>
   * @return The saveStatus.
   */
  @java.lang.Override public hla.rti1516_202X.fedpro.SaveStatus getSaveStatus() {
    @SuppressWarnings("deprecation")
    hla.rti1516_202X.fedpro.SaveStatus result = hla.rti1516_202X.fedpro.SaveStatus.valueOf(saveStatus_);
    return result == null ? hla.rti1516_202X.fedpro.SaveStatus.UNRECOGNIZED : result;
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
    if (federateHandle_ != null) {
      output.writeMessage(1, getFederateHandle());
    }
    if (saveStatus_ != hla.rti1516_202X.fedpro.SaveStatus.NO_SAVE_IN_PROGRESS.getNumber()) {
      output.writeEnum(2, saveStatus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (federateHandle_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFederateHandle());
    }
    if (saveStatus_ != hla.rti1516_202X.fedpro.SaveStatus.NO_SAVE_IN_PROGRESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, saveStatus_);
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
    if (!(obj instanceof hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair other = (hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair) obj;

    if (hasFederateHandle() != other.hasFederateHandle()) return false;
    if (hasFederateHandle()) {
      if (!getFederateHandle()
          .equals(other.getFederateHandle())) return false;
    }
    if (saveStatus_ != other.saveStatus_) return false;
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
    if (hasFederateHandle()) {
      hash = (37 * hash) + FEDERATEHANDLE_FIELD_NUMBER;
      hash = (53 * hash) + getFederateHandle().hashCode();
    }
    hash = (37 * hash) + SAVESTATUS_FIELD_NUMBER;
    hash = (53 * hash) + saveStatus_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair parseFrom(
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
  public static Builder newBuilder(hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair prototype) {
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
   * Protobuf type {@code rti1516_202X.fedpro.FederateHandleSaveStatusPair}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.FederateHandleSaveStatusPair)
      hla.rti1516_202X.fedpro.FederateHandleSaveStatusPairOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FederateHandleSaveStatusPair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FederateHandleSaveStatusPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair.class, hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (federateHandleBuilder_ == null) {
        federateHandle_ = null;
      } else {
        federateHandle_ = null;
        federateHandleBuilder_ = null;
      }
      saveStatus_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FederateHandleSaveStatusPair_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair build() {
      hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair buildPartial() {
      hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair result = new hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair(this);
      if (federateHandleBuilder_ == null) {
        result.federateHandle_ = federateHandle_;
      } else {
        result.federateHandle_ = federateHandleBuilder_.build();
      }
      result.saveStatus_ = saveStatus_;
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
      if (other instanceof hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair) {
        return mergeFrom((hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair other) {
      if (other == hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair.getDefaultInstance()) return this;
      if (other.hasFederateHandle()) {
        mergeFederateHandle(other.getFederateHandle());
      }
      if (other.saveStatus_ != 0) {
        setSaveStatusValue(other.getSaveStatusValue());
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
              input.readMessage(
                  getFederateHandleFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 16: {
              saveStatus_ = input.readEnum();

              break;
            } // case 16
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

    private hla.rti1516_202X.fedpro.FederateHandle federateHandle_;
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.FederateHandle, hla.rti1516_202X.fedpro.FederateHandle.Builder, hla.rti1516_202X.fedpro.FederateHandleOrBuilder> federateHandleBuilder_;
    /**
     * <code>.rti1516_202X.fedpro.FederateHandle federateHandle = 1;</code>
     * @return Whether the federateHandle field is set.
     */
    public boolean hasFederateHandle() {
      return federateHandleBuilder_ != null || federateHandle_ != null;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandle federateHandle = 1;</code>
     * @return The federateHandle.
     */
    public hla.rti1516_202X.fedpro.FederateHandle getFederateHandle() {
      if (federateHandleBuilder_ == null) {
        return federateHandle_ == null ? hla.rti1516_202X.fedpro.FederateHandle.getDefaultInstance() : federateHandle_;
      } else {
        return federateHandleBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public Builder setFederateHandle(hla.rti1516_202X.fedpro.FederateHandle value) {
      if (federateHandleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        federateHandle_ = value;
        onChanged();
      } else {
        federateHandleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public Builder setFederateHandle(
        hla.rti1516_202X.fedpro.FederateHandle.Builder builderForValue) {
      if (federateHandleBuilder_ == null) {
        federateHandle_ = builderForValue.build();
        onChanged();
      } else {
        federateHandleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public Builder mergeFederateHandle(hla.rti1516_202X.fedpro.FederateHandle value) {
      if (federateHandleBuilder_ == null) {
        if (federateHandle_ != null) {
          federateHandle_ =
            hla.rti1516_202X.fedpro.FederateHandle.newBuilder(federateHandle_).mergeFrom(value).buildPartial();
        } else {
          federateHandle_ = value;
        }
        onChanged();
      } else {
        federateHandleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public Builder clearFederateHandle() {
      if (federateHandleBuilder_ == null) {
        federateHandle_ = null;
        onChanged();
      } else {
        federateHandle_ = null;
        federateHandleBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public hla.rti1516_202X.fedpro.FederateHandle.Builder getFederateHandleBuilder() {
      
      onChanged();
      return getFederateHandleFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public hla.rti1516_202X.fedpro.FederateHandleOrBuilder getFederateHandleOrBuilder() {
      if (federateHandleBuilder_ != null) {
        return federateHandleBuilder_.getMessageOrBuilder();
      } else {
        return federateHandle_ == null ?
            hla.rti1516_202X.fedpro.FederateHandle.getDefaultInstance() : federateHandle_;
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.FederateHandle federateHandle = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.FederateHandle, hla.rti1516_202X.fedpro.FederateHandle.Builder, hla.rti1516_202X.fedpro.FederateHandleOrBuilder> 
        getFederateHandleFieldBuilder() {
      if (federateHandleBuilder_ == null) {
        federateHandleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            hla.rti1516_202X.fedpro.FederateHandle, hla.rti1516_202X.fedpro.FederateHandle.Builder, hla.rti1516_202X.fedpro.FederateHandleOrBuilder>(
                getFederateHandle(),
                getParentForChildren(),
                isClean());
        federateHandle_ = null;
      }
      return federateHandleBuilder_;
    }

    private int saveStatus_ = 0;
    /**
     * <code>.rti1516_202X.fedpro.SaveStatus saveStatus = 2;</code>
     * @return The enum numeric value on the wire for saveStatus.
     */
    @java.lang.Override public int getSaveStatusValue() {
      return saveStatus_;
    }
    /**
     * <code>.rti1516_202X.fedpro.SaveStatus saveStatus = 2;</code>
     * @param value The enum numeric value on the wire for saveStatus to set.
     * @return This builder for chaining.
     */
    public Builder setSaveStatusValue(int value) {
      
      saveStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.SaveStatus saveStatus = 2;</code>
     * @return The saveStatus.
     */
    @java.lang.Override
    public hla.rti1516_202X.fedpro.SaveStatus getSaveStatus() {
      @SuppressWarnings("deprecation")
      hla.rti1516_202X.fedpro.SaveStatus result = hla.rti1516_202X.fedpro.SaveStatus.valueOf(saveStatus_);
      return result == null ? hla.rti1516_202X.fedpro.SaveStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.rti1516_202X.fedpro.SaveStatus saveStatus = 2;</code>
     * @param value The saveStatus to set.
     * @return This builder for chaining.
     */
    public Builder setSaveStatus(hla.rti1516_202X.fedpro.SaveStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      saveStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.SaveStatus saveStatus = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSaveStatus() {
      
      saveStatus_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.FederateHandleSaveStatusPair)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.FederateHandleSaveStatusPair)
  private static final hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair();
  }

  public static hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FederateHandleSaveStatusPair>
      PARSER = new com.google.protobuf.AbstractParser<FederateHandleSaveStatusPair>() {
    @java.lang.Override
    public FederateHandleSaveStatusPair parsePartialFrom(
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

  public static com.google.protobuf.Parser<FederateHandleSaveStatusPair> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FederateHandleSaveStatusPair> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.FederateHandleSaveStatusPair getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


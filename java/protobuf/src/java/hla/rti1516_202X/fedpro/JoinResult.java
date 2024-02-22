// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datatypes.proto

package hla.rti1516_202X.fedpro;

/**
 * Protobuf type {@code rti1516_202X.fedpro.JoinResult}
 */
public final class JoinResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.JoinResult)
    JoinResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JoinResult.newBuilder() to construct.
  private JoinResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JoinResult() {
    logicalTimeImplementationName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JoinResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_JoinResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_JoinResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.JoinResult.class, hla.rti1516_202X.fedpro.JoinResult.Builder.class);
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

  public static final int LOGICALTIMEIMPLEMENTATIONNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object logicalTimeImplementationName_;
  /**
   * <code>string logicalTimeImplementationName = 2;</code>
   * @return The logicalTimeImplementationName.
   */
  @java.lang.Override
  public java.lang.String getLogicalTimeImplementationName() {
    java.lang.Object ref = logicalTimeImplementationName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logicalTimeImplementationName_ = s;
      return s;
    }
  }
  /**
   * <code>string logicalTimeImplementationName = 2;</code>
   * @return The bytes for logicalTimeImplementationName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLogicalTimeImplementationNameBytes() {
    java.lang.Object ref = logicalTimeImplementationName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logicalTimeImplementationName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logicalTimeImplementationName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, logicalTimeImplementationName_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logicalTimeImplementationName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, logicalTimeImplementationName_);
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
    if (!(obj instanceof hla.rti1516_202X.fedpro.JoinResult)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.JoinResult other = (hla.rti1516_202X.fedpro.JoinResult) obj;

    if (hasFederateHandle() != other.hasFederateHandle()) return false;
    if (hasFederateHandle()) {
      if (!getFederateHandle()
          .equals(other.getFederateHandle())) return false;
    }
    if (!getLogicalTimeImplementationName()
        .equals(other.getLogicalTimeImplementationName())) return false;
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
    hash = (37 * hash) + LOGICALTIMEIMPLEMENTATIONNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLogicalTimeImplementationName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.JoinResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.JoinResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.JoinResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.JoinResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.JoinResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.JoinResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.JoinResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.JoinResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.JoinResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.JoinResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.JoinResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.JoinResult parseFrom(
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
  public static Builder newBuilder(hla.rti1516_202X.fedpro.JoinResult prototype) {
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
   * Protobuf type {@code rti1516_202X.fedpro.JoinResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.JoinResult)
      hla.rti1516_202X.fedpro.JoinResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_JoinResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_JoinResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.JoinResult.class, hla.rti1516_202X.fedpro.JoinResult.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.JoinResult.newBuilder()
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
      logicalTimeImplementationName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_JoinResult_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.JoinResult getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.JoinResult.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.JoinResult build() {
      hla.rti1516_202X.fedpro.JoinResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.JoinResult buildPartial() {
      hla.rti1516_202X.fedpro.JoinResult result = new hla.rti1516_202X.fedpro.JoinResult(this);
      if (federateHandleBuilder_ == null) {
        result.federateHandle_ = federateHandle_;
      } else {
        result.federateHandle_ = federateHandleBuilder_.build();
      }
      result.logicalTimeImplementationName_ = logicalTimeImplementationName_;
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
      if (other instanceof hla.rti1516_202X.fedpro.JoinResult) {
        return mergeFrom((hla.rti1516_202X.fedpro.JoinResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.JoinResult other) {
      if (other == hla.rti1516_202X.fedpro.JoinResult.getDefaultInstance()) return this;
      if (other.hasFederateHandle()) {
        mergeFederateHandle(other.getFederateHandle());
      }
      if (!other.getLogicalTimeImplementationName().isEmpty()) {
        logicalTimeImplementationName_ = other.logicalTimeImplementationName_;
        onChanged();
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
            case 18: {
              logicalTimeImplementationName_ = input.readStringRequireUtf8();

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

    private java.lang.Object logicalTimeImplementationName_ = "";
    /**
     * <code>string logicalTimeImplementationName = 2;</code>
     * @return The logicalTimeImplementationName.
     */
    public java.lang.String getLogicalTimeImplementationName() {
      java.lang.Object ref = logicalTimeImplementationName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logicalTimeImplementationName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string logicalTimeImplementationName = 2;</code>
     * @return The bytes for logicalTimeImplementationName.
     */
    public com.google.protobuf.ByteString
        getLogicalTimeImplementationNameBytes() {
      java.lang.Object ref = logicalTimeImplementationName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logicalTimeImplementationName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string logicalTimeImplementationName = 2;</code>
     * @param value The logicalTimeImplementationName to set.
     * @return This builder for chaining.
     */
    public Builder setLogicalTimeImplementationName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      logicalTimeImplementationName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string logicalTimeImplementationName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogicalTimeImplementationName() {
      
      logicalTimeImplementationName_ = getDefaultInstance().getLogicalTimeImplementationName();
      onChanged();
      return this;
    }
    /**
     * <code>string logicalTimeImplementationName = 2;</code>
     * @param value The bytes for logicalTimeImplementationName to set.
     * @return This builder for chaining.
     */
    public Builder setLogicalTimeImplementationNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      logicalTimeImplementationName_ = value;
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


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.JoinResult)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.JoinResult)
  private static final hla.rti1516_202X.fedpro.JoinResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.JoinResult();
  }

  public static hla.rti1516_202X.fedpro.JoinResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JoinResult>
      PARSER = new com.google.protobuf.AbstractParser<JoinResult>() {
    @java.lang.Override
    public JoinResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<JoinResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JoinResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.JoinResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


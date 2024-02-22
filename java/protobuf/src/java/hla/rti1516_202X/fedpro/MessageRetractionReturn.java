// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datatypes.proto

package hla.rti1516_202X.fedpro;

/**
 * Protobuf type {@code rti1516_202X.fedpro.MessageRetractionReturn}
 */
public final class MessageRetractionReturn extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.MessageRetractionReturn)
    MessageRetractionReturnOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MessageRetractionReturn.newBuilder() to construct.
  private MessageRetractionReturn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MessageRetractionReturn() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MessageRetractionReturn();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_MessageRetractionReturn_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_MessageRetractionReturn_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.MessageRetractionReturn.class, hla.rti1516_202X.fedpro.MessageRetractionReturn.Builder.class);
  }

  public static final int RETRACTIONHANDLEISVALID_FIELD_NUMBER = 1;
  private boolean retractionHandleIsValid_;
  /**
   * <code>bool retractionHandleIsValid = 1;</code>
   * @return The retractionHandleIsValid.
   */
  @java.lang.Override
  public boolean getRetractionHandleIsValid() {
    return retractionHandleIsValid_;
  }

  public static final int MESSAGERETRACTIONHANDLE_FIELD_NUMBER = 2;
  private hla.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle_;
  /**
   * <pre>
   * optional, only valid if retractionHandleIsValid == true
   * </pre>
   *
   * <code>.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle = 2;</code>
   * @return Whether the messageRetractionHandle field is set.
   */
  @java.lang.Override
  public boolean hasMessageRetractionHandle() {
    return messageRetractionHandle_ != null;
  }
  /**
   * <pre>
   * optional, only valid if retractionHandleIsValid == true
   * </pre>
   *
   * <code>.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle = 2;</code>
   * @return The messageRetractionHandle.
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.MessageRetractionHandle getMessageRetractionHandle() {
    return messageRetractionHandle_ == null ? hla.rti1516_202X.fedpro.MessageRetractionHandle.getDefaultInstance() : messageRetractionHandle_;
  }
  /**
   * <pre>
   * optional, only valid if retractionHandleIsValid == true
   * </pre>
   *
   * <code>.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle = 2;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.MessageRetractionHandleOrBuilder getMessageRetractionHandleOrBuilder() {
    return getMessageRetractionHandle();
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
    if (retractionHandleIsValid_ != false) {
      output.writeBool(1, retractionHandleIsValid_);
    }
    if (messageRetractionHandle_ != null) {
      output.writeMessage(2, getMessageRetractionHandle());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (retractionHandleIsValid_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, retractionHandleIsValid_);
    }
    if (messageRetractionHandle_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMessageRetractionHandle());
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
    if (!(obj instanceof hla.rti1516_202X.fedpro.MessageRetractionReturn)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.MessageRetractionReturn other = (hla.rti1516_202X.fedpro.MessageRetractionReturn) obj;

    if (getRetractionHandleIsValid()
        != other.getRetractionHandleIsValid()) return false;
    if (hasMessageRetractionHandle() != other.hasMessageRetractionHandle()) return false;
    if (hasMessageRetractionHandle()) {
      if (!getMessageRetractionHandle()
          .equals(other.getMessageRetractionHandle())) return false;
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
    hash = (37 * hash) + RETRACTIONHANDLEISVALID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRetractionHandleIsValid());
    if (hasMessageRetractionHandle()) {
      hash = (37 * hash) + MESSAGERETRACTIONHANDLE_FIELD_NUMBER;
      hash = (53 * hash) + getMessageRetractionHandle().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.MessageRetractionReturn parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.MessageRetractionReturn parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.MessageRetractionReturn parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.MessageRetractionReturn parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.MessageRetractionReturn parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.MessageRetractionReturn parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.MessageRetractionReturn parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.MessageRetractionReturn parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.MessageRetractionReturn parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.MessageRetractionReturn parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.MessageRetractionReturn parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.MessageRetractionReturn parseFrom(
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
  public static Builder newBuilder(hla.rti1516_202X.fedpro.MessageRetractionReturn prototype) {
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
   * Protobuf type {@code rti1516_202X.fedpro.MessageRetractionReturn}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.MessageRetractionReturn)
      hla.rti1516_202X.fedpro.MessageRetractionReturnOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_MessageRetractionReturn_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_MessageRetractionReturn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.MessageRetractionReturn.class, hla.rti1516_202X.fedpro.MessageRetractionReturn.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.MessageRetractionReturn.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      retractionHandleIsValid_ = false;

      if (messageRetractionHandleBuilder_ == null) {
        messageRetractionHandle_ = null;
      } else {
        messageRetractionHandle_ = null;
        messageRetractionHandleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_MessageRetractionReturn_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.MessageRetractionReturn getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.MessageRetractionReturn.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.MessageRetractionReturn build() {
      hla.rti1516_202X.fedpro.MessageRetractionReturn result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.MessageRetractionReturn buildPartial() {
      hla.rti1516_202X.fedpro.MessageRetractionReturn result = new hla.rti1516_202X.fedpro.MessageRetractionReturn(this);
      result.retractionHandleIsValid_ = retractionHandleIsValid_;
      if (messageRetractionHandleBuilder_ == null) {
        result.messageRetractionHandle_ = messageRetractionHandle_;
      } else {
        result.messageRetractionHandle_ = messageRetractionHandleBuilder_.build();
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
      if (other instanceof hla.rti1516_202X.fedpro.MessageRetractionReturn) {
        return mergeFrom((hla.rti1516_202X.fedpro.MessageRetractionReturn)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.MessageRetractionReturn other) {
      if (other == hla.rti1516_202X.fedpro.MessageRetractionReturn.getDefaultInstance()) return this;
      if (other.getRetractionHandleIsValid() != false) {
        setRetractionHandleIsValid(other.getRetractionHandleIsValid());
      }
      if (other.hasMessageRetractionHandle()) {
        mergeMessageRetractionHandle(other.getMessageRetractionHandle());
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
            case 8: {
              retractionHandleIsValid_ = input.readBool();

              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getMessageRetractionHandleFieldBuilder().getBuilder(),
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

    private boolean retractionHandleIsValid_ ;
    /**
     * <code>bool retractionHandleIsValid = 1;</code>
     * @return The retractionHandleIsValid.
     */
    @java.lang.Override
    public boolean getRetractionHandleIsValid() {
      return retractionHandleIsValid_;
    }
    /**
     * <code>bool retractionHandleIsValid = 1;</code>
     * @param value The retractionHandleIsValid to set.
     * @return This builder for chaining.
     */
    public Builder setRetractionHandleIsValid(boolean value) {
      
      retractionHandleIsValid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool retractionHandleIsValid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRetractionHandleIsValid() {
      
      retractionHandleIsValid_ = false;
      onChanged();
      return this;
    }

    private hla.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle_;
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.MessageRetractionHandle, hla.rti1516_202X.fedpro.MessageRetractionHandle.Builder, hla.rti1516_202X.fedpro.MessageRetractionHandleOrBuilder> messageRetractionHandleBuilder_;
    /**
     * <pre>
     * optional, only valid if retractionHandleIsValid == true
     * </pre>
     *
     * <code>.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle = 2;</code>
     * @return Whether the messageRetractionHandle field is set.
     */
    public boolean hasMessageRetractionHandle() {
      return messageRetractionHandleBuilder_ != null || messageRetractionHandle_ != null;
    }
    /**
     * <pre>
     * optional, only valid if retractionHandleIsValid == true
     * </pre>
     *
     * <code>.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle = 2;</code>
     * @return The messageRetractionHandle.
     */
    public hla.rti1516_202X.fedpro.MessageRetractionHandle getMessageRetractionHandle() {
      if (messageRetractionHandleBuilder_ == null) {
        return messageRetractionHandle_ == null ? hla.rti1516_202X.fedpro.MessageRetractionHandle.getDefaultInstance() : messageRetractionHandle_;
      } else {
        return messageRetractionHandleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * optional, only valid if retractionHandleIsValid == true
     * </pre>
     *
     * <code>.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle = 2;</code>
     */
    public Builder setMessageRetractionHandle(hla.rti1516_202X.fedpro.MessageRetractionHandle value) {
      if (messageRetractionHandleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        messageRetractionHandle_ = value;
        onChanged();
      } else {
        messageRetractionHandleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * optional, only valid if retractionHandleIsValid == true
     * </pre>
     *
     * <code>.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle = 2;</code>
     */
    public Builder setMessageRetractionHandle(
        hla.rti1516_202X.fedpro.MessageRetractionHandle.Builder builderForValue) {
      if (messageRetractionHandleBuilder_ == null) {
        messageRetractionHandle_ = builderForValue.build();
        onChanged();
      } else {
        messageRetractionHandleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * optional, only valid if retractionHandleIsValid == true
     * </pre>
     *
     * <code>.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle = 2;</code>
     */
    public Builder mergeMessageRetractionHandle(hla.rti1516_202X.fedpro.MessageRetractionHandle value) {
      if (messageRetractionHandleBuilder_ == null) {
        if (messageRetractionHandle_ != null) {
          messageRetractionHandle_ =
            hla.rti1516_202X.fedpro.MessageRetractionHandle.newBuilder(messageRetractionHandle_).mergeFrom(value).buildPartial();
        } else {
          messageRetractionHandle_ = value;
        }
        onChanged();
      } else {
        messageRetractionHandleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * optional, only valid if retractionHandleIsValid == true
     * </pre>
     *
     * <code>.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle = 2;</code>
     */
    public Builder clearMessageRetractionHandle() {
      if (messageRetractionHandleBuilder_ == null) {
        messageRetractionHandle_ = null;
        onChanged();
      } else {
        messageRetractionHandle_ = null;
        messageRetractionHandleBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * optional, only valid if retractionHandleIsValid == true
     * </pre>
     *
     * <code>.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle = 2;</code>
     */
    public hla.rti1516_202X.fedpro.MessageRetractionHandle.Builder getMessageRetractionHandleBuilder() {
      
      onChanged();
      return getMessageRetractionHandleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * optional, only valid if retractionHandleIsValid == true
     * </pre>
     *
     * <code>.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle = 2;</code>
     */
    public hla.rti1516_202X.fedpro.MessageRetractionHandleOrBuilder getMessageRetractionHandleOrBuilder() {
      if (messageRetractionHandleBuilder_ != null) {
        return messageRetractionHandleBuilder_.getMessageOrBuilder();
      } else {
        return messageRetractionHandle_ == null ?
            hla.rti1516_202X.fedpro.MessageRetractionHandle.getDefaultInstance() : messageRetractionHandle_;
      }
    }
    /**
     * <pre>
     * optional, only valid if retractionHandleIsValid == true
     * </pre>
     *
     * <code>.rti1516_202X.fedpro.MessageRetractionHandle messageRetractionHandle = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.MessageRetractionHandle, hla.rti1516_202X.fedpro.MessageRetractionHandle.Builder, hla.rti1516_202X.fedpro.MessageRetractionHandleOrBuilder> 
        getMessageRetractionHandleFieldBuilder() {
      if (messageRetractionHandleBuilder_ == null) {
        messageRetractionHandleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            hla.rti1516_202X.fedpro.MessageRetractionHandle, hla.rti1516_202X.fedpro.MessageRetractionHandle.Builder, hla.rti1516_202X.fedpro.MessageRetractionHandleOrBuilder>(
                getMessageRetractionHandle(),
                getParentForChildren(),
                isClean());
        messageRetractionHandle_ = null;
      }
      return messageRetractionHandleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.MessageRetractionReturn)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.MessageRetractionReturn)
  private static final hla.rti1516_202X.fedpro.MessageRetractionReturn DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.MessageRetractionReturn();
  }

  public static hla.rti1516_202X.fedpro.MessageRetractionReturn getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MessageRetractionReturn>
      PARSER = new com.google.protobuf.AbstractParser<MessageRetractionReturn>() {
    @java.lang.Override
    public MessageRetractionReturn parsePartialFrom(
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

  public static com.google.protobuf.Parser<MessageRetractionReturn> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessageRetractionReturn> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.MessageRetractionReturn getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RTIambassador.proto

package hla.rti1516_202X.fedpro;

/**
 * Protobuf type {@code rti1516_202X.fedpro.SubscribeInteractionClassRequest}
 */
public final class SubscribeInteractionClassRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.SubscribeInteractionClassRequest)
    SubscribeInteractionClassRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubscribeInteractionClassRequest.newBuilder() to construct.
  private SubscribeInteractionClassRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubscribeInteractionClassRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubscribeInteractionClassRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_SubscribeInteractionClassRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_SubscribeInteractionClassRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest.class, hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest.Builder.class);
  }

  public static final int INTERACTIONCLASS_FIELD_NUMBER = 1;
  private hla.rti1516_202X.fedpro.InteractionClassHandle interactionClass_;
  /**
   * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
   * @return Whether the interactionClass field is set.
   */
  @java.lang.Override
  public boolean hasInteractionClass() {
    return interactionClass_ != null;
  }
  /**
   * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
   * @return The interactionClass.
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.InteractionClassHandle getInteractionClass() {
    return interactionClass_ == null ? hla.rti1516_202X.fedpro.InteractionClassHandle.getDefaultInstance() : interactionClass_;
  }
  /**
   * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.InteractionClassHandleOrBuilder getInteractionClassOrBuilder() {
    return getInteractionClass();
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
    if (interactionClass_ != null) {
      output.writeMessage(1, getInteractionClass());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (interactionClass_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInteractionClass());
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
    if (!(obj instanceof hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest other = (hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest) obj;

    if (hasInteractionClass() != other.hasInteractionClass()) return false;
    if (hasInteractionClass()) {
      if (!getInteractionClass()
          .equals(other.getInteractionClass())) return false;
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
    if (hasInteractionClass()) {
      hash = (37 * hash) + INTERACTIONCLASS_FIELD_NUMBER;
      hash = (53 * hash) + getInteractionClass().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest parseFrom(
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
  public static Builder newBuilder(hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest prototype) {
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
   * Protobuf type {@code rti1516_202X.fedpro.SubscribeInteractionClassRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.SubscribeInteractionClassRequest)
      hla.rti1516_202X.fedpro.SubscribeInteractionClassRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_SubscribeInteractionClassRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_SubscribeInteractionClassRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest.class, hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (interactionClassBuilder_ == null) {
        interactionClass_ = null;
      } else {
        interactionClass_ = null;
        interactionClassBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_SubscribeInteractionClassRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest build() {
      hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest buildPartial() {
      hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest result = new hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest(this);
      if (interactionClassBuilder_ == null) {
        result.interactionClass_ = interactionClass_;
      } else {
        result.interactionClass_ = interactionClassBuilder_.build();
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
      if (other instanceof hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest) {
        return mergeFrom((hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest other) {
      if (other == hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest.getDefaultInstance()) return this;
      if (other.hasInteractionClass()) {
        mergeInteractionClass(other.getInteractionClass());
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
                  getInteractionClassFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private hla.rti1516_202X.fedpro.InteractionClassHandle interactionClass_;
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.InteractionClassHandle, hla.rti1516_202X.fedpro.InteractionClassHandle.Builder, hla.rti1516_202X.fedpro.InteractionClassHandleOrBuilder> interactionClassBuilder_;
    /**
     * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
     * @return Whether the interactionClass field is set.
     */
    public boolean hasInteractionClass() {
      return interactionClassBuilder_ != null || interactionClass_ != null;
    }
    /**
     * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
     * @return The interactionClass.
     */
    public hla.rti1516_202X.fedpro.InteractionClassHandle getInteractionClass() {
      if (interactionClassBuilder_ == null) {
        return interactionClass_ == null ? hla.rti1516_202X.fedpro.InteractionClassHandle.getDefaultInstance() : interactionClass_;
      } else {
        return interactionClassBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public Builder setInteractionClass(hla.rti1516_202X.fedpro.InteractionClassHandle value) {
      if (interactionClassBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        interactionClass_ = value;
        onChanged();
      } else {
        interactionClassBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public Builder setInteractionClass(
        hla.rti1516_202X.fedpro.InteractionClassHandle.Builder builderForValue) {
      if (interactionClassBuilder_ == null) {
        interactionClass_ = builderForValue.build();
        onChanged();
      } else {
        interactionClassBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public Builder mergeInteractionClass(hla.rti1516_202X.fedpro.InteractionClassHandle value) {
      if (interactionClassBuilder_ == null) {
        if (interactionClass_ != null) {
          interactionClass_ =
            hla.rti1516_202X.fedpro.InteractionClassHandle.newBuilder(interactionClass_).mergeFrom(value).buildPartial();
        } else {
          interactionClass_ = value;
        }
        onChanged();
      } else {
        interactionClassBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public Builder clearInteractionClass() {
      if (interactionClassBuilder_ == null) {
        interactionClass_ = null;
        onChanged();
      } else {
        interactionClass_ = null;
        interactionClassBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public hla.rti1516_202X.fedpro.InteractionClassHandle.Builder getInteractionClassBuilder() {
      
      onChanged();
      return getInteractionClassFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public hla.rti1516_202X.fedpro.InteractionClassHandleOrBuilder getInteractionClassOrBuilder() {
      if (interactionClassBuilder_ != null) {
        return interactionClassBuilder_.getMessageOrBuilder();
      } else {
        return interactionClass_ == null ?
            hla.rti1516_202X.fedpro.InteractionClassHandle.getDefaultInstance() : interactionClass_;
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.InteractionClassHandle, hla.rti1516_202X.fedpro.InteractionClassHandle.Builder, hla.rti1516_202X.fedpro.InteractionClassHandleOrBuilder> 
        getInteractionClassFieldBuilder() {
      if (interactionClassBuilder_ == null) {
        interactionClassBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            hla.rti1516_202X.fedpro.InteractionClassHandle, hla.rti1516_202X.fedpro.InteractionClassHandle.Builder, hla.rti1516_202X.fedpro.InteractionClassHandleOrBuilder>(
                getInteractionClass(),
                getParentForChildren(),
                isClean());
        interactionClass_ = null;
      }
      return interactionClassBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.SubscribeInteractionClassRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.SubscribeInteractionClassRequest)
  private static final hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest();
  }

  public static hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscribeInteractionClassRequest>
      PARSER = new com.google.protobuf.AbstractParser<SubscribeInteractionClassRequest>() {
    @java.lang.Override
    public SubscribeInteractionClassRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubscribeInteractionClassRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscribeInteractionClassRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.SubscribeInteractionClassRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


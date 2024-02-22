// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RTIambassador.proto

package hla.rti1516_202X.fedpro;

/**
 * Protobuf type {@code rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse}
 */
public final class RegisterObjectInstanceWithNameAndRegionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse)
    RegisterObjectInstanceWithNameAndRegionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisterObjectInstanceWithNameAndRegionsResponse.newBuilder() to construct.
  private RegisterObjectInstanceWithNameAndRegionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterObjectInstanceWithNameAndRegionsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegisterObjectInstanceWithNameAndRegionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_RegisterObjectInstanceWithNameAndRegionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_RegisterObjectInstanceWithNameAndRegionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse.class, hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private hla.rti1516_202X.fedpro.ObjectInstanceHandle result_;
  /**
   * <code>.rti1516_202X.fedpro.ObjectInstanceHandle result = 1;</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <code>.rti1516_202X.fedpro.ObjectInstanceHandle result = 1;</code>
   * @return The result.
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.ObjectInstanceHandle getResult() {
    return result_ == null ? hla.rti1516_202X.fedpro.ObjectInstanceHandle.getDefaultInstance() : result_;
  }
  /**
   * <code>.rti1516_202X.fedpro.ObjectInstanceHandle result = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.ObjectInstanceHandleOrBuilder getResultOrBuilder() {
    return getResult();
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
    if (result_ != null) {
      output.writeMessage(1, getResult());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResult());
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
    if (!(obj instanceof hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse other = (hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
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
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse parseFrom(
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
  public static Builder newBuilder(hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse prototype) {
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
   * Protobuf type {@code rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse)
      hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_RegisterObjectInstanceWithNameAndRegionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_RegisterObjectInstanceWithNameAndRegionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse.class, hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_RegisterObjectInstanceWithNameAndRegionsResponse_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse build() {
      hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse buildPartial() {
      hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse result = new hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse(this);
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
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
      if (other instanceof hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse) {
        return mergeFrom((hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse other) {
      if (other == hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
                  getResultFieldBuilder().getBuilder(),
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

    private hla.rti1516_202X.fedpro.ObjectInstanceHandle result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.ObjectInstanceHandle, hla.rti1516_202X.fedpro.ObjectInstanceHandle.Builder, hla.rti1516_202X.fedpro.ObjectInstanceHandleOrBuilder> resultBuilder_;
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle result = 1;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle result = 1;</code>
     * @return The result.
     */
    public hla.rti1516_202X.fedpro.ObjectInstanceHandle getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? hla.rti1516_202X.fedpro.ObjectInstanceHandle.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle result = 1;</code>
     */
    public Builder setResult(hla.rti1516_202X.fedpro.ObjectInstanceHandle value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle result = 1;</code>
     */
    public Builder setResult(
        hla.rti1516_202X.fedpro.ObjectInstanceHandle.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle result = 1;</code>
     */
    public Builder mergeResult(hla.rti1516_202X.fedpro.ObjectInstanceHandle value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            hla.rti1516_202X.fedpro.ObjectInstanceHandle.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle result = 1;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle result = 1;</code>
     */
    public hla.rti1516_202X.fedpro.ObjectInstanceHandle.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle result = 1;</code>
     */
    public hla.rti1516_202X.fedpro.ObjectInstanceHandleOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            hla.rti1516_202X.fedpro.ObjectInstanceHandle.getDefaultInstance() : result_;
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle result = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.ObjectInstanceHandle, hla.rti1516_202X.fedpro.ObjectInstanceHandle.Builder, hla.rti1516_202X.fedpro.ObjectInstanceHandleOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            hla.rti1516_202X.fedpro.ObjectInstanceHandle, hla.rti1516_202X.fedpro.ObjectInstanceHandle.Builder, hla.rti1516_202X.fedpro.ObjectInstanceHandleOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse)
  private static final hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse();
  }

  public static hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterObjectInstanceWithNameAndRegionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<RegisterObjectInstanceWithNameAndRegionsResponse>() {
    @java.lang.Override
    public RegisterObjectInstanceWithNameAndRegionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegisterObjectInstanceWithNameAndRegionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterObjectInstanceWithNameAndRegionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.RegisterObjectInstanceWithNameAndRegionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


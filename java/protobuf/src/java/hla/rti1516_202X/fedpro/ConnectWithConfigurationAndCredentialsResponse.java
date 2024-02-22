// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RTIambassador.proto

package hla.rti1516_202X.fedpro;

/**
 * Protobuf type {@code rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse}
 */
public final class ConnectWithConfigurationAndCredentialsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse)
    ConnectWithConfigurationAndCredentialsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConnectWithConfigurationAndCredentialsResponse.newBuilder() to construct.
  private ConnectWithConfigurationAndCredentialsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConnectWithConfigurationAndCredentialsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConnectWithConfigurationAndCredentialsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_ConnectWithConfigurationAndCredentialsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_ConnectWithConfigurationAndCredentialsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse.class, hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse.Builder.class);
  }

  public static final int CONFIGURATIONRESULT_FIELD_NUMBER = 1;
  private hla.rti1516_202X.fedpro.ConfigurationResult configurationResult_;
  /**
   * <code>.rti1516_202X.fedpro.ConfigurationResult configurationResult = 1;</code>
   * @return Whether the configurationResult field is set.
   */
  @java.lang.Override
  public boolean hasConfigurationResult() {
    return configurationResult_ != null;
  }
  /**
   * <code>.rti1516_202X.fedpro.ConfigurationResult configurationResult = 1;</code>
   * @return The configurationResult.
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.ConfigurationResult getConfigurationResult() {
    return configurationResult_ == null ? hla.rti1516_202X.fedpro.ConfigurationResult.getDefaultInstance() : configurationResult_;
  }
  /**
   * <code>.rti1516_202X.fedpro.ConfigurationResult configurationResult = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.ConfigurationResultOrBuilder getConfigurationResultOrBuilder() {
    return getConfigurationResult();
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
    if (configurationResult_ != null) {
      output.writeMessage(1, getConfigurationResult());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (configurationResult_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConfigurationResult());
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
    if (!(obj instanceof hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse other = (hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse) obj;

    if (hasConfigurationResult() != other.hasConfigurationResult()) return false;
    if (hasConfigurationResult()) {
      if (!getConfigurationResult()
          .equals(other.getConfigurationResult())) return false;
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
    if (hasConfigurationResult()) {
      hash = (37 * hash) + CONFIGURATIONRESULT_FIELD_NUMBER;
      hash = (53 * hash) + getConfigurationResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
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
  public static Builder newBuilder(hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse prototype) {
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
   * Protobuf type {@code rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse)
      hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_ConnectWithConfigurationAndCredentialsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_ConnectWithConfigurationAndCredentialsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse.class, hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (configurationResultBuilder_ == null) {
        configurationResult_ = null;
      } else {
        configurationResult_ = null;
        configurationResultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_ConnectWithConfigurationAndCredentialsResponse_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse build() {
      hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse buildPartial() {
      hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse result = new hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse(this);
      if (configurationResultBuilder_ == null) {
        result.configurationResult_ = configurationResult_;
      } else {
        result.configurationResult_ = configurationResultBuilder_.build();
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
      if (other instanceof hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse) {
        return mergeFrom((hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse other) {
      if (other == hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse.getDefaultInstance()) return this;
      if (other.hasConfigurationResult()) {
        mergeConfigurationResult(other.getConfigurationResult());
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
                  getConfigurationResultFieldBuilder().getBuilder(),
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

    private hla.rti1516_202X.fedpro.ConfigurationResult configurationResult_;
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.ConfigurationResult, hla.rti1516_202X.fedpro.ConfigurationResult.Builder, hla.rti1516_202X.fedpro.ConfigurationResultOrBuilder> configurationResultBuilder_;
    /**
     * <code>.rti1516_202X.fedpro.ConfigurationResult configurationResult = 1;</code>
     * @return Whether the configurationResult field is set.
     */
    public boolean hasConfigurationResult() {
      return configurationResultBuilder_ != null || configurationResult_ != null;
    }
    /**
     * <code>.rti1516_202X.fedpro.ConfigurationResult configurationResult = 1;</code>
     * @return The configurationResult.
     */
    public hla.rti1516_202X.fedpro.ConfigurationResult getConfigurationResult() {
      if (configurationResultBuilder_ == null) {
        return configurationResult_ == null ? hla.rti1516_202X.fedpro.ConfigurationResult.getDefaultInstance() : configurationResult_;
      } else {
        return configurationResultBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    public Builder setConfigurationResult(hla.rti1516_202X.fedpro.ConfigurationResult value) {
      if (configurationResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        configurationResult_ = value;
        onChanged();
      } else {
        configurationResultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    public Builder setConfigurationResult(
        hla.rti1516_202X.fedpro.ConfigurationResult.Builder builderForValue) {
      if (configurationResultBuilder_ == null) {
        configurationResult_ = builderForValue.build();
        onChanged();
      } else {
        configurationResultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    public Builder mergeConfigurationResult(hla.rti1516_202X.fedpro.ConfigurationResult value) {
      if (configurationResultBuilder_ == null) {
        if (configurationResult_ != null) {
          configurationResult_ =
            hla.rti1516_202X.fedpro.ConfigurationResult.newBuilder(configurationResult_).mergeFrom(value).buildPartial();
        } else {
          configurationResult_ = value;
        }
        onChanged();
      } else {
        configurationResultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    public Builder clearConfigurationResult() {
      if (configurationResultBuilder_ == null) {
        configurationResult_ = null;
        onChanged();
      } else {
        configurationResult_ = null;
        configurationResultBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    public hla.rti1516_202X.fedpro.ConfigurationResult.Builder getConfigurationResultBuilder() {
      
      onChanged();
      return getConfigurationResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_202X.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    public hla.rti1516_202X.fedpro.ConfigurationResultOrBuilder getConfigurationResultOrBuilder() {
      if (configurationResultBuilder_ != null) {
        return configurationResultBuilder_.getMessageOrBuilder();
      } else {
        return configurationResult_ == null ?
            hla.rti1516_202X.fedpro.ConfigurationResult.getDefaultInstance() : configurationResult_;
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.ConfigurationResult, hla.rti1516_202X.fedpro.ConfigurationResult.Builder, hla.rti1516_202X.fedpro.ConfigurationResultOrBuilder> 
        getConfigurationResultFieldBuilder() {
      if (configurationResultBuilder_ == null) {
        configurationResultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            hla.rti1516_202X.fedpro.ConfigurationResult, hla.rti1516_202X.fedpro.ConfigurationResult.Builder, hla.rti1516_202X.fedpro.ConfigurationResultOrBuilder>(
                getConfigurationResult(),
                getParentForChildren(),
                isClean());
        configurationResult_ = null;
      }
      return configurationResultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse)
  private static final hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse();
  }

  public static hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConnectWithConfigurationAndCredentialsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ConnectWithConfigurationAndCredentialsResponse>() {
    @java.lang.Override
    public ConnectWithConfigurationAndCredentialsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConnectWithConfigurationAndCredentialsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConnectWithConfigurationAndCredentialsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.ConnectWithConfigurationAndCredentialsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


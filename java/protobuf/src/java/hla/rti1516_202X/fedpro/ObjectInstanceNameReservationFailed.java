// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FederateAmbassador.proto

package hla.rti1516_202X.fedpro;

/**
 * Protobuf type {@code rti1516_202X.fedpro.ObjectInstanceNameReservationFailed}
 */
public final class ObjectInstanceNameReservationFailed extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.ObjectInstanceNameReservationFailed)
    ObjectInstanceNameReservationFailedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ObjectInstanceNameReservationFailed.newBuilder() to construct.
  private ObjectInstanceNameReservationFailed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ObjectInstanceNameReservationFailed() {
    objectInstanceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ObjectInstanceNameReservationFailed();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_ObjectInstanceNameReservationFailed_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_ObjectInstanceNameReservationFailed_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed.class, hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed.Builder.class);
  }

  public static final int OBJECTINSTANCENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object objectInstanceName_;
  /**
   * <code>string objectInstanceName = 1;</code>
   * @return The objectInstanceName.
   */
  @java.lang.Override
  public java.lang.String getObjectInstanceName() {
    java.lang.Object ref = objectInstanceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      objectInstanceName_ = s;
      return s;
    }
  }
  /**
   * <code>string objectInstanceName = 1;</code>
   * @return The bytes for objectInstanceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObjectInstanceNameBytes() {
    java.lang.Object ref = objectInstanceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      objectInstanceName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectInstanceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, objectInstanceName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectInstanceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, objectInstanceName_);
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
    if (!(obj instanceof hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed other = (hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed) obj;

    if (!getObjectInstanceName()
        .equals(other.getObjectInstanceName())) return false;
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
    hash = (37 * hash) + OBJECTINSTANCENAME_FIELD_NUMBER;
    hash = (53 * hash) + getObjectInstanceName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed parseFrom(
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
  public static Builder newBuilder(hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed prototype) {
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
   * Protobuf type {@code rti1516_202X.fedpro.ObjectInstanceNameReservationFailed}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.ObjectInstanceNameReservationFailed)
      hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_ObjectInstanceNameReservationFailed_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_ObjectInstanceNameReservationFailed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed.class, hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      objectInstanceName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_ObjectInstanceNameReservationFailed_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed build() {
      hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed buildPartial() {
      hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed result = new hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed(this);
      result.objectInstanceName_ = objectInstanceName_;
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
      if (other instanceof hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed) {
        return mergeFrom((hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed other) {
      if (other == hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed.getDefaultInstance()) return this;
      if (!other.getObjectInstanceName().isEmpty()) {
        objectInstanceName_ = other.objectInstanceName_;
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
              objectInstanceName_ = input.readStringRequireUtf8();

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

    private java.lang.Object objectInstanceName_ = "";
    /**
     * <code>string objectInstanceName = 1;</code>
     * @return The objectInstanceName.
     */
    public java.lang.String getObjectInstanceName() {
      java.lang.Object ref = objectInstanceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        objectInstanceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string objectInstanceName = 1;</code>
     * @return The bytes for objectInstanceName.
     */
    public com.google.protobuf.ByteString
        getObjectInstanceNameBytes() {
      java.lang.Object ref = objectInstanceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        objectInstanceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string objectInstanceName = 1;</code>
     * @param value The objectInstanceName to set.
     * @return This builder for chaining.
     */
    public Builder setObjectInstanceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      objectInstanceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string objectInstanceName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectInstanceName() {
      
      objectInstanceName_ = getDefaultInstance().getObjectInstanceName();
      onChanged();
      return this;
    }
    /**
     * <code>string objectInstanceName = 1;</code>
     * @param value The bytes for objectInstanceName to set.
     * @return This builder for chaining.
     */
    public Builder setObjectInstanceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      objectInstanceName_ = value;
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


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.ObjectInstanceNameReservationFailed)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.ObjectInstanceNameReservationFailed)
  private static final hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed();
  }

  public static hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectInstanceNameReservationFailed>
      PARSER = new com.google.protobuf.AbstractParser<ObjectInstanceNameReservationFailed>() {
    @java.lang.Override
    public ObjectInstanceNameReservationFailed parsePartialFrom(
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

  public static com.google.protobuf.Parser<ObjectInstanceNameReservationFailed> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectInstanceNameReservationFailed> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.ObjectInstanceNameReservationFailed getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


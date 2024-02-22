// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RTIambassador.proto

package hla.rti1516_202X.fedpro;

/**
 * Protobuf type {@code rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest}
 */
public final class UnpublishObjectClassAttributesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest)
    UnpublishObjectClassAttributesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnpublishObjectClassAttributesRequest.newBuilder() to construct.
  private UnpublishObjectClassAttributesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnpublishObjectClassAttributesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UnpublishObjectClassAttributesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_UnpublishObjectClassAttributesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_UnpublishObjectClassAttributesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest.class, hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest.Builder.class);
  }

  public static final int OBJECTCLASS_FIELD_NUMBER = 1;
  private hla.rti1516_202X.fedpro.ObjectClassHandle objectClass_;
  /**
   * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
   * @return Whether the objectClass field is set.
   */
  @java.lang.Override
  public boolean hasObjectClass() {
    return objectClass_ != null;
  }
  /**
   * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
   * @return The objectClass.
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.ObjectClassHandle getObjectClass() {
    return objectClass_ == null ? hla.rti1516_202X.fedpro.ObjectClassHandle.getDefaultInstance() : objectClass_;
  }
  /**
   * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.ObjectClassHandleOrBuilder getObjectClassOrBuilder() {
    return getObjectClass();
  }

  public static final int ATTRIBUTES_FIELD_NUMBER = 2;
  private hla.rti1516_202X.fedpro.AttributeHandleSet attributes_;
  /**
   * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
   * @return Whether the attributes field is set.
   */
  @java.lang.Override
  public boolean hasAttributes() {
    return attributes_ != null;
  }
  /**
   * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
   * @return The attributes.
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.AttributeHandleSet getAttributes() {
    return attributes_ == null ? hla.rti1516_202X.fedpro.AttributeHandleSet.getDefaultInstance() : attributes_;
  }
  /**
   * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.AttributeHandleSetOrBuilder getAttributesOrBuilder() {
    return getAttributes();
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
    if (objectClass_ != null) {
      output.writeMessage(1, getObjectClass());
    }
    if (attributes_ != null) {
      output.writeMessage(2, getAttributes());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (objectClass_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getObjectClass());
    }
    if (attributes_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAttributes());
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
    if (!(obj instanceof hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest other = (hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest) obj;

    if (hasObjectClass() != other.hasObjectClass()) return false;
    if (hasObjectClass()) {
      if (!getObjectClass()
          .equals(other.getObjectClass())) return false;
    }
    if (hasAttributes() != other.hasAttributes()) return false;
    if (hasAttributes()) {
      if (!getAttributes()
          .equals(other.getAttributes())) return false;
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
    if (hasObjectClass()) {
      hash = (37 * hash) + OBJECTCLASS_FIELD_NUMBER;
      hash = (53 * hash) + getObjectClass().hashCode();
    }
    if (hasAttributes()) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getAttributes().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest parseFrom(
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
  public static Builder newBuilder(hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest prototype) {
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
   * Protobuf type {@code rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest)
      hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_UnpublishObjectClassAttributesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_UnpublishObjectClassAttributesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest.class, hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (objectClassBuilder_ == null) {
        objectClass_ = null;
      } else {
        objectClass_ = null;
        objectClassBuilder_ = null;
      }
      if (attributesBuilder_ == null) {
        attributes_ = null;
      } else {
        attributes_ = null;
        attributesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_UnpublishObjectClassAttributesRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest build() {
      hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest buildPartial() {
      hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest result = new hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest(this);
      if (objectClassBuilder_ == null) {
        result.objectClass_ = objectClass_;
      } else {
        result.objectClass_ = objectClassBuilder_.build();
      }
      if (attributesBuilder_ == null) {
        result.attributes_ = attributes_;
      } else {
        result.attributes_ = attributesBuilder_.build();
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
      if (other instanceof hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest) {
        return mergeFrom((hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest other) {
      if (other == hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest.getDefaultInstance()) return this;
      if (other.hasObjectClass()) {
        mergeObjectClass(other.getObjectClass());
      }
      if (other.hasAttributes()) {
        mergeAttributes(other.getAttributes());
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
                  getObjectClassFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAttributesFieldBuilder().getBuilder(),
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

    private hla.rti1516_202X.fedpro.ObjectClassHandle objectClass_;
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.ObjectClassHandle, hla.rti1516_202X.fedpro.ObjectClassHandle.Builder, hla.rti1516_202X.fedpro.ObjectClassHandleOrBuilder> objectClassBuilder_;
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
     * @return Whether the objectClass field is set.
     */
    public boolean hasObjectClass() {
      return objectClassBuilder_ != null || objectClass_ != null;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
     * @return The objectClass.
     */
    public hla.rti1516_202X.fedpro.ObjectClassHandle getObjectClass() {
      if (objectClassBuilder_ == null) {
        return objectClass_ == null ? hla.rti1516_202X.fedpro.ObjectClassHandle.getDefaultInstance() : objectClass_;
      } else {
        return objectClassBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    public Builder setObjectClass(hla.rti1516_202X.fedpro.ObjectClassHandle value) {
      if (objectClassBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        objectClass_ = value;
        onChanged();
      } else {
        objectClassBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    public Builder setObjectClass(
        hla.rti1516_202X.fedpro.ObjectClassHandle.Builder builderForValue) {
      if (objectClassBuilder_ == null) {
        objectClass_ = builderForValue.build();
        onChanged();
      } else {
        objectClassBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    public Builder mergeObjectClass(hla.rti1516_202X.fedpro.ObjectClassHandle value) {
      if (objectClassBuilder_ == null) {
        if (objectClass_ != null) {
          objectClass_ =
            hla.rti1516_202X.fedpro.ObjectClassHandle.newBuilder(objectClass_).mergeFrom(value).buildPartial();
        } else {
          objectClass_ = value;
        }
        onChanged();
      } else {
        objectClassBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    public Builder clearObjectClass() {
      if (objectClassBuilder_ == null) {
        objectClass_ = null;
        onChanged();
      } else {
        objectClass_ = null;
        objectClassBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    public hla.rti1516_202X.fedpro.ObjectClassHandle.Builder getObjectClassBuilder() {
      
      onChanged();
      return getObjectClassFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    public hla.rti1516_202X.fedpro.ObjectClassHandleOrBuilder getObjectClassOrBuilder() {
      if (objectClassBuilder_ != null) {
        return objectClassBuilder_.getMessageOrBuilder();
      } else {
        return objectClass_ == null ?
            hla.rti1516_202X.fedpro.ObjectClassHandle.getDefaultInstance() : objectClass_;
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.ObjectClassHandle, hla.rti1516_202X.fedpro.ObjectClassHandle.Builder, hla.rti1516_202X.fedpro.ObjectClassHandleOrBuilder> 
        getObjectClassFieldBuilder() {
      if (objectClassBuilder_ == null) {
        objectClassBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            hla.rti1516_202X.fedpro.ObjectClassHandle, hla.rti1516_202X.fedpro.ObjectClassHandle.Builder, hla.rti1516_202X.fedpro.ObjectClassHandleOrBuilder>(
                getObjectClass(),
                getParentForChildren(),
                isClean());
        objectClass_ = null;
      }
      return objectClassBuilder_;
    }

    private hla.rti1516_202X.fedpro.AttributeHandleSet attributes_;
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.AttributeHandleSet, hla.rti1516_202X.fedpro.AttributeHandleSet.Builder, hla.rti1516_202X.fedpro.AttributeHandleSetOrBuilder> attributesBuilder_;
    /**
     * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
     * @return Whether the attributes field is set.
     */
    public boolean hasAttributes() {
      return attributesBuilder_ != null || attributes_ != null;
    }
    /**
     * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
     * @return The attributes.
     */
    public hla.rti1516_202X.fedpro.AttributeHandleSet getAttributes() {
      if (attributesBuilder_ == null) {
        return attributes_ == null ? hla.rti1516_202X.fedpro.AttributeHandleSet.getDefaultInstance() : attributes_;
      } else {
        return attributesBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    public Builder setAttributes(hla.rti1516_202X.fedpro.AttributeHandleSet value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attributes_ = value;
        onChanged();
      } else {
        attributesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    public Builder setAttributes(
        hla.rti1516_202X.fedpro.AttributeHandleSet.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        attributes_ = builderForValue.build();
        onChanged();
      } else {
        attributesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    public Builder mergeAttributes(hla.rti1516_202X.fedpro.AttributeHandleSet value) {
      if (attributesBuilder_ == null) {
        if (attributes_ != null) {
          attributes_ =
            hla.rti1516_202X.fedpro.AttributeHandleSet.newBuilder(attributes_).mergeFrom(value).buildPartial();
        } else {
          attributes_ = value;
        }
        onChanged();
      } else {
        attributesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    public Builder clearAttributes() {
      if (attributesBuilder_ == null) {
        attributes_ = null;
        onChanged();
      } else {
        attributes_ = null;
        attributesBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    public hla.rti1516_202X.fedpro.AttributeHandleSet.Builder getAttributesBuilder() {
      
      onChanged();
      return getAttributesFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    public hla.rti1516_202X.fedpro.AttributeHandleSetOrBuilder getAttributesOrBuilder() {
      if (attributesBuilder_ != null) {
        return attributesBuilder_.getMessageOrBuilder();
      } else {
        return attributes_ == null ?
            hla.rti1516_202X.fedpro.AttributeHandleSet.getDefaultInstance() : attributes_;
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.AttributeHandleSet, hla.rti1516_202X.fedpro.AttributeHandleSet.Builder, hla.rti1516_202X.fedpro.AttributeHandleSetOrBuilder> 
        getAttributesFieldBuilder() {
      if (attributesBuilder_ == null) {
        attributesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            hla.rti1516_202X.fedpro.AttributeHandleSet, hla.rti1516_202X.fedpro.AttributeHandleSet.Builder, hla.rti1516_202X.fedpro.AttributeHandleSetOrBuilder>(
                getAttributes(),
                getParentForChildren(),
                isClean());
        attributes_ = null;
      }
      return attributesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest)
  private static final hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest();
  }

  public static hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnpublishObjectClassAttributesRequest>
      PARSER = new com.google.protobuf.AbstractParser<UnpublishObjectClassAttributesRequest>() {
    @java.lang.Override
    public UnpublishObjectClassAttributesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UnpublishObjectClassAttributesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnpublishObjectClassAttributesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.UnpublishObjectClassAttributesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


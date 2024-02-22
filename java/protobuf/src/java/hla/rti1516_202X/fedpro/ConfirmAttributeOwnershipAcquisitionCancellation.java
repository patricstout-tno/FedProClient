// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FederateAmbassador.proto

package hla.rti1516_202X.fedpro;

/**
 * Protobuf type {@code rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation}
 */
public final class ConfirmAttributeOwnershipAcquisitionCancellation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation)
    ConfirmAttributeOwnershipAcquisitionCancellationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConfirmAttributeOwnershipAcquisitionCancellation.newBuilder() to construct.
  private ConfirmAttributeOwnershipAcquisitionCancellation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConfirmAttributeOwnershipAcquisitionCancellation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConfirmAttributeOwnershipAcquisitionCancellation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_ConfirmAttributeOwnershipAcquisitionCancellation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_ConfirmAttributeOwnershipAcquisitionCancellation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation.class, hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation.Builder.class);
  }

  public static final int OBJECTINSTANCE_FIELD_NUMBER = 1;
  private hla.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance_;
  /**
   * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   * @return Whether the objectInstance field is set.
   */
  @java.lang.Override
  public boolean hasObjectInstance() {
    return objectInstance_ != null;
  }
  /**
   * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   * @return The objectInstance.
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.ObjectInstanceHandle getObjectInstance() {
    return objectInstance_ == null ? hla.rti1516_202X.fedpro.ObjectInstanceHandle.getDefaultInstance() : objectInstance_;
  }
  /**
   * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.ObjectInstanceHandleOrBuilder getObjectInstanceOrBuilder() {
    return getObjectInstance();
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
    if (objectInstance_ != null) {
      output.writeMessage(1, getObjectInstance());
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
    if (objectInstance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getObjectInstance());
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
    if (!(obj instanceof hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation other = (hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation) obj;

    if (hasObjectInstance() != other.hasObjectInstance()) return false;
    if (hasObjectInstance()) {
      if (!getObjectInstance()
          .equals(other.getObjectInstance())) return false;
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
    if (hasObjectInstance()) {
      hash = (37 * hash) + OBJECTINSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getObjectInstance().hashCode();
    }
    if (hasAttributes()) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getAttributes().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation parseFrom(
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
  public static Builder newBuilder(hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation prototype) {
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
   * Protobuf type {@code rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation)
      hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_ConfirmAttributeOwnershipAcquisitionCancellation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_ConfirmAttributeOwnershipAcquisitionCancellation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation.class, hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (objectInstanceBuilder_ == null) {
        objectInstance_ = null;
      } else {
        objectInstance_ = null;
        objectInstanceBuilder_ = null;
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
      return hla.rti1516_202X.fedpro.FederateAmbassador.internal_static_rti1516_202X_fedpro_ConfirmAttributeOwnershipAcquisitionCancellation_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation build() {
      hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation buildPartial() {
      hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation result = new hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation(this);
      if (objectInstanceBuilder_ == null) {
        result.objectInstance_ = objectInstance_;
      } else {
        result.objectInstance_ = objectInstanceBuilder_.build();
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
      if (other instanceof hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation) {
        return mergeFrom((hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation other) {
      if (other == hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation.getDefaultInstance()) return this;
      if (other.hasObjectInstance()) {
        mergeObjectInstance(other.getObjectInstance());
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
                  getObjectInstanceFieldBuilder().getBuilder(),
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

    private hla.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.ObjectInstanceHandle, hla.rti1516_202X.fedpro.ObjectInstanceHandle.Builder, hla.rti1516_202X.fedpro.ObjectInstanceHandleOrBuilder> objectInstanceBuilder_;
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     * @return Whether the objectInstance field is set.
     */
    public boolean hasObjectInstance() {
      return objectInstanceBuilder_ != null || objectInstance_ != null;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     * @return The objectInstance.
     */
    public hla.rti1516_202X.fedpro.ObjectInstanceHandle getObjectInstance() {
      if (objectInstanceBuilder_ == null) {
        return objectInstance_ == null ? hla.rti1516_202X.fedpro.ObjectInstanceHandle.getDefaultInstance() : objectInstance_;
      } else {
        return objectInstanceBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    public Builder setObjectInstance(hla.rti1516_202X.fedpro.ObjectInstanceHandle value) {
      if (objectInstanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        objectInstance_ = value;
        onChanged();
      } else {
        objectInstanceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    public Builder setObjectInstance(
        hla.rti1516_202X.fedpro.ObjectInstanceHandle.Builder builderForValue) {
      if (objectInstanceBuilder_ == null) {
        objectInstance_ = builderForValue.build();
        onChanged();
      } else {
        objectInstanceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    public Builder mergeObjectInstance(hla.rti1516_202X.fedpro.ObjectInstanceHandle value) {
      if (objectInstanceBuilder_ == null) {
        if (objectInstance_ != null) {
          objectInstance_ =
            hla.rti1516_202X.fedpro.ObjectInstanceHandle.newBuilder(objectInstance_).mergeFrom(value).buildPartial();
        } else {
          objectInstance_ = value;
        }
        onChanged();
      } else {
        objectInstanceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    public Builder clearObjectInstance() {
      if (objectInstanceBuilder_ == null) {
        objectInstance_ = null;
        onChanged();
      } else {
        objectInstance_ = null;
        objectInstanceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    public hla.rti1516_202X.fedpro.ObjectInstanceHandle.Builder getObjectInstanceBuilder() {
      
      onChanged();
      return getObjectInstanceFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    public hla.rti1516_202X.fedpro.ObjectInstanceHandleOrBuilder getObjectInstanceOrBuilder() {
      if (objectInstanceBuilder_ != null) {
        return objectInstanceBuilder_.getMessageOrBuilder();
      } else {
        return objectInstance_ == null ?
            hla.rti1516_202X.fedpro.ObjectInstanceHandle.getDefaultInstance() : objectInstance_;
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.ObjectInstanceHandle, hla.rti1516_202X.fedpro.ObjectInstanceHandle.Builder, hla.rti1516_202X.fedpro.ObjectInstanceHandleOrBuilder> 
        getObjectInstanceFieldBuilder() {
      if (objectInstanceBuilder_ == null) {
        objectInstanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            hla.rti1516_202X.fedpro.ObjectInstanceHandle, hla.rti1516_202X.fedpro.ObjectInstanceHandle.Builder, hla.rti1516_202X.fedpro.ObjectInstanceHandleOrBuilder>(
                getObjectInstance(),
                getParentForChildren(),
                isClean());
        objectInstance_ = null;
      }
      return objectInstanceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation)
  private static final hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation();
  }

  public static hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfirmAttributeOwnershipAcquisitionCancellation>
      PARSER = new com.google.protobuf.AbstractParser<ConfirmAttributeOwnershipAcquisitionCancellation>() {
    @java.lang.Override
    public ConfirmAttributeOwnershipAcquisitionCancellation parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConfirmAttributeOwnershipAcquisitionCancellation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfirmAttributeOwnershipAcquisitionCancellation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.ConfirmAttributeOwnershipAcquisitionCancellation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


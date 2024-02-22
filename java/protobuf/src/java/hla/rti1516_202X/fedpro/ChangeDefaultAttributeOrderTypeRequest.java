// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RTIambassador.proto

package hla.rti1516_202X.fedpro;

/**
 * Protobuf type {@code rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest}
 */
public final class ChangeDefaultAttributeOrderTypeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest)
    ChangeDefaultAttributeOrderTypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangeDefaultAttributeOrderTypeRequest.newBuilder() to construct.
  private ChangeDefaultAttributeOrderTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangeDefaultAttributeOrderTypeRequest() {
    orderType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChangeDefaultAttributeOrderTypeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_ChangeDefaultAttributeOrderTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_ChangeDefaultAttributeOrderTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest.class, hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest.Builder.class);
  }

  public static final int THEOBJECTCLASS_FIELD_NUMBER = 1;
  private hla.rti1516_202X.fedpro.ObjectClassHandle theObjectClass_;
  /**
   * <code>.rti1516_202X.fedpro.ObjectClassHandle theObjectClass = 1;</code>
   * @return Whether the theObjectClass field is set.
   */
  @java.lang.Override
  public boolean hasTheObjectClass() {
    return theObjectClass_ != null;
  }
  /**
   * <code>.rti1516_202X.fedpro.ObjectClassHandle theObjectClass = 1;</code>
   * @return The theObjectClass.
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.ObjectClassHandle getTheObjectClass() {
    return theObjectClass_ == null ? hla.rti1516_202X.fedpro.ObjectClassHandle.getDefaultInstance() : theObjectClass_;
  }
  /**
   * <code>.rti1516_202X.fedpro.ObjectClassHandle theObjectClass = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.ObjectClassHandleOrBuilder getTheObjectClassOrBuilder() {
    return getTheObjectClass();
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

  public static final int ORDERTYPE_FIELD_NUMBER = 3;
  private int orderType_;
  /**
   * <code>.rti1516_202X.fedpro.OrderType orderType = 3;</code>
   * @return The enum numeric value on the wire for orderType.
   */
  @java.lang.Override public int getOrderTypeValue() {
    return orderType_;
  }
  /**
   * <code>.rti1516_202X.fedpro.OrderType orderType = 3;</code>
   * @return The orderType.
   */
  @java.lang.Override public hla.rti1516_202X.fedpro.OrderType getOrderType() {
    @SuppressWarnings("deprecation")
    hla.rti1516_202X.fedpro.OrderType result = hla.rti1516_202X.fedpro.OrderType.valueOf(orderType_);
    return result == null ? hla.rti1516_202X.fedpro.OrderType.UNRECOGNIZED : result;
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
    if (theObjectClass_ != null) {
      output.writeMessage(1, getTheObjectClass());
    }
    if (attributes_ != null) {
      output.writeMessage(2, getAttributes());
    }
    if (orderType_ != hla.rti1516_202X.fedpro.OrderType.RECEIVE.getNumber()) {
      output.writeEnum(3, orderType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (theObjectClass_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTheObjectClass());
    }
    if (attributes_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAttributes());
    }
    if (orderType_ != hla.rti1516_202X.fedpro.OrderType.RECEIVE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, orderType_);
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
    if (!(obj instanceof hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest other = (hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest) obj;

    if (hasTheObjectClass() != other.hasTheObjectClass()) return false;
    if (hasTheObjectClass()) {
      if (!getTheObjectClass()
          .equals(other.getTheObjectClass())) return false;
    }
    if (hasAttributes() != other.hasAttributes()) return false;
    if (hasAttributes()) {
      if (!getAttributes()
          .equals(other.getAttributes())) return false;
    }
    if (orderType_ != other.orderType_) return false;
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
    if (hasTheObjectClass()) {
      hash = (37 * hash) + THEOBJECTCLASS_FIELD_NUMBER;
      hash = (53 * hash) + getTheObjectClass().hashCode();
    }
    if (hasAttributes()) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getAttributes().hashCode();
    }
    hash = (37 * hash) + ORDERTYPE_FIELD_NUMBER;
    hash = (53 * hash) + orderType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest parseFrom(
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
  public static Builder newBuilder(hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest prototype) {
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
   * Protobuf type {@code rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest)
      hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_ChangeDefaultAttributeOrderTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_ChangeDefaultAttributeOrderTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest.class, hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (theObjectClassBuilder_ == null) {
        theObjectClass_ = null;
      } else {
        theObjectClass_ = null;
        theObjectClassBuilder_ = null;
      }
      if (attributesBuilder_ == null) {
        attributes_ = null;
      } else {
        attributes_ = null;
        attributesBuilder_ = null;
      }
      orderType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_202X.fedpro.RTIambassador.internal_static_rti1516_202X_fedpro_ChangeDefaultAttributeOrderTypeRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest build() {
      hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest buildPartial() {
      hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest result = new hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest(this);
      if (theObjectClassBuilder_ == null) {
        result.theObjectClass_ = theObjectClass_;
      } else {
        result.theObjectClass_ = theObjectClassBuilder_.build();
      }
      if (attributesBuilder_ == null) {
        result.attributes_ = attributes_;
      } else {
        result.attributes_ = attributesBuilder_.build();
      }
      result.orderType_ = orderType_;
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
      if (other instanceof hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest) {
        return mergeFrom((hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest other) {
      if (other == hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest.getDefaultInstance()) return this;
      if (other.hasTheObjectClass()) {
        mergeTheObjectClass(other.getTheObjectClass());
      }
      if (other.hasAttributes()) {
        mergeAttributes(other.getAttributes());
      }
      if (other.orderType_ != 0) {
        setOrderTypeValue(other.getOrderTypeValue());
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
                  getTheObjectClassFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAttributesFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 24: {
              orderType_ = input.readEnum();

              break;
            } // case 24
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

    private hla.rti1516_202X.fedpro.ObjectClassHandle theObjectClass_;
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.ObjectClassHandle, hla.rti1516_202X.fedpro.ObjectClassHandle.Builder, hla.rti1516_202X.fedpro.ObjectClassHandleOrBuilder> theObjectClassBuilder_;
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle theObjectClass = 1;</code>
     * @return Whether the theObjectClass field is set.
     */
    public boolean hasTheObjectClass() {
      return theObjectClassBuilder_ != null || theObjectClass_ != null;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle theObjectClass = 1;</code>
     * @return The theObjectClass.
     */
    public hla.rti1516_202X.fedpro.ObjectClassHandle getTheObjectClass() {
      if (theObjectClassBuilder_ == null) {
        return theObjectClass_ == null ? hla.rti1516_202X.fedpro.ObjectClassHandle.getDefaultInstance() : theObjectClass_;
      } else {
        return theObjectClassBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle theObjectClass = 1;</code>
     */
    public Builder setTheObjectClass(hla.rti1516_202X.fedpro.ObjectClassHandle value) {
      if (theObjectClassBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        theObjectClass_ = value;
        onChanged();
      } else {
        theObjectClassBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle theObjectClass = 1;</code>
     */
    public Builder setTheObjectClass(
        hla.rti1516_202X.fedpro.ObjectClassHandle.Builder builderForValue) {
      if (theObjectClassBuilder_ == null) {
        theObjectClass_ = builderForValue.build();
        onChanged();
      } else {
        theObjectClassBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle theObjectClass = 1;</code>
     */
    public Builder mergeTheObjectClass(hla.rti1516_202X.fedpro.ObjectClassHandle value) {
      if (theObjectClassBuilder_ == null) {
        if (theObjectClass_ != null) {
          theObjectClass_ =
            hla.rti1516_202X.fedpro.ObjectClassHandle.newBuilder(theObjectClass_).mergeFrom(value).buildPartial();
        } else {
          theObjectClass_ = value;
        }
        onChanged();
      } else {
        theObjectClassBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle theObjectClass = 1;</code>
     */
    public Builder clearTheObjectClass() {
      if (theObjectClassBuilder_ == null) {
        theObjectClass_ = null;
        onChanged();
      } else {
        theObjectClass_ = null;
        theObjectClassBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle theObjectClass = 1;</code>
     */
    public hla.rti1516_202X.fedpro.ObjectClassHandle.Builder getTheObjectClassBuilder() {
      
      onChanged();
      return getTheObjectClassFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle theObjectClass = 1;</code>
     */
    public hla.rti1516_202X.fedpro.ObjectClassHandleOrBuilder getTheObjectClassOrBuilder() {
      if (theObjectClassBuilder_ != null) {
        return theObjectClassBuilder_.getMessageOrBuilder();
      } else {
        return theObjectClass_ == null ?
            hla.rti1516_202X.fedpro.ObjectClassHandle.getDefaultInstance() : theObjectClass_;
      }
    }
    /**
     * <code>.rti1516_202X.fedpro.ObjectClassHandle theObjectClass = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        hla.rti1516_202X.fedpro.ObjectClassHandle, hla.rti1516_202X.fedpro.ObjectClassHandle.Builder, hla.rti1516_202X.fedpro.ObjectClassHandleOrBuilder> 
        getTheObjectClassFieldBuilder() {
      if (theObjectClassBuilder_ == null) {
        theObjectClassBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            hla.rti1516_202X.fedpro.ObjectClassHandle, hla.rti1516_202X.fedpro.ObjectClassHandle.Builder, hla.rti1516_202X.fedpro.ObjectClassHandleOrBuilder>(
                getTheObjectClass(),
                getParentForChildren(),
                isClean());
        theObjectClass_ = null;
      }
      return theObjectClassBuilder_;
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

    private int orderType_ = 0;
    /**
     * <code>.rti1516_202X.fedpro.OrderType orderType = 3;</code>
     * @return The enum numeric value on the wire for orderType.
     */
    @java.lang.Override public int getOrderTypeValue() {
      return orderType_;
    }
    /**
     * <code>.rti1516_202X.fedpro.OrderType orderType = 3;</code>
     * @param value The enum numeric value on the wire for orderType to set.
     * @return This builder for chaining.
     */
    public Builder setOrderTypeValue(int value) {
      
      orderType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.OrderType orderType = 3;</code>
     * @return The orderType.
     */
    @java.lang.Override
    public hla.rti1516_202X.fedpro.OrderType getOrderType() {
      @SuppressWarnings("deprecation")
      hla.rti1516_202X.fedpro.OrderType result = hla.rti1516_202X.fedpro.OrderType.valueOf(orderType_);
      return result == null ? hla.rti1516_202X.fedpro.OrderType.UNRECOGNIZED : result;
    }
    /**
     * <code>.rti1516_202X.fedpro.OrderType orderType = 3;</code>
     * @param value The orderType to set.
     * @return This builder for chaining.
     */
    public Builder setOrderType(hla.rti1516_202X.fedpro.OrderType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      orderType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_202X.fedpro.OrderType orderType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderType() {
      
      orderType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest)
  private static final hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest();
  }

  public static hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeDefaultAttributeOrderTypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<ChangeDefaultAttributeOrderTypeRequest>() {
    @java.lang.Override
    public ChangeDefaultAttributeOrderTypeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChangeDefaultAttributeOrderTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeDefaultAttributeOrderTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.ChangeDefaultAttributeOrderTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

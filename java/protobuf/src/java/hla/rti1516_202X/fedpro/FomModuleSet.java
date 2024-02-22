// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datatypes.proto

package hla.rti1516_202X.fedpro;

/**
 * <pre>
 * Set of FomModule elements.
 * The set shall not contain duplicate elements.
 * </pre>
 *
 * Protobuf type {@code rti1516_202X.fedpro.FomModuleSet}
 */
public final class FomModuleSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rti1516_202X.fedpro.FomModuleSet)
    FomModuleSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FomModuleSet.newBuilder() to construct.
  private FomModuleSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FomModuleSet() {
    fomModule_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FomModuleSet();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FomModuleSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FomModuleSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_202X.fedpro.FomModuleSet.class, hla.rti1516_202X.fedpro.FomModuleSet.Builder.class);
  }

  public static final int FOMMODULE_FIELD_NUMBER = 1;
  private java.util.List<hla.rti1516_202X.fedpro.FomModule> fomModule_;
  /**
   * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
   */
  @java.lang.Override
  public java.util.List<hla.rti1516_202X.fedpro.FomModule> getFomModuleList() {
    return fomModule_;
  }
  /**
   * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends hla.rti1516_202X.fedpro.FomModuleOrBuilder> 
      getFomModuleOrBuilderList() {
    return fomModule_;
  }
  /**
   * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
   */
  @java.lang.Override
  public int getFomModuleCount() {
    return fomModule_.size();
  }
  /**
   * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.FomModule getFomModule(int index) {
    return fomModule_.get(index);
  }
  /**
   * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_202X.fedpro.FomModuleOrBuilder getFomModuleOrBuilder(
      int index) {
    return fomModule_.get(index);
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
    for (int i = 0; i < fomModule_.size(); i++) {
      output.writeMessage(1, fomModule_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < fomModule_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, fomModule_.get(i));
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
    if (!(obj instanceof hla.rti1516_202X.fedpro.FomModuleSet)) {
      return super.equals(obj);
    }
    hla.rti1516_202X.fedpro.FomModuleSet other = (hla.rti1516_202X.fedpro.FomModuleSet) obj;

    if (!getFomModuleList()
        .equals(other.getFomModuleList())) return false;
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
    if (getFomModuleCount() > 0) {
      hash = (37 * hash) + FOMMODULE_FIELD_NUMBER;
      hash = (53 * hash) + getFomModuleList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_202X.fedpro.FomModuleSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.FomModuleSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FomModuleSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.FomModuleSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FomModuleSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_202X.fedpro.FomModuleSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FomModuleSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.FomModuleSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FomModuleSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.FomModuleSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_202X.fedpro.FomModuleSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_202X.fedpro.FomModuleSet parseFrom(
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
  public static Builder newBuilder(hla.rti1516_202X.fedpro.FomModuleSet prototype) {
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
   * <pre>
   * Set of FomModule elements.
   * The set shall not contain duplicate elements.
   * </pre>
   *
   * Protobuf type {@code rti1516_202X.fedpro.FomModuleSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_202X.fedpro.FomModuleSet)
      hla.rti1516_202X.fedpro.FomModuleSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FomModuleSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FomModuleSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_202X.fedpro.FomModuleSet.class, hla.rti1516_202X.fedpro.FomModuleSet.Builder.class);
    }

    // Construct using hla.rti1516_202X.fedpro.FomModuleSet.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (fomModuleBuilder_ == null) {
        fomModule_ = java.util.Collections.emptyList();
      } else {
        fomModule_ = null;
        fomModuleBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_202X.fedpro.Datatypes.internal_static_rti1516_202X_fedpro_FomModuleSet_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.FomModuleSet getDefaultInstanceForType() {
      return hla.rti1516_202X.fedpro.FomModuleSet.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.FomModuleSet build() {
      hla.rti1516_202X.fedpro.FomModuleSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_202X.fedpro.FomModuleSet buildPartial() {
      hla.rti1516_202X.fedpro.FomModuleSet result = new hla.rti1516_202X.fedpro.FomModuleSet(this);
      int from_bitField0_ = bitField0_;
      if (fomModuleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fomModule_ = java.util.Collections.unmodifiableList(fomModule_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fomModule_ = fomModule_;
      } else {
        result.fomModule_ = fomModuleBuilder_.build();
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
      if (other instanceof hla.rti1516_202X.fedpro.FomModuleSet) {
        return mergeFrom((hla.rti1516_202X.fedpro.FomModuleSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_202X.fedpro.FomModuleSet other) {
      if (other == hla.rti1516_202X.fedpro.FomModuleSet.getDefaultInstance()) return this;
      if (fomModuleBuilder_ == null) {
        if (!other.fomModule_.isEmpty()) {
          if (fomModule_.isEmpty()) {
            fomModule_ = other.fomModule_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFomModuleIsMutable();
            fomModule_.addAll(other.fomModule_);
          }
          onChanged();
        }
      } else {
        if (!other.fomModule_.isEmpty()) {
          if (fomModuleBuilder_.isEmpty()) {
            fomModuleBuilder_.dispose();
            fomModuleBuilder_ = null;
            fomModule_ = other.fomModule_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fomModuleBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFomModuleFieldBuilder() : null;
          } else {
            fomModuleBuilder_.addAllMessages(other.fomModule_);
          }
        }
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
              hla.rti1516_202X.fedpro.FomModule m =
                  input.readMessage(
                      hla.rti1516_202X.fedpro.FomModule.parser(),
                      extensionRegistry);
              if (fomModuleBuilder_ == null) {
                ensureFomModuleIsMutable();
                fomModule_.add(m);
              } else {
                fomModuleBuilder_.addMessage(m);
              }
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
    private int bitField0_;

    private java.util.List<hla.rti1516_202X.fedpro.FomModule> fomModule_ =
      java.util.Collections.emptyList();
    private void ensureFomModuleIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fomModule_ = new java.util.ArrayList<hla.rti1516_202X.fedpro.FomModule>(fomModule_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        hla.rti1516_202X.fedpro.FomModule, hla.rti1516_202X.fedpro.FomModule.Builder, hla.rti1516_202X.fedpro.FomModuleOrBuilder> fomModuleBuilder_;

    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public java.util.List<hla.rti1516_202X.fedpro.FomModule> getFomModuleList() {
      if (fomModuleBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fomModule_);
      } else {
        return fomModuleBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public int getFomModuleCount() {
      if (fomModuleBuilder_ == null) {
        return fomModule_.size();
      } else {
        return fomModuleBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public hla.rti1516_202X.fedpro.FomModule getFomModule(int index) {
      if (fomModuleBuilder_ == null) {
        return fomModule_.get(index);
      } else {
        return fomModuleBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public Builder setFomModule(
        int index, hla.rti1516_202X.fedpro.FomModule value) {
      if (fomModuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFomModuleIsMutable();
        fomModule_.set(index, value);
        onChanged();
      } else {
        fomModuleBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public Builder setFomModule(
        int index, hla.rti1516_202X.fedpro.FomModule.Builder builderForValue) {
      if (fomModuleBuilder_ == null) {
        ensureFomModuleIsMutable();
        fomModule_.set(index, builderForValue.build());
        onChanged();
      } else {
        fomModuleBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public Builder addFomModule(hla.rti1516_202X.fedpro.FomModule value) {
      if (fomModuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFomModuleIsMutable();
        fomModule_.add(value);
        onChanged();
      } else {
        fomModuleBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public Builder addFomModule(
        int index, hla.rti1516_202X.fedpro.FomModule value) {
      if (fomModuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFomModuleIsMutable();
        fomModule_.add(index, value);
        onChanged();
      } else {
        fomModuleBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public Builder addFomModule(
        hla.rti1516_202X.fedpro.FomModule.Builder builderForValue) {
      if (fomModuleBuilder_ == null) {
        ensureFomModuleIsMutable();
        fomModule_.add(builderForValue.build());
        onChanged();
      } else {
        fomModuleBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public Builder addFomModule(
        int index, hla.rti1516_202X.fedpro.FomModule.Builder builderForValue) {
      if (fomModuleBuilder_ == null) {
        ensureFomModuleIsMutable();
        fomModule_.add(index, builderForValue.build());
        onChanged();
      } else {
        fomModuleBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public Builder addAllFomModule(
        java.lang.Iterable<? extends hla.rti1516_202X.fedpro.FomModule> values) {
      if (fomModuleBuilder_ == null) {
        ensureFomModuleIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fomModule_);
        onChanged();
      } else {
        fomModuleBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public Builder clearFomModule() {
      if (fomModuleBuilder_ == null) {
        fomModule_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fomModuleBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public Builder removeFomModule(int index) {
      if (fomModuleBuilder_ == null) {
        ensureFomModuleIsMutable();
        fomModule_.remove(index);
        onChanged();
      } else {
        fomModuleBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public hla.rti1516_202X.fedpro.FomModule.Builder getFomModuleBuilder(
        int index) {
      return getFomModuleFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public hla.rti1516_202X.fedpro.FomModuleOrBuilder getFomModuleOrBuilder(
        int index) {
      if (fomModuleBuilder_ == null) {
        return fomModule_.get(index);  } else {
        return fomModuleBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public java.util.List<? extends hla.rti1516_202X.fedpro.FomModuleOrBuilder> 
         getFomModuleOrBuilderList() {
      if (fomModuleBuilder_ != null) {
        return fomModuleBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fomModule_);
      }
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public hla.rti1516_202X.fedpro.FomModule.Builder addFomModuleBuilder() {
      return getFomModuleFieldBuilder().addBuilder(
          hla.rti1516_202X.fedpro.FomModule.getDefaultInstance());
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public hla.rti1516_202X.fedpro.FomModule.Builder addFomModuleBuilder(
        int index) {
      return getFomModuleFieldBuilder().addBuilder(
          index, hla.rti1516_202X.fedpro.FomModule.getDefaultInstance());
    }
    /**
     * <code>repeated .rti1516_202X.fedpro.FomModule fomModule = 1;</code>
     */
    public java.util.List<hla.rti1516_202X.fedpro.FomModule.Builder> 
         getFomModuleBuilderList() {
      return getFomModuleFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        hla.rti1516_202X.fedpro.FomModule, hla.rti1516_202X.fedpro.FomModule.Builder, hla.rti1516_202X.fedpro.FomModuleOrBuilder> 
        getFomModuleFieldBuilder() {
      if (fomModuleBuilder_ == null) {
        fomModuleBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            hla.rti1516_202X.fedpro.FomModule, hla.rti1516_202X.fedpro.FomModule.Builder, hla.rti1516_202X.fedpro.FomModuleOrBuilder>(
                fomModule_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        fomModule_ = null;
      }
      return fomModuleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rti1516_202X.fedpro.FomModuleSet)
  }

  // @@protoc_insertion_point(class_scope:rti1516_202X.fedpro.FomModuleSet)
  private static final hla.rti1516_202X.fedpro.FomModuleSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_202X.fedpro.FomModuleSet();
  }

  public static hla.rti1516_202X.fedpro.FomModuleSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FomModuleSet>
      PARSER = new com.google.protobuf.AbstractParser<FomModuleSet>() {
    @java.lang.Override
    public FomModuleSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<FomModuleSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FomModuleSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_202X.fedpro.FomModuleSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


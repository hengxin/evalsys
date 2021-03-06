// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: prepareMessage.proto

package io.grpc.prepare;

/**
 * <pre>
 *要包含一次完整的事务
 * </pre>
 *
 * Protobuf type {@code rpgc.PrepareRequest}
 */
public final class PrepareRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpgc.PrepareRequest)
    PrepareRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrepareRequest.newBuilder() to construct.
  private PrepareRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrepareRequest() {
    access_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrepareRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PrepareRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            txnId_ = input.readInt64();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              access_ = new java.util.ArrayList<io.grpc.prepare.Access>();
              mutable_bitField0_ |= 0x00000001;
            }
            access_.add(
                input.readMessage(io.grpc.prepare.Access.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        access_ = java.util.Collections.unmodifiableList(access_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.prepare.prepareMsgProto.internal_static_rpgc_PrepareRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.prepare.prepareMsgProto.internal_static_rpgc_PrepareRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.prepare.PrepareRequest.class, io.grpc.prepare.PrepareRequest.Builder.class);
  }

  public static final int TXNID_FIELD_NUMBER = 1;
  private long txnId_;
  /**
   * <code>int64 txnId = 1;</code>
   * @return The txnId.
   */
  @java.lang.Override
  public long getTxnId() {
    return txnId_;
  }

  public static final int ACCESS_FIELD_NUMBER = 2;
  private java.util.List<io.grpc.prepare.Access> access_;
  /**
   * <pre>
   *一个事务包含多个操作
   * </pre>
   *
   * <code>repeated .rpgc.Access access = 2;</code>
   */
  @java.lang.Override
  public java.util.List<io.grpc.prepare.Access> getAccessList() {
    return access_;
  }
  /**
   * <pre>
   *一个事务包含多个操作
   * </pre>
   *
   * <code>repeated .rpgc.Access access = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grpc.prepare.AccessOrBuilder> 
      getAccessOrBuilderList() {
    return access_;
  }
  /**
   * <pre>
   *一个事务包含多个操作
   * </pre>
   *
   * <code>repeated .rpgc.Access access = 2;</code>
   */
  @java.lang.Override
  public int getAccessCount() {
    return access_.size();
  }
  /**
   * <pre>
   *一个事务包含多个操作
   * </pre>
   *
   * <code>repeated .rpgc.Access access = 2;</code>
   */
  @java.lang.Override
  public io.grpc.prepare.Access getAccess(int index) {
    return access_.get(index);
  }
  /**
   * <pre>
   *一个事务包含多个操作
   * </pre>
   *
   * <code>repeated .rpgc.Access access = 2;</code>
   */
  @java.lang.Override
  public io.grpc.prepare.AccessOrBuilder getAccessOrBuilder(
      int index) {
    return access_.get(index);
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
    if (txnId_ != 0L) {
      output.writeInt64(1, txnId_);
    }
    for (int i = 0; i < access_.size(); i++) {
      output.writeMessage(2, access_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (txnId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, txnId_);
    }
    for (int i = 0; i < access_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, access_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.prepare.PrepareRequest)) {
      return super.equals(obj);
    }
    io.grpc.prepare.PrepareRequest other = (io.grpc.prepare.PrepareRequest) obj;

    if (getTxnId()
        != other.getTxnId()) return false;
    if (!getAccessList()
        .equals(other.getAccessList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TXNID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTxnId());
    if (getAccessCount() > 0) {
      hash = (37 * hash) + ACCESS_FIELD_NUMBER;
      hash = (53 * hash) + getAccessList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.prepare.PrepareRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.prepare.PrepareRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.prepare.PrepareRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.prepare.PrepareRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.prepare.PrepareRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.prepare.PrepareRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.prepare.PrepareRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.prepare.PrepareRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.prepare.PrepareRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.prepare.PrepareRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.prepare.PrepareRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.prepare.PrepareRequest parseFrom(
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
  public static Builder newBuilder(io.grpc.prepare.PrepareRequest prototype) {
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
   *要包含一次完整的事务
   * </pre>
   *
   * Protobuf type {@code rpgc.PrepareRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpgc.PrepareRequest)
      io.grpc.prepare.PrepareRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.prepare.prepareMsgProto.internal_static_rpgc_PrepareRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.prepare.prepareMsgProto.internal_static_rpgc_PrepareRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.prepare.PrepareRequest.class, io.grpc.prepare.PrepareRequest.Builder.class);
    }

    // Construct using io.grpc.prepare.PrepareRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAccessFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      txnId_ = 0L;

      if (accessBuilder_ == null) {
        access_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        accessBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.prepare.prepareMsgProto.internal_static_rpgc_PrepareRequest_descriptor;
    }

    @java.lang.Override
    public io.grpc.prepare.PrepareRequest getDefaultInstanceForType() {
      return io.grpc.prepare.PrepareRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.prepare.PrepareRequest build() {
      io.grpc.prepare.PrepareRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.prepare.PrepareRequest buildPartial() {
      io.grpc.prepare.PrepareRequest result = new io.grpc.prepare.PrepareRequest(this);
      int from_bitField0_ = bitField0_;
      result.txnId_ = txnId_;
      if (accessBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          access_ = java.util.Collections.unmodifiableList(access_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.access_ = access_;
      } else {
        result.access_ = accessBuilder_.build();
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
      if (other instanceof io.grpc.prepare.PrepareRequest) {
        return mergeFrom((io.grpc.prepare.PrepareRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.prepare.PrepareRequest other) {
      if (other == io.grpc.prepare.PrepareRequest.getDefaultInstance()) return this;
      if (other.getTxnId() != 0L) {
        setTxnId(other.getTxnId());
      }
      if (accessBuilder_ == null) {
        if (!other.access_.isEmpty()) {
          if (access_.isEmpty()) {
            access_ = other.access_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccessIsMutable();
            access_.addAll(other.access_);
          }
          onChanged();
        }
      } else {
        if (!other.access_.isEmpty()) {
          if (accessBuilder_.isEmpty()) {
            accessBuilder_.dispose();
            accessBuilder_ = null;
            access_ = other.access_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accessBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAccessFieldBuilder() : null;
          } else {
            accessBuilder_.addAllMessages(other.access_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      io.grpc.prepare.PrepareRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.prepare.PrepareRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long txnId_ ;
    /**
     * <code>int64 txnId = 1;</code>
     * @return The txnId.
     */
    @java.lang.Override
    public long getTxnId() {
      return txnId_;
    }
    /**
     * <code>int64 txnId = 1;</code>
     * @param value The txnId to set.
     * @return This builder for chaining.
     */
    public Builder setTxnId(long value) {
      
      txnId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 txnId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTxnId() {
      
      txnId_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<io.grpc.prepare.Access> access_ =
      java.util.Collections.emptyList();
    private void ensureAccessIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        access_ = new java.util.ArrayList<io.grpc.prepare.Access>(access_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.prepare.Access, io.grpc.prepare.Access.Builder, io.grpc.prepare.AccessOrBuilder> accessBuilder_;

    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public java.util.List<io.grpc.prepare.Access> getAccessList() {
      if (accessBuilder_ == null) {
        return java.util.Collections.unmodifiableList(access_);
      } else {
        return accessBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public int getAccessCount() {
      if (accessBuilder_ == null) {
        return access_.size();
      } else {
        return accessBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public io.grpc.prepare.Access getAccess(int index) {
      if (accessBuilder_ == null) {
        return access_.get(index);
      } else {
        return accessBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public Builder setAccess(
        int index, io.grpc.prepare.Access value) {
      if (accessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessIsMutable();
        access_.set(index, value);
        onChanged();
      } else {
        accessBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public Builder setAccess(
        int index, io.grpc.prepare.Access.Builder builderForValue) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        access_.set(index, builderForValue.build());
        onChanged();
      } else {
        accessBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public Builder addAccess(io.grpc.prepare.Access value) {
      if (accessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessIsMutable();
        access_.add(value);
        onChanged();
      } else {
        accessBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public Builder addAccess(
        int index, io.grpc.prepare.Access value) {
      if (accessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessIsMutable();
        access_.add(index, value);
        onChanged();
      } else {
        accessBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public Builder addAccess(
        io.grpc.prepare.Access.Builder builderForValue) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        access_.add(builderForValue.build());
        onChanged();
      } else {
        accessBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public Builder addAccess(
        int index, io.grpc.prepare.Access.Builder builderForValue) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        access_.add(index, builderForValue.build());
        onChanged();
      } else {
        accessBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public Builder addAllAccess(
        java.lang.Iterable<? extends io.grpc.prepare.Access> values) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, access_);
        onChanged();
      } else {
        accessBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public Builder clearAccess() {
      if (accessBuilder_ == null) {
        access_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accessBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public Builder removeAccess(int index) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        access_.remove(index);
        onChanged();
      } else {
        accessBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public io.grpc.prepare.Access.Builder getAccessBuilder(
        int index) {
      return getAccessFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public io.grpc.prepare.AccessOrBuilder getAccessOrBuilder(
        int index) {
      if (accessBuilder_ == null) {
        return access_.get(index);  } else {
        return accessBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public java.util.List<? extends io.grpc.prepare.AccessOrBuilder> 
         getAccessOrBuilderList() {
      if (accessBuilder_ != null) {
        return accessBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(access_);
      }
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public io.grpc.prepare.Access.Builder addAccessBuilder() {
      return getAccessFieldBuilder().addBuilder(
          io.grpc.prepare.Access.getDefaultInstance());
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public io.grpc.prepare.Access.Builder addAccessBuilder(
        int index) {
      return getAccessFieldBuilder().addBuilder(
          index, io.grpc.prepare.Access.getDefaultInstance());
    }
    /**
     * <pre>
     *一个事务包含多个操作
     * </pre>
     *
     * <code>repeated .rpgc.Access access = 2;</code>
     */
    public java.util.List<io.grpc.prepare.Access.Builder> 
         getAccessBuilderList() {
      return getAccessFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.prepare.Access, io.grpc.prepare.Access.Builder, io.grpc.prepare.AccessOrBuilder> 
        getAccessFieldBuilder() {
      if (accessBuilder_ == null) {
        accessBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grpc.prepare.Access, io.grpc.prepare.Access.Builder, io.grpc.prepare.AccessOrBuilder>(
                access_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        access_ = null;
      }
      return accessBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rpgc.PrepareRequest)
  }

  // @@protoc_insertion_point(class_scope:rpgc.PrepareRequest)
  private static final io.grpc.prepare.PrepareRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.prepare.PrepareRequest();
  }

  public static io.grpc.prepare.PrepareRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrepareRequest>
      PARSER = new com.google.protobuf.AbstractParser<PrepareRequest>() {
    @java.lang.Override
    public PrepareRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PrepareRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PrepareRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrepareRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.prepare.PrepareRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


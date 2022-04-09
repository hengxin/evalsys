// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: prepareMessage.proto

package io.grpc.prepare;

/**
 * <pre>
 *行
 * </pre>
 *
 * Protobuf type {@code rpgc.Row}
 */
public final class Row extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpgc.Row)
    RowOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Row.newBuilder() to construct.
  private Row(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Row() {
    data_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Row();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Row(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            primaryKey_ = input.readInt64();
            break;
          }
          case 16: {

            partId_ = input.readInt64();
            break;
          }
          case 24: {

            rowId_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            data_ = s;
            break;
          }
          case 42: {
            io.grpc.prepare.Table.Builder subBuilder = null;
            if (table_ != null) {
              subBuilder = table_.toBuilder();
            }
            table_ = input.readMessage(io.grpc.prepare.Table.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(table_);
              table_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.prepare.prepareMsgProto.internal_static_rpgc_Row_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.prepare.prepareMsgProto.internal_static_rpgc_Row_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.prepare.Row.class, io.grpc.prepare.Row.Builder.class);
  }

  public static final int PRIMARYKEY_FIELD_NUMBER = 1;
  private long primaryKey_;
  /**
   * <code>int64 primaryKey = 1;</code>
   * @return The primaryKey.
   */
  @java.lang.Override
  public long getPrimaryKey() {
    return primaryKey_;
  }

  public static final int PARTID_FIELD_NUMBER = 2;
  private long partId_;
  /**
   * <code>int64 partId = 2;</code>
   * @return The partId.
   */
  @java.lang.Override
  public long getPartId() {
    return partId_;
  }

  public static final int ROWID_FIELD_NUMBER = 3;
  private long rowId_;
  /**
   * <code>int64 rowId = 3;</code>
   * @return The rowId.
   */
  @java.lang.Override
  public long getRowId() {
    return rowId_;
  }

  public static final int DATA_FIELD_NUMBER = 4;
  private volatile java.lang.Object data_;
  /**
   * <pre>
   *value
   * </pre>
   *
   * <code>string data = 4;</code>
   * @return The data.
   */
  @java.lang.Override
  public java.lang.String getData() {
    java.lang.Object ref = data_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      data_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *value
   * </pre>
   *
   * <code>string data = 4;</code>
   * @return The bytes for data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataBytes() {
    java.lang.Object ref = data_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      data_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TABLE_FIELD_NUMBER = 5;
  private io.grpc.prepare.Table table_;
  /**
   * <code>.rpgc.Table table = 5;</code>
   * @return Whether the table field is set.
   */
  @java.lang.Override
  public boolean hasTable() {
    return table_ != null;
  }
  /**
   * <code>.rpgc.Table table = 5;</code>
   * @return The table.
   */
  @java.lang.Override
  public io.grpc.prepare.Table getTable() {
    return table_ == null ? io.grpc.prepare.Table.getDefaultInstance() : table_;
  }
  /**
   * <code>.rpgc.Table table = 5;</code>
   */
  @java.lang.Override
  public io.grpc.prepare.TableOrBuilder getTableOrBuilder() {
    return getTable();
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
    if (primaryKey_ != 0L) {
      output.writeInt64(1, primaryKey_);
    }
    if (partId_ != 0L) {
      output.writeInt64(2, partId_);
    }
    if (rowId_ != 0L) {
      output.writeInt64(3, rowId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(data_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, data_);
    }
    if (table_ != null) {
      output.writeMessage(5, getTable());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (primaryKey_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, primaryKey_);
    }
    if (partId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, partId_);
    }
    if (rowId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, rowId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(data_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, data_);
    }
    if (table_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getTable());
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
    if (!(obj instanceof io.grpc.prepare.Row)) {
      return super.equals(obj);
    }
    io.grpc.prepare.Row other = (io.grpc.prepare.Row) obj;

    if (getPrimaryKey()
        != other.getPrimaryKey()) return false;
    if (getPartId()
        != other.getPartId()) return false;
    if (getRowId()
        != other.getRowId()) return false;
    if (!getData()
        .equals(other.getData())) return false;
    if (hasTable() != other.hasTable()) return false;
    if (hasTable()) {
      if (!getTable()
          .equals(other.getTable())) return false;
    }
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
    hash = (37 * hash) + PRIMARYKEY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrimaryKey());
    hash = (37 * hash) + PARTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPartId());
    hash = (37 * hash) + ROWID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRowId());
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    if (hasTable()) {
      hash = (37 * hash) + TABLE_FIELD_NUMBER;
      hash = (53 * hash) + getTable().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.prepare.Row parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.prepare.Row parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.prepare.Row parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.prepare.Row parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.prepare.Row parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.prepare.Row parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.prepare.Row parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.prepare.Row parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.prepare.Row parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.prepare.Row parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.prepare.Row parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.prepare.Row parseFrom(
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
  public static Builder newBuilder(io.grpc.prepare.Row prototype) {
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
   *行
   * </pre>
   *
   * Protobuf type {@code rpgc.Row}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpgc.Row)
      io.grpc.prepare.RowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.prepare.prepareMsgProto.internal_static_rpgc_Row_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.prepare.prepareMsgProto.internal_static_rpgc_Row_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.prepare.Row.class, io.grpc.prepare.Row.Builder.class);
    }

    // Construct using io.grpc.prepare.Row.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      primaryKey_ = 0L;

      partId_ = 0L;

      rowId_ = 0L;

      data_ = "";

      if (tableBuilder_ == null) {
        table_ = null;
      } else {
        table_ = null;
        tableBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.prepare.prepareMsgProto.internal_static_rpgc_Row_descriptor;
    }

    @java.lang.Override
    public io.grpc.prepare.Row getDefaultInstanceForType() {
      return io.grpc.prepare.Row.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.prepare.Row build() {
      io.grpc.prepare.Row result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.prepare.Row buildPartial() {
      io.grpc.prepare.Row result = new io.grpc.prepare.Row(this);
      result.primaryKey_ = primaryKey_;
      result.partId_ = partId_;
      result.rowId_ = rowId_;
      result.data_ = data_;
      if (tableBuilder_ == null) {
        result.table_ = table_;
      } else {
        result.table_ = tableBuilder_.build();
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
      if (other instanceof io.grpc.prepare.Row) {
        return mergeFrom((io.grpc.prepare.Row)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.prepare.Row other) {
      if (other == io.grpc.prepare.Row.getDefaultInstance()) return this;
      if (other.getPrimaryKey() != 0L) {
        setPrimaryKey(other.getPrimaryKey());
      }
      if (other.getPartId() != 0L) {
        setPartId(other.getPartId());
      }
      if (other.getRowId() != 0L) {
        setRowId(other.getRowId());
      }
      if (!other.getData().isEmpty()) {
        data_ = other.data_;
        onChanged();
      }
      if (other.hasTable()) {
        mergeTable(other.getTable());
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
      io.grpc.prepare.Row parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.prepare.Row) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long primaryKey_ ;
    /**
     * <code>int64 primaryKey = 1;</code>
     * @return The primaryKey.
     */
    @java.lang.Override
    public long getPrimaryKey() {
      return primaryKey_;
    }
    /**
     * <code>int64 primaryKey = 1;</code>
     * @param value The primaryKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryKey(long value) {
      
      primaryKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 primaryKey = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrimaryKey() {
      
      primaryKey_ = 0L;
      onChanged();
      return this;
    }

    private long partId_ ;
    /**
     * <code>int64 partId = 2;</code>
     * @return The partId.
     */
    @java.lang.Override
    public long getPartId() {
      return partId_;
    }
    /**
     * <code>int64 partId = 2;</code>
     * @param value The partId to set.
     * @return This builder for chaining.
     */
    public Builder setPartId(long value) {
      
      partId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 partId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartId() {
      
      partId_ = 0L;
      onChanged();
      return this;
    }

    private long rowId_ ;
    /**
     * <code>int64 rowId = 3;</code>
     * @return The rowId.
     */
    @java.lang.Override
    public long getRowId() {
      return rowId_;
    }
    /**
     * <code>int64 rowId = 3;</code>
     * @param value The rowId to set.
     * @return This builder for chaining.
     */
    public Builder setRowId(long value) {
      
      rowId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 rowId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRowId() {
      
      rowId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object data_ = "";
    /**
     * <pre>
     *value
     * </pre>
     *
     * <code>string data = 4;</code>
     * @return The data.
     */
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        data_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *value
     * </pre>
     *
     * <code>string data = 4;</code>
     * @return The bytes for data.
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *value
     * </pre>
     *
     * <code>string data = 4;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *value
     * </pre>
     *
     * <code>string data = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *value
     * </pre>
     *
     * <code>string data = 4;</code>
     * @param value The bytes for data to set.
     * @return This builder for chaining.
     */
    public Builder setDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      data_ = value;
      onChanged();
      return this;
    }

    private io.grpc.prepare.Table table_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.prepare.Table, io.grpc.prepare.Table.Builder, io.grpc.prepare.TableOrBuilder> tableBuilder_;
    /**
     * <code>.rpgc.Table table = 5;</code>
     * @return Whether the table field is set.
     */
    public boolean hasTable() {
      return tableBuilder_ != null || table_ != null;
    }
    /**
     * <code>.rpgc.Table table = 5;</code>
     * @return The table.
     */
    public io.grpc.prepare.Table getTable() {
      if (tableBuilder_ == null) {
        return table_ == null ? io.grpc.prepare.Table.getDefaultInstance() : table_;
      } else {
        return tableBuilder_.getMessage();
      }
    }
    /**
     * <code>.rpgc.Table table = 5;</code>
     */
    public Builder setTable(io.grpc.prepare.Table value) {
      if (tableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        table_ = value;
        onChanged();
      } else {
        tableBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rpgc.Table table = 5;</code>
     */
    public Builder setTable(
        io.grpc.prepare.Table.Builder builderForValue) {
      if (tableBuilder_ == null) {
        table_ = builderForValue.build();
        onChanged();
      } else {
        tableBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rpgc.Table table = 5;</code>
     */
    public Builder mergeTable(io.grpc.prepare.Table value) {
      if (tableBuilder_ == null) {
        if (table_ != null) {
          table_ =
            io.grpc.prepare.Table.newBuilder(table_).mergeFrom(value).buildPartial();
        } else {
          table_ = value;
        }
        onChanged();
      } else {
        tableBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rpgc.Table table = 5;</code>
     */
    public Builder clearTable() {
      if (tableBuilder_ == null) {
        table_ = null;
        onChanged();
      } else {
        table_ = null;
        tableBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rpgc.Table table = 5;</code>
     */
    public io.grpc.prepare.Table.Builder getTableBuilder() {
      
      onChanged();
      return getTableFieldBuilder().getBuilder();
    }
    /**
     * <code>.rpgc.Table table = 5;</code>
     */
    public io.grpc.prepare.TableOrBuilder getTableOrBuilder() {
      if (tableBuilder_ != null) {
        return tableBuilder_.getMessageOrBuilder();
      } else {
        return table_ == null ?
            io.grpc.prepare.Table.getDefaultInstance() : table_;
      }
    }
    /**
     * <code>.rpgc.Table table = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.prepare.Table, io.grpc.prepare.Table.Builder, io.grpc.prepare.TableOrBuilder> 
        getTableFieldBuilder() {
      if (tableBuilder_ == null) {
        tableBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.prepare.Table, io.grpc.prepare.Table.Builder, io.grpc.prepare.TableOrBuilder>(
                getTable(),
                getParentForChildren(),
                isClean());
        table_ = null;
      }
      return tableBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rpgc.Row)
  }

  // @@protoc_insertion_point(class_scope:rpgc.Row)
  private static final io.grpc.prepare.Row DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.prepare.Row();
  }

  public static io.grpc.prepare.Row getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Row>
      PARSER = new com.google.protobuf.AbstractParser<Row>() {
    @java.lang.Override
    public Row parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Row(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Row> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Row> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.prepare.Row getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: prepareMessage.proto

package io.grpc.prepare;

public final class prepareMsgProto {
  private prepareMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpgc_PrepareRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpgc_PrepareRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpgc_Access_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpgc_Access_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpgc_Row_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpgc_Row_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpgc_Table_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpgc_Table_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpgc_Reply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpgc_Reply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024prepareMessage.proto\022\004rpgc\032\033google/pro" +
      "tobuf/empty.proto\"=\n\016PrepareRequest\022\r\n\005t" +
      "xnId\030\001 \001(\003\022\034\n\006access\030\002 \003(\0132\014.rpgc.Access" +
      "\"8\n\006Access\".\n\nAccessType\022\006\n\002RD\020\000\022\006\n\002WR\020\001" +
      "\022\006\n\002XP\020\002\022\010\n\004SCAN\020\003\"b\n\003Row\022\022\n\nprimaryKey\030" +
      "\001 \001(\003\022\016\n\006partId\030\002 \001(\003\022\r\n\005rowId\030\003 \001(\003\022\014\n\004" +
      "data\030\004 \001(\t\022\032\n\005table\030\005 \001(\0132\013.rpgc.Table\"+" +
      "\n\005Table\022\021\n\ttableName\030\001 \001(\t\022\017\n\007tableId\030\002 " +
      "\001(\003\"\024\n\005Reply\022\013\n\003msg\030\001 \001(\t2J\n\021PrepareMsgS" +
      "ervice\0225\n\016sendPrepareMsg\022\024.rpgc.PrepareR" +
      "equest\032\013.rpgc.Reply\"\000B$\n\017io.grpc.prepare" +
      "B\017prepareMsgProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_rpgc_PrepareRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rpgc_PrepareRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpgc_PrepareRequest_descriptor,
        new java.lang.String[] { "TxnId", "Access", });
    internal_static_rpgc_Access_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_rpgc_Access_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpgc_Access_descriptor,
        new java.lang.String[] { });
    internal_static_rpgc_Row_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_rpgc_Row_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpgc_Row_descriptor,
        new java.lang.String[] { "PrimaryKey", "PartId", "RowId", "Data", "Table", });
    internal_static_rpgc_Table_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_rpgc_Table_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpgc_Table_descriptor,
        new java.lang.String[] { "TableName", "TableId", });
    internal_static_rpgc_Reply_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_rpgc_Reply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpgc_Reply_descriptor,
        new java.lang.String[] { "Msg", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

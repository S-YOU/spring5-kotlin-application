// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task.proto

package app.grpc.server.gen.task;

public final class TaskServiceProto {
  private TaskServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_TaskInbound_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_TaskInbound_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_TaskListInbound_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_TaskListInbound_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_CreateTaskInbound_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_CreateTaskInbound_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_UpdateTaskInbound_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_UpdateTaskInbound_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_TaskOutbound_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_TaskOutbound_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntask.proto\022\010messages\032\034google/api/annot" +
      "ations.proto\"\036\n\013TaskInbound\022\017\n\007task_id\030\001" +
      " \001(\r\"\037\n\017TaskListInbound\022\014\n\004page\030\001 \001(\r\"\"\n" +
      "\021CreateTaskInbound\022\r\n\005title\030\001 \001(\t\"3\n\021Upd" +
      "ateTaskInbound\022\017\n\007task_id\030\001 \001(\r\022\r\n\005title" +
      "\030\002 \001(\t\"h\n\014TaskOutbound\022\017\n\007task_id\030\001 \001(\r\022" +
      "\r\n\005title\030\002 \001(\t\022\022\n\nfinishedAt\030\003 \001(\t\022\021\n\tcr" +
      "eatedAt\030\004 \001(\t\022\021\n\tupdatedAt\030\005 \001(\t2\251\004\n\013Tas" +
      "kService\022Q\n\016GetTaskService\022\025.messages.Ta" +
      "skInbound\032\026.messages.TaskOutbound\"\020\202\323\344\223\002",
      "\n\022\010/v1/task\022\\\n\022GetTaskListService\022\031.mess" +
      "ages.TaskListInbound\032\026.messages.TaskOutb" +
      "ound\"\021\202\323\344\223\002\013\022\t/v1/tasks0\001\022Z\n\021CreateTaskS" +
      "ervice\022\033.messages.CreateTaskInbound\032\026.me" +
      "ssages.TaskOutbound\"\020\202\323\344\223\002\n\"\010/v1/task\022Z\n" +
      "\021UpdateTaskService\022\033.messages.UpdateTask" +
      "Inbound\032\026.messages.TaskOutbound\"\020\202\323\344\223\002\n\032" +
      "\010/v1/task\022T\n\021DeleteTaskService\022\025.message" +
      "s.TaskInbound\032\026.messages.TaskOutbound\"\020\202" +
      "\323\344\223\002\n*\010/v1/task\022[\n\021FinishTaskService\022\025.m",
      "essages.TaskInbound\032\026.messages.TaskOutbo" +
      "und\"\027\202\323\344\223\002\021\032\017/v1/task/finishB4\n\030app.grpc" +
      ".server.gen.taskB\020TaskServiceProtoP\001Z\004ta" +
      "skb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_messages_TaskInbound_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_messages_TaskInbound_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_TaskInbound_descriptor,
        new java.lang.String[] { "TaskId", });
    internal_static_messages_TaskListInbound_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_messages_TaskListInbound_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_TaskListInbound_descriptor,
        new java.lang.String[] { "Page", });
    internal_static_messages_CreateTaskInbound_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_messages_CreateTaskInbound_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_CreateTaskInbound_descriptor,
        new java.lang.String[] { "Title", });
    internal_static_messages_UpdateTaskInbound_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_messages_UpdateTaskInbound_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_UpdateTaskInbound_descriptor,
        new java.lang.String[] { "TaskId", "Title", });
    internal_static_messages_TaskOutbound_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_messages_TaskOutbound_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_TaskOutbound_descriptor,
        new java.lang.String[] { "TaskId", "Title", "FinishedAt", "CreatedAt", "UpdatedAt", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

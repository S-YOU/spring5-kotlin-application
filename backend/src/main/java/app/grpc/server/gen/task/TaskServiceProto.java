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
      " \001(\r\".\n\014TaskOutbound\022\017\n\007task_id\030\001 \001(\r\022\r\n" +
      "\005title\030\002 \001(\t2`\n\013TaskService\022Q\n\016GetTaskSe" +
      "rvice\022\025.messages.TaskInbound\032\026.messages." +
      "TaskOutbound\"\020\202\323\344\223\002\n\022\010/v1/taskB4\n\030app.gr" +
      "pc.server.gen.taskB\020TaskServiceProtoP\001Z\004" +
      "taskb\006proto3"
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
    internal_static_messages_TaskOutbound_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_messages_TaskOutbound_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_TaskOutbound_descriptor,
        new java.lang.String[] { "TaskId", "Title", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

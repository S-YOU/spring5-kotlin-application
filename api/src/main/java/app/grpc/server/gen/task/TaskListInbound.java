// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task.proto

package app.grpc.server.gen.task;

/**
 * Protobuf type {@code messages.TaskListInbound}
 */
public  final class TaskListInbound extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:messages.TaskListInbound)
    TaskListInboundOrBuilder {
  // Use TaskListInbound.newBuilder() to construct.
  private TaskListInbound(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskListInbound() {
    page_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TaskListInbound(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            page_ = input.readUInt32();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return app.grpc.server.gen.task.TaskServiceProto.internal_static_messages_TaskListInbound_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.grpc.server.gen.task.TaskServiceProto.internal_static_messages_TaskListInbound_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.grpc.server.gen.task.TaskListInbound.class, app.grpc.server.gen.task.TaskListInbound.Builder.class);
  }

  public static final int PAGE_FIELD_NUMBER = 1;
  private int page_;
  /**
   * <code>uint32 page = 1;</code>
   */
  public int getPage() {
    return page_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (page_ != 0) {
      output.writeUInt32(1, page_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, page_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof app.grpc.server.gen.task.TaskListInbound)) {
      return super.equals(obj);
    }
    app.grpc.server.gen.task.TaskListInbound other = (app.grpc.server.gen.task.TaskListInbound) obj;

    boolean result = true;
    result = result && (getPage()
        == other.getPage());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.grpc.server.gen.task.TaskListInbound parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.grpc.server.gen.task.TaskListInbound parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.grpc.server.gen.task.TaskListInbound parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.grpc.server.gen.task.TaskListInbound parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.grpc.server.gen.task.TaskListInbound parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.grpc.server.gen.task.TaskListInbound parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.grpc.server.gen.task.TaskListInbound parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.grpc.server.gen.task.TaskListInbound parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.grpc.server.gen.task.TaskListInbound parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.grpc.server.gen.task.TaskListInbound parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(app.grpc.server.gen.task.TaskListInbound prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code messages.TaskListInbound}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:messages.TaskListInbound)
      app.grpc.server.gen.task.TaskListInboundOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.grpc.server.gen.task.TaskServiceProto.internal_static_messages_TaskListInbound_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.grpc.server.gen.task.TaskServiceProto.internal_static_messages_TaskListInbound_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.grpc.server.gen.task.TaskListInbound.class, app.grpc.server.gen.task.TaskListInbound.Builder.class);
    }

    // Construct using app.grpc.server.gen.task.TaskListInbound.newBuilder()
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
    public Builder clear() {
      super.clear();
      page_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.grpc.server.gen.task.TaskServiceProto.internal_static_messages_TaskListInbound_descriptor;
    }

    public app.grpc.server.gen.task.TaskListInbound getDefaultInstanceForType() {
      return app.grpc.server.gen.task.TaskListInbound.getDefaultInstance();
    }

    public app.grpc.server.gen.task.TaskListInbound build() {
      app.grpc.server.gen.task.TaskListInbound result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public app.grpc.server.gen.task.TaskListInbound buildPartial() {
      app.grpc.server.gen.task.TaskListInbound result = new app.grpc.server.gen.task.TaskListInbound(this);
      result.page_ = page_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof app.grpc.server.gen.task.TaskListInbound) {
        return mergeFrom((app.grpc.server.gen.task.TaskListInbound)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.grpc.server.gen.task.TaskListInbound other) {
      if (other == app.grpc.server.gen.task.TaskListInbound.getDefaultInstance()) return this;
      if (other.getPage() != 0) {
        setPage(other.getPage());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      app.grpc.server.gen.task.TaskListInbound parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.grpc.server.gen.task.TaskListInbound) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int page_ ;
    /**
     * <code>uint32 page = 1;</code>
     */
    public int getPage() {
      return page_;
    }
    /**
     * <code>uint32 page = 1;</code>
     */
    public Builder setPage(int value) {
      
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 page = 1;</code>
     */
    public Builder clearPage() {
      
      page_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:messages.TaskListInbound)
  }

  // @@protoc_insertion_point(class_scope:messages.TaskListInbound)
  private static final app.grpc.server.gen.task.TaskListInbound DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.grpc.server.gen.task.TaskListInbound();
  }

  public static app.grpc.server.gen.task.TaskListInbound getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskListInbound>
      PARSER = new com.google.protobuf.AbstractParser<TaskListInbound>() {
    public TaskListInbound parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TaskListInbound(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaskListInbound> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskListInbound> getParserForType() {
    return PARSER;
  }

  public app.grpc.server.gen.task.TaskListInbound getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


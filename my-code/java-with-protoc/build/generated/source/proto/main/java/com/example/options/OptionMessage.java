// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: option_example.proto

package com.example.options;

/**
 * Protobuf type {@code example.options.OptionMessage}
 */
public  final class OptionMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:example.options.OptionMessage)
    OptionMessageOrBuilder {
  // Use OptionMessage.newBuilder() to construct.
  private OptionMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OptionMessage() {
    id_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private OptionMessage(
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

            id_ = input.readInt32();
            break;
          }
          case 18: {
            com.example.options.InnerOption.Builder subBuilder = null;
            if (innerOption_ != null) {
              subBuilder = innerOption_.toBuilder();
            }
            innerOption_ = input.readMessage(com.example.options.InnerOption.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(innerOption_);
              innerOption_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.options.OptionExample.internal_static_example_options_OptionMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.options.OptionExample.internal_static_example_options_OptionMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.options.OptionMessage.class, com.example.options.OptionMessage.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>optional int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int INNER_OPTION_FIELD_NUMBER = 2;
  private com.example.options.InnerOption innerOption_;
  /**
   * <code>optional .example.options.InnerOption inner_option = 2;</code>
   */
  public boolean hasInnerOption() {
    return innerOption_ != null;
  }
  /**
   * <code>optional .example.options.InnerOption inner_option = 2;</code>
   */
  public com.example.options.InnerOption getInnerOption() {
    return innerOption_ == null ? com.example.options.InnerOption.getDefaultInstance() : innerOption_;
  }
  /**
   * <code>optional .example.options.InnerOption inner_option = 2;</code>
   */
  public com.example.options.InnerOptionOrBuilder getInnerOptionOrBuilder() {
    return getInnerOption();
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (innerOption_ != null) {
      output.writeMessage(2, getInnerOption());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (innerOption_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInnerOption());
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
    if (!(obj instanceof com.example.options.OptionMessage)) {
      return super.equals(obj);
    }
    com.example.options.OptionMessage other = (com.example.options.OptionMessage) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && (hasInnerOption() == other.hasInnerOption());
    if (hasInnerOption()) {
      result = result && getInnerOption()
          .equals(other.getInnerOption());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    if (hasInnerOption()) {
      hash = (37 * hash) + INNER_OPTION_FIELD_NUMBER;
      hash = (53 * hash) + getInnerOption().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.options.OptionMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.options.OptionMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.options.OptionMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.options.OptionMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.options.OptionMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.options.OptionMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.options.OptionMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.options.OptionMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.options.OptionMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.options.OptionMessage parseFrom(
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
  public static Builder newBuilder(com.example.options.OptionMessage prototype) {
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
   * Protobuf type {@code example.options.OptionMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:example.options.OptionMessage)
      com.example.options.OptionMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.options.OptionExample.internal_static_example_options_OptionMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.options.OptionExample.internal_static_example_options_OptionMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.options.OptionMessage.class, com.example.options.OptionMessage.Builder.class);
    }

    // Construct using com.example.options.OptionMessage.newBuilder()
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
      id_ = 0;

      if (innerOptionBuilder_ == null) {
        innerOption_ = null;
      } else {
        innerOption_ = null;
        innerOptionBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.options.OptionExample.internal_static_example_options_OptionMessage_descriptor;
    }

    public com.example.options.OptionMessage getDefaultInstanceForType() {
      return com.example.options.OptionMessage.getDefaultInstance();
    }

    public com.example.options.OptionMessage build() {
      com.example.options.OptionMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.options.OptionMessage buildPartial() {
      com.example.options.OptionMessage result = new com.example.options.OptionMessage(this);
      result.id_ = id_;
      if (innerOptionBuilder_ == null) {
        result.innerOption_ = innerOption_;
      } else {
        result.innerOption_ = innerOptionBuilder_.build();
      }
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
      if (other instanceof com.example.options.OptionMessage) {
        return mergeFrom((com.example.options.OptionMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.options.OptionMessage other) {
      if (other == com.example.options.OptionMessage.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.hasInnerOption()) {
        mergeInnerOption(other.getInnerOption());
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
      com.example.options.OptionMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.options.OptionMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>optional int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>optional int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private com.example.options.InnerOption innerOption_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.options.InnerOption, com.example.options.InnerOption.Builder, com.example.options.InnerOptionOrBuilder> innerOptionBuilder_;
    /**
     * <code>optional .example.options.InnerOption inner_option = 2;</code>
     */
    public boolean hasInnerOption() {
      return innerOptionBuilder_ != null || innerOption_ != null;
    }
    /**
     * <code>optional .example.options.InnerOption inner_option = 2;</code>
     */
    public com.example.options.InnerOption getInnerOption() {
      if (innerOptionBuilder_ == null) {
        return innerOption_ == null ? com.example.options.InnerOption.getDefaultInstance() : innerOption_;
      } else {
        return innerOptionBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .example.options.InnerOption inner_option = 2;</code>
     */
    public Builder setInnerOption(com.example.options.InnerOption value) {
      if (innerOptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        innerOption_ = value;
        onChanged();
      } else {
        innerOptionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .example.options.InnerOption inner_option = 2;</code>
     */
    public Builder setInnerOption(
        com.example.options.InnerOption.Builder builderForValue) {
      if (innerOptionBuilder_ == null) {
        innerOption_ = builderForValue.build();
        onChanged();
      } else {
        innerOptionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .example.options.InnerOption inner_option = 2;</code>
     */
    public Builder mergeInnerOption(com.example.options.InnerOption value) {
      if (innerOptionBuilder_ == null) {
        if (innerOption_ != null) {
          innerOption_ =
            com.example.options.InnerOption.newBuilder(innerOption_).mergeFrom(value).buildPartial();
        } else {
          innerOption_ = value;
        }
        onChanged();
      } else {
        innerOptionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .example.options.InnerOption inner_option = 2;</code>
     */
    public Builder clearInnerOption() {
      if (innerOptionBuilder_ == null) {
        innerOption_ = null;
        onChanged();
      } else {
        innerOption_ = null;
        innerOptionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .example.options.InnerOption inner_option = 2;</code>
     */
    public com.example.options.InnerOption.Builder getInnerOptionBuilder() {
      
      onChanged();
      return getInnerOptionFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .example.options.InnerOption inner_option = 2;</code>
     */
    public com.example.options.InnerOptionOrBuilder getInnerOptionOrBuilder() {
      if (innerOptionBuilder_ != null) {
        return innerOptionBuilder_.getMessageOrBuilder();
      } else {
        return innerOption_ == null ?
            com.example.options.InnerOption.getDefaultInstance() : innerOption_;
      }
    }
    /**
     * <code>optional .example.options.InnerOption inner_option = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.options.InnerOption, com.example.options.InnerOption.Builder, com.example.options.InnerOptionOrBuilder> 
        getInnerOptionFieldBuilder() {
      if (innerOptionBuilder_ == null) {
        innerOptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.options.InnerOption, com.example.options.InnerOption.Builder, com.example.options.InnerOptionOrBuilder>(
                getInnerOption(),
                getParentForChildren(),
                isClean());
        innerOption_ = null;
      }
      return innerOptionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:example.options.OptionMessage)
  }

  // @@protoc_insertion_point(class_scope:example.options.OptionMessage)
  private static final com.example.options.OptionMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.options.OptionMessage();
  }

  public static com.example.options.OptionMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OptionMessage>
      PARSER = new com.google.protobuf.AbstractParser<OptionMessage>() {
    public OptionMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new OptionMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OptionMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OptionMessage> getParserForType() {
    return PARSER;
  }

  public com.example.options.OptionMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


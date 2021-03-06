// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recursivekeyvalue.proto

package io.confluent.connect.protobuf.test;

public final class RecursiveKeyValue {
  private RecursiveKeyValue() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RecursiveKeyValueMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RecursiveKeyValueMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 key = 1;</code>
     * @return The key.
     */
    int getKey();

    /**
     * <code>string value = 2;</code>
     * @return The value.
     */
    java.lang.String getValue();
    /**
     * <code>string value = 2;</code>
     * @return The bytes for value.
     */
    com.google.protobuf.ByteString
        getValueBytes();

    /**
     * <code>.RecursiveKeyValueMessage key_value = 10;</code>
     * @return Whether the keyValue field is set.
     */
    boolean hasKeyValue();
    /**
     * <code>.RecursiveKeyValueMessage key_value = 10;</code>
     * @return The keyValue.
     */
    io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage getKeyValue();
    /**
     * <code>.RecursiveKeyValueMessage key_value = 10;</code>
     */
    io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessageOrBuilder getKeyValueOrBuilder();
  }
  /**
   * Protobuf type {@code RecursiveKeyValueMessage}
   */
  public static final class RecursiveKeyValueMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RecursiveKeyValueMessage)
      RecursiveKeyValueMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RecursiveKeyValueMessage.newBuilder() to construct.
    private RecursiveKeyValueMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RecursiveKeyValueMessage() {
      value_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RecursiveKeyValueMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RecursiveKeyValueMessage(
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

              key_ = input.readInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              value_ = s;
              break;
            }
            case 82: {
              io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.Builder subBuilder = null;
              if (keyValue_ != null) {
                subBuilder = keyValue_.toBuilder();
              }
              keyValue_ = input.readMessage(io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(keyValue_);
                keyValue_ = subBuilder.buildPartial();
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
      return io.confluent.connect.protobuf.test.RecursiveKeyValue.internal_static_RecursiveKeyValueMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.confluent.connect.protobuf.test.RecursiveKeyValue.internal_static_RecursiveKeyValueMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.class, io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    private int key_;
    /**
     * <code>int32 key = 1;</code>
     * @return The key.
     */
    @java.lang.Override
    public int getKey() {
      return key_;
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private volatile java.lang.Object value_;
    /**
     * <code>string value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      }
    }
    /**
     * <code>string value = 2;</code>
     * @return The bytes for value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int KEY_VALUE_FIELD_NUMBER = 10;
    private io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage keyValue_;
    /**
     * <code>.RecursiveKeyValueMessage key_value = 10;</code>
     * @return Whether the keyValue field is set.
     */
    @java.lang.Override
    public boolean hasKeyValue() {
      return keyValue_ != null;
    }
    /**
     * <code>.RecursiveKeyValueMessage key_value = 10;</code>
     * @return The keyValue.
     */
    @java.lang.Override
    public io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage getKeyValue() {
      return keyValue_ == null ? io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.getDefaultInstance() : keyValue_;
    }
    /**
     * <code>.RecursiveKeyValueMessage key_value = 10;</code>
     */
    @java.lang.Override
    public io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessageOrBuilder getKeyValueOrBuilder() {
      return getKeyValue();
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
      if (key_ != 0) {
        output.writeInt32(1, key_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
      }
      if (keyValue_ != null) {
        output.writeMessage(10, getKeyValue());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (key_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, key_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
      }
      if (keyValue_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getKeyValue());
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
      if (!(obj instanceof io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage)) {
        return super.equals(obj);
      }
      io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage other = (io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage) obj;

      if (getKey()
          != other.getKey()) return false;
      if (!getValue()
          .equals(other.getValue())) return false;
      if (hasKeyValue() != other.hasKeyValue()) return false;
      if (hasKeyValue()) {
        if (!getKeyValue()
            .equals(other.getKeyValue())) return false;
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
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
      if (hasKeyValue()) {
        hash = (37 * hash) + KEY_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getKeyValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage parseFrom(
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
    public static Builder newBuilder(io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage prototype) {
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
     * Protobuf type {@code RecursiveKeyValueMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RecursiveKeyValueMessage)
        io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.confluent.connect.protobuf.test.RecursiveKeyValue.internal_static_RecursiveKeyValueMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.confluent.connect.protobuf.test.RecursiveKeyValue.internal_static_RecursiveKeyValueMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.class, io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.Builder.class);
      }

      // Construct using io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.newBuilder()
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
        key_ = 0;

        value_ = "";

        if (keyValueBuilder_ == null) {
          keyValue_ = null;
        } else {
          keyValue_ = null;
          keyValueBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.confluent.connect.protobuf.test.RecursiveKeyValue.internal_static_RecursiveKeyValueMessage_descriptor;
      }

      @java.lang.Override
      public io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage getDefaultInstanceForType() {
        return io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.getDefaultInstance();
      }

      @java.lang.Override
      public io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage build() {
        io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage buildPartial() {
        io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage result = new io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage(this);
        result.key_ = key_;
        result.value_ = value_;
        if (keyValueBuilder_ == null) {
          result.keyValue_ = keyValue_;
        } else {
          result.keyValue_ = keyValueBuilder_.build();
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
        if (other instanceof io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage) {
          return mergeFrom((io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage other) {
        if (other == io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.getDefaultInstance()) return this;
        if (other.getKey() != 0) {
          setKey(other.getKey());
        }
        if (!other.getValue().isEmpty()) {
          value_ = other.value_;
          onChanged();
        }
        if (other.hasKeyValue()) {
          mergeKeyValue(other.getKeyValue());
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
        io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int key_ ;
      /**
       * <code>int32 key = 1;</code>
       * @return The key.
       */
      @java.lang.Override
      public int getKey() {
        return key_;
      }
      /**
       * <code>int32 key = 1;</code>
       * @param value The key to set.
       * @return This builder for chaining.
       */
      public Builder setKey(int value) {
        
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 key = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearKey() {
        
        key_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object value_ = "";
      /**
       * <code>string value = 2;</code>
       * @return The value.
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string value = 2;</code>
       * @return The bytes for value.
       */
      public com.google.protobuf.ByteString
          getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string value = 2;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string value = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>string value = 2;</code>
       * @param value The bytes for value to set.
       * @return This builder for chaining.
       */
      public Builder setValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        value_ = value;
        onChanged();
        return this;
      }

      private io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage keyValue_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage, io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.Builder, io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessageOrBuilder> keyValueBuilder_;
      /**
       * <code>.RecursiveKeyValueMessage key_value = 10;</code>
       * @return Whether the keyValue field is set.
       */
      public boolean hasKeyValue() {
        return keyValueBuilder_ != null || keyValue_ != null;
      }
      /**
       * <code>.RecursiveKeyValueMessage key_value = 10;</code>
       * @return The keyValue.
       */
      public io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage getKeyValue() {
        if (keyValueBuilder_ == null) {
          return keyValue_ == null ? io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.getDefaultInstance() : keyValue_;
        } else {
          return keyValueBuilder_.getMessage();
        }
      }
      /**
       * <code>.RecursiveKeyValueMessage key_value = 10;</code>
       */
      public Builder setKeyValue(io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage value) {
        if (keyValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          keyValue_ = value;
          onChanged();
        } else {
          keyValueBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.RecursiveKeyValueMessage key_value = 10;</code>
       */
      public Builder setKeyValue(
          io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.Builder builderForValue) {
        if (keyValueBuilder_ == null) {
          keyValue_ = builderForValue.build();
          onChanged();
        } else {
          keyValueBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.RecursiveKeyValueMessage key_value = 10;</code>
       */
      public Builder mergeKeyValue(io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage value) {
        if (keyValueBuilder_ == null) {
          if (keyValue_ != null) {
            keyValue_ =
              io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.newBuilder(keyValue_).mergeFrom(value).buildPartial();
          } else {
            keyValue_ = value;
          }
          onChanged();
        } else {
          keyValueBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.RecursiveKeyValueMessage key_value = 10;</code>
       */
      public Builder clearKeyValue() {
        if (keyValueBuilder_ == null) {
          keyValue_ = null;
          onChanged();
        } else {
          keyValue_ = null;
          keyValueBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.RecursiveKeyValueMessage key_value = 10;</code>
       */
      public io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.Builder getKeyValueBuilder() {
        
        onChanged();
        return getKeyValueFieldBuilder().getBuilder();
      }
      /**
       * <code>.RecursiveKeyValueMessage key_value = 10;</code>
       */
      public io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessageOrBuilder getKeyValueOrBuilder() {
        if (keyValueBuilder_ != null) {
          return keyValueBuilder_.getMessageOrBuilder();
        } else {
          return keyValue_ == null ?
              io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.getDefaultInstance() : keyValue_;
        }
      }
      /**
       * <code>.RecursiveKeyValueMessage key_value = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage, io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.Builder, io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessageOrBuilder> 
          getKeyValueFieldBuilder() {
        if (keyValueBuilder_ == null) {
          keyValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage, io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage.Builder, io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessageOrBuilder>(
                  getKeyValue(),
                  getParentForChildren(),
                  isClean());
          keyValue_ = null;
        }
        return keyValueBuilder_;
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


      // @@protoc_insertion_point(builder_scope:RecursiveKeyValueMessage)
    }

    // @@protoc_insertion_point(class_scope:RecursiveKeyValueMessage)
    private static final io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage();
    }

    public static io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RecursiveKeyValueMessage>
        PARSER = new com.google.protobuf.AbstractParser<RecursiveKeyValueMessage>() {
      @java.lang.Override
      public RecursiveKeyValueMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RecursiveKeyValueMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RecursiveKeyValueMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RecursiveKeyValueMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.confluent.connect.protobuf.test.RecursiveKeyValue.RecursiveKeyValueMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RecursiveKeyValueMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RecursiveKeyValueMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027recursivekeyvalue.proto\032 google/protob" +
      "uf/descriptor.proto\"d\n\030RecursiveKeyValue" +
      "Message\022\013\n\003key\030\001 \001(\005\022\r\n\005value\030\002 \001(\t\022,\n\tk" +
      "ey_value\030\n \001(\0132\031.RecursiveKeyValueMessag" +
      "eB7\n\"io.confluent.connect.protobuf.testB" +
      "\021RecursiveKeyValueb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_RecursiveKeyValueMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RecursiveKeyValueMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RecursiveKeyValueMessage_descriptor,
        new java.lang.String[] { "Key", "Value", "KeyValue", });
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

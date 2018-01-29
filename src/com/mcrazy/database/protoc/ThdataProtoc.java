// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ThdataProto.proto

package com.mcrazy.database.protoc;

public final class ThdataProtoc {
  private ThdataProtoc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ThdataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MQTTServer.Thdata)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 temp = 1;</code>
     */
    int getTemp();

    /**
     * <code>int32 humidity = 2;</code>
     */
    int getHumidity();

    /**
     * <code>string prec = 3;</code>
     */
    java.lang.String getPrec();
    /**
     * <code>string prec = 3;</code>
     */
    com.google.protobuf.ByteString
        getPrecBytes();
  }
  /**
   * Protobuf type {@code MQTTServer.Thdata}
   */
  public  static final class Thdata extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MQTTServer.Thdata)
      ThdataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Thdata.newBuilder() to construct.
    private Thdata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Thdata() {
      temp_ = 0;
      humidity_ = 0;
      prec_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Thdata(
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              temp_ = input.readInt32();
              break;
            }
            case 16: {

              humidity_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              prec_ = s;
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
      return com.mcrazy.database.protoc.ThdataProtoc.internal_static_MQTTServer_Thdata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mcrazy.database.protoc.ThdataProtoc.internal_static_MQTTServer_Thdata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mcrazy.database.protoc.ThdataProtoc.Thdata.class, com.mcrazy.database.protoc.ThdataProtoc.Thdata.Builder.class);
    }

    public static final int TEMP_FIELD_NUMBER = 1;
    private int temp_;
    /**
     * <code>int32 temp = 1;</code>
     */
    public int getTemp() {
      return temp_;
    }

    public static final int HUMIDITY_FIELD_NUMBER = 2;
    private int humidity_;
    /**
     * <code>int32 humidity = 2;</code>
     */
    public int getHumidity() {
      return humidity_;
    }

    public static final int PREC_FIELD_NUMBER = 3;
    private volatile java.lang.Object prec_;
    /**
     * <code>string prec = 3;</code>
     */
    public java.lang.String getPrec() {
      java.lang.Object ref = prec_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prec_ = s;
        return s;
      }
    }
    /**
     * <code>string prec = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPrecBytes() {
      java.lang.Object ref = prec_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prec_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (temp_ != 0) {
        output.writeInt32(1, temp_);
      }
      if (humidity_ != 0) {
        output.writeInt32(2, humidity_);
      }
      if (!getPrecBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, prec_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (temp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, temp_);
      }
      if (humidity_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, humidity_);
      }
      if (!getPrecBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, prec_);
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
      if (!(obj instanceof com.mcrazy.database.protoc.ThdataProtoc.Thdata)) {
        return super.equals(obj);
      }
      com.mcrazy.database.protoc.ThdataProtoc.Thdata other = (com.mcrazy.database.protoc.ThdataProtoc.Thdata) obj;

      boolean result = true;
      result = result && (getTemp()
          == other.getTemp());
      result = result && (getHumidity()
          == other.getHumidity());
      result = result && getPrec()
          .equals(other.getPrec());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TEMP_FIELD_NUMBER;
      hash = (53 * hash) + getTemp();
      hash = (37 * hash) + HUMIDITY_FIELD_NUMBER;
      hash = (53 * hash) + getHumidity();
      hash = (37 * hash) + PREC_FIELD_NUMBER;
      hash = (53 * hash) + getPrec().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mcrazy.database.protoc.ThdataProtoc.Thdata parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mcrazy.database.protoc.ThdataProtoc.Thdata parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mcrazy.database.protoc.ThdataProtoc.Thdata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mcrazy.database.protoc.ThdataProtoc.Thdata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mcrazy.database.protoc.ThdataProtoc.Thdata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mcrazy.database.protoc.ThdataProtoc.Thdata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mcrazy.database.protoc.ThdataProtoc.Thdata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mcrazy.database.protoc.ThdataProtoc.Thdata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mcrazy.database.protoc.ThdataProtoc.Thdata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.mcrazy.database.protoc.ThdataProtoc.Thdata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mcrazy.database.protoc.ThdataProtoc.Thdata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mcrazy.database.protoc.ThdataProtoc.Thdata parseFrom(
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
    public static Builder newBuilder(com.mcrazy.database.protoc.ThdataProtoc.Thdata prototype) {
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
     * Protobuf type {@code MQTTServer.Thdata}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MQTTServer.Thdata)
        com.mcrazy.database.protoc.ThdataProtoc.ThdataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mcrazy.database.protoc.ThdataProtoc.internal_static_MQTTServer_Thdata_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mcrazy.database.protoc.ThdataProtoc.internal_static_MQTTServer_Thdata_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mcrazy.database.protoc.ThdataProtoc.Thdata.class, com.mcrazy.database.protoc.ThdataProtoc.Thdata.Builder.class);
      }

      // Construct using com.mcrazy.database.protoc.ThdataProtoc.Thdata.newBuilder()
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
        temp_ = 0;

        humidity_ = 0;

        prec_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mcrazy.database.protoc.ThdataProtoc.internal_static_MQTTServer_Thdata_descriptor;
      }

      public com.mcrazy.database.protoc.ThdataProtoc.Thdata getDefaultInstanceForType() {
        return com.mcrazy.database.protoc.ThdataProtoc.Thdata.getDefaultInstance();
      }

      public com.mcrazy.database.protoc.ThdataProtoc.Thdata build() {
        com.mcrazy.database.protoc.ThdataProtoc.Thdata result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.mcrazy.database.protoc.ThdataProtoc.Thdata buildPartial() {
        com.mcrazy.database.protoc.ThdataProtoc.Thdata result = new com.mcrazy.database.protoc.ThdataProtoc.Thdata(this);
        result.temp_ = temp_;
        result.humidity_ = humidity_;
        result.prec_ = prec_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mcrazy.database.protoc.ThdataProtoc.Thdata) {
          return mergeFrom((com.mcrazy.database.protoc.ThdataProtoc.Thdata)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mcrazy.database.protoc.ThdataProtoc.Thdata other) {
        if (other == com.mcrazy.database.protoc.ThdataProtoc.Thdata.getDefaultInstance()) return this;
        if (other.getTemp() != 0) {
          setTemp(other.getTemp());
        }
        if (other.getHumidity() != 0) {
          setHumidity(other.getHumidity());
        }
        if (!other.getPrec().isEmpty()) {
          prec_ = other.prec_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
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
        com.mcrazy.database.protoc.ThdataProtoc.Thdata parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.mcrazy.database.protoc.ThdataProtoc.Thdata) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int temp_ ;
      /**
       * <code>int32 temp = 1;</code>
       */
      public int getTemp() {
        return temp_;
      }
      /**
       * <code>int32 temp = 1;</code>
       */
      public Builder setTemp(int value) {
        
        temp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 temp = 1;</code>
       */
      public Builder clearTemp() {
        
        temp_ = 0;
        onChanged();
        return this;
      }

      private int humidity_ ;
      /**
       * <code>int32 humidity = 2;</code>
       */
      public int getHumidity() {
        return humidity_;
      }
      /**
       * <code>int32 humidity = 2;</code>
       */
      public Builder setHumidity(int value) {
        
        humidity_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 humidity = 2;</code>
       */
      public Builder clearHumidity() {
        
        humidity_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object prec_ = "";
      /**
       * <code>string prec = 3;</code>
       */
      public java.lang.String getPrec() {
        java.lang.Object ref = prec_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          prec_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string prec = 3;</code>
       */
      public com.google.protobuf.ByteString
          getPrecBytes() {
        java.lang.Object ref = prec_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          prec_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string prec = 3;</code>
       */
      public Builder setPrec(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        prec_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string prec = 3;</code>
       */
      public Builder clearPrec() {
        
        prec_ = getDefaultInstance().getPrec();
        onChanged();
        return this;
      }
      /**
       * <code>string prec = 3;</code>
       */
      public Builder setPrecBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        prec_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MQTTServer.Thdata)
    }

    // @@protoc_insertion_point(class_scope:MQTTServer.Thdata)
    private static final com.mcrazy.database.protoc.ThdataProtoc.Thdata DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mcrazy.database.protoc.ThdataProtoc.Thdata();
    }

    public static com.mcrazy.database.protoc.ThdataProtoc.Thdata getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Thdata>
        PARSER = new com.google.protobuf.AbstractParser<Thdata>() {
      public Thdata parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Thdata(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Thdata> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Thdata> getParserForType() {
      return PARSER;
    }

    public com.mcrazy.database.protoc.ThdataProtoc.Thdata getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MQTTServer_Thdata_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MQTTServer_Thdata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ThdataProto.proto\022\nMQTTServer\"6\n\006Thdat" +
      "a\022\014\n\004temp\030\001 \001(\005\022\020\n\010humidity\030\002 \001(\005\022\014\n\004pre" +
      "c\030\003 \001(\tB*\n\032com.mcrazy.database.protocB\014T" +
      "hdataProtocb\006proto3"
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
        }, assigner);
    internal_static_MQTTServer_Thdata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MQTTServer_Thdata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MQTTServer_Thdata_descriptor,
        new java.lang.String[] { "Temp", "Humidity", "Prec", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
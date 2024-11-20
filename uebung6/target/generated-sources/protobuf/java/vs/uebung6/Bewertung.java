// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package vs.uebung6;

/**
 * Protobuf type {@code vs.uebung6.Bewertung}
 */
public final class Bewertung extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:vs.uebung6.Bewertung)
    BewertungOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Bewertung.newBuilder() to construct.
  private Bewertung(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Bewertung() {
    kommando_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Bewertung();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Bewertung(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            kommando_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (datum_ != null) {
              subBuilder = datum_.toBuilder();
            }
            datum_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(datum_);
              datum_ = subBuilder.buildPartial();
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
    return vs.uebung6.Service.internal_static_vs_uebung6_Bewertung_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return vs.uebung6.Service.internal_static_vs_uebung6_Bewertung_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            vs.uebung6.Bewertung.class, vs.uebung6.Bewertung.Builder.class);
  }

  public static final int KOMMANDO_FIELD_NUMBER = 1;
  private volatile java.lang.Object kommando_;
  /**
   * <code>string kommando = 1;</code>
   * @return The kommando.
   */
  @java.lang.Override
  public java.lang.String getKommando() {
    java.lang.Object ref = kommando_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kommando_ = s;
      return s;
    }
  }
  /**
   * <code>string kommando = 1;</code>
   * @return The bytes for kommando.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKommandoBytes() {
    java.lang.Object ref = kommando_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kommando_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATUM_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp datum_;
  /**
   * <code>.google.protobuf.Timestamp datum = 2;</code>
   * @return Whether the datum field is set.
   */
  @java.lang.Override
  public boolean hasDatum() {
    return datum_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp datum = 2;</code>
   * @return The datum.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getDatum() {
    return datum_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : datum_;
  }
  /**
   * <code>.google.protobuf.Timestamp datum = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getDatumOrBuilder() {
    return getDatum();
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
    if (!getKommandoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kommando_);
    }
    if (datum_ != null) {
      output.writeMessage(2, getDatum());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKommandoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kommando_);
    }
    if (datum_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDatum());
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
    if (!(obj instanceof vs.uebung6.Bewertung)) {
      return super.equals(obj);
    }
    vs.uebung6.Bewertung other = (vs.uebung6.Bewertung) obj;

    if (!getKommando()
        .equals(other.getKommando())) return false;
    if (hasDatum() != other.hasDatum()) return false;
    if (hasDatum()) {
      if (!getDatum()
          .equals(other.getDatum())) return false;
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
    hash = (37 * hash) + KOMMANDO_FIELD_NUMBER;
    hash = (53 * hash) + getKommando().hashCode();
    if (hasDatum()) {
      hash = (37 * hash) + DATUM_FIELD_NUMBER;
      hash = (53 * hash) + getDatum().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static vs.uebung6.Bewertung parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vs.uebung6.Bewertung parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vs.uebung6.Bewertung parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vs.uebung6.Bewertung parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vs.uebung6.Bewertung parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vs.uebung6.Bewertung parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vs.uebung6.Bewertung parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static vs.uebung6.Bewertung parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static vs.uebung6.Bewertung parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static vs.uebung6.Bewertung parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static vs.uebung6.Bewertung parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static vs.uebung6.Bewertung parseFrom(
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
  public static Builder newBuilder(vs.uebung6.Bewertung prototype) {
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
   * Protobuf type {@code vs.uebung6.Bewertung}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:vs.uebung6.Bewertung)
      vs.uebung6.BewertungOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return vs.uebung6.Service.internal_static_vs_uebung6_Bewertung_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return vs.uebung6.Service.internal_static_vs_uebung6_Bewertung_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              vs.uebung6.Bewertung.class, vs.uebung6.Bewertung.Builder.class);
    }

    // Construct using vs.uebung6.Bewertung.newBuilder()
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
      kommando_ = "";

      if (datumBuilder_ == null) {
        datum_ = null;
      } else {
        datum_ = null;
        datumBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return vs.uebung6.Service.internal_static_vs_uebung6_Bewertung_descriptor;
    }

    @java.lang.Override
    public vs.uebung6.Bewertung getDefaultInstanceForType() {
      return vs.uebung6.Bewertung.getDefaultInstance();
    }

    @java.lang.Override
    public vs.uebung6.Bewertung build() {
      vs.uebung6.Bewertung result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public vs.uebung6.Bewertung buildPartial() {
      vs.uebung6.Bewertung result = new vs.uebung6.Bewertung(this);
      result.kommando_ = kommando_;
      if (datumBuilder_ == null) {
        result.datum_ = datum_;
      } else {
        result.datum_ = datumBuilder_.build();
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
      if (other instanceof vs.uebung6.Bewertung) {
        return mergeFrom((vs.uebung6.Bewertung)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(vs.uebung6.Bewertung other) {
      if (other == vs.uebung6.Bewertung.getDefaultInstance()) return this;
      if (!other.getKommando().isEmpty()) {
        kommando_ = other.kommando_;
        onChanged();
      }
      if (other.hasDatum()) {
        mergeDatum(other.getDatum());
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
      vs.uebung6.Bewertung parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (vs.uebung6.Bewertung) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object kommando_ = "";
    /**
     * <code>string kommando = 1;</code>
     * @return The kommando.
     */
    public java.lang.String getKommando() {
      java.lang.Object ref = kommando_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kommando_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string kommando = 1;</code>
     * @return The bytes for kommando.
     */
    public com.google.protobuf.ByteString
        getKommandoBytes() {
      java.lang.Object ref = kommando_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kommando_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string kommando = 1;</code>
     * @param value The kommando to set.
     * @return This builder for chaining.
     */
    public Builder setKommando(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kommando_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string kommando = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKommando() {
      
      kommando_ = getDefaultInstance().getKommando();
      onChanged();
      return this;
    }
    /**
     * <code>string kommando = 1;</code>
     * @param value The bytes for kommando to set.
     * @return This builder for chaining.
     */
    public Builder setKommandoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kommando_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp datum_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> datumBuilder_;
    /**
     * <code>.google.protobuf.Timestamp datum = 2;</code>
     * @return Whether the datum field is set.
     */
    public boolean hasDatum() {
      return datumBuilder_ != null || datum_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp datum = 2;</code>
     * @return The datum.
     */
    public com.google.protobuf.Timestamp getDatum() {
      if (datumBuilder_ == null) {
        return datum_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : datum_;
      } else {
        return datumBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp datum = 2;</code>
     */
    public Builder setDatum(com.google.protobuf.Timestamp value) {
      if (datumBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        datum_ = value;
        onChanged();
      } else {
        datumBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp datum = 2;</code>
     */
    public Builder setDatum(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (datumBuilder_ == null) {
        datum_ = builderForValue.build();
        onChanged();
      } else {
        datumBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp datum = 2;</code>
     */
    public Builder mergeDatum(com.google.protobuf.Timestamp value) {
      if (datumBuilder_ == null) {
        if (datum_ != null) {
          datum_ =
            com.google.protobuf.Timestamp.newBuilder(datum_).mergeFrom(value).buildPartial();
        } else {
          datum_ = value;
        }
        onChanged();
      } else {
        datumBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp datum = 2;</code>
     */
    public Builder clearDatum() {
      if (datumBuilder_ == null) {
        datum_ = null;
        onChanged();
      } else {
        datum_ = null;
        datumBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp datum = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getDatumBuilder() {
      
      onChanged();
      return getDatumFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp datum = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDatumOrBuilder() {
      if (datumBuilder_ != null) {
        return datumBuilder_.getMessageOrBuilder();
      } else {
        return datum_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : datum_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp datum = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getDatumFieldBuilder() {
      if (datumBuilder_ == null) {
        datumBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getDatum(),
                getParentForChildren(),
                isClean());
        datum_ = null;
      }
      return datumBuilder_;
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


    // @@protoc_insertion_point(builder_scope:vs.uebung6.Bewertung)
  }

  // @@protoc_insertion_point(class_scope:vs.uebung6.Bewertung)
  private static final vs.uebung6.Bewertung DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new vs.uebung6.Bewertung();
  }

  public static vs.uebung6.Bewertung getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Bewertung>
      PARSER = new com.google.protobuf.AbstractParser<Bewertung>() {
    @java.lang.Override
    public Bewertung parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Bewertung(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Bewertung> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Bewertung> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public vs.uebung6.Bewertung getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AmazontoWorld.proto

package edu.duke.ece568.minUPS.protocol.AmazontoWorld;

/**
 * Protobuf type {@code AQuery}
 */
public final class AQuery extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AQuery)
    AQueryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AQuery.newBuilder() to construct.
  private AQuery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AQuery() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AQuery();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.duke.ece568.minUPS.protocol.AmazontoWorld.AmazontoWorld.internal_static_AQuery_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.duke.ece568.minUPS.protocol.AmazontoWorld.AmazontoWorld.internal_static_AQuery_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery.class, edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery.Builder.class);
  }

  private int bitField0_;
  public static final int PACKAGEID_FIELD_NUMBER = 1;
  private long packageid_ = 0L;
  /**
   * <code>required int64 packageid = 1;</code>
   * @return Whether the packageid field is set.
   */
  @java.lang.Override
  public boolean hasPackageid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required int64 packageid = 1;</code>
   * @return The packageid.
   */
  @java.lang.Override
  public long getPackageid() {
    return packageid_;
  }

  public static final int SEQNUM_FIELD_NUMBER = 2;
  private long seqnum_ = 0L;
  /**
   * <code>required int64 seqnum = 2;</code>
   * @return Whether the seqnum field is set.
   */
  @java.lang.Override
  public boolean hasSeqnum() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required int64 seqnum = 2;</code>
   * @return The seqnum.
   */
  @java.lang.Override
  public long getSeqnum() {
    return seqnum_;
  }

  public static edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery parseFrom(
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
  public static Builder newBuilder(edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery prototype) {
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
   * Protobuf type {@code AQuery}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AQuery)
      edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQueryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.duke.ece568.minUPS.protocol.AmazontoWorld.AmazontoWorld.internal_static_AQuery_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.duke.ece568.minUPS.protocol.AmazontoWorld.AmazontoWorld.internal_static_AQuery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery.class, edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery.Builder.class);
    }

    // Construct using edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      packageid_ = 0L;
      seqnum_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.duke.ece568.minUPS.protocol.AmazontoWorld.AmazontoWorld.internal_static_AQuery_descriptor;
    }

    @java.lang.Override
    public edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery getDefaultInstanceForType() {
      return edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery.getDefaultInstance();
    }

    @java.lang.Override
    public edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery build() {
      edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery buildPartial() {
      edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery result = new edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.packageid_ = packageid_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.seqnum_ = seqnum_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    private int bitField0_;

    private long packageid_ ;
    /**
     * <code>required int64 packageid = 1;</code>
     * @return Whether the packageid field is set.
     */
    @java.lang.Override
    public boolean hasPackageid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int64 packageid = 1;</code>
     * @return The packageid.
     */
    @java.lang.Override
    public long getPackageid() {
      return packageid_;
    }
    /**
     * <code>required int64 packageid = 1;</code>
     * @param value The packageid to set.
     * @return This builder for chaining.
     */
    public Builder setPackageid(long value) {

      packageid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 packageid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPackageid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      packageid_ = 0L;
      onChanged();
      return this;
    }

    private long seqnum_ ;
    /**
     * <code>required int64 seqnum = 2;</code>
     * @return Whether the seqnum field is set.
     */
    @java.lang.Override
    public boolean hasSeqnum() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required int64 seqnum = 2;</code>
     * @return The seqnum.
     */
    @java.lang.Override
    public long getSeqnum() {
      return seqnum_;
    }
    /**
     * <code>required int64 seqnum = 2;</code>
     * @param value The seqnum to set.
     * @return This builder for chaining.
     */
    public Builder setSeqnum(long value) {

      seqnum_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 seqnum = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeqnum() {
      bitField0_ = (bitField0_ & ~0x00000002);
      seqnum_ = 0L;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:AQuery)
  }

  // @@protoc_insertion_point(class_scope:AQuery)
  private static final edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery();
  }

  public static edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AQuery>
      PARSER = new com.google.protobuf.AbstractParser<AQuery>() {
    @java.lang.Override
    public AQuery parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AQuery> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AQuery> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


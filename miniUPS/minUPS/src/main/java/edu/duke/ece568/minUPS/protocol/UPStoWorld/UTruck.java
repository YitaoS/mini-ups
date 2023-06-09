// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: world_ups.proto

package edu.duke.ece568.minUPS.protocol.UPStoWorld;

/**
 * Protobuf type {@code protocol.UTruck}
 */
public final class UTruck extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.UTruck)
    UTruckOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UTruck.newBuilder() to construct.
  private UTruck(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UTruck() {
    status_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UTruck();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.duke.ece568.minUPS.protocol.UPStoWorld.WorldUps.internal_static_protocol_UTruck_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.duke.ece568.minUPS.protocol.UPStoWorld.WorldUps.internal_static_protocol_UTruck_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck.class, edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck.Builder.class);
  }

  private int bitField0_;
  public static final int TRUCKID_FIELD_NUMBER = 1;
  private int truckid_ = 0;
  /**
   * <code>required int32 truckid = 1;</code>
   * @return Whether the truckid field is set.
   */
  @java.lang.Override
  public boolean hasTruckid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required int32 truckid = 1;</code>
   * @return The truckid.
   */
  @java.lang.Override
  public int getTruckid() {
    return truckid_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object status_ = "";
  /**
   * <code>required string status = 2;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required string status = 2;</code>
   * @return The status.
   */
  @java.lang.Override
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        status_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string status = 2;</code>
   * @return The bytes for status.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int X_FIELD_NUMBER = 3;
  private int x_ = 0;
  /**
   * <code>required int32 x = 3;</code>
   * @return Whether the x field is set.
   */
  @java.lang.Override
  public boolean hasX() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>required int32 x = 3;</code>
   * @return The x.
   */
  @java.lang.Override
  public int getX() {
    return x_;
  }

  public static final int Y_FIELD_NUMBER = 4;
  private int y_ = 0;
  /**
   * <code>required int32 y = 4;</code>
   * @return Whether the y field is set.
   */
  @java.lang.Override
  public boolean hasY() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>required int32 y = 4;</code>
   * @return The y.
   */
  @java.lang.Override
  public int getY() {
    return y_;
  }

  public static final int SEQNUM_FIELD_NUMBER = 5;
  private long seqnum_ = 0L;
  /**
   * <code>required int64 seqnum = 5;</code>
   * @return Whether the seqnum field is set.
   */
  @java.lang.Override
  public boolean hasSeqnum() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>required int64 seqnum = 5;</code>
   * @return The seqnum.
   */
  @java.lang.Override
  public long getSeqnum() {
    return seqnum_;
  }

  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck parseFrom(
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
  public static Builder newBuilder(edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck prototype) {
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
   * Protobuf type {@code protocol.UTruck}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.UTruck)
      edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruckOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.duke.ece568.minUPS.protocol.UPStoWorld.WorldUps.internal_static_protocol_UTruck_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.duke.ece568.minUPS.protocol.UPStoWorld.WorldUps.internal_static_protocol_UTruck_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck.class, edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck.Builder.class);
    }

    // Construct using edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck.newBuilder()
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
      truckid_ = 0;
      status_ = "";
      x_ = 0;
      y_ = 0;
      seqnum_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.duke.ece568.minUPS.protocol.UPStoWorld.WorldUps.internal_static_protocol_UTruck_descriptor;
    }

    @java.lang.Override
    public edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck getDefaultInstanceForType() {
      return edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck.getDefaultInstance();
    }

    @java.lang.Override
    public edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck build() {
      edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck buildPartial() {
      edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck result = new edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.truckid_ = truckid_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = status_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.x_ = x_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.y_ = y_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.seqnum_ = seqnum_;
        to_bitField0_ |= 0x00000010;
      }
      result.bitField0_ |= to_bitField0_;
    }

    private int bitField0_;

    private int truckid_ ;
    /**
     * <code>required int32 truckid = 1;</code>
     * @return Whether the truckid field is set.
     */
    @java.lang.Override
    public boolean hasTruckid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int32 truckid = 1;</code>
     * @return The truckid.
     */
    @java.lang.Override
    public int getTruckid() {
      return truckid_;
    }
    /**
     * <code>required int32 truckid = 1;</code>
     * @param value The truckid to set.
     * @return This builder for chaining.
     */
    public Builder setTruckid(int value) {

      truckid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 truckid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTruckid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      truckid_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <code>required string status = 2;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string status = 2;</code>
     * @return The status.
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          status_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string status = 2;</code>
     * @return The bytes for status.
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string status = 2;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      status_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>required string status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      status_ = getDefaultInstance().getStatus();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>required string status = 2;</code>
     * @param value The bytes for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      status_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int x_ ;
    /**
     * <code>required int32 x = 3;</code>
     * @return Whether the x field is set.
     */
    @java.lang.Override
    public boolean hasX() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required int32 x = 3;</code>
     * @return The x.
     */
    @java.lang.Override
    public int getX() {
      return x_;
    }
    /**
     * <code>required int32 x = 3;</code>
     * @param value The x to set.
     * @return This builder for chaining.
     */
    public Builder setX(int value) {

      x_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 x = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearX() {
      bitField0_ = (bitField0_ & ~0x00000004);
      x_ = 0;
      onChanged();
      return this;
    }

    private int y_ ;
    /**
     * <code>required int32 y = 4;</code>
     * @return Whether the y field is set.
     */
    @java.lang.Override
    public boolean hasY() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required int32 y = 4;</code>
     * @return The y.
     */
    @java.lang.Override
    public int getY() {
      return y_;
    }
    /**
     * <code>required int32 y = 4;</code>
     * @param value The y to set.
     * @return This builder for chaining.
     */
    public Builder setY(int value) {

      y_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 y = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearY() {
      bitField0_ = (bitField0_ & ~0x00000008);
      y_ = 0;
      onChanged();
      return this;
    }

    private long seqnum_ ;
    /**
     * <code>required int64 seqnum = 5;</code>
     * @return Whether the seqnum field is set.
     */
    @java.lang.Override
    public boolean hasSeqnum() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>required int64 seqnum = 5;</code>
     * @return The seqnum.
     */
    @java.lang.Override
    public long getSeqnum() {
      return seqnum_;
    }
    /**
     * <code>required int64 seqnum = 5;</code>
     * @param value The seqnum to set.
     * @return This builder for chaining.
     */
    public Builder setSeqnum(long value) {

      seqnum_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 seqnum = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeqnum() {
      bitField0_ = (bitField0_ & ~0x00000010);
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


    // @@protoc_insertion_point(builder_scope:protocol.UTruck)
  }

  // @@protoc_insertion_point(class_scope:protocol.UTruck)
  private static final edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck();
  }

  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<UTruck>
      PARSER = new com.google.protobuf.AbstractParser<UTruck>() {
    @java.lang.Override
    public UTruck parsePartialFrom(
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

  public static com.google.protobuf.Parser<UTruck> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UTruck> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.duke.ece568.minUPS.protocol.UPStoWorld.UTruck getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


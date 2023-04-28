// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: world_ups.proto

package edu.duke.ece568.minUPS.protocol.UPStoWorld;

/**
 * Protobuf type {@code protocol.UGoDeliver}
 */
public  final class UGoDeliver extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.UGoDeliver)
    UGoDeliverOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UGoDeliver.newBuilder() to construct.
  private UGoDeliver(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UGoDeliver() {
    truckid_ = 0;
    packages_ = java.util.Collections.emptyList();
    seqnum_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.duke.ece568.minUPS.protocol.UPStoWorld.WorldUps.internal_static_protocol_UGoDeliver_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.duke.ece568.minUPS.protocol.UPStoWorld.WorldUps.internal_static_protocol_UGoDeliver_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver.class, edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver.Builder.class);
  }

  private int bitField0_;
  public static final int TRUCKID_FIELD_NUMBER = 1;
  private int truckid_;
  /**
   * <code>required int32 truckid = 1;</code>
   */
  public boolean hasTruckid() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required int32 truckid = 1;</code>
   */
  public int getTruckid() {
    return truckid_;
  }

  public static final int PACKAGES_FIELD_NUMBER = 2;
  private java.util.List<edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation> packages_;
  /**
   * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
   */
  public java.util.List<edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation> getPackagesList() {
    return packages_;
  }
  /**
   * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
   */
  public java.util.List<? extends edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocationOrBuilder> 
      getPackagesOrBuilderList() {
    return packages_;
  }
  /**
   * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
   */
  public int getPackagesCount() {
    return packages_.size();
  }
  /**
   * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
   */
  public edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation getPackages(int index) {
    return packages_.get(index);
  }
  /**
   * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
   */
  public edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocationOrBuilder getPackagesOrBuilder(
      int index) {
    return packages_.get(index);
  }

  public static final int SEQNUM_FIELD_NUMBER = 3;
  private long seqnum_;
  /**
   * <code>required int64 seqnum = 3;</code>
   */
  public boolean hasSeqnum() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required int64 seqnum = 3;</code>
   */
  public long getSeqnum() {
    return seqnum_;
  }

  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver parseFrom(
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
  public static Builder newBuilder(edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver prototype) {
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
   * Protobuf type {@code protocol.UGoDeliver}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.UGoDeliver)
      edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliverOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.duke.ece568.minUPS.protocol.UPStoWorld.WorldUps.internal_static_protocol_UGoDeliver_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.duke.ece568.minUPS.protocol.UPStoWorld.WorldUps.internal_static_protocol_UGoDeliver_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver.class, edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver.Builder.class);
    }

    // Construct using edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver.newBuilder()
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
        getPackagesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      truckid_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (packagesBuilder_ == null) {
        packages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        packagesBuilder_.clear();
      }
      seqnum_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.duke.ece568.minUPS.protocol.UPStoWorld.WorldUps.internal_static_protocol_UGoDeliver_descriptor;
    }

    @java.lang.Override
    public edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver getDefaultInstanceForType() {
      return edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver.getDefaultInstance();
    }

    @java.lang.Override
    public edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver build() {
      edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver buildPartial() {
      edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver result = new edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.truckid_ = truckid_;
      if (packagesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          packages_ = java.util.Collections.unmodifiableList(packages_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.packages_ = packages_;
      } else {
        result.packages_ = packagesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000002;
      }
      result.seqnum_ = seqnum_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private int truckid_ ;
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public boolean hasTruckid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public int getTruckid() {
      return truckid_;
    }
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public Builder setTruckid(int value) {
      bitField0_ |= 0x00000001;
      truckid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public Builder clearTruckid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      truckid_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation> packages_ =
      java.util.Collections.emptyList();
    private void ensurePackagesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        packages_ = new java.util.ArrayList<edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation>(packages_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation, edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation.Builder, edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocationOrBuilder> packagesBuilder_;

    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public java.util.List<edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation> getPackagesList() {
      if (packagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(packages_);
      } else {
        return packagesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public int getPackagesCount() {
      if (packagesBuilder_ == null) {
        return packages_.size();
      } else {
        return packagesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation getPackages(int index) {
      if (packagesBuilder_ == null) {
        return packages_.get(index);
      } else {
        return packagesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public Builder setPackages(
        int index, edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation value) {
      if (packagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePackagesIsMutable();
        packages_.set(index, value);
        onChanged();
      } else {
        packagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public Builder setPackages(
        int index, edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation.Builder builderForValue) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        packages_.set(index, builderForValue.build());
        onChanged();
      } else {
        packagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public Builder addPackages(edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation value) {
      if (packagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePackagesIsMutable();
        packages_.add(value);
        onChanged();
      } else {
        packagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public Builder addPackages(
        int index, edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation value) {
      if (packagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePackagesIsMutable();
        packages_.add(index, value);
        onChanged();
      } else {
        packagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public Builder addPackages(
        edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation.Builder builderForValue) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        packages_.add(builderForValue.build());
        onChanged();
      } else {
        packagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public Builder addPackages(
        int index, edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation.Builder builderForValue) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        packages_.add(index, builderForValue.build());
        onChanged();
      } else {
        packagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public Builder addAllPackages(
        java.lang.Iterable<? extends edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation> values) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, packages_);
        onChanged();
      } else {
        packagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public Builder clearPackages() {
      if (packagesBuilder_ == null) {
        packages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        packagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public Builder removePackages(int index) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        packages_.remove(index);
        onChanged();
      } else {
        packagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation.Builder getPackagesBuilder(
        int index) {
      return getPackagesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocationOrBuilder getPackagesOrBuilder(
        int index) {
      if (packagesBuilder_ == null) {
        return packages_.get(index);  } else {
        return packagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public java.util.List<? extends edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocationOrBuilder> 
         getPackagesOrBuilderList() {
      if (packagesBuilder_ != null) {
        return packagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(packages_);
      }
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation.Builder addPackagesBuilder() {
      return getPackagesFieldBuilder().addBuilder(
          edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation.getDefaultInstance());
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation.Builder addPackagesBuilder(
        int index) {
      return getPackagesFieldBuilder().addBuilder(
          index, edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation.getDefaultInstance());
    }
    /**
     * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
     */
    public java.util.List<edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation.Builder> 
         getPackagesBuilderList() {
      return getPackagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation, edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation.Builder, edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocationOrBuilder> 
        getPackagesFieldBuilder() {
      if (packagesBuilder_ == null) {
        packagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation, edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation.Builder, edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocationOrBuilder>(
                packages_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        packages_ = null;
      }
      return packagesBuilder_;
    }

    private long seqnum_ ;
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    public boolean hasSeqnum() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    public long getSeqnum() {
      return seqnum_;
    }
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    public Builder setSeqnum(long value) {
      bitField0_ |= 0x00000004;
      seqnum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    public Builder clearSeqnum() {
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:protocol.UGoDeliver)
  }

  // @@protoc_insertion_point(class_scope:protocol.UGoDeliver)
  private static final edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver();
  }

  public static edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<UGoDeliver>
      PARSER = new com.google.protobuf.AbstractParser<UGoDeliver>() {
    @java.lang.Override
    public UGoDeliver parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(
                builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UGoDeliver> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UGoDeliver> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.duke.ece568.minUPS.protocol.UPStoWorld.UGoDeliver getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


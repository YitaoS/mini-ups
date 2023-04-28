// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: withAmazon.proto

package edu.duke.ece568.minUPS.protocol.UPStoAmazon;

/**
 * Protobuf type {@code tutorial.UACommunication}
 */
public  final class UACommunication extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tutorial.UACommunication)
    UACommunicationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UACommunication.newBuilder() to construct.
  private UACommunication(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UACommunication() {
    arrived_ = java.util.Collections.emptyList();
    delivered_ = java.util.Collections.emptyList();
    acks_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.duke.ece568.minUPS.protocol.UPStoAmazon.WithAmazon.internal_static_tutorial_UACommunication_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.duke.ece568.minUPS.protocol.UPStoAmazon.WithAmazon.internal_static_tutorial_UACommunication_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication.class, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication.Builder.class);
  }

  private int bitField0_;
  public static final int ARRIVED_FIELD_NUMBER = 1;
  private java.util.List<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived> arrived_;
  /**
   * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
   */
  public java.util.List<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived> getArrivedList() {
    return arrived_;
  }
  /**
   * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
   */
  public java.util.List<? extends edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrivedOrBuilder> 
      getArrivedOrBuilderList() {
    return arrived_;
  }
  /**
   * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
   */
  public int getArrivedCount() {
    return arrived_.size();
  }
  /**
   * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
   */
  public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived getArrived(int index) {
    return arrived_.get(index);
  }
  /**
   * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
   */
  public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrivedOrBuilder getArrivedOrBuilder(
      int index) {
    return arrived_.get(index);
  }

  public static final int DELIVERED_FIELD_NUMBER = 2;
  private java.util.List<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered> delivered_;
  /**
   * <code>repeated .tutorial.UDelivered delivered = 2;</code>
   */
  public java.util.List<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered> getDeliveredList() {
    return delivered_;
  }
  /**
   * <code>repeated .tutorial.UDelivered delivered = 2;</code>
   */
  public java.util.List<? extends edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDeliveredOrBuilder> 
      getDeliveredOrBuilderList() {
    return delivered_;
  }
  /**
   * <code>repeated .tutorial.UDelivered delivered = 2;</code>
   */
  public int getDeliveredCount() {
    return delivered_.size();
  }
  /**
   * <code>repeated .tutorial.UDelivered delivered = 2;</code>
   */
  public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered getDelivered(int index) {
    return delivered_.get(index);
  }
  /**
   * <code>repeated .tutorial.UDelivered delivered = 2;</code>
   */
  public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDeliveredOrBuilder getDeliveredOrBuilder(
      int index) {
    return delivered_.get(index);
  }

  public static final int ACKS_FIELD_NUMBER = 3;
  private long acks_;
  /**
   * <code>optional int64 acks = 3;</code>
   */
  public boolean hasAcks() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 acks = 3;</code>
   */
  public long getAcks() {
    return acks_;
  }

  public static edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication parseFrom(
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
  public static Builder newBuilder(edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication prototype) {
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
   * Protobuf type {@code tutorial.UACommunication}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tutorial.UACommunication)
      edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunicationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.duke.ece568.minUPS.protocol.UPStoAmazon.WithAmazon.internal_static_tutorial_UACommunication_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.duke.ece568.minUPS.protocol.UPStoAmazon.WithAmazon.internal_static_tutorial_UACommunication_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication.class, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication.Builder.class);
    }

    // Construct using edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication.newBuilder()
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
        getArrivedFieldBuilder();
        getDeliveredFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (arrivedBuilder_ == null) {
        arrived_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        arrivedBuilder_.clear();
      }
      if (deliveredBuilder_ == null) {
        delivered_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        deliveredBuilder_.clear();
      }
      acks_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.duke.ece568.minUPS.protocol.UPStoAmazon.WithAmazon.internal_static_tutorial_UACommunication_descriptor;
    }

    @java.lang.Override
    public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication getDefaultInstanceForType() {
      return edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication.getDefaultInstance();
    }

    @java.lang.Override
    public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication build() {
      edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication buildPartial() {
      edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication result = new edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (arrivedBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          arrived_ = java.util.Collections.unmodifiableList(arrived_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.arrived_ = arrived_;
      } else {
        result.arrived_ = arrivedBuilder_.build();
      }
      if (deliveredBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          delivered_ = java.util.Collections.unmodifiableList(delivered_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.delivered_ = delivered_;
      } else {
        result.delivered_ = deliveredBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000001;
      }
      result.acks_ = acks_;
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

    private java.util.List<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived> arrived_ =
      java.util.Collections.emptyList();
    private void ensureArrivedIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        arrived_ = new java.util.ArrayList<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived>(arrived_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived.Builder, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrivedOrBuilder> arrivedBuilder_;

    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public java.util.List<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived> getArrivedList() {
      if (arrivedBuilder_ == null) {
        return java.util.Collections.unmodifiableList(arrived_);
      } else {
        return arrivedBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public int getArrivedCount() {
      if (arrivedBuilder_ == null) {
        return arrived_.size();
      } else {
        return arrivedBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived getArrived(int index) {
      if (arrivedBuilder_ == null) {
        return arrived_.get(index);
      } else {
        return arrivedBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public Builder setArrived(
        int index, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived value) {
      if (arrivedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArrivedIsMutable();
        arrived_.set(index, value);
        onChanged();
      } else {
        arrivedBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public Builder setArrived(
        int index, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived.Builder builderForValue) {
      if (arrivedBuilder_ == null) {
        ensureArrivedIsMutable();
        arrived_.set(index, builderForValue.build());
        onChanged();
      } else {
        arrivedBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public Builder addArrived(edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived value) {
      if (arrivedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArrivedIsMutable();
        arrived_.add(value);
        onChanged();
      } else {
        arrivedBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public Builder addArrived(
        int index, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived value) {
      if (arrivedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArrivedIsMutable();
        arrived_.add(index, value);
        onChanged();
      } else {
        arrivedBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public Builder addArrived(
        edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived.Builder builderForValue) {
      if (arrivedBuilder_ == null) {
        ensureArrivedIsMutable();
        arrived_.add(builderForValue.build());
        onChanged();
      } else {
        arrivedBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public Builder addArrived(
        int index, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived.Builder builderForValue) {
      if (arrivedBuilder_ == null) {
        ensureArrivedIsMutable();
        arrived_.add(index, builderForValue.build());
        onChanged();
      } else {
        arrivedBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public Builder addAllArrived(
        java.lang.Iterable<? extends edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived> values) {
      if (arrivedBuilder_ == null) {
        ensureArrivedIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, arrived_);
        onChanged();
      } else {
        arrivedBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public Builder clearArrived() {
      if (arrivedBuilder_ == null) {
        arrived_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        arrivedBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public Builder removeArrived(int index) {
      if (arrivedBuilder_ == null) {
        ensureArrivedIsMutable();
        arrived_.remove(index);
        onChanged();
      } else {
        arrivedBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived.Builder getArrivedBuilder(
        int index) {
      return getArrivedFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrivedOrBuilder getArrivedOrBuilder(
        int index) {
      if (arrivedBuilder_ == null) {
        return arrived_.get(index);  } else {
        return arrivedBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public java.util.List<? extends edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrivedOrBuilder> 
         getArrivedOrBuilderList() {
      if (arrivedBuilder_ != null) {
        return arrivedBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(arrived_);
      }
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived.Builder addArrivedBuilder() {
      return getArrivedFieldBuilder().addBuilder(
          edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived.Builder addArrivedBuilder(
        int index) {
      return getArrivedFieldBuilder().addBuilder(
          index, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
     */
    public java.util.List<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived.Builder> 
         getArrivedBuilderList() {
      return getArrivedFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived.Builder, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrivedOrBuilder> 
        getArrivedFieldBuilder() {
      if (arrivedBuilder_ == null) {
        arrivedBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived.Builder, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrivedOrBuilder>(
                arrived_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        arrived_ = null;
      }
      return arrivedBuilder_;
    }

    private java.util.List<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered> delivered_ =
      java.util.Collections.emptyList();
    private void ensureDeliveredIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        delivered_ = new java.util.ArrayList<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered>(delivered_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered.Builder, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDeliveredOrBuilder> deliveredBuilder_;

    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public java.util.List<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered> getDeliveredList() {
      if (deliveredBuilder_ == null) {
        return java.util.Collections.unmodifiableList(delivered_);
      } else {
        return deliveredBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public int getDeliveredCount() {
      if (deliveredBuilder_ == null) {
        return delivered_.size();
      } else {
        return deliveredBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered getDelivered(int index) {
      if (deliveredBuilder_ == null) {
        return delivered_.get(index);
      } else {
        return deliveredBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public Builder setDelivered(
        int index, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered value) {
      if (deliveredBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeliveredIsMutable();
        delivered_.set(index, value);
        onChanged();
      } else {
        deliveredBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public Builder setDelivered(
        int index, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered.Builder builderForValue) {
      if (deliveredBuilder_ == null) {
        ensureDeliveredIsMutable();
        delivered_.set(index, builderForValue.build());
        onChanged();
      } else {
        deliveredBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public Builder addDelivered(edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered value) {
      if (deliveredBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeliveredIsMutable();
        delivered_.add(value);
        onChanged();
      } else {
        deliveredBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public Builder addDelivered(
        int index, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered value) {
      if (deliveredBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeliveredIsMutable();
        delivered_.add(index, value);
        onChanged();
      } else {
        deliveredBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public Builder addDelivered(
        edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered.Builder builderForValue) {
      if (deliveredBuilder_ == null) {
        ensureDeliveredIsMutable();
        delivered_.add(builderForValue.build());
        onChanged();
      } else {
        deliveredBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public Builder addDelivered(
        int index, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered.Builder builderForValue) {
      if (deliveredBuilder_ == null) {
        ensureDeliveredIsMutable();
        delivered_.add(index, builderForValue.build());
        onChanged();
      } else {
        deliveredBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public Builder addAllDelivered(
        java.lang.Iterable<? extends edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered> values) {
      if (deliveredBuilder_ == null) {
        ensureDeliveredIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, delivered_);
        onChanged();
      } else {
        deliveredBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public Builder clearDelivered() {
      if (deliveredBuilder_ == null) {
        delivered_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        deliveredBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public Builder removeDelivered(int index) {
      if (deliveredBuilder_ == null) {
        ensureDeliveredIsMutable();
        delivered_.remove(index);
        onChanged();
      } else {
        deliveredBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered.Builder getDeliveredBuilder(
        int index) {
      return getDeliveredFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDeliveredOrBuilder getDeliveredOrBuilder(
        int index) {
      if (deliveredBuilder_ == null) {
        return delivered_.get(index);  } else {
        return deliveredBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public java.util.List<? extends edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDeliveredOrBuilder> 
         getDeliveredOrBuilderList() {
      if (deliveredBuilder_ != null) {
        return deliveredBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(delivered_);
      }
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered.Builder addDeliveredBuilder() {
      return getDeliveredFieldBuilder().addBuilder(
          edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered.Builder addDeliveredBuilder(
        int index) {
      return getDeliveredFieldBuilder().addBuilder(
          index, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.UDelivered delivered = 2;</code>
     */
    public java.util.List<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered.Builder> 
         getDeliveredBuilderList() {
      return getDeliveredFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered.Builder, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDeliveredOrBuilder> 
        getDeliveredFieldBuilder() {
      if (deliveredBuilder_ == null) {
        deliveredBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered.Builder, edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDeliveredOrBuilder>(
                delivered_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        delivered_ = null;
      }
      return deliveredBuilder_;
    }

    private long acks_ ;
    /**
     * <code>optional int64 acks = 3;</code>
     */
    public boolean hasAcks() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 acks = 3;</code>
     */
    public long getAcks() {
      return acks_;
    }
    /**
     * <code>optional int64 acks = 3;</code>
     */
    public Builder setAcks(long value) {
      bitField0_ |= 0x00000004;
      acks_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 acks = 3;</code>
     */
    public Builder clearAcks() {
      bitField0_ = (bitField0_ & ~0x00000004);
      acks_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tutorial.UACommunication)
  }

  // @@protoc_insertion_point(class_scope:tutorial.UACommunication)
  private static final edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication();
  }

  public static edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<UACommunication>
      PARSER = new com.google.protobuf.AbstractParser<UACommunication>() {
    @java.lang.Override
    public UACommunication parsePartialFrom(
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

  public static com.google.protobuf.Parser<UACommunication> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UACommunication> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


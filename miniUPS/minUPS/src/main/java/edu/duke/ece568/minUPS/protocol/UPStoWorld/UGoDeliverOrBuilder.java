// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: world_ups.proto

package edu.duke.ece568.minUPS.protocol.UPStoWorld;

public interface UGoDeliverOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.UGoDeliver)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required int32 truckid = 1;</code>
   * @return Whether the truckid field is set.
   */
  boolean hasTruckid();
  /**
   * <code>required int32 truckid = 1;</code>
   * @return The truckid.
   */
  int getTruckid();

  /**
   * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
   */
  java.util.List<edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation> 
      getPackagesList();
  /**
   * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
   */
  edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocation getPackages(int index);
  /**
   * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
   */
  int getPackagesCount();
  /**
   * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
   */
  java.util.List<? extends edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocationOrBuilder> 
      getPackagesOrBuilderList();
  /**
   * <code>repeated .protocol.UDeliveryLocation packages = 2;</code>
   */
  edu.duke.ece568.minUPS.protocol.UPStoWorld.UDeliveryLocationOrBuilder getPackagesOrBuilder(
      int index);

  /**
   * <code>required int64 seqnum = 3;</code>
   * @return Whether the seqnum field is set.
   */
  boolean hasSeqnum();
  /**
   * <code>required int64 seqnum = 3;</code>
   * @return The seqnum.
   */
  long getSeqnum();
}

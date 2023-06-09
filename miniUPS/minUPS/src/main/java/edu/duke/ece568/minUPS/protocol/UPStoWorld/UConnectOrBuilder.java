// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: world_ups.proto

package edu.duke.ece568.minUPS.protocol.UPStoWorld;

public interface UConnectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.UConnect)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 worldid = 1;</code>
   * @return Whether the worldid field is set.
   */
  boolean hasWorldid();
  /**
   * <code>optional int64 worldid = 1;</code>
   * @return The worldid.
   */
  long getWorldid();

  /**
   * <code>repeated .protocol.UInitTruck trucks = 2;</code>
   */
  java.util.List<edu.duke.ece568.minUPS.protocol.UPStoWorld.UInitTruck> 
      getTrucksList();
  /**
   * <code>repeated .protocol.UInitTruck trucks = 2;</code>
   */
  edu.duke.ece568.minUPS.protocol.UPStoWorld.UInitTruck getTrucks(int index);
  /**
   * <code>repeated .protocol.UInitTruck trucks = 2;</code>
   */
  int getTrucksCount();
  /**
   * <code>repeated .protocol.UInitTruck trucks = 2;</code>
   */
  java.util.List<? extends edu.duke.ece568.minUPS.protocol.UPStoWorld.UInitTruckOrBuilder> 
      getTrucksOrBuilderList();
  /**
   * <code>repeated .protocol.UInitTruck trucks = 2;</code>
   */
  edu.duke.ece568.minUPS.protocol.UPStoWorld.UInitTruckOrBuilder getTrucksOrBuilder(
      int index);

  /**
   * <code>required bool isAmazon = 3;</code>
   * @return Whether the isAmazon field is set.
   */
  boolean hasIsAmazon();
  /**
   * <code>required bool isAmazon = 3;</code>
   * @return The isAmazon.
   */
  boolean getIsAmazon();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: withAmazon.proto

package edu.duke.ece568.minUPS.protocol.UPStoAmazon;

public interface UACommunicationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.UACommunication)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
   */
  java.util.List<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived> 
      getArrivedList();
  /**
   * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
   */
  edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived getArrived(int index);
  /**
   * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
   */
  int getArrivedCount();
  /**
   * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
   */
  java.util.List<? extends edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrivedOrBuilder> 
      getArrivedOrBuilderList();
  /**
   * <code>repeated .tutorial.UTruckArrived arrived = 1;</code>
   */
  edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrivedOrBuilder getArrivedOrBuilder(
      int index);

  /**
   * <code>repeated .tutorial.UDelivered delivered = 2;</code>
   */
  java.util.List<edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered> 
      getDeliveredList();
  /**
   * <code>repeated .tutorial.UDelivered delivered = 2;</code>
   */
  edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDelivered getDelivered(int index);
  /**
   * <code>repeated .tutorial.UDelivered delivered = 2;</code>
   */
  int getDeliveredCount();
  /**
   * <code>repeated .tutorial.UDelivered delivered = 2;</code>
   */
  java.util.List<? extends edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDeliveredOrBuilder> 
      getDeliveredOrBuilderList();
  /**
   * <code>repeated .tutorial.UDelivered delivered = 2;</code>
   */
  edu.duke.ece568.minUPS.protocol.UPStoAmazon.UDeliveredOrBuilder getDeliveredOrBuilder(
      int index);

  /**
   * <code>optional int64 acks = 3;</code>
   */
  boolean hasAcks();
  /**
   * <code>optional int64 acks = 3;</code>
   */
  long getAcks();
}

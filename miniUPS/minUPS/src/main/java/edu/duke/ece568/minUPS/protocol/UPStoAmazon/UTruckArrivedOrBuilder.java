// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: withAmazon.proto

package edu.duke.ece568.minUPS.protocol.UPStoAmazon;

public interface UTruckArrivedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.UTruckArrived)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required int64 packageid = 1;</code>
   * @return Whether the packageid field is set.
   */
  boolean hasPackageid();
  /**
   * <code>required int64 packageid = 1;</code>
   * @return The packageid.
   */
  long getPackageid();

  /**
   * <code>required int32 truckid = 2;</code>
   * @return Whether the truckid field is set.
   */
  boolean hasTruckid();
  /**
   * <code>required int32 truckid = 2;</code>
   * @return The truckid.
   */
  int getTruckid();

  /**
   * <code>optional int64 seqnum = 3;</code>
   * @return Whether the seqnum field is set.
   */
  boolean hasSeqnum();
  /**
   * <code>optional int64 seqnum = 3;</code>
   * @return The seqnum.
   */
  long getSeqnum();
}

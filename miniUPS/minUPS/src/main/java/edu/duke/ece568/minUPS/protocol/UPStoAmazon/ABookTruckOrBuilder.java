// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: withAmazon.proto

package edu.duke.ece568.minUPS.protocol.UPStoAmazon;

public interface ABookTruckOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.ABookTruck)
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
   * <code>required int32 warehouseid = 2;</code>
   * @return Whether the warehouseid field is set.
   */
  boolean hasWarehouseid();
  /**
   * <code>required int32 warehouseid = 2;</code>
   * @return The warehouseid.
   */
  int getWarehouseid();

  /**
   * <code>required int32 warehousex = 3;</code>
   * @return Whether the warehousex field is set.
   */
  boolean hasWarehousex();
  /**
   * <code>required int32 warehousex = 3;</code>
   * @return The warehousex.
   */
  int getWarehousex();

  /**
   * <code>required int32 warehousey = 4;</code>
   * @return Whether the warehousey field is set.
   */
  boolean hasWarehousey();
  /**
   * <code>required int32 warehousey = 4;</code>
   * @return The warehousey.
   */
  int getWarehousey();

  /**
   * <code>required int32 destinationx = 5;</code>
   * @return Whether the destinationx field is set.
   */
  boolean hasDestinationx();
  /**
   * <code>required int32 destinationx = 5;</code>
   * @return The destinationx.
   */
  int getDestinationx();

  /**
   * <code>required int32 destinationy = 6;</code>
   * @return Whether the destinationy field is set.
   */
  boolean hasDestinationy();
  /**
   * <code>required int32 destinationy = 6;</code>
   * @return The destinationy.
   */
  int getDestinationy();

  /**
   * <code>optional string upsid = 7;</code>
   * @return Whether the upsid field is set.
   */
  boolean hasUpsid();
  /**
   * <code>optional string upsid = 7;</code>
   * @return The upsid.
   */
  java.lang.String getUpsid();
  /**
   * <code>optional string upsid = 7;</code>
   * @return The bytes for upsid.
   */
  com.google.protobuf.ByteString
      getUpsidBytes();

  /**
   * <code>optional int64 seqnum = 8;</code>
   * @return Whether the seqnum field is set.
   */
  boolean hasSeqnum();
  /**
   * <code>optional int64 seqnum = 8;</code>
   * @return The seqnum.
   */
  long getSeqnum();
}

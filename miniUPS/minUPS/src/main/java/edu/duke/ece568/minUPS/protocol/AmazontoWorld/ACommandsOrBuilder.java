// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AmazontoWorld.proto

package edu.duke.ece568.minUPS.protocol.AmazontoWorld;

public interface ACommandsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ACommands)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .APurchaseMore buy = 1;</code>
   */
  java.util.List<edu.duke.ece568.minUPS.protocol.AmazontoWorld.APurchaseMore> 
      getBuyList();
  /**
   * <code>repeated .APurchaseMore buy = 1;</code>
   */
  edu.duke.ece568.minUPS.protocol.AmazontoWorld.APurchaseMore getBuy(int index);
  /**
   * <code>repeated .APurchaseMore buy = 1;</code>
   */
  int getBuyCount();
  /**
   * <code>repeated .APurchaseMore buy = 1;</code>
   */
  java.util.List<? extends edu.duke.ece568.minUPS.protocol.AmazontoWorld.APurchaseMoreOrBuilder> 
      getBuyOrBuilderList();
  /**
   * <code>repeated .APurchaseMore buy = 1;</code>
   */
  edu.duke.ece568.minUPS.protocol.AmazontoWorld.APurchaseMoreOrBuilder getBuyOrBuilder(
      int index);

  /**
   * <code>repeated .APack topack = 2;</code>
   */
  java.util.List<edu.duke.ece568.minUPS.protocol.AmazontoWorld.APack> 
      getTopackList();
  /**
   * <code>repeated .APack topack = 2;</code>
   */
  edu.duke.ece568.minUPS.protocol.AmazontoWorld.APack getTopack(int index);
  /**
   * <code>repeated .APack topack = 2;</code>
   */
  int getTopackCount();
  /**
   * <code>repeated .APack topack = 2;</code>
   */
  java.util.List<? extends edu.duke.ece568.minUPS.protocol.AmazontoWorld.APackOrBuilder> 
      getTopackOrBuilderList();
  /**
   * <code>repeated .APack topack = 2;</code>
   */
  edu.duke.ece568.minUPS.protocol.AmazontoWorld.APackOrBuilder getTopackOrBuilder(
      int index);

  /**
   * <code>repeated .APutOnTruck load = 3;</code>
   */
  java.util.List<edu.duke.ece568.minUPS.protocol.AmazontoWorld.APutOnTruck> 
      getLoadList();
  /**
   * <code>repeated .APutOnTruck load = 3;</code>
   */
  edu.duke.ece568.minUPS.protocol.AmazontoWorld.APutOnTruck getLoad(int index);
  /**
   * <code>repeated .APutOnTruck load = 3;</code>
   */
  int getLoadCount();
  /**
   * <code>repeated .APutOnTruck load = 3;</code>
   */
  java.util.List<? extends edu.duke.ece568.minUPS.protocol.AmazontoWorld.APutOnTruckOrBuilder> 
      getLoadOrBuilderList();
  /**
   * <code>repeated .APutOnTruck load = 3;</code>
   */
  edu.duke.ece568.minUPS.protocol.AmazontoWorld.APutOnTruckOrBuilder getLoadOrBuilder(
      int index);

  /**
   * <code>repeated .AQuery queries = 4;</code>
   */
  java.util.List<edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery> 
      getQueriesList();
  /**
   * <code>repeated .AQuery queries = 4;</code>
   */
  edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQuery getQueries(int index);
  /**
   * <code>repeated .AQuery queries = 4;</code>
   */
  int getQueriesCount();
  /**
   * <code>repeated .AQuery queries = 4;</code>
   */
  java.util.List<? extends edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQueryOrBuilder> 
      getQueriesOrBuilderList();
  /**
   * <code>repeated .AQuery queries = 4;</code>
   */
  edu.duke.ece568.minUPS.protocol.AmazontoWorld.AQueryOrBuilder getQueriesOrBuilder(
      int index);

  /**
   * <code>optional uint32 simspeed = 5;</code>
   */
  boolean hasSimspeed();
  /**
   * <code>optional uint32 simspeed = 5;</code>
   */
  int getSimspeed();

  /**
   * <code>optional bool disconnect = 6;</code>
   */
  boolean hasDisconnect();
  /**
   * <code>optional bool disconnect = 6;</code>
   */
  boolean getDisconnect();

  /**
   * <code>repeated int64 acks = 7;</code>
   */
  java.util.List<java.lang.Long> getAcksList();
  /**
   * <code>repeated int64 acks = 7;</code>
   */
  int getAcksCount();
  /**
   * <code>repeated int64 acks = 7;</code>
   */
  long getAcks(int index);
}

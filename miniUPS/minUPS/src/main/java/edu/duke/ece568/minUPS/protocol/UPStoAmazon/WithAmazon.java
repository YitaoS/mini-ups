// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: withAmazon.proto

package edu.duke.ece568.minUPS.protocol.UPStoAmazon;

public final class WithAmazon {
  private WithAmazon() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_AInformWorld_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_AInformWorld_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_UReceivedWorld_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_UReceivedWorld_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_ABookTruck_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_ABookTruck_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_UTruckArrived_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_UTruckArrived_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_AStartDeliver_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_AStartDeliver_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_UDelivered_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_UDelivered_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_AUCommunication_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_AUCommunication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_UACommunication_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_UACommunication_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020withAmazon.proto\022\010tutorial\"\037\n\014AInformW" +
      "orld\022\017\n\007worldid\030\001 \002(\003\"!\n\016UReceivedWorld\022" +
      "\017\n\007worldid\030\001 \002(\003\"\267\001\n\nABookTruck\022\021\n\tpacka" +
      "geid\030\001 \002(\003\022\023\n\013warehouseid\030\002 \002(\005\022\022\n\nwareh" +
      "ousex\030\003 \002(\005\022\022\n\nwarehousey\030\004 \002(\005\022\024\n\014desti" +
      "nationx\030\005 \002(\005\022\024\n\014destinationy\030\006 \002(\005\022\r\n\005u" +
      "psid\030\007 \001(\t\022\016\n\006seqnum\030\010 \001(\003\022\016\n\006detail\030\t \001" +
      "(\t\"C\n\rUTruckArrived\022\021\n\tpackageid\030\001 \002(\003\022\017" +
      "\n\007truckid\030\002 \002(\005\022\016\n\006seqnum\030\003 \001(\003\"2\n\rAStar" +
      "tDeliver\022\021\n\tpackageid\030\001 \002(\003\022\016\n\006seqnum\030\002 " +
      "\001(\003\"/\n\nUDelivered\022\021\n\tpackageid\030\001 \002(\003\022\016\n\006" +
      "seqnum\030\002 \001(\003\"r\n\017AUCommunication\022&\n\010booki" +
      "ngs\030\001 \003(\0132\024.tutorial.ABookTruck\022)\n\010deliv" +
      "ers\030\002 \003(\0132\027.tutorial.AStartDeliver\022\014\n\004ac" +
      "ks\030\003 \001(\003\"r\n\017UACommunication\022(\n\007arrived\030\001" +
      " \003(\0132\027.tutorial.UTruckArrived\022\'\n\tdeliver" +
      "ed\030\002 \003(\0132\024.tutorial.UDelivered\022\014\n\004acks\030\003" +
      " \001(\003B1\n+edu.duke.ece568.minUPS.protocol." +
      "UPStoAmazonH\002P\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tutorial_AInformWorld_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_AInformWorld_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_AInformWorld_descriptor,
        new java.lang.String[] { "Worldid", });
    internal_static_tutorial_UReceivedWorld_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tutorial_UReceivedWorld_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_UReceivedWorld_descriptor,
        new java.lang.String[] { "Worldid", });
    internal_static_tutorial_ABookTruck_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tutorial_ABookTruck_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_ABookTruck_descriptor,
        new java.lang.String[] { "Packageid", "Warehouseid", "Warehousex", "Warehousey", "Destinationx", "Destinationy", "Upsid", "Seqnum", "Detail", });
    internal_static_tutorial_UTruckArrived_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tutorial_UTruckArrived_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_UTruckArrived_descriptor,
        new java.lang.String[] { "Packageid", "Truckid", "Seqnum", });
    internal_static_tutorial_AStartDeliver_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tutorial_AStartDeliver_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_AStartDeliver_descriptor,
        new java.lang.String[] { "Packageid", "Seqnum", });
    internal_static_tutorial_UDelivered_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tutorial_UDelivered_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_UDelivered_descriptor,
        new java.lang.String[] { "Packageid", "Seqnum", });
    internal_static_tutorial_AUCommunication_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tutorial_AUCommunication_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_AUCommunication_descriptor,
        new java.lang.String[] { "Bookings", "Delivers", "Acks", });
    internal_static_tutorial_UACommunication_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tutorial_UACommunication_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_UACommunication_descriptor,
        new java.lang.String[] { "Arrived", "Delivered", "Acks", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pingpong.proto

package org.apache.camel.component.grpc;

public interface PingRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.apache.camel.component.grpc.test.PingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ping_name = 1;</code>
   * @return The pingName.
   */
  java.lang.String getPingName();
  /**
   * <code>string ping_name = 1;</code>
   * @return The bytes for pingName.
   */
  com.google.protobuf.ByteString
      getPingNameBytes();

  /**
   * <code>int32 ping_id = 2;</code>
   * @return The pingId.
   */
  int getPingId();
}
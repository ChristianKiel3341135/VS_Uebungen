// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package vs.uebung6;

public interface BewertungOrBuilder extends
    // @@protoc_insertion_point(interface_extends:vs.uebung6.Bewertung)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string kommando = 1;</code>
   * @return The kommando.
   */
  java.lang.String getKommando();
  /**
   * <code>string kommando = 1;</code>
   * @return The bytes for kommando.
   */
  com.google.protobuf.ByteString
      getKommandoBytes();

  /**
   * <code>.google.protobuf.Timestamp datum = 2;</code>
   * @return Whether the datum field is set.
   */
  boolean hasDatum();
  /**
   * <code>.google.protobuf.Timestamp datum = 2;</code>
   * @return The datum.
   */
  com.google.protobuf.Timestamp getDatum();
  /**
   * <code>.google.protobuf.Timestamp datum = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDatumOrBuilder();
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: account/user/v1/user.proto
// Protobuf Java Version: 4.27.0

package com.github.vnworkday.proto.account.user.v1;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:account.user.v1.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string first_name = 2 [json_name = "firstName"];</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 2 [json_name = "firstName"];</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 3 [json_name = "lastName"];</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 3 [json_name = "lastName"];</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string full_name = 4 [json_name = "fullName", deprecated = true];</code>
   * @deprecated account.user.v1.User.full_name is deprecated.
   *     See account/user/v1/user.proto;l=8
   * @return The fullName.
   */
  @java.lang.Deprecated java.lang.String getFullName();
  /**
   * <code>string full_name = 4 [json_name = "fullName", deprecated = true];</code>
   * @deprecated account.user.v1.User.full_name is deprecated.
   *     See account/user/v1/user.proto;l=8
   * @return The bytes for fullName.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getFullNameBytes();

  /**
   * <code>string email = 5 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 5 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();
}

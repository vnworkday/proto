// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: account/tenant/v1/tenant_service.proto
// Protobuf Java Version: 4.27.0

package com.github.vnworkday.proto.account.tenant.v1;

public interface UpdateTenantResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:account.tenant.v1.UpdateTenantResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
   * @return Whether the tenant field is set.
   */
  boolean hasTenant();
  /**
   * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
   * @return The tenant.
   */
  com.github.vnworkday.proto.account.tenant.v1.Tenant getTenant();
  /**
   * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
   */
  com.github.vnworkday.proto.account.tenant.v1.TenantOrBuilder getTenantOrBuilder();
}

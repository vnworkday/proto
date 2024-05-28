// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: account/tenant/v1/tenant_service.proto
// Protobuf Java Version: 4.27.0

package com.github.vnworkday.proto.account.tenant.v1;

/**
 * Protobuf type {@code account.tenant.v1.UpdateTenantResponse}
 */
public final class UpdateTenantResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:account.tenant.v1.UpdateTenantResponse)
    UpdateTenantResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 0,
      /* suffix= */ "",
      UpdateTenantResponse.class.getName());
  }
  // Use UpdateTenantResponse.newBuilder() to construct.
  private UpdateTenantResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateTenantResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.vnworkday.proto.account.tenant.v1.TenantServiceProto.internal_static_account_tenant_v1_UpdateTenantResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.vnworkday.proto.account.tenant.v1.TenantServiceProto.internal_static_account_tenant_v1_UpdateTenantResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse.class, com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TENANT_FIELD_NUMBER = 1;
  private com.github.vnworkday.proto.account.tenant.v1.Tenant tenant_;
  /**
   * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
   * @return Whether the tenant field is set.
   */
  @java.lang.Override
  public boolean hasTenant() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
   * @return The tenant.
   */
  @java.lang.Override
  public com.github.vnworkday.proto.account.tenant.v1.Tenant getTenant() {
    return tenant_ == null ? com.github.vnworkday.proto.account.tenant.v1.Tenant.getDefaultInstance() : tenant_;
  }
  /**
   * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
   */
  @java.lang.Override
  public com.github.vnworkday.proto.account.tenant.v1.TenantOrBuilder getTenantOrBuilder() {
    return tenant_ == null ? com.github.vnworkday.proto.account.tenant.v1.Tenant.getDefaultInstance() : tenant_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTenant());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTenant());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse)) {
      return super.equals(obj);
    }
    com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse other = (com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse) obj;

    if (hasTenant() != other.hasTenant()) return false;
    if (hasTenant()) {
      if (!getTenant()
          .equals(other.getTenant())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTenant()) {
      hash = (37 * hash) + TENANT_FIELD_NUMBER;
      hash = (53 * hash) + getTenant().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code account.tenant.v1.UpdateTenantResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:account.tenant.v1.UpdateTenantResponse)
      com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.vnworkday.proto.account.tenant.v1.TenantServiceProto.internal_static_account_tenant_v1_UpdateTenantResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.vnworkday.proto.account.tenant.v1.TenantServiceProto.internal_static_account_tenant_v1_UpdateTenantResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse.class, com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse.Builder.class);
    }

    // Construct using com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getTenantFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tenant_ = null;
      if (tenantBuilder_ != null) {
        tenantBuilder_.dispose();
        tenantBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.vnworkday.proto.account.tenant.v1.TenantServiceProto.internal_static_account_tenant_v1_UpdateTenantResponse_descriptor;
    }

    @java.lang.Override
    public com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse getDefaultInstanceForType() {
      return com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse build() {
      com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse buildPartial() {
      com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse result = new com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tenant_ = tenantBuilder_ == null
            ? tenant_
            : tenantBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse) {
        return mergeFrom((com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse other) {
      if (other == com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse.getDefaultInstance()) return this;
      if (other.hasTenant()) {
        mergeTenant(other.getTenant());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getTenantFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.github.vnworkday.proto.account.tenant.v1.Tenant tenant_;
    private com.google.protobuf.SingleFieldBuilder<
        com.github.vnworkday.proto.account.tenant.v1.Tenant, com.github.vnworkday.proto.account.tenant.v1.Tenant.Builder, com.github.vnworkday.proto.account.tenant.v1.TenantOrBuilder> tenantBuilder_;
    /**
     * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     * @return Whether the tenant field is set.
     */
    public boolean hasTenant() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     * @return The tenant.
     */
    public com.github.vnworkday.proto.account.tenant.v1.Tenant getTenant() {
      if (tenantBuilder_ == null) {
        return tenant_ == null ? com.github.vnworkday.proto.account.tenant.v1.Tenant.getDefaultInstance() : tenant_;
      } else {
        return tenantBuilder_.getMessage();
      }
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    public Builder setTenant(com.github.vnworkday.proto.account.tenant.v1.Tenant value) {
      if (tenantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tenant_ = value;
      } else {
        tenantBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    public Builder setTenant(
        com.github.vnworkday.proto.account.tenant.v1.Tenant.Builder builderForValue) {
      if (tenantBuilder_ == null) {
        tenant_ = builderForValue.build();
      } else {
        tenantBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    public Builder mergeTenant(com.github.vnworkday.proto.account.tenant.v1.Tenant value) {
      if (tenantBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          tenant_ != null &&
          tenant_ != com.github.vnworkday.proto.account.tenant.v1.Tenant.getDefaultInstance()) {
          getTenantBuilder().mergeFrom(value);
        } else {
          tenant_ = value;
        }
      } else {
        tenantBuilder_.mergeFrom(value);
      }
      if (tenant_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    public Builder clearTenant() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tenant_ = null;
      if (tenantBuilder_ != null) {
        tenantBuilder_.dispose();
        tenantBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    public com.github.vnworkday.proto.account.tenant.v1.Tenant.Builder getTenantBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTenantFieldBuilder().getBuilder();
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    public com.github.vnworkday.proto.account.tenant.v1.TenantOrBuilder getTenantOrBuilder() {
      if (tenantBuilder_ != null) {
        return tenantBuilder_.getMessageOrBuilder();
      } else {
        return tenant_ == null ?
            com.github.vnworkday.proto.account.tenant.v1.Tenant.getDefaultInstance() : tenant_;
      }
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.github.vnworkday.proto.account.tenant.v1.Tenant, com.github.vnworkday.proto.account.tenant.v1.Tenant.Builder, com.github.vnworkday.proto.account.tenant.v1.TenantOrBuilder> 
        getTenantFieldBuilder() {
      if (tenantBuilder_ == null) {
        tenantBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.github.vnworkday.proto.account.tenant.v1.Tenant, com.github.vnworkday.proto.account.tenant.v1.Tenant.Builder, com.github.vnworkday.proto.account.tenant.v1.TenantOrBuilder>(
                getTenant(),
                getParentForChildren(),
                isClean());
        tenant_ = null;
      }
      return tenantBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:account.tenant.v1.UpdateTenantResponse)
  }

  // @@protoc_insertion_point(class_scope:account.tenant.v1.UpdateTenantResponse)
  private static final com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse();
  }

  public static com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTenantResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateTenantResponse>() {
    @java.lang.Override
    public UpdateTenantResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UpdateTenantResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTenantResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.vnworkday.proto.account.tenant.v1.UpdateTenantResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


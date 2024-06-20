// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: account/tenant/v1/tenant_service.proto
// Protobuf Java Version: 4.27.0

package com.github.vnworkday.proto.account.tenant.v1;

/**
 * <pre>
 * Response for getting a tenant.
 * </pre>
 *
 * Protobuf type {@code account.tenant.v1.GetTenantResponse}
 */
public final class GetTenantResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:account.tenant.v1.GetTenantResponse)
    GetTenantResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 0,
      /* suffix= */ "",
      GetTenantResponse.class.getName());
  }
  // Use GetTenantResponse.newBuilder() to construct.
  private GetTenantResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetTenantResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.vnworkday.proto.account.tenant.v1.TenantServiceProto.internal_static_account_tenant_v1_GetTenantResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.vnworkday.proto.account.tenant.v1.TenantServiceProto.internal_static_account_tenant_v1_GetTenantResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse.class, com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ERROR_FIELD_NUMBER = 1;
  private com.github.vnworkday.proto.shared.v1.Error error_;
  /**
   * <code>.shared.v1.Error error = 1 [json_name = "error"];</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.shared.v1.Error error = 1 [json_name = "error"];</code>
   * @return The error.
   */
  @java.lang.Override
  public com.github.vnworkday.proto.shared.v1.Error getError() {
    return error_ == null ? com.github.vnworkday.proto.shared.v1.Error.getDefaultInstance() : error_;
  }
  /**
   * <code>.shared.v1.Error error = 1 [json_name = "error"];</code>
   */
  @java.lang.Override
  public com.github.vnworkday.proto.shared.v1.ErrorOrBuilder getErrorOrBuilder() {
    return error_ == null ? com.github.vnworkday.proto.shared.v1.Error.getDefaultInstance() : error_;
  }

  public static final int TENANT_FIELD_NUMBER = 2;
  private com.github.vnworkday.proto.account.tenant.v1.Tenant tenant_;
  /**
   * <code>.account.tenant.v1.Tenant tenant = 2 [json_name = "tenant"];</code>
   * @return Whether the tenant field is set.
   */
  @java.lang.Override
  public boolean hasTenant() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.account.tenant.v1.Tenant tenant = 2 [json_name = "tenant"];</code>
   * @return The tenant.
   */
  @java.lang.Override
  public com.github.vnworkday.proto.account.tenant.v1.Tenant getTenant() {
    return tenant_ == null ? com.github.vnworkday.proto.account.tenant.v1.Tenant.getDefaultInstance() : tenant_;
  }
  /**
   * <code>.account.tenant.v1.Tenant tenant = 2 [json_name = "tenant"];</code>
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
      output.writeMessage(1, getError());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getTenant());
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
        .computeMessageSize(1, getError());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTenant());
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
    if (!(obj instanceof com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse)) {
      return super.equals(obj);
    }
    com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse other = (com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse) obj;

    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError()
          .equals(other.getError())) return false;
    }
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
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    if (hasTenant()) {
      hash = (37 * hash) + TENANT_FIELD_NUMBER;
      hash = (53 * hash) + getTenant().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse parseFrom(
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
  public static Builder newBuilder(com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse prototype) {
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
   * <pre>
   * Response for getting a tenant.
   * </pre>
   *
   * Protobuf type {@code account.tenant.v1.GetTenantResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:account.tenant.v1.GetTenantResponse)
      com.github.vnworkday.proto.account.tenant.v1.GetTenantResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.vnworkday.proto.account.tenant.v1.TenantServiceProto.internal_static_account_tenant_v1_GetTenantResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.vnworkday.proto.account.tenant.v1.TenantServiceProto.internal_static_account_tenant_v1_GetTenantResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse.class, com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse.Builder.class);
    }

    // Construct using com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse.newBuilder()
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
        getErrorFieldBuilder();
        getTenantFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
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
      return com.github.vnworkday.proto.account.tenant.v1.TenantServiceProto.internal_static_account_tenant_v1_GetTenantResponse_descriptor;
    }

    @java.lang.Override
    public com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse getDefaultInstanceForType() {
      return com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse build() {
      com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse buildPartial() {
      com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse result = new com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.error_ = errorBuilder_ == null
            ? error_
            : errorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tenant_ = tenantBuilder_ == null
            ? tenant_
            : tenantBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse) {
        return mergeFrom((com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse other) {
      if (other == com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse.getDefaultInstance()) return this;
      if (other.hasError()) {
        mergeError(other.getError());
      }
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
                  getErrorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTenantFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.github.vnworkday.proto.shared.v1.Error error_;
    private com.google.protobuf.SingleFieldBuilder<
        com.github.vnworkday.proto.shared.v1.Error, com.github.vnworkday.proto.shared.v1.Error.Builder, com.github.vnworkday.proto.shared.v1.ErrorOrBuilder> errorBuilder_;
    /**
     * <code>.shared.v1.Error error = 1 [json_name = "error"];</code>
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.shared.v1.Error error = 1 [json_name = "error"];</code>
     * @return The error.
     */
    public com.github.vnworkday.proto.shared.v1.Error getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.github.vnworkday.proto.shared.v1.Error.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <code>.shared.v1.Error error = 1 [json_name = "error"];</code>
     */
    public Builder setError(com.github.vnworkday.proto.shared.v1.Error value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
      } else {
        errorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.shared.v1.Error error = 1 [json_name = "error"];</code>
     */
    public Builder setError(
        com.github.vnworkday.proto.shared.v1.Error.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.shared.v1.Error error = 1 [json_name = "error"];</code>
     */
    public Builder mergeError(com.github.vnworkday.proto.shared.v1.Error value) {
      if (errorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          error_ != null &&
          error_ != com.github.vnworkday.proto.shared.v1.Error.getDefaultInstance()) {
          getErrorBuilder().mergeFrom(value);
        } else {
          error_ = value;
        }
      } else {
        errorBuilder_.mergeFrom(value);
      }
      if (error_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.shared.v1.Error error = 1 [json_name = "error"];</code>
     */
    public Builder clearError() {
      bitField0_ = (bitField0_ & ~0x00000001);
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.shared.v1.Error error = 1 [json_name = "error"];</code>
     */
    public com.github.vnworkday.proto.shared.v1.Error.Builder getErrorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>.shared.v1.Error error = 1 [json_name = "error"];</code>
     */
    public com.github.vnworkday.proto.shared.v1.ErrorOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ?
            com.github.vnworkday.proto.shared.v1.Error.getDefaultInstance() : error_;
      }
    }
    /**
     * <code>.shared.v1.Error error = 1 [json_name = "error"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.github.vnworkday.proto.shared.v1.Error, com.github.vnworkday.proto.shared.v1.Error.Builder, com.github.vnworkday.proto.shared.v1.ErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.github.vnworkday.proto.shared.v1.Error, com.github.vnworkday.proto.shared.v1.Error.Builder, com.github.vnworkday.proto.shared.v1.ErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
    }

    private com.github.vnworkday.proto.account.tenant.v1.Tenant tenant_;
    private com.google.protobuf.SingleFieldBuilder<
        com.github.vnworkday.proto.account.tenant.v1.Tenant, com.github.vnworkday.proto.account.tenant.v1.Tenant.Builder, com.github.vnworkday.proto.account.tenant.v1.TenantOrBuilder> tenantBuilder_;
    /**
     * <code>.account.tenant.v1.Tenant tenant = 2 [json_name = "tenant"];</code>
     * @return Whether the tenant field is set.
     */
    public boolean hasTenant() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 2 [json_name = "tenant"];</code>
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
     * <code>.account.tenant.v1.Tenant tenant = 2 [json_name = "tenant"];</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 2 [json_name = "tenant"];</code>
     */
    public Builder setTenant(
        com.github.vnworkday.proto.account.tenant.v1.Tenant.Builder builderForValue) {
      if (tenantBuilder_ == null) {
        tenant_ = builderForValue.build();
      } else {
        tenantBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 2 [json_name = "tenant"];</code>
     */
    public Builder mergeTenant(com.github.vnworkday.proto.account.tenant.v1.Tenant value) {
      if (tenantBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
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
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 2 [json_name = "tenant"];</code>
     */
    public Builder clearTenant() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tenant_ = null;
      if (tenantBuilder_ != null) {
        tenantBuilder_.dispose();
        tenantBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 2 [json_name = "tenant"];</code>
     */
    public com.github.vnworkday.proto.account.tenant.v1.Tenant.Builder getTenantBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTenantFieldBuilder().getBuilder();
    }
    /**
     * <code>.account.tenant.v1.Tenant tenant = 2 [json_name = "tenant"];</code>
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
     * <code>.account.tenant.v1.Tenant tenant = 2 [json_name = "tenant"];</code>
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

    // @@protoc_insertion_point(builder_scope:account.tenant.v1.GetTenantResponse)
  }

  // @@protoc_insertion_point(class_scope:account.tenant.v1.GetTenantResponse)
  private static final com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse();
  }

  public static com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTenantResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTenantResponse>() {
    @java.lang.Override
    public GetTenantResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTenantResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTenantResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.vnworkday.proto.account.tenant.v1.GetTenantResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


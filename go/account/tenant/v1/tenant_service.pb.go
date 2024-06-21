// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.34.1
// 	protoc        (unknown)
// source: account/tenant/v1/tenant_service.proto

package tenantv1

import (
	v1 "github.com/vnworkday/proto/shared/v1"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// For creating a new tenant.
// Status is set to ACTIVE by default.
// Production type is set to ENTERPRISE by default. Other types must be created outside of the API.
type CreateTenantRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Info *v1.RequestInfo `protobuf:"bytes,1,opt,name=info,proto3" json:"info,omitempty"`
	// Required. The name of the tenant. This must be unique across all tenants.
	Name string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	// Required. The domain of the tenant. This must be unique across all tenants.
	Domain string `protobuf:"bytes,3,opt,name=domain,proto3" json:"domain,omitempty"`
	// Required. The timezone of the tenant. This must be a valid Olson timezone.
	Timezone string `protobuf:"bytes,4,opt,name=timezone,proto3" json:"timezone,omitempty"`
	// Required. The type of subscription for the tenant.
	SubscriptionType TenantSubscriptionType `protobuf:"varint,5,opt,name=subscription_type,json=subscriptionType,proto3,enum=account.tenant.v1.TenantSubscriptionType" json:"subscription_type,omitempty"`
	// Optional. Whether self-registration is enabled for the tenant. Defaults to false if not set.
	SelfRegistrationEnabled bool `protobuf:"varint,6,opt,name=self_registration_enabled,json=selfRegistrationEnabled,proto3" json:"self_registration_enabled,omitempty"`
}

func (x *CreateTenantRequest) Reset() {
	*x = CreateTenantRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateTenantRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateTenantRequest) ProtoMessage() {}

func (x *CreateTenantRequest) ProtoReflect() protoreflect.Message {
	mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateTenantRequest.ProtoReflect.Descriptor instead.
func (*CreateTenantRequest) Descriptor() ([]byte, []int) {
	return file_account_tenant_v1_tenant_service_proto_rawDescGZIP(), []int{0}
}

func (x *CreateTenantRequest) GetInfo() *v1.RequestInfo {
	if x != nil {
		return x.Info
	}
	return nil
}

func (x *CreateTenantRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *CreateTenantRequest) GetDomain() string {
	if x != nil {
		return x.Domain
	}
	return ""
}

func (x *CreateTenantRequest) GetTimezone() string {
	if x != nil {
		return x.Timezone
	}
	return ""
}

func (x *CreateTenantRequest) GetSubscriptionType() TenantSubscriptionType {
	if x != nil {
		return x.SubscriptionType
	}
	return TenantSubscriptionType_TENANT_SUBSCRIPTION_TYPE_UNSPECIFIED
}

func (x *CreateTenantRequest) GetSelfRegistrationEnabled() bool {
	if x != nil {
		return x.SelfRegistrationEnabled
	}
	return false
}

// Response for creating a new tenant.
type CreateTenantResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Error  *v1.Error `protobuf:"bytes,1,opt,name=error,proto3" json:"error,omitempty"`
	Tenant *Tenant   `protobuf:"bytes,2,opt,name=tenant,proto3" json:"tenant,omitempty"`
}

func (x *CreateTenantResponse) Reset() {
	*x = CreateTenantResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateTenantResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateTenantResponse) ProtoMessage() {}

func (x *CreateTenantResponse) ProtoReflect() protoreflect.Message {
	mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateTenantResponse.ProtoReflect.Descriptor instead.
func (*CreateTenantResponse) Descriptor() ([]byte, []int) {
	return file_account_tenant_v1_tenant_service_proto_rawDescGZIP(), []int{1}
}

func (x *CreateTenantResponse) GetError() *v1.Error {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *CreateTenantResponse) GetTenant() *Tenant {
	if x != nil {
		return x.Tenant
	}
	return nil
}

// For getting a tenant.
type GetTenantRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Info *v1.RequestInfo `protobuf:"bytes,1,opt,name=info,proto3" json:"info,omitempty"`
	// Required. The ID of the tenant to get.
	Id string `protobuf:"bytes,2,opt,name=id,proto3" json:"id,omitempty"`
}

func (x *GetTenantRequest) Reset() {
	*x = GetTenantRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetTenantRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetTenantRequest) ProtoMessage() {}

func (x *GetTenantRequest) ProtoReflect() protoreflect.Message {
	mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetTenantRequest.ProtoReflect.Descriptor instead.
func (*GetTenantRequest) Descriptor() ([]byte, []int) {
	return file_account_tenant_v1_tenant_service_proto_rawDescGZIP(), []int{2}
}

func (x *GetTenantRequest) GetInfo() *v1.RequestInfo {
	if x != nil {
		return x.Info
	}
	return nil
}

func (x *GetTenantRequest) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

// Response for getting a tenant.
type GetTenantResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Error  *v1.Error `protobuf:"bytes,1,opt,name=error,proto3" json:"error,omitempty"`
	Tenant *Tenant   `protobuf:"bytes,2,opt,name=tenant,proto3" json:"tenant,omitempty"`
}

func (x *GetTenantResponse) Reset() {
	*x = GetTenantResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetTenantResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetTenantResponse) ProtoMessage() {}

func (x *GetTenantResponse) ProtoReflect() protoreflect.Message {
	mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetTenantResponse.ProtoReflect.Descriptor instead.
func (*GetTenantResponse) Descriptor() ([]byte, []int) {
	return file_account_tenant_v1_tenant_service_proto_rawDescGZIP(), []int{3}
}

func (x *GetTenantResponse) GetError() *v1.Error {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *GetTenantResponse) GetTenant() *Tenant {
	if x != nil {
		return x.Tenant
	}
	return nil
}

// For listing tenants.
type ListTenantsRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Info       *v1.RequestInfo       `protobuf:"bytes,1,opt,name=info,proto3" json:"info,omitempty"`
	Pagination *v1.RequestPagination `protobuf:"bytes,2,opt,name=pagination,proto3" json:"pagination,omitempty"`
	// Optional. Filters to apply to the list of tenants.
	// If multiple filters are specified, they are combined with AND.
	// Supported filters:
	// - name: The name of the tenant.
	// - domain: The domain of the tenant.
	// - timezone: The timezone of the tenant.
	// - subscription_type: The subscription type of the tenant.
	// - self_registration_enabled: Whether self-registration is enabled for the tenant.
	// - status: The status of the tenant.
	Filters []*v1.RequestFilter `protobuf:"bytes,3,rep,name=filters,proto3" json:"filters,omitempty"`
	// Optional. Sorts to apply to the list of tenants.
	// If multiple sorts are specified, they are applied in the order given.
	// Supported sorts:
	// - name
	// - domain
	// - timezone
	// - subscription_type
	// - self_registration_enabled
	// - status
	// - created_at
	// - updated_at
	Sorts []*v1.RequestSort `protobuf:"bytes,4,rep,name=sorts,proto3" json:"sorts,omitempty"`
}

func (x *ListTenantsRequest) Reset() {
	*x = ListTenantsRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListTenantsRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListTenantsRequest) ProtoMessage() {}

func (x *ListTenantsRequest) ProtoReflect() protoreflect.Message {
	mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListTenantsRequest.ProtoReflect.Descriptor instead.
func (*ListTenantsRequest) Descriptor() ([]byte, []int) {
	return file_account_tenant_v1_tenant_service_proto_rawDescGZIP(), []int{4}
}

func (x *ListTenantsRequest) GetInfo() *v1.RequestInfo {
	if x != nil {
		return x.Info
	}
	return nil
}

func (x *ListTenantsRequest) GetPagination() *v1.RequestPagination {
	if x != nil {
		return x.Pagination
	}
	return nil
}

func (x *ListTenantsRequest) GetFilters() []*v1.RequestFilter {
	if x != nil {
		return x.Filters
	}
	return nil
}

func (x *ListTenantsRequest) GetSorts() []*v1.RequestSort {
	if x != nil {
		return x.Sorts
	}
	return nil
}

// Response for listing tenants.
type ListTenantsResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Error      *v1.Error              `protobuf:"bytes,1,opt,name=error,proto3" json:"error,omitempty"`
	Pagination *v1.ResponsePagination `protobuf:"bytes,2,opt,name=pagination,proto3" json:"pagination,omitempty"`
	Tenants    []*Tenant              `protobuf:"bytes,3,rep,name=tenants,proto3" json:"tenants,omitempty"`
}

func (x *ListTenantsResponse) Reset() {
	*x = ListTenantsResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListTenantsResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListTenantsResponse) ProtoMessage() {}

func (x *ListTenantsResponse) ProtoReflect() protoreflect.Message {
	mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListTenantsResponse.ProtoReflect.Descriptor instead.
func (*ListTenantsResponse) Descriptor() ([]byte, []int) {
	return file_account_tenant_v1_tenant_service_proto_rawDescGZIP(), []int{5}
}

func (x *ListTenantsResponse) GetError() *v1.Error {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *ListTenantsResponse) GetPagination() *v1.ResponsePagination {
	if x != nil {
		return x.Pagination
	}
	return nil
}

func (x *ListTenantsResponse) GetTenants() []*Tenant {
	if x != nil {
		return x.Tenants
	}
	return nil
}

// For updating a tenant.
type UpdateTenantRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Info *v1.RequestInfo `protobuf:"bytes,1,opt,name=info,proto3" json:"info,omitempty"`
	// Required. The ID of the tenant to update.
	Id string `protobuf:"bytes,2,opt,name=id,proto3" json:"id,omitempty"`
	// Required. The new name of the tenant. This must be unique across all tenants.
	Name string `protobuf:"bytes,3,opt,name=name,proto3" json:"name,omitempty"`
	// Required. The new type of subscription for the tenant.
	SubscriptionType TenantSubscriptionType `protobuf:"varint,4,opt,name=subscription_type,json=subscriptionType,proto3,enum=account.tenant.v1.TenantSubscriptionType" json:"subscription_type,omitempty"`
	// Optional. Whether self-registration is enabled for the tenant. Defaults to false if not set.
	SelfRegistrationEnabled bool `protobuf:"varint,5,opt,name=self_registration_enabled,json=selfRegistrationEnabled,proto3" json:"self_registration_enabled,omitempty"`
}

func (x *UpdateTenantRequest) Reset() {
	*x = UpdateTenantRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateTenantRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateTenantRequest) ProtoMessage() {}

func (x *UpdateTenantRequest) ProtoReflect() protoreflect.Message {
	mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateTenantRequest.ProtoReflect.Descriptor instead.
func (*UpdateTenantRequest) Descriptor() ([]byte, []int) {
	return file_account_tenant_v1_tenant_service_proto_rawDescGZIP(), []int{6}
}

func (x *UpdateTenantRequest) GetInfo() *v1.RequestInfo {
	if x != nil {
		return x.Info
	}
	return nil
}

func (x *UpdateTenantRequest) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *UpdateTenantRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *UpdateTenantRequest) GetSubscriptionType() TenantSubscriptionType {
	if x != nil {
		return x.SubscriptionType
	}
	return TenantSubscriptionType_TENANT_SUBSCRIPTION_TYPE_UNSPECIFIED
}

func (x *UpdateTenantRequest) GetSelfRegistrationEnabled() bool {
	if x != nil {
		return x.SelfRegistrationEnabled
	}
	return false
}

// Response for updating a tenant.
type UpdateTenantResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Error *v1.Error `protobuf:"bytes,1,opt,name=error,proto3" json:"error,omitempty"`
	// Required. The updated tenant.
	Tenant *Tenant `protobuf:"bytes,2,opt,name=tenant,proto3" json:"tenant,omitempty"`
}

func (x *UpdateTenantResponse) Reset() {
	*x = UpdateTenantResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateTenantResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateTenantResponse) ProtoMessage() {}

func (x *UpdateTenantResponse) ProtoReflect() protoreflect.Message {
	mi := &file_account_tenant_v1_tenant_service_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateTenantResponse.ProtoReflect.Descriptor instead.
func (*UpdateTenantResponse) Descriptor() ([]byte, []int) {
	return file_account_tenant_v1_tenant_service_proto_rawDescGZIP(), []int{7}
}

func (x *UpdateTenantResponse) GetError() *v1.Error {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *UpdateTenantResponse) GetTenant() *Tenant {
	if x != nil {
		return x.Tenant
	}
	return nil
}

var File_account_tenant_v1_tenant_service_proto protoreflect.FileDescriptor

var file_account_tenant_v1_tenant_service_proto_rawDesc = []byte{
	0x0a, 0x26, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2f, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74,
	0x2f, 0x76, 0x31, 0x2f, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x11, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e,
	0x74, 0x2e, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x1a, 0x1e, 0x61, 0x63, 0x63,
	0x6f, 0x75, 0x6e, 0x74, 0x2f, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2f, 0x76, 0x31, 0x2f, 0x74,
	0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x15, 0x73, 0x68, 0x61,
	0x72, 0x65, 0x64, 0x2f, 0x76, 0x31, 0x2f, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x17, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2f, 0x76, 0x31, 0x2f, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x18, 0x73, 0x68, 0x61,
	0x72, 0x65, 0x64, 0x2f, 0x76, 0x31, 0x2f, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2f, 0x76, 0x31,
	0x2f, 0x74, 0x72, 0x61, 0x63, 0x69, 0x6e, 0x67, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x9d,
	0x02, 0x0a, 0x13, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x2a, 0x0a, 0x04, 0x69, 0x6e, 0x66, 0x6f, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x16, 0x2e, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2e, 0x76, 0x31,
	0x2e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x04, 0x69, 0x6e,
	0x66, 0x6f, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e,
	0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x12, 0x1a,
	0x0a, 0x08, 0x74, 0x69, 0x6d, 0x65, 0x7a, 0x6f, 0x6e, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x08, 0x74, 0x69, 0x6d, 0x65, 0x7a, 0x6f, 0x6e, 0x65, 0x12, 0x56, 0x0a, 0x11, 0x73, 0x75,
	0x62, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18,
	0x05, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x29, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e,
	0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74,
	0x53, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x54, 0x79, 0x70, 0x65,
	0x52, 0x10, 0x73, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x54, 0x79,
	0x70, 0x65, 0x12, 0x3a, 0x0a, 0x19, 0x73, 0x65, 0x6c, 0x66, 0x5f, 0x72, 0x65, 0x67, 0x69, 0x73,
	0x74, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x65, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x18,
	0x06, 0x20, 0x01, 0x28, 0x08, 0x52, 0x17, 0x73, 0x65, 0x6c, 0x66, 0x52, 0x65, 0x67, 0x69, 0x73,
	0x74, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x22, 0x71,
	0x0a, 0x14, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x26, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2e, 0x76,
	0x31, 0x2e, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x12, 0x31,
	0x0a, 0x06, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x19,
	0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e,
	0x76, 0x31, 0x2e, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52, 0x06, 0x74, 0x65, 0x6e, 0x61, 0x6e,
	0x74, 0x22, 0x4e, 0x0a, 0x10, 0x47, 0x65, 0x74, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x2a, 0x0a, 0x04, 0x69, 0x6e, 0x66, 0x6f, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x16, 0x2e, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2e, 0x76, 0x31, 0x2e,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x04, 0x69, 0x6e, 0x66,
	0x6f, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69,
	0x64, 0x22, 0x6e, 0x0a, 0x11, 0x47, 0x65, 0x74, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x26, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2e, 0x76,
	0x31, 0x2e, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x12, 0x31,
	0x0a, 0x06, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x19,
	0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e,
	0x76, 0x31, 0x2e, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52, 0x06, 0x74, 0x65, 0x6e, 0x61, 0x6e,
	0x74, 0x22, 0xe0, 0x01, 0x0a, 0x12, 0x4c, 0x69, 0x73, 0x74, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74,
	0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x2a, 0x0a, 0x04, 0x69, 0x6e, 0x66, 0x6f,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x16, 0x2e, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2e,
	0x76, 0x31, 0x2e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x04,
	0x69, 0x6e, 0x66, 0x6f, 0x12, 0x3c, 0x0a, 0x0a, 0x70, 0x61, 0x67, 0x69, 0x6e, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x73, 0x68, 0x61, 0x72, 0x65,
	0x64, 0x2e, 0x76, 0x31, 0x2e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x50, 0x61, 0x67, 0x69,
	0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0a, 0x70, 0x61, 0x67, 0x69, 0x6e, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x12, 0x32, 0x0a, 0x07, 0x66, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x73, 0x18, 0x03, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x18, 0x2e, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2e, 0x76, 0x31, 0x2e,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x52, 0x07, 0x66,
	0x69, 0x6c, 0x74, 0x65, 0x72, 0x73, 0x12, 0x2c, 0x0a, 0x05, 0x73, 0x6f, 0x72, 0x74, 0x73, 0x18,
	0x04, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x16, 0x2e, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2e, 0x76,
	0x31, 0x2e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x53, 0x6f, 0x72, 0x74, 0x52, 0x05, 0x73,
	0x6f, 0x72, 0x74, 0x73, 0x22, 0xb1, 0x01, 0x0a, 0x13, 0x4c, 0x69, 0x73, 0x74, 0x54, 0x65, 0x6e,
	0x61, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x26, 0x0a, 0x05,
	0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x73, 0x68,
	0x61, 0x72, 0x65, 0x64, 0x2e, 0x76, 0x31, 0x2e, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05, 0x65,
	0x72, 0x72, 0x6f, 0x72, 0x12, 0x3d, 0x0a, 0x0a, 0x70, 0x61, 0x67, 0x69, 0x6e, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x73, 0x68, 0x61, 0x72, 0x65,
	0x64, 0x2e, 0x76, 0x31, 0x2e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x50, 0x61, 0x67,
	0x69, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0a, 0x70, 0x61, 0x67, 0x69, 0x6e, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x12, 0x33, 0x0a, 0x07, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x73, 0x18, 0x03,
	0x20, 0x03, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x74,
	0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52,
	0x07, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x73, 0x22, 0xf9, 0x01, 0x0a, 0x13, 0x55, 0x70, 0x64,
	0x61, 0x74, 0x65, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x12, 0x2a, 0x0a, 0x04, 0x69, 0x6e, 0x66, 0x6f, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x16,
	0x2e, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2e, 0x76, 0x31, 0x2e, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x04, 0x69, 0x6e, 0x66, 0x6f, 0x12, 0x0e, 0x0a, 0x02,
	0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x12, 0x0a, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65,
	0x12, 0x56, 0x0a, 0x11, 0x73, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e,
	0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x29, 0x2e, 0x61, 0x63,
	0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e,
	0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x53, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69,
	0x6f, 0x6e, 0x54, 0x79, 0x70, 0x65, 0x52, 0x10, 0x73, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70,
	0x74, 0x69, 0x6f, 0x6e, 0x54, 0x79, 0x70, 0x65, 0x12, 0x3a, 0x0a, 0x19, 0x73, 0x65, 0x6c, 0x66,
	0x5f, 0x72, 0x65, 0x67, 0x69, 0x73, 0x74, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x65, 0x6e,
	0x61, 0x62, 0x6c, 0x65, 0x64, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08, 0x52, 0x17, 0x73, 0x65, 0x6c,
	0x66, 0x52, 0x65, 0x67, 0x69, 0x73, 0x74, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x45, 0x6e, 0x61,
	0x62, 0x6c, 0x65, 0x64, 0x22, 0x71, 0x0a, 0x14, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x54, 0x65,
	0x6e, 0x61, 0x6e, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x26, 0x0a, 0x05,
	0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x73, 0x68,
	0x61, 0x72, 0x65, 0x64, 0x2e, 0x76, 0x31, 0x2e, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05, 0x65,
	0x72, 0x72, 0x6f, 0x72, 0x12, 0x31, 0x0a, 0x06, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x74,
	0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52,
	0x06, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x32, 0x8f, 0x03, 0x0a, 0x0d, 0x54, 0x65, 0x6e, 0x61,
	0x6e, 0x74, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x61, 0x0a, 0x0c, 0x43, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x12, 0x26, 0x2e, 0x61, 0x63, 0x63, 0x6f,
	0x75, 0x6e, 0x74, 0x2e, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x27, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x74, 0x65, 0x6e, 0x61,
	0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x54, 0x65, 0x6e, 0x61,
	0x6e, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x58, 0x0a, 0x09,
	0x47, 0x65, 0x74, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x12, 0x23, 0x2e, 0x61, 0x63, 0x63, 0x6f,
	0x75, 0x6e, 0x74, 0x2e, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65,
	0x74, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x24,
	0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e,
	0x76, 0x31, 0x2e, 0x47, 0x65, 0x74, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x5e, 0x0a, 0x0b, 0x4c, 0x69, 0x73, 0x74, 0x54, 0x65,
	0x6e, 0x61, 0x6e, 0x74, 0x73, 0x12, 0x25, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e,
	0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x54, 0x65,
	0x6e, 0x61, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x26, 0x2e, 0x61,
	0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e, 0x76, 0x31,
	0x2e, 0x4c, 0x69, 0x73, 0x74, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x61, 0x0a, 0x0c, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x12, 0x26, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74,
	0x2e, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74,
	0x65, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x27,
	0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e,
	0x76, 0x31, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x42, 0xc8, 0x01, 0x0a, 0x15, 0x63, 0x6f,
	0x6d, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74,
	0x2e, 0x76, 0x31, 0x42, 0x12, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x53, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x35, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x76, 0x6e, 0x77, 0x6f, 0x72, 0x6b, 0x64, 0x61, 0x79, 0x2f,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2f, 0x74, 0x65,
	0x6e, 0x61, 0x6e, 0x74, 0x2f, 0x76, 0x31, 0x3b, 0x74, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x76, 0x31,
	0xa2, 0x02, 0x03, 0x41, 0x54, 0x58, 0xaa, 0x02, 0x11, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74,
	0x2e, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x2e, 0x56, 0x31, 0xca, 0x02, 0x11, 0x41, 0x63, 0x63,
	0x6f, 0x75, 0x6e, 0x74, 0x5c, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x5c, 0x56, 0x31, 0xe2, 0x02,
	0x1d, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x5c, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74, 0x5c,
	0x56, 0x31, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02,
	0x13, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x3a, 0x3a, 0x54, 0x65, 0x6e, 0x61, 0x6e, 0x74,
	0x3a, 0x3a, 0x56, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_account_tenant_v1_tenant_service_proto_rawDescOnce sync.Once
	file_account_tenant_v1_tenant_service_proto_rawDescData = file_account_tenant_v1_tenant_service_proto_rawDesc
)

func file_account_tenant_v1_tenant_service_proto_rawDescGZIP() []byte {
	file_account_tenant_v1_tenant_service_proto_rawDescOnce.Do(func() {
		file_account_tenant_v1_tenant_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_account_tenant_v1_tenant_service_proto_rawDescData)
	})
	return file_account_tenant_v1_tenant_service_proto_rawDescData
}

var file_account_tenant_v1_tenant_service_proto_msgTypes = make([]protoimpl.MessageInfo, 8)
var file_account_tenant_v1_tenant_service_proto_goTypes = []interface{}{
	(*CreateTenantRequest)(nil),   // 0: account.tenant.v1.CreateTenantRequest
	(*CreateTenantResponse)(nil),  // 1: account.tenant.v1.CreateTenantResponse
	(*GetTenantRequest)(nil),      // 2: account.tenant.v1.GetTenantRequest
	(*GetTenantResponse)(nil),     // 3: account.tenant.v1.GetTenantResponse
	(*ListTenantsRequest)(nil),    // 4: account.tenant.v1.ListTenantsRequest
	(*ListTenantsResponse)(nil),   // 5: account.tenant.v1.ListTenantsResponse
	(*UpdateTenantRequest)(nil),   // 6: account.tenant.v1.UpdateTenantRequest
	(*UpdateTenantResponse)(nil),  // 7: account.tenant.v1.UpdateTenantResponse
	(*v1.RequestInfo)(nil),        // 8: shared.v1.RequestInfo
	(TenantSubscriptionType)(0),   // 9: account.tenant.v1.TenantSubscriptionType
	(*v1.Error)(nil),              // 10: shared.v1.Error
	(*Tenant)(nil),                // 11: account.tenant.v1.Tenant
	(*v1.RequestPagination)(nil),  // 12: shared.v1.RequestPagination
	(*v1.RequestFilter)(nil),      // 13: shared.v1.RequestFilter
	(*v1.RequestSort)(nil),        // 14: shared.v1.RequestSort
	(*v1.ResponsePagination)(nil), // 15: shared.v1.ResponsePagination
}
var file_account_tenant_v1_tenant_service_proto_depIdxs = []int32{
	8,  // 0: account.tenant.v1.CreateTenantRequest.info:type_name -> shared.v1.RequestInfo
	9,  // 1: account.tenant.v1.CreateTenantRequest.subscription_type:type_name -> account.tenant.v1.TenantSubscriptionType
	10, // 2: account.tenant.v1.CreateTenantResponse.error:type_name -> shared.v1.Error
	11, // 3: account.tenant.v1.CreateTenantResponse.tenant:type_name -> account.tenant.v1.Tenant
	8,  // 4: account.tenant.v1.GetTenantRequest.info:type_name -> shared.v1.RequestInfo
	10, // 5: account.tenant.v1.GetTenantResponse.error:type_name -> shared.v1.Error
	11, // 6: account.tenant.v1.GetTenantResponse.tenant:type_name -> account.tenant.v1.Tenant
	8,  // 7: account.tenant.v1.ListTenantsRequest.info:type_name -> shared.v1.RequestInfo
	12, // 8: account.tenant.v1.ListTenantsRequest.pagination:type_name -> shared.v1.RequestPagination
	13, // 9: account.tenant.v1.ListTenantsRequest.filters:type_name -> shared.v1.RequestFilter
	14, // 10: account.tenant.v1.ListTenantsRequest.sorts:type_name -> shared.v1.RequestSort
	10, // 11: account.tenant.v1.ListTenantsResponse.error:type_name -> shared.v1.Error
	15, // 12: account.tenant.v1.ListTenantsResponse.pagination:type_name -> shared.v1.ResponsePagination
	11, // 13: account.tenant.v1.ListTenantsResponse.tenants:type_name -> account.tenant.v1.Tenant
	8,  // 14: account.tenant.v1.UpdateTenantRequest.info:type_name -> shared.v1.RequestInfo
	9,  // 15: account.tenant.v1.UpdateTenantRequest.subscription_type:type_name -> account.tenant.v1.TenantSubscriptionType
	10, // 16: account.tenant.v1.UpdateTenantResponse.error:type_name -> shared.v1.Error
	11, // 17: account.tenant.v1.UpdateTenantResponse.tenant:type_name -> account.tenant.v1.Tenant
	0,  // 18: account.tenant.v1.TenantService.CreateTenant:input_type -> account.tenant.v1.CreateTenantRequest
	2,  // 19: account.tenant.v1.TenantService.GetTenant:input_type -> account.tenant.v1.GetTenantRequest
	4,  // 20: account.tenant.v1.TenantService.ListTenants:input_type -> account.tenant.v1.ListTenantsRequest
	6,  // 21: account.tenant.v1.TenantService.UpdateTenant:input_type -> account.tenant.v1.UpdateTenantRequest
	1,  // 22: account.tenant.v1.TenantService.CreateTenant:output_type -> account.tenant.v1.CreateTenantResponse
	3,  // 23: account.tenant.v1.TenantService.GetTenant:output_type -> account.tenant.v1.GetTenantResponse
	5,  // 24: account.tenant.v1.TenantService.ListTenants:output_type -> account.tenant.v1.ListTenantsResponse
	7,  // 25: account.tenant.v1.TenantService.UpdateTenant:output_type -> account.tenant.v1.UpdateTenantResponse
	22, // [22:26] is the sub-list for method output_type
	18, // [18:22] is the sub-list for method input_type
	18, // [18:18] is the sub-list for extension type_name
	18, // [18:18] is the sub-list for extension extendee
	0,  // [0:18] is the sub-list for field type_name
}

func init() { file_account_tenant_v1_tenant_service_proto_init() }
func file_account_tenant_v1_tenant_service_proto_init() {
	if File_account_tenant_v1_tenant_service_proto != nil {
		return
	}
	file_account_tenant_v1_tenant_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_account_tenant_v1_tenant_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateTenantRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_account_tenant_v1_tenant_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateTenantResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_account_tenant_v1_tenant_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetTenantRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_account_tenant_v1_tenant_service_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetTenantResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_account_tenant_v1_tenant_service_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListTenantsRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_account_tenant_v1_tenant_service_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListTenantsResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_account_tenant_v1_tenant_service_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateTenantRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_account_tenant_v1_tenant_service_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateTenantResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_account_tenant_v1_tenant_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   8,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_account_tenant_v1_tenant_service_proto_goTypes,
		DependencyIndexes: file_account_tenant_v1_tenant_service_proto_depIdxs,
		MessageInfos:      file_account_tenant_v1_tenant_service_proto_msgTypes,
	}.Build()
	File_account_tenant_v1_tenant_service_proto = out.File
	file_account_tenant_v1_tenant_service_proto_rawDesc = nil
	file_account_tenant_v1_tenant_service_proto_goTypes = nil
	file_account_tenant_v1_tenant_service_proto_depIdxs = nil
}
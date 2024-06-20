// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.34.1
// 	protoc        (unknown)
// source: shared/v1/response.proto

package sharedv1

import (
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

type ResponsePagination struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Optional. The token that can be used to fetch the next page. If the token is empty, it means that there are no more pages.
	NextToken string `protobuf:"bytes,1,opt,name=next_token,json=nextToken,proto3" json:"next_token,omitempty"`
	// Optional. The token that can be used to fetch the previous page. If the token is empty, it means that there are no previous pages.
	PreviousToken string `protobuf:"bytes,2,opt,name=previous_token,json=previousToken,proto3" json:"previous_token,omitempty"`
	// Required. The total number of items.
	Total int32 `protobuf:"varint,3,opt,name=total,proto3" json:"total,omitempty"`
	// Required. The total number of pages.
	TotalPages int32 `protobuf:"varint,4,opt,name=total_pages,json=totalPages,proto3" json:"total_pages,omitempty"`
}

func (x *ResponsePagination) Reset() {
	*x = ResponsePagination{}
	if protoimpl.UnsafeEnabled {
		mi := &file_shared_v1_response_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ResponsePagination) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ResponsePagination) ProtoMessage() {}

func (x *ResponsePagination) ProtoReflect() protoreflect.Message {
	mi := &file_shared_v1_response_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ResponsePagination.ProtoReflect.Descriptor instead.
func (*ResponsePagination) Descriptor() ([]byte, []int) {
	return file_shared_v1_response_proto_rawDescGZIP(), []int{0}
}

func (x *ResponsePagination) GetNextToken() string {
	if x != nil {
		return x.NextToken
	}
	return ""
}

func (x *ResponsePagination) GetPreviousToken() string {
	if x != nil {
		return x.PreviousToken
	}
	return ""
}

func (x *ResponsePagination) GetTotal() int32 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *ResponsePagination) GetTotalPages() int32 {
	if x != nil {
		return x.TotalPages
	}
	return 0
}

var File_shared_v1_response_proto protoreflect.FileDescriptor

var file_shared_v1_response_proto_rawDesc = []byte{
	0x0a, 0x18, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2f, 0x76, 0x31, 0x2f, 0x72, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x09, 0x73, 0x68, 0x61, 0x72,
	0x65, 0x64, 0x2e, 0x76, 0x31, 0x22, 0x91, 0x01, 0x0a, 0x12, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x50, 0x61, 0x67, 0x69, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x1d, 0x0a, 0x0a,
	0x6e, 0x65, 0x78, 0x74, 0x5f, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x09, 0x6e, 0x65, 0x78, 0x74, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x12, 0x25, 0x0a, 0x0e, 0x70,
	0x72, 0x65, 0x76, 0x69, 0x6f, 0x75, 0x73, 0x5f, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x0d, 0x70, 0x72, 0x65, 0x76, 0x69, 0x6f, 0x75, 0x73, 0x54, 0x6f, 0x6b,
	0x65, 0x6e, 0x12, 0x14, 0x0a, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x05, 0x52, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x12, 0x1f, 0x0a, 0x0b, 0x74, 0x6f, 0x74, 0x61,
	0x6c, 0x5f, 0x70, 0x61, 0x67, 0x65, 0x73, 0x18, 0x04, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0a, 0x74,
	0x6f, 0x74, 0x61, 0x6c, 0x50, 0x61, 0x67, 0x65, 0x73, 0x42, 0x92, 0x01, 0x0a, 0x0d, 0x63, 0x6f,
	0x6d, 0x2e, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2e, 0x76, 0x31, 0x42, 0x0d, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x2d, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x76, 0x6e, 0x77, 0x6f, 0x72, 0x6b, 0x64,
	0x61, 0x79, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2f,
	0x76, 0x31, 0x3b, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x76, 0x31, 0xa2, 0x02, 0x03, 0x53, 0x58,
	0x58, 0xaa, 0x02, 0x09, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2e, 0x56, 0x31, 0xca, 0x02, 0x09,
	0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x5c, 0x56, 0x31, 0xe2, 0x02, 0x15, 0x53, 0x68, 0x61, 0x72,
	0x65, 0x64, 0x5c, 0x56, 0x31, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74,
	0x61, 0xea, 0x02, 0x0a, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x3a, 0x3a, 0x56, 0x31, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_shared_v1_response_proto_rawDescOnce sync.Once
	file_shared_v1_response_proto_rawDescData = file_shared_v1_response_proto_rawDesc
)

func file_shared_v1_response_proto_rawDescGZIP() []byte {
	file_shared_v1_response_proto_rawDescOnce.Do(func() {
		file_shared_v1_response_proto_rawDescData = protoimpl.X.CompressGZIP(file_shared_v1_response_proto_rawDescData)
	})
	return file_shared_v1_response_proto_rawDescData
}

var file_shared_v1_response_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_shared_v1_response_proto_goTypes = []interface{}{
	(*ResponsePagination)(nil), // 0: shared.v1.ResponsePagination
}
var file_shared_v1_response_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_shared_v1_response_proto_init() }
func file_shared_v1_response_proto_init() {
	if File_shared_v1_response_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_shared_v1_response_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ResponsePagination); i {
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
			RawDescriptor: file_shared_v1_response_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_shared_v1_response_proto_goTypes,
		DependencyIndexes: file_shared_v1_response_proto_depIdxs,
		MessageInfos:      file_shared_v1_response_proto_msgTypes,
	}.Build()
	File_shared_v1_response_proto = out.File
	file_shared_v1_response_proto_rawDesc = nil
	file_shared_v1_response_proto_goTypes = nil
	file_shared_v1_response_proto_depIdxs = nil
}

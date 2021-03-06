// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.19.4
// source: protofiles/address_number.proto

package addressbookpb

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

// Our address book file is just one of these.
type AddressBook struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	People []*Person `protobuf:"bytes,1,rep,name=people,proto3" json:"people,omitempty"`
}

func (x *AddressBook) Reset() {
	*x = AddressBook{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protofiles_address_number_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AddressBook) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AddressBook) ProtoMessage() {}

func (x *AddressBook) ProtoReflect() protoreflect.Message {
	mi := &file_protofiles_address_number_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AddressBook.ProtoReflect.Descriptor instead.
func (*AddressBook) Descriptor() ([]byte, []int) {
	return file_protofiles_address_number_proto_rawDescGZIP(), []int{0}
}

func (x *AddressBook) GetPeople() []*Person {
	if x != nil {
		return x.People
	}
	return nil
}

var File_protofiles_address_number_proto protoreflect.FileDescriptor

var file_protofiles_address_number_proto_rawDesc = []byte{
	0x0a, 0x1f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x66, 0x69, 0x6c, 0x65, 0x73, 0x2f, 0x61, 0x64, 0x64,
	0x72, 0x65, 0x73, 0x73, 0x5f, 0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x15, 0x65, 0x78, 0x65, 0x72, 0x63, 0x69, 0x73, 0x65, 0x2e, 0x70, 0x68, 0x6f, 0x6e,
	0x65, 0x5f, 0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x1a, 0x17, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x66,
	0x69, 0x6c, 0x65, 0x73, 0x2f, 0x70, 0x65, 0x72, 0x73, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x22, 0x3e, 0x0a, 0x0b, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x42, 0x6f, 0x6f, 0x6b,
	0x12, 0x2f, 0x0a, 0x06, 0x70, 0x65, 0x6f, 0x70, 0x6c, 0x65, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b,
	0x32, 0x17, 0x2e, 0x65, 0x78, 0x65, 0x72, 0x63, 0x69, 0x73, 0x65, 0x2e, 0x70, 0x65, 0x72, 0x73,
	0x6f, 0x6e, 0x2e, 0x50, 0x65, 0x72, 0x73, 0x6f, 0x6e, 0x52, 0x06, 0x70, 0x65, 0x6f, 0x70, 0x6c,
	0x65, 0x42, 0x12, 0x5a, 0x10, 0x70, 0x62, 0x2f, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x62,
	0x6f, 0x6f, 0x6b, 0x70, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_protofiles_address_number_proto_rawDescOnce sync.Once
	file_protofiles_address_number_proto_rawDescData = file_protofiles_address_number_proto_rawDesc
)

func file_protofiles_address_number_proto_rawDescGZIP() []byte {
	file_protofiles_address_number_proto_rawDescOnce.Do(func() {
		file_protofiles_address_number_proto_rawDescData = protoimpl.X.CompressGZIP(file_protofiles_address_number_proto_rawDescData)
	})
	return file_protofiles_address_number_proto_rawDescData
}

var file_protofiles_address_number_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_protofiles_address_number_proto_goTypes = []interface{}{
	(*AddressBook)(nil), // 0: exercise.phone_number.AddressBook
	(*Person)(nil),      // 1: exercise.person.Person
}
var file_protofiles_address_number_proto_depIdxs = []int32{
	1, // 0: exercise.phone_number.AddressBook.people:type_name -> exercise.person.Person
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_protofiles_address_number_proto_init() }
func file_protofiles_address_number_proto_init() {
	if File_protofiles_address_number_proto != nil {
		return
	}
	file_protofiles_person_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_protofiles_address_number_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AddressBook); i {
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
			RawDescriptor: file_protofiles_address_number_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_protofiles_address_number_proto_goTypes,
		DependencyIndexes: file_protofiles_address_number_proto_depIdxs,
		MessageInfos:      file_protofiles_address_number_proto_msgTypes,
	}.Build()
	File_protofiles_address_number_proto = out.File
	file_protofiles_address_number_proto_rawDesc = nil
	file_protofiles_address_number_proto_goTypes = nil
	file_protofiles_address_number_proto_depIdxs = nil
}

/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/label.proto

package com.google.api;

public final class LabelProto {
  private LabelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_LabelDescriptor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_LabelDescriptor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\026google/api/label.proto\022\ngoogle.api\"\234\001\n"
          + "\017LabelDescriptor\022\013\n\003key\030\001 \001(\t\0229\n\nvalue_t"
          + "ype\030\002 \001(\0162%.google.api.LabelDescriptor.V"
          + "alueType\022\023\n\013description\030\003 \001(\t\",\n\tValueTy"
          + "pe\022\n\n\006STRING\020\000\022\010\n\004BOOL\020\001\022\t\n\005INT64\020\002B_\n\016c"
          + "om.google.apiB\nLabelProtoP\001Z5google.gola"
          + "ng.org/genproto/googleapis/api/label;lab"
          + "el\370\001\001\242\002\004GAPIb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_api_LabelDescriptor_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_LabelDescriptor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_LabelDescriptor_descriptor,
            new java.lang.String[] {
              "Key", "ValueType", "Description",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
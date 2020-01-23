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
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * The device state, as reported by the device.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.DeviceState}
 */
public final class DeviceState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.DeviceState)
    DeviceStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeviceState.newBuilder() to construct.
  private DeviceState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeviceState() {
    binaryData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeviceState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DeviceState(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (updateTime_ != null) {
                subBuilder = updateTime_.toBuilder();
              }
              updateTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateTime_);
                updateTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              binaryData_ = input.readBytes();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iot.v1.ResourcesProto
        .internal_static_google_cloud_iot_v1_DeviceState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.ResourcesProto
        .internal_static_google_cloud_iot_v1_DeviceState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.DeviceState.class,
            com.google.cloud.iot.v1.DeviceState.Builder.class);
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * [Output only] The time at which this state version was updated in Cloud
   * IoT Core.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return Whether the updateTime field is set.
   */
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * [Output only] The time at which this state version was updated in Cloud
   * IoT Core.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return The updateTime.
   */
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * [Output only] The time at which this state version was updated in Cloud
   * IoT Core.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
  }

  public static final int BINARY_DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString binaryData_;
  /**
   *
   *
   * <pre>
   * The device state data.
   * </pre>
   *
   * <code>bytes binary_data = 2;</code>
   *
   * @return The binaryData.
   */
  public com.google.protobuf.ByteString getBinaryData() {
    return binaryData_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (updateTime_ != null) {
      output.writeMessage(1, getUpdateTime());
    }
    if (!binaryData_.isEmpty()) {
      output.writeBytes(2, binaryData_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdateTime());
    }
    if (!binaryData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, binaryData_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.iot.v1.DeviceState)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.DeviceState other = (com.google.cloud.iot.v1.DeviceState) obj;

    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
    if (!getBinaryData().equals(other.getBinaryData())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (37 * hash) + BINARY_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getBinaryData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.DeviceState parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.DeviceState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.DeviceState parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.DeviceState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.DeviceState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.DeviceState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.DeviceState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.DeviceState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.DeviceState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.DeviceState parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.DeviceState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.DeviceState parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.iot.v1.DeviceState prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The device state, as reported by the device.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.DeviceState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.DeviceState)
      com.google.cloud.iot.v1.DeviceStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_DeviceState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_DeviceState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.DeviceState.class,
              com.google.cloud.iot.v1.DeviceState.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.DeviceState.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }
      binaryData_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_DeviceState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.DeviceState getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.DeviceState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.DeviceState build() {
      com.google.cloud.iot.v1.DeviceState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.DeviceState buildPartial() {
      com.google.cloud.iot.v1.DeviceState result = new com.google.cloud.iot.v1.DeviceState(this);
      if (updateTimeBuilder_ == null) {
        result.updateTime_ = updateTime_;
      } else {
        result.updateTime_ = updateTimeBuilder_.build();
      }
      result.binaryData_ = binaryData_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.iot.v1.DeviceState) {
        return mergeFrom((com.google.cloud.iot.v1.DeviceState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.DeviceState other) {
      if (other == com.google.cloud.iot.v1.DeviceState.getDefaultInstance()) return this;
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
      }
      if (other.getBinaryData() != com.google.protobuf.ByteString.EMPTY) {
        setBinaryData(other.getBinaryData());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.iot.v1.DeviceState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.iot.v1.DeviceState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * [Output only] The time at which this state version was updated in Cloud
     * IoT Core.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return updateTimeBuilder_ != null || updateTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The time at which this state version was updated in Cloud
     * IoT Core.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output only] The time at which this state version was updated in Cloud
     * IoT Core.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The time at which this state version was updated in Cloud
     * IoT Core.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The time at which this state version was updated in Cloud
     * IoT Core.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (updateTime_ != null) {
          updateTime_ =
              com.google.protobuf.Timestamp.newBuilder(updateTime_).mergeFrom(value).buildPartial();
        } else {
          updateTime_ = value;
        }
        onChanged();
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The time at which this state version was updated in Cloud
     * IoT Core.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder clearUpdateTime() {
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
        onChanged();
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The time at which this state version was updated in Cloud
     * IoT Core.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {

      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * [Output only] The time at which this state version was updated in Cloud
     * IoT Core.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output only] The time at which this state version was updated in Cloud
     * IoT Core.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
    }

    private com.google.protobuf.ByteString binaryData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * The device state data.
     * </pre>
     *
     * <code>bytes binary_data = 2;</code>
     *
     * @return The binaryData.
     */
    public com.google.protobuf.ByteString getBinaryData() {
      return binaryData_;
    }
    /**
     *
     *
     * <pre>
     * The device state data.
     * </pre>
     *
     * <code>bytes binary_data = 2;</code>
     *
     * @param value The binaryData to set.
     * @return This builder for chaining.
     */
    public Builder setBinaryData(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      binaryData_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The device state data.
     * </pre>
     *
     * <code>bytes binary_data = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBinaryData() {

      binaryData_ = getDefaultInstance().getBinaryData();
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.DeviceState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.DeviceState)
  private static final com.google.cloud.iot.v1.DeviceState DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.DeviceState();
  }

  public static com.google.cloud.iot.v1.DeviceState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceState> PARSER =
      new com.google.protobuf.AbstractParser<DeviceState>() {
        @java.lang.Override
        public DeviceState parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DeviceState(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DeviceState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.DeviceState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

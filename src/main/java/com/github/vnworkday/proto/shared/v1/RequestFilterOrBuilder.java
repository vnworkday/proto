// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: shared/v1/request.proto
// Protobuf Java Version: 4.27.0

package com.github.vnworkday.proto.shared.v1;

public interface RequestFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:shared.v1.RequestFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The field to filter by.
   * </pre>
   *
   * <code>string field = 1 [json_name = "field"];</code>
   * @return The field.
   */
  java.lang.String getField();
  /**
   * <pre>
   * Required. The field to filter by.
   * </pre>
   *
   * <code>string field = 1 [json_name = "field"];</code>
   * @return The bytes for field.
   */
  com.google.protobuf.ByteString
      getFieldBytes();

  /**
   * <pre>
   * Conditionally required. The value to filter by.
   * If the operator is 'null' or 'not_null', the value will be ignored and can be omitted.
   * If the operator is 'in' or 'not_in', the value should be a list of values separated by vertical bars '|'.
   * </pre>
   *
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Conditionally required. The value to filter by.
   * If the operator is 'null' or 'not_null', the value will be ignored and can be omitted.
   * If the operator is 'in' or 'not_in', the value should be a list of values separated by vertical bars '|'.
   * </pre>
   *
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * Required. The operator to use for the filter.
   * </pre>
   *
   * <code>.shared.v1.Operator operator = 3 [json_name = "operator"];</code>
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();
  /**
   * <pre>
   * Required. The operator to use for the filter.
   * </pre>
   *
   * <code>.shared.v1.Operator operator = 3 [json_name = "operator"];</code>
   * @return The operator.
   */
  com.github.vnworkday.proto.shared.v1.Operator getOperator();

  /**
   * <pre>
   * Optional. Whether the filter is case sensitive. The default is false.
   * </pre>
   *
   * <code>bool is_case_sensitive = 4 [json_name = "isCaseSensitive"];</code>
   * @return The isCaseSensitive.
   */
  boolean getIsCaseSensitive();

  /**
   * <pre>
   * Optional. The type of the value. The default is string.
   * </pre>
   *
   * <code>.shared.v1.ValueType value_type = 5 [json_name = "valueType"];</code>
   * @return The enum numeric value on the wire for valueType.
   */
  int getValueTypeValue();
  /**
   * <pre>
   * Optional. The type of the value. The default is string.
   * </pre>
   *
   * <code>.shared.v1.ValueType value_type = 5 [json_name = "valueType"];</code>
   * @return The valueType.
   */
  com.github.vnworkday.proto.shared.v1.ValueType getValueType();
}

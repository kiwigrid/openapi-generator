/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TypeHolderExample
 */
@JsonPropertyOrder({
  TypeHolderExample.JSON_PROPERTY_STRING_ITEM,
  TypeHolderExample.JSON_PROPERTY_NUMBER_ITEM,
  TypeHolderExample.JSON_PROPERTY_FLOAT_ITEM,
  TypeHolderExample.JSON_PROPERTY_INTEGER_ITEM,
  TypeHolderExample.JSON_PROPERTY_BOOL_ITEM,
  TypeHolderExample.JSON_PROPERTY_ARRAY_ITEM
})
@javax.annotation.concurrent.Immutable
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TypeHolderExample {
  public static final String JSON_PROPERTY_STRING_ITEM = "string_item";
  private String stringItem;

  public static final String JSON_PROPERTY_NUMBER_ITEM = "number_item";
  private BigDecimal numberItem;

  public static final String JSON_PROPERTY_FLOAT_ITEM = "float_item";
  private Float floatItem;

  public static final String JSON_PROPERTY_INTEGER_ITEM = "integer_item";
  private Integer integerItem;

  public static final String JSON_PROPERTY_BOOL_ITEM = "bool_item";
  private Boolean boolItem;

  public static final String JSON_PROPERTY_ARRAY_ITEM = "array_item";
  private List<Integer> arrayItem = new ArrayList<>();

  public TypeHolderExample() {
  }

  public TypeHolderExample stringItem(String stringItem) {
    
    this.stringItem = stringItem;
    return this;
  }

   /**
   * Get stringItem
   * @return stringItem
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STRING_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStringItem() {
    return stringItem;
  }


  @JsonProperty(JSON_PROPERTY_STRING_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStringItem(String stringItem) {
    this.stringItem = stringItem;
  }


  public TypeHolderExample numberItem(BigDecimal numberItem) {
    
    this.numberItem = numberItem;
    return this;
  }

   /**
   * Get numberItem
   * @return numberItem
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NUMBER_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getNumberItem() {
    return numberItem;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumberItem(BigDecimal numberItem) {
    this.numberItem = numberItem;
  }


  public TypeHolderExample floatItem(Float floatItem) {
    
    this.floatItem = floatItem;
    return this;
  }

   /**
   * Get floatItem
   * @return floatItem
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FLOAT_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getFloatItem() {
    return floatItem;
  }


  @JsonProperty(JSON_PROPERTY_FLOAT_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFloatItem(Float floatItem) {
    this.floatItem = floatItem;
  }


  public TypeHolderExample integerItem(Integer integerItem) {
    
    this.integerItem = integerItem;
    return this;
  }

   /**
   * Get integerItem
   * @return integerItem
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTEGER_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getIntegerItem() {
    return integerItem;
  }


  @JsonProperty(JSON_PROPERTY_INTEGER_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntegerItem(Integer integerItem) {
    this.integerItem = integerItem;
  }


  public TypeHolderExample boolItem(Boolean boolItem) {
    
    this.boolItem = boolItem;
    return this;
  }

   /**
   * Get boolItem
   * @return boolItem
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BOOL_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isBoolItem() {
    return boolItem;
  }


  @JsonProperty(JSON_PROPERTY_BOOL_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBoolItem(Boolean boolItem) {
    this.boolItem = boolItem;
  }


  public TypeHolderExample arrayItem(List<Integer> arrayItem) {
    
    this.arrayItem = arrayItem;
    return this;
  }

  public TypeHolderExample addArrayItemItem(Integer arrayItemItem) {
    if (this.arrayItem == null) {
      this.arrayItem = new ArrayList<>();
    }
    this.arrayItem.add(arrayItemItem);
    return this;
  }

   /**
   * Get arrayItem
   * @return arrayItem
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ARRAY_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Integer> getArrayItem() {
    return arrayItem;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArrayItem(List<Integer> arrayItem) {
    this.arrayItem = arrayItem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeHolderExample typeHolderExample = (TypeHolderExample) o;
    return Objects.equals(this.stringItem, typeHolderExample.stringItem) &&
        Objects.equals(this.numberItem, typeHolderExample.numberItem) &&
        Objects.equals(this.floatItem, typeHolderExample.floatItem) &&
        Objects.equals(this.integerItem, typeHolderExample.integerItem) &&
        Objects.equals(this.boolItem, typeHolderExample.boolItem) &&
        Objects.equals(this.arrayItem, typeHolderExample.arrayItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringItem, numberItem, floatItem, integerItem, boolItem, arrayItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeHolderExample {\n");
    sb.append("    stringItem: ").append(toIndentedString(stringItem)).append("\n");
    sb.append("    numberItem: ").append(toIndentedString(numberItem)).append("\n");
    sb.append("    floatItem: ").append(toIndentedString(floatItem)).append("\n");
    sb.append("    integerItem: ").append(toIndentedString(integerItem)).append("\n");
    sb.append("    boolItem: ").append(toIndentedString(boolItem)).append("\n");
    sb.append("    arrayItem: ").append(toIndentedString(arrayItem)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


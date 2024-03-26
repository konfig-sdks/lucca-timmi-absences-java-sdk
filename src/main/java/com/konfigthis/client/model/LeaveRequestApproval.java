/*
 * Timmi Absences API
 * Welcome on the documentation for Timmi Absences API.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: developers@lucca.fr
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ## Fields
 */
@ApiModel(description = "## Fields")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LeaveRequestApproval {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_APPROVER_ID = "approverId";
  @SerializedName(SERIALIZED_NAME_APPROVER_ID)
  private Double approverId;

  /**
   * 0 &#x3D; PENDING_APPROVAL  2 &#x3D; APPROVED  3 &#x3D; DENIED  4 &#x3D; CANCELLED  5 &#x3D; CANCELLATION_PENDING 
   */
  @JsonAdapter(SubstitutedApproverIdEnum.Adapter.class)
 public enum SubstitutedApproverIdEnum {
    NUMBER_0(0),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5);

    private Integer value;

    SubstitutedApproverIdEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubstitutedApproverIdEnum fromValue(Integer value) {
      for (SubstitutedApproverIdEnum b : SubstitutedApproverIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubstitutedApproverIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubstitutedApproverIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubstitutedApproverIdEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return SubstitutedApproverIdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBSTITUTED_APPROVER_ID = "substitutedApproverId";
  @SerializedName(SERIALIZED_NAME_SUBSTITUTED_APPROVER_ID)
  private SubstitutedApproverIdEnum substitutedApproverId;

  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private Boolean approved;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public LeaveRequestApproval() {
  }

  public LeaveRequestApproval id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the LeaveRequestApproval
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the LeaveRequestApproval")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public LeaveRequestApproval date(OffsetDateTime date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    
    
    
    this.date = date;
  }


  public LeaveRequestApproval approverId(Double approverId) {
    
    
    
    
    this.approverId = approverId;
    return this;
  }

  public LeaveRequestApproval approverId(Integer approverId) {
    
    
    
    
    this.approverId = approverId.doubleValue();
    return this;
  }

   /**
   * Unique identifier for the approver
   * @return approverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the approver")

  public Double getApproverId() {
    return approverId;
  }


  public void setApproverId(Double approverId) {
    
    
    
    this.approverId = approverId;
  }


  public LeaveRequestApproval substitutedApproverId(SubstitutedApproverIdEnum substitutedApproverId) {
    
    
    
    
    this.substitutedApproverId = substitutedApproverId;
    return this;
  }

   /**
   * 0 &#x3D; PENDING_APPROVAL  2 &#x3D; APPROVED  3 &#x3D; DENIED  4 &#x3D; CANCELLED  5 &#x3D; CANCELLATION_PENDING 
   * @return substitutedApproverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0 = PENDING_APPROVAL  2 = APPROVED  3 = DENIED  4 = CANCELLED  5 = CANCELLATION_PENDING ")

  public SubstitutedApproverIdEnum getSubstitutedApproverId() {
    return substitutedApproverId;
  }


  public void setSubstitutedApproverId(SubstitutedApproverIdEnum substitutedApproverId) {
    
    
    
    this.substitutedApproverId = substitutedApproverId;
  }


  public LeaveRequestApproval approved(Boolean approved) {
    
    
    
    
    this.approved = approved;
    return this;
  }

   /**
   * Has the value &#x60;true&#x60; for approved LeaveRequest or the value &#x60;false&#x60; for LeaveRequest pending approval
   * @return approved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Has the value `true` for approved LeaveRequest or the value `false` for LeaveRequest pending approval")

  public Boolean getApproved() {
    return approved;
  }


  public void setApproved(Boolean approved) {
    
    
    
    this.approved = approved;
  }


  public LeaveRequestApproval comment(String comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

   /**
   * Comments
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comments")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    
    
    
    this.comment = comment;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the LeaveRequestApproval instance itself
   */
  public LeaveRequestApproval putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveRequestApproval leaveRequestApproval = (LeaveRequestApproval) o;
    return Objects.equals(this.id, leaveRequestApproval.id) &&
        Objects.equals(this.date, leaveRequestApproval.date) &&
        Objects.equals(this.approverId, leaveRequestApproval.approverId) &&
        Objects.equals(this.substitutedApproverId, leaveRequestApproval.substitutedApproverId) &&
        Objects.equals(this.approved, leaveRequestApproval.approved) &&
        Objects.equals(this.comment, leaveRequestApproval.comment)&&
        Objects.equals(this.additionalProperties, leaveRequestApproval.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, approverId, substitutedApproverId, approved, comment, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveRequestApproval {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    approverId: ").append(toIndentedString(approverId)).append("\n");
    sb.append("    substitutedApproverId: ").append(toIndentedString(substitutedApproverId)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("date");
    openapiFields.add("approverId");
    openapiFields.add("substitutedApproverId");
    openapiFields.add("approved");
    openapiFields.add("comment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LeaveRequestApproval
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LeaveRequestApproval.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LeaveRequestApproval is not found in the empty JSON string", LeaveRequestApproval.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LeaveRequestApproval.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LeaveRequestApproval' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LeaveRequestApproval> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LeaveRequestApproval.class));

       return (TypeAdapter<T>) new TypeAdapter<LeaveRequestApproval>() {
           @Override
           public void write(JsonWriter out, LeaveRequestApproval value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public LeaveRequestApproval read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LeaveRequestApproval instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LeaveRequestApproval given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LeaveRequestApproval
  * @throws IOException if the JSON string is invalid with respect to LeaveRequestApproval
  */
  public static LeaveRequestApproval fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LeaveRequestApproval.class);
  }

 /**
  * Convert an instance of LeaveRequestApproval to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


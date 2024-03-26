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
import com.konfigthis.client.model.LeaveAccount;
import com.konfigthis.client.model.LeavePeriod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Absences from work, wether they are planned or not, are described in Lucca using three concepts : **LeaveRequests**, **LeavePeriods** and **Leaves**.  A **LeaveRequest** represent the request made by employees when planning time off. This resource is used for workflow purposes.  A **LeavePeriod** is the continuous period of absence requested by the employee or entered by HR. It is linked to a **LeaveRequest** if workflow applies.  A **Leave** is the subdivision of a **LeavePeriod**. There is one **Leave** per half-day of the **LeavePeriod**. Each **Leave** is linked to a **LeaveAccount**, which represent the type of leave (PTO, Sick Leave, Congés payés, RTT, etc).  ![Timmi Absences - UML](https://stoplight.io/api/v1/projects/cHJqOjEwNjgxNg/images/6yaK9GNTQ08)  There can only be one **Leave** per half-day. This prevents duplicates. For **Leaves** expressed in hours (as opposed to **Leaves** in days), the duration of the **Leave** is stored in the value field of the **Leave**. The previous constraint implies that there can only be one type of **Leave** per half-day. This issue is solved in the next version of the API.  ## Fields
 */
@ApiModel(description = "Absences from work, wether they are planned or not, are described in Lucca using three concepts : **LeaveRequests**, **LeavePeriods** and **Leaves**.  A **LeaveRequest** represent the request made by employees when planning time off. This resource is used for workflow purposes.  A **LeavePeriod** is the continuous period of absence requested by the employee or entered by HR. It is linked to a **LeaveRequest** if workflow applies.  A **Leave** is the subdivision of a **LeavePeriod**. There is one **Leave** per half-day of the **LeavePeriod**. Each **Leave** is linked to a **LeaveAccount**, which represent the type of leave (PTO, Sick Leave, Congés payés, RTT, etc).  ![Timmi Absences - UML](https://stoplight.io/api/v1/projects/cHJqOjEwNjgxNg/images/6yaK9GNTQ08)  There can only be one **Leave** per half-day. This prevents duplicates. For **Leaves** expressed in hours (as opposed to **Leaves** in days), the duration of the **Leave** is stored in the value field of the **Leave**. The previous constraint implies that there can only be one type of **Leave** per half-day. This issue is solved in the next version of the API.  ## Fields")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Leave {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_IS_AM = "isAm";
  @SerializedName(SERIALIZED_NAME_IS_AM)
  private Boolean isAm;

  public static final String SERIALIZED_NAME_LEAVE_ACCOUNT_ID = "leaveAccountId";
  @SerializedName(SERIALIZED_NAME_LEAVE_ACCOUNT_ID)
  private Integer leaveAccountId;

  public static final String SERIALIZED_NAME_LEAVE_ACCOUNT = "leaveAccount";
  @SerializedName(SERIALIZED_NAME_LEAVE_ACCOUNT)
  private LeaveAccount leaveAccount;

  public static final String SERIALIZED_NAME_LEAVE_PERIOD_ID = "leavePeriodId";
  @SerializedName(SERIALIZED_NAME_LEAVE_PERIOD_ID)
  private Integer leavePeriodId;

  public static final String SERIALIZED_NAME_LEAVE_PERIOD = "leavePeriod";
  @SerializedName(SERIALIZED_NAME_LEAVE_PERIOD)
  private LeavePeriod leavePeriod;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_CANCELLATION_DATE = "cancellationDate";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_DATE)
  private Object cancellationDate = null;

  public static final String SERIALIZED_NAME_CANCELLATION_USER_ID = "cancellationUserId";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_USER_ID)
  private Object cancellationUserId = null;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public Leave() {
  }

  public Leave id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the Leave
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier for the Leave")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Leave date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Date of the leave in ISO format &#x60;yyyy-mm-dd&#x60;
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date of the leave in ISO format `yyyy-mm-dd`")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public Leave isAm(Boolean isAm) {
    
    
    
    
    this.isAm = isAm;
    return this;
  }

   /**
   * Has the value &#x60;true&#x60; for morning or the value &#x60;false&#x60; for afternoon
   * @return isAm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Has the value `true` for morning or the value `false` for afternoon")

  public Boolean getIsAm() {
    return isAm;
  }


  public void setIsAm(Boolean isAm) {
    
    
    
    this.isAm = isAm;
  }


  public Leave leaveAccountId(Integer leaveAccountId) {
    
    
    
    
    this.leaveAccountId = leaveAccountId;
    return this;
  }

   /**
   * Unique identifier for the attached LeaveAccount
   * @return leaveAccountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier for the attached LeaveAccount")

  public Integer getLeaveAccountId() {
    return leaveAccountId;
  }


  public void setLeaveAccountId(Integer leaveAccountId) {
    
    
    
    this.leaveAccountId = leaveAccountId;
  }


  public Leave leaveAccount(LeaveAccount leaveAccount) {
    
    
    
    
    this.leaveAccount = leaveAccount;
    return this;
  }

   /**
   * Get leaveAccount
   * @return leaveAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LeaveAccount getLeaveAccount() {
    return leaveAccount;
  }


  public void setLeaveAccount(LeaveAccount leaveAccount) {
    
    
    
    this.leaveAccount = leaveAccount;
  }


  public Leave leavePeriodId(Integer leavePeriodId) {
    
    
    
    
    this.leavePeriodId = leavePeriodId;
    return this;
  }

   /**
   * Unique identifier for the attached LeavePeriod
   * @return leavePeriodId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier for the attached LeavePeriod")

  public Integer getLeavePeriodId() {
    return leavePeriodId;
  }


  public void setLeavePeriodId(Integer leavePeriodId) {
    
    
    
    this.leavePeriodId = leavePeriodId;
  }


  public Leave leavePeriod(LeavePeriod leavePeriod) {
    
    
    
    
    this.leavePeriod = leavePeriod;
    return this;
  }

   /**
   * Get leavePeriod
   * @return leavePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LeavePeriod getLeavePeriod() {
    return leavePeriod;
  }


  public void setLeavePeriod(LeavePeriod leavePeriod) {
    
    
    
    this.leavePeriod = leavePeriod;
  }


  public Leave value(Object value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * Leave duration in hours
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Leave duration in hours")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    
    
    
    this.value = value;
  }


  public Leave creationDate(OffsetDateTime creationDate) {
    
    
    
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Time at which the object was created
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time at which the object was created")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    
    
    
    this.creationDate = creationDate;
  }


  public Leave isActive(Boolean isActive) {
    
    
    
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Has the value &#x60;true&#x60; when the Leave exists (for pending or confirmed LeavePeriods), or the value &#x60;false&#x60; when it has been deleted (for canceled or denied LeaveRequests). 
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Has the value `true` when the Leave exists (for pending or confirmed LeavePeriods), or the value `false` when it has been deleted (for canceled or denied LeaveRequests). ")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    
    
    
    this.isActive = isActive;
  }


  public Leave cancellationDate(Object cancellationDate) {
    
    
    
    
    this.cancellationDate = cancellationDate;
    return this;
  }

   /**
   * Time at which the request was canceled
   * @return cancellationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time at which the request was canceled")

  public Object getCancellationDate() {
    return cancellationDate;
  }


  public void setCancellationDate(Object cancellationDate) {
    
    
    
    this.cancellationDate = cancellationDate;
  }


  public Leave cancellationUserId(Object cancellationUserId) {
    
    
    
    
    this.cancellationUserId = cancellationUserId;
    return this;
  }

   /**
   * Unique identifier for the user who canceled the request 
   * @return cancellationUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the user who canceled the request ")

  public Object getCancellationUserId() {
    return cancellationUserId;
  }


  public void setCancellationUserId(Object cancellationUserId) {
    
    
    
    this.cancellationUserId = cancellationUserId;
  }


  public Leave comment(String comment) {
    
    
    
    
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
   * @return the Leave instance itself
   */
  public Leave putAdditionalProperty(String key, Object value) {
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
    Leave leave = (Leave) o;
    return Objects.equals(this.id, leave.id) &&
        Objects.equals(this.date, leave.date) &&
        Objects.equals(this.isAm, leave.isAm) &&
        Objects.equals(this.leaveAccountId, leave.leaveAccountId) &&
        Objects.equals(this.leaveAccount, leave.leaveAccount) &&
        Objects.equals(this.leavePeriodId, leave.leavePeriodId) &&
        Objects.equals(this.leavePeriod, leave.leavePeriod) &&
        Objects.equals(this.value, leave.value) &&
        Objects.equals(this.creationDate, leave.creationDate) &&
        Objects.equals(this.isActive, leave.isActive) &&
        Objects.equals(this.cancellationDate, leave.cancellationDate) &&
        Objects.equals(this.cancellationUserId, leave.cancellationUserId) &&
        Objects.equals(this.comment, leave.comment)&&
        Objects.equals(this.additionalProperties, leave.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, isAm, leaveAccountId, leaveAccount, leavePeriodId, leavePeriod, value, creationDate, isActive, cancellationDate, cancellationUserId, comment, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leave {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isAm: ").append(toIndentedString(isAm)).append("\n");
    sb.append("    leaveAccountId: ").append(toIndentedString(leaveAccountId)).append("\n");
    sb.append("    leaveAccount: ").append(toIndentedString(leaveAccount)).append("\n");
    sb.append("    leavePeriodId: ").append(toIndentedString(leavePeriodId)).append("\n");
    sb.append("    leavePeriod: ").append(toIndentedString(leavePeriod)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
    sb.append("    cancellationUserId: ").append(toIndentedString(cancellationUserId)).append("\n");
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
    openapiFields.add("isAm");
    openapiFields.add("leaveAccountId");
    openapiFields.add("leaveAccount");
    openapiFields.add("leavePeriodId");
    openapiFields.add("leavePeriod");
    openapiFields.add("value");
    openapiFields.add("creationDate");
    openapiFields.add("isActive");
    openapiFields.add("cancellationDate");
    openapiFields.add("cancellationUserId");
    openapiFields.add("comment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("isAm");
    openapiRequiredFields.add("leaveAccountId");
    openapiRequiredFields.add("leavePeriodId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Leave
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Leave.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Leave is not found in the empty JSON string", Leave.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Leave.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `leaveAccount`
      if (jsonObj.get("leaveAccount") != null && !jsonObj.get("leaveAccount").isJsonNull()) {
        LeaveAccount.validateJsonObject(jsonObj.getAsJsonObject("leaveAccount"));
      }
      // validate the optional field `leavePeriod`
      if (jsonObj.get("leavePeriod") != null && !jsonObj.get("leavePeriod").isJsonNull()) {
        LeavePeriod.validateJsonObject(jsonObj.getAsJsonObject("leavePeriod"));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Leave.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Leave' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Leave> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Leave.class));

       return (TypeAdapter<T>) new TypeAdapter<Leave>() {
           @Override
           public void write(JsonWriter out, Leave value) throws IOException {
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
           public Leave read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Leave instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Leave given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Leave
  * @throws IOException if the JSON string is invalid with respect to Leave
  */
  public static Leave fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Leave.class);
  }

 /**
  * Convert an instance of Leave to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

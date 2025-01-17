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
 * ## Fields
 */
@ApiModel(description = "## Fields")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CancellationRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "authorId";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private Integer authorId;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  /**
   * 0 &#x3D; PENDING_APPROVAL  2 &#x3D; APPROVED  3 &#x3D; DENIED  4 &#x3D; CANCELLED  5 &#x3D; CANCELLATION_PENDING 
   */
  @JsonAdapter(RankEnum.Adapter.class)
 public enum RankEnum {
    NUMBER_0(0),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5);

    private Double value;

    RankEnum(Double value) {
      this.value = value;
    }

    public Double getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RankEnum fromValue(Double value) {
      for (RankEnum b : RankEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RankEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RankEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RankEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RankEnum.fromValue(new BigDecimal(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private RankEnum rank;

  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private Boolean approved;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_NEXT_APPROVER_ID = "nextApproverId";
  @SerializedName(SERIALIZED_NAME_NEXT_APPROVER_ID)
  private Object nextApproverId = null;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public CancellationRequest() {
  }

  public CancellationRequest id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public CancellationRequest authorId(Integer authorId) {
    
    
    
    
    this.authorId = authorId;
    return this;
  }

   /**
   * Get authorId
   * @return authorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAuthorId() {
    return authorId;
  }


  public void setAuthorId(Integer authorId) {
    
    
    
    this.authorId = authorId;
  }


  public CancellationRequest comment(String comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    
    
    
    this.comment = comment;
  }


  public CancellationRequest rank(RankEnum rank) {
    
    
    
    
    this.rank = rank;
    return this;
  }

  public CancellationRequest rank(Integer rank) {
    
    
    
    
    this.rank = rank.doubleValue();
    return this;
  }

   /**
   * 0 &#x3D; PENDING_APPROVAL  2 &#x3D; APPROVED  3 &#x3D; DENIED  4 &#x3D; CANCELLED  5 &#x3D; CANCELLATION_PENDING 
   * @return rank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0 = PENDING_APPROVAL  2 = APPROVED  3 = DENIED  4 = CANCELLED  5 = CANCELLATION_PENDING ")

  public RankEnum getRank() {
    return rank;
  }


  public void setRank(RankEnum rank) {
    
    
    
    this.rank = rank;
  }


  public CancellationRequest approved(Boolean approved) {
    
    
    
    
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getApproved() {
    return approved;
  }


  public void setApproved(Boolean approved) {
    
    
    
    this.approved = approved;
  }


  public CancellationRequest creationDate(OffsetDateTime creationDate) {
    
    
    
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    
    
    
    this.creationDate = creationDate;
  }


  public CancellationRequest nextApproverId(Object nextApproverId) {
    
    
    
    
    this.nextApproverId = nextApproverId;
    return this;
  }

   /**
   * Get nextApproverId
   * @return nextApproverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getNextApproverId() {
    return nextApproverId;
  }


  public void setNextApproverId(Object nextApproverId) {
    
    
    
    this.nextApproverId = nextApproverId;
  }


  public CancellationRequest isActive(Boolean isActive) {
    
    
    
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    
    
    
    this.isActive = isActive;
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
   * @return the CancellationRequest instance itself
   */
  public CancellationRequest putAdditionalProperty(String key, Object value) {
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
    CancellationRequest cancellationRequest = (CancellationRequest) o;
    return Objects.equals(this.id, cancellationRequest.id) &&
        Objects.equals(this.authorId, cancellationRequest.authorId) &&
        Objects.equals(this.comment, cancellationRequest.comment) &&
        Objects.equals(this.rank, cancellationRequest.rank) &&
        Objects.equals(this.approved, cancellationRequest.approved) &&
        Objects.equals(this.creationDate, cancellationRequest.creationDate) &&
        Objects.equals(this.nextApproverId, cancellationRequest.nextApproverId) &&
        Objects.equals(this.isActive, cancellationRequest.isActive)&&
        Objects.equals(this.additionalProperties, cancellationRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, authorId, comment, rank, approved, creationDate, nextApproverId, isActive, additionalProperties);
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
    sb.append("class CancellationRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    nextApproverId: ").append(toIndentedString(nextApproverId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
    openapiFields.add("authorId");
    openapiFields.add("comment");
    openapiFields.add("rank");
    openapiFields.add("approved");
    openapiFields.add("creationDate");
    openapiFields.add("nextApproverId");
    openapiFields.add("isActive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CancellationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CancellationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CancellationRequest is not found in the empty JSON string", CancellationRequest.openapiRequiredFields.toString()));
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
       if (!CancellationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CancellationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CancellationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CancellationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CancellationRequest>() {
           @Override
           public void write(JsonWriter out, CancellationRequest value) throws IOException {
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
           public CancellationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CancellationRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CancellationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CancellationRequest
  * @throws IOException if the JSON string is invalid with respect to CancellationRequest
  */
  public static CancellationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CancellationRequest.class);
  }

 /**
  * Convert an instance of CancellationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


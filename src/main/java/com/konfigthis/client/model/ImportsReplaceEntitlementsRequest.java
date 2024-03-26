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
 * ImportsReplaceEntitlementsRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ImportsReplaceEntitlementsRequest {
  public static final String SERIALIZED_NAME_FILE = "File";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String _file;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REFERENCE_DATE = "ReferenceDate";
  @SerializedName(SERIALIZED_NAME_REFERENCE_DATE)
  private OffsetDateTime referenceDate;

  public static final String SERIALIZED_NAME_ENTRY_TYPES = "EntryTypes";
  @SerializedName(SERIALIZED_NAME_ENTRY_TYPES)
  private String entryTypes = "AutoAccruals,ManualAccruals,Regularizations";

  public ImportsReplaceEntitlementsRequest() {
  }

  public ImportsReplaceEntitlementsRequest _file(String _file) {
    
    
    
    
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFile() {
    return _file;
  }


  public void setFile(String _file) {
    
    
    
    this._file = _file;
  }


  public ImportsReplaceEntitlementsRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Description of the entries generated by the import (visible to users in the account details).
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the entries generated by the import (visible to users in the account details).")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ImportsReplaceEntitlementsRequest referenceDate(OffsetDateTime referenceDate) {
    
    
    
    
    this.referenceDate = referenceDate;
    return this;
  }

   /**
   * Reference date (text mode). Respect the format: yyyy-MM-ddThh: mm: ss
   * @return referenceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference date (text mode). Respect the format: yyyy-MM-ddThh: mm: ss")

  public OffsetDateTime getReferenceDate() {
    return referenceDate;
  }


  public void setReferenceDate(OffsetDateTime referenceDate) {
    
    
    
    this.referenceDate = referenceDate;
  }


  public ImportsReplaceEntitlementsRequest entryTypes(String entryTypes) {
    
    
    
    
    this.entryTypes = entryTypes;
    return this;
  }

   /**
   * Types of entries to take into account, separated by commas, from the following list: AutoAccruals, ManualAccruals, Regularisations, EntitlementsImport, Seniority, Fractionnement, TimeSavings, Comp  By default: &#x60;AutoAccruals, ManualAccruals, Regularizations&#x60; which correspond to the main cases of acquisition (automatic acquisition, manual adjustments, regularisations).
   * @return entryTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AutoAccruals,ManualAccruals,Regularizations", value = "Types of entries to take into account, separated by commas, from the following list: AutoAccruals, ManualAccruals, Regularisations, EntitlementsImport, Seniority, Fractionnement, TimeSavings, Comp  By default: `AutoAccruals, ManualAccruals, Regularizations` which correspond to the main cases of acquisition (automatic acquisition, manual adjustments, regularisations).")

  public String getEntryTypes() {
    return entryTypes;
  }


  public void setEntryTypes(String entryTypes) {
    
    
    
    this.entryTypes = entryTypes;
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
   * @return the ImportsReplaceEntitlementsRequest instance itself
   */
  public ImportsReplaceEntitlementsRequest putAdditionalProperty(String key, Object value) {
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
    ImportsReplaceEntitlementsRequest importsReplaceEntitlementsRequest = (ImportsReplaceEntitlementsRequest) o;
    return Objects.equals(this._file, importsReplaceEntitlementsRequest._file) &&
        Objects.equals(this.description, importsReplaceEntitlementsRequest.description) &&
        Objects.equals(this.referenceDate, importsReplaceEntitlementsRequest.referenceDate) &&
        Objects.equals(this.entryTypes, importsReplaceEntitlementsRequest.entryTypes)&&
        Objects.equals(this.additionalProperties, importsReplaceEntitlementsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, description, referenceDate, entryTypes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportsReplaceEntitlementsRequest {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    referenceDate: ").append(toIndentedString(referenceDate)).append("\n");
    sb.append("    entryTypes: ").append(toIndentedString(entryTypes)).append("\n");
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
    openapiFields.add("File");
    openapiFields.add("Description");
    openapiFields.add("ReferenceDate");
    openapiFields.add("EntryTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportsReplaceEntitlementsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ImportsReplaceEntitlementsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportsReplaceEntitlementsRequest is not found in the empty JSON string", ImportsReplaceEntitlementsRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("File") != null && !jsonObj.get("File").isJsonNull()) && !jsonObj.get("File").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `File` to be a primitive type in the JSON string but got `%s`", jsonObj.get("File").toString()));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if ((jsonObj.get("EntryTypes") != null && !jsonObj.get("EntryTypes").isJsonNull()) && !jsonObj.get("EntryTypes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EntryTypes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EntryTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportsReplaceEntitlementsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportsReplaceEntitlementsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportsReplaceEntitlementsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportsReplaceEntitlementsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportsReplaceEntitlementsRequest>() {
           @Override
           public void write(JsonWriter out, ImportsReplaceEntitlementsRequest value) throws IOException {
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
           public ImportsReplaceEntitlementsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ImportsReplaceEntitlementsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ImportsReplaceEntitlementsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportsReplaceEntitlementsRequest
  * @throws IOException if the JSON string is invalid with respect to ImportsReplaceEntitlementsRequest
  */
  public static ImportsReplaceEntitlementsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportsReplaceEntitlementsRequest.class);
  }

 /**
  * Convert an instance of ImportsReplaceEntitlementsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.client.model.AppleReq;
import org.openapitools.client.model.BananaReq;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class FruitReq extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FruitReq.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FruitReq.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FruitReq' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AppleReq> adapterAppleReq = gson.getDelegateAdapter(this, TypeToken.get(AppleReq.class));
            final TypeAdapter<BananaReq> adapterBananaReq = gson.getDelegateAdapter(this, TypeToken.get(BananaReq.class));

            return (TypeAdapter<T>) new TypeAdapter<FruitReq>() {
                @Override
                public void write(JsonWriter out, FruitReq value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AppleReq`
                    if (value.getActualInstance() instanceof AppleReq) {
                        JsonElement element = adapterAppleReq.toJsonTree((AppleReq)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `BananaReq`
                    if (value.getActualInstance() instanceof BananaReq) {
                        JsonElement element = adapterBananaReq.toJsonTree((BananaReq)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AppleReq, BananaReq");
                }

                @Override
                public FruitReq read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AppleReq
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AppleReq.validateJsonElement(jsonElement);
                        actualAdapter = adapterAppleReq;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AppleReq'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AppleReq failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AppleReq'", e);
                    }
                    // deserialize BananaReq
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BananaReq.validateJsonElement(jsonElement);
                        actualAdapter = adapterBananaReq;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BananaReq'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BananaReq failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BananaReq'", e);
                    }

                    if (match == 1) {
                        FruitReq ret = new FruitReq();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for FruitReq: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public FruitReq() {
        super("oneOf", Boolean.TRUE);
    }

    public FruitReq(AppleReq o) {
        super("oneOf", Boolean.TRUE);
        setActualInstance(o);
    }

    public FruitReq(BananaReq o) {
        super("oneOf", Boolean.TRUE);
        setActualInstance(o);
    }

    static {
        schemas.put("AppleReq", AppleReq.class);
        schemas.put("BananaReq", BananaReq.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return FruitReq.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AppleReq, BananaReq
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance == null) {
           super.setActualInstance(instance);
           return;
        }

        if (instance instanceof AppleReq) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BananaReq) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AppleReq, BananaReq");
    }

    /**
     * Get the actual instance, which can be the following:
     * AppleReq, BananaReq
     *
     * @return The actual instance (AppleReq, BananaReq)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppleReq`. If the actual instance is not `AppleReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppleReq`
     * @throws ClassCastException if the instance is not `AppleReq`
     */
    public AppleReq getAppleReq() throws ClassCastException {
        return (AppleReq)super.getActualInstance();
    }
    /**
     * Get the actual instance of `BananaReq`. If the actual instance is not `BananaReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BananaReq`
     * @throws ClassCastException if the instance is not `BananaReq`
     */
    public BananaReq getBananaReq() throws ClassCastException {
        return (BananaReq)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to FruitReq
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with AppleReq
        try {
            AppleReq.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AppleReq failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with BananaReq
        try {
            BananaReq.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BananaReq failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for FruitReq with oneOf schemas: AppleReq, BananaReq. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of FruitReq given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FruitReq
     * @throws IOException if the JSON string is invalid with respect to FruitReq
     */
    public static FruitReq fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FruitReq.class);
    }

    /**
     * Convert an instance of FruitReq to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


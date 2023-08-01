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


package org.openapitools.client;

import org.openapitools.client.api.*;

import io.restassured.builder.RequestSpecBuilder;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.JacksonObjectMapper.jackson;

public class ApiClient {
    public static final String BASE_URI = "http://petstore.swagger.io:80/v2";

    private final Config config;

    private ApiClient(Config config) {
        this.config = config;
    }

    public static ApiClient api(Config config) {
        return new ApiClient(config);
    }

    public AnotherFakeApi anotherFake() {
        return AnotherFakeApi.anotherFake(config.reqSpecSupplier);
    }
    public FakeApi fake() {
        return FakeApi.fake(config.reqSpecSupplier);
    }
    public FakeClassnameTags123Api fakeClassnameTags123() {
        return FakeClassnameTags123Api.fakeClassnameTags123(config.reqSpecSupplier);
    }
    public PetApi pet() {
        return PetApi.pet(config.reqSpecSupplier);
    }
    public StoreApi store() {
        return StoreApi.store(config.reqSpecSupplier);
    }
    public UserApi user() {
        return UserApi.user(config.reqSpecSupplier);
    }

    public static class Config {
        private Supplier<RequestSpecBuilder> reqSpecSupplier = () -> new RequestSpecBuilder()
                .setBaseUri(BASE_URI)
                .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(jackson())));

        /**
         * Use common specification for all operations
         * @param supplier supplier
         * @return configuration
         */
        public Config reqSpecSupplier(Supplier<RequestSpecBuilder> supplier) {
            this.reqSpecSupplier = supplier;
            return this;
        }

        public static Config apiConfig() {
            return new Config();
        }
    }
}
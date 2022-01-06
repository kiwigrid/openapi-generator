/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Pair;

import org.openapitools.client.model.DataQuery;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter;
import org.openapitools.client.model.TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public QueryApi() {
    this(new ApiClient());
  }

  public QueryApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param datetimeQuery  (optional)
   * @param dateQuery  (optional)
   * @param stringQuery  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testQueryDatetimeDateString(OffsetDateTime datetimeQuery, LocalDate dateQuery, String stringQuery) throws ApiException {
    ApiResponse<String> localVarResponse = testQueryDatetimeDateStringWithHttpInfo(datetimeQuery, dateQuery, stringQuery);
    return localVarResponse.getData();
  }

  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param datetimeQuery  (optional)
   * @param dateQuery  (optional)
   * @param stringQuery  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testQueryDatetimeDateStringWithHttpInfo(OffsetDateTime datetimeQuery, LocalDate dateQuery, String stringQuery) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testQueryDatetimeDateStringRequestBuilder(datetimeQuery, dateQuery, stringQuery);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testQueryDatetimeDateString", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0))) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testQueryDatetimeDateStringRequestBuilder(OffsetDateTime datetimeQuery, LocalDate dateQuery, String stringQuery) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/query/datetime/date/string";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "datetime_query";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("datetime_query", datetimeQuery));
    localVarQueryParameterBaseName = "date_query";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("date_query", dateQuery));
    localVarQueryParameterBaseName = "string_query";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("string_query", stringQuery));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "text/plain");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param integerQuery  (optional)
   * @param booleanQuery  (optional)
   * @param stringQuery  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testQueryIntegerBooleanString(Integer integerQuery, Boolean booleanQuery, String stringQuery) throws ApiException {
    ApiResponse<String> localVarResponse = testQueryIntegerBooleanStringWithHttpInfo(integerQuery, booleanQuery, stringQuery);
    return localVarResponse.getData();
  }

  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param integerQuery  (optional)
   * @param booleanQuery  (optional)
   * @param stringQuery  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testQueryIntegerBooleanStringWithHttpInfo(Integer integerQuery, Boolean booleanQuery, String stringQuery) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testQueryIntegerBooleanStringRequestBuilder(integerQuery, booleanQuery, stringQuery);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testQueryIntegerBooleanString", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0))) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testQueryIntegerBooleanStringRequestBuilder(Integer integerQuery, Boolean booleanQuery, String stringQuery) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/query/integer/boolean/string";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "integer_query";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("integer_query", integerQuery));
    localVarQueryParameterBaseName = "boolean_query";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("boolean_query", booleanQuery));
    localVarQueryParameterBaseName = "string_query";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("string_query", stringQuery));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "text/plain");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param queryObject  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testQueryStyleDeepObjectExplodeTrueObject(Pet queryObject) throws ApiException {
    ApiResponse<String> localVarResponse = testQueryStyleDeepObjectExplodeTrueObjectWithHttpInfo(queryObject);
    return localVarResponse.getData();
  }

  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param queryObject  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testQueryStyleDeepObjectExplodeTrueObjectWithHttpInfo(Pet queryObject) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testQueryStyleDeepObjectExplodeTrueObjectRequestBuilder(queryObject);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testQueryStyleDeepObjectExplodeTrueObject", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0))) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testQueryStyleDeepObjectExplodeTrueObjectRequestBuilder(Pet queryObject) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/query/style_deepObject/explode_true/object";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "query_object";
    if (queryObject != null) {
      localVarQueryStringJoiner.add(queryObject.toUrlQueryString("query_object"));
    }

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "text/plain");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param queryObject  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testQueryStyleDeepObjectExplodeTrueObjectAllOf(TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter queryObject) throws ApiException {
    ApiResponse<String> localVarResponse = testQueryStyleDeepObjectExplodeTrueObjectAllOfWithHttpInfo(queryObject);
    return localVarResponse.getData();
  }

  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param queryObject  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testQueryStyleDeepObjectExplodeTrueObjectAllOfWithHttpInfo(TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter queryObject) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testQueryStyleDeepObjectExplodeTrueObjectAllOfRequestBuilder(queryObject);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testQueryStyleDeepObjectExplodeTrueObjectAllOf", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0))) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testQueryStyleDeepObjectExplodeTrueObjectAllOfRequestBuilder(TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter queryObject) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/query/style_deepObject/explode_true/object/allOf";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "query_object";
    if (queryObject != null) {
      localVarQueryStringJoiner.add(queryObject.toUrlQueryString("query_object"));
    }

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "text/plain");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param queryObject  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testQueryStyleFormExplodeTrueArrayString(TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter queryObject) throws ApiException {
    ApiResponse<String> localVarResponse = testQueryStyleFormExplodeTrueArrayStringWithHttpInfo(queryObject);
    return localVarResponse.getData();
  }

  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param queryObject  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testQueryStyleFormExplodeTrueArrayStringWithHttpInfo(TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter queryObject) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testQueryStyleFormExplodeTrueArrayStringRequestBuilder(queryObject);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testQueryStyleFormExplodeTrueArrayString", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0))) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testQueryStyleFormExplodeTrueArrayStringRequestBuilder(TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter queryObject) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/query/style_form/explode_true/array_string";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "query_object";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "values", queryObject.getValues()));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "text/plain");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param queryObject  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testQueryStyleFormExplodeTrueObject(Pet queryObject) throws ApiException {
    ApiResponse<String> localVarResponse = testQueryStyleFormExplodeTrueObjectWithHttpInfo(queryObject);
    return localVarResponse.getData();
  }

  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param queryObject  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testQueryStyleFormExplodeTrueObjectWithHttpInfo(Pet queryObject) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testQueryStyleFormExplodeTrueObjectRequestBuilder(queryObject);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testQueryStyleFormExplodeTrueObject", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0))) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testQueryStyleFormExplodeTrueObjectRequestBuilder(Pet queryObject) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/query/style_form/explode_true/object";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "query_object";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("id", queryObject.getId()));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("name", queryObject.getName()));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("category", queryObject.getCategory()));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "photoUrls", queryObject.getPhotoUrls()));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "tags", queryObject.getTags()));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("status", queryObject.getStatus()));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "text/plain");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param queryObject  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testQueryStyleFormExplodeTrueObjectAllOf(DataQuery queryObject) throws ApiException {
    ApiResponse<String> localVarResponse = testQueryStyleFormExplodeTrueObjectAllOfWithHttpInfo(queryObject);
    return localVarResponse.getData();
  }

  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param queryObject  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testQueryStyleFormExplodeTrueObjectAllOfWithHttpInfo(DataQuery queryObject) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testQueryStyleFormExplodeTrueObjectAllOfRequestBuilder(queryObject);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testQueryStyleFormExplodeTrueObjectAllOf", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0))) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testQueryStyleFormExplodeTrueObjectAllOfRequestBuilder(DataQuery queryObject) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/query/style_form/explode_true/object/allOf";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "query_object";
    localVarQueryStringJoiner.add(queryObject.toUrlQueryString());

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "text/plain");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}

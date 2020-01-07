package com.blockchain.shipmentstrato.api.strato;

import com.blockchain.shipmentstrato.api.ApiClient;
import com.blockchain.shipmentstrato.api.EncodingUtils;

import com.blockchain.shipmentstrato.model.strato.Attest;
import java.io.File;
import com.blockchain.shipmentstrato.model.strato.Verify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public interface ExternalStorageApi extends ApiClient.Api {

  /**
   * Attest a file
   * 
   * @param body username &#x3D; User attesting the file
 password &#x3D; Password of user attesting the file
 address &#x3D; Address of user attesting the file
 contractAddress &#x3D; Address of file to be attested (required)
   * @return Object
   */
  @RequestLine("POST /apex-api/bloc/file/attest")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: text/plain;charset&#x3D;utf-8",
  })
  Object apexApiBlocFileAttestPost(Attest body);
  /**
   * Download a file
   * 
   * @param contractAddress Address of the file to be downloaded (required)
   * @return Object
   */
  @RequestLine("GET /apex-api/bloc/file/download?contractAddress={contractAddress}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Object apexApiBlocFileDownloadGet(@Param("contractAddress") String contractAddress);

  /**
   * Download a file
   * 
   * Note, this is equivalent to the other <code>apexApiBlocFileDownloadGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApexApiBlocFileDownloadGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>contractAddress - Address of the file to be downloaded (required)</li>
   *   </ul>
   * @return Object

   */
  @RequestLine("GET /apex-api/bloc/file/download?contractAddress={contractAddress}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Object apexApiBlocFileDownloadGet(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>apexApiBlocFileDownloadGet</code> method in a fluent style.
   */
  public static class ApexApiBlocFileDownloadGetQueryParams extends HashMap<String, Object> {
    public ApexApiBlocFileDownloadGetQueryParams contractAddress(final String value) {
      put("contractAddress", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get a list of all uploaded files
   * 
   * @param limit Pagination limit per page (default: 100) (optional)
   * @param offset Pagination offset (default: 0) (optional)
   * @return Object
   */
  @RequestLine("GET /apex-api/bloc/file/list?limit={limit}&offset={offset}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Object apexApiBlocFileListGet(@Param("limit") String limit, @Param("offset") String offset);

  /**
   * Get a list of all uploaded files
   * 
   * Note, this is equivalent to the other <code>apexApiBlocFileListGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApexApiBlocFileListGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - Pagination limit per page (default: 100) (optional)</li>
   *   <li>offset - Pagination offset (default: 0) (optional)</li>
   *   </ul>
   * @return Object

   */
  @RequestLine("GET /apex-api/bloc/file/list?limit={limit}&offset={offset}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Object apexApiBlocFileListGet(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>apexApiBlocFileListGet</code> method in a fluent style.
   */
  public static class ApexApiBlocFileListGetQueryParams extends HashMap<String, Object> {
    public ApexApiBlocFileListGetQueryParams limit(final String value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ApexApiBlocFileListGetQueryParams offset(final String value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Upload a file
   * 
   * @param content  (optional)
   * @param username  (optional)
   * @param password  (optional)
   * @param address  (optional)
   * @param provider  (optional)
   * @param metadata  (optional)
   * @return Object
   */
  @RequestLine("POST /apex-api/bloc/file/upload")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Object apexApiBlocFileUploadPost(@Param("content") File content, @Param("username") String username, @Param("password") String password, @Param("address") String address, @Param("provider") String provider, @Param("metadata") String metadata);
  /**
   * Verify a file
   * 
   * @param contractAddress Address of the file to be verified (required)
   * @return Verify
   */
  @RequestLine("GET /apex-api/bloc/file/verify?contractAddress={contractAddress}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Verify apexApiBlocFileVerifyGet(@Param("contractAddress") String contractAddress);

  /**
   * Verify a file
   * 
   * Note, this is equivalent to the other <code>apexApiBlocFileVerifyGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApexApiBlocFileVerifyGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>contractAddress - Address of the file to be verified (required)</li>
   *   </ul>
   * @return Verify

   */
  @RequestLine("GET /apex-api/bloc/file/verify?contractAddress={contractAddress}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Verify apexApiBlocFileVerifyGet(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>apexApiBlocFileVerifyGet</code> method in a fluent style.
   */
  public static class ApexApiBlocFileVerifyGetQueryParams extends HashMap<String, Object> {
    public ApexApiBlocFileVerifyGetQueryParams contractAddress(final String value) {
      put("contractAddress", EncodingUtils.encode(value));
      return this;
    }
  }
}

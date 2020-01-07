package com.blockchain.shipmentstrato.api.strato;

import com.blockchain.shipmentstrato.api.ApiClient;
import com.blockchain.shipmentstrato.api.EncodingUtils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public interface UsersOAuthApi extends ApiClient.Api {

  /**
   * Get account address of authorized user or another user
   * 
   * @param username (optional) Username to get another user&#x27;s address (optional)
   * @return Object
   */
  @RequestLine("GET /strato/v2.3/key?username={username}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Object stratoV23KeyGet(@Param("username") String username);

  /**
   * Get account address of authorized user or another user
   * 
   * Note, this is equivalent to the other <code>stratoV23KeyGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StratoV23KeyGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>username - (optional) Username to get another user&#x27;s address (optional)</li>
   *   </ul>
   * @return Object

   */
  @RequestLine("GET /strato/v2.3/key?username={username}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Object stratoV23KeyGet(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>stratoV23KeyGet</code> method in a fluent style.
   */
  public static class StratoV23KeyGetQueryParams extends HashMap<String, Object> {
    public StratoV23KeyGetQueryParams username(final String value) {
      put("username", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get account address of authorized user or another user
   * 
   * @return Object
   */
  @RequestLine("POST /strato/v2.3/key")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Object stratoV23KeyPost();
  /**
   * Get list of OAuth users and OAuth account address
   * 
   * @param address Address of user to look up the username of (optional)
   * @param limit Pagination limit per page (default: 100) (optional)
   * @param offset Pagination offset (default: 0) (optional)
   * @return Object
   */
  @RequestLine("GET /strato/v2.3/users?address={address}&limit={limit}&offset={offset}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Object stratoV23UsersGet(@Param("address") String address, @Param("limit") String limit, @Param("offset") String offset);

  /**
   * Get list of OAuth users and OAuth account address
   * 
   * Note, this is equivalent to the other <code>stratoV23UsersGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StratoV23UsersGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>address - Address of user to look up the username of (optional)</li>
   *   <li>limit - Pagination limit per page (default: 100) (optional)</li>
   *   <li>offset - Pagination offset (default: 0) (optional)</li>
   *   </ul>
   * @return Object

   */
  @RequestLine("GET /strato/v2.3/users?address={address}&limit={limit}&offset={offset}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Object stratoV23UsersGet(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>stratoV23UsersGet</code> method in a fluent style.
   */
  public static class StratoV23UsersGetQueryParams extends HashMap<String, Object> {
    public StratoV23UsersGetQueryParams address(final String value) {
      put("address", EncodingUtils.encode(value));
      return this;
    }
    public StratoV23UsersGetQueryParams limit(final String value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public StratoV23UsersGetQueryParams offset(final String value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }
}

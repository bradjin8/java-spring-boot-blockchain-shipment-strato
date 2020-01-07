package com.blockchain.shipmentstrato.api.strato;

import com.blockchain.shipmentstrato.api.ApiClient;
import com.blockchain.shipmentstrato.api.EncodingUtils;

import com.blockchain.shipmentstrato.model.strato.ChainInfo;
import com.blockchain.shipmentstrato.model.strato.ChainInput;
import com.blockchain.shipmentstrato.model.strato.NamedTuple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public interface ChainsApi extends ApiClient.Api {

  /**
   * Get chain info
   * 
   * @param chainid  (required)
   * @return List&lt;NamedTuple&gt;
   */
  @RequestLine("GET /bloc/v2.2/chain?chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<NamedTuple> blocV22ChainGet(@Param("chainid") List<String> chainid);

  /**
   * Get chain info
   * 
   * Note, this is equivalent to the other <code>blocV22ChainGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22ChainGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (required)</li>
   *   </ul>
   * @return List&lt;NamedTuple&gt;

   */
  @RequestLine("GET /bloc/v2.2/chain?chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<NamedTuple> blocV22ChainGet(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22ChainGet</code> method in a fluent style.
   */
  public static class BlocV22ChainGetQueryParams extends HashMap<String, Object> {
    public BlocV22ChainGetQueryParams chainid(final List<String> value) {
      put("chainid", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Create a private chain
   * Returns chainId
   * @param body  (required)
   * @return String
   */
  @RequestLine("POST /bloc/v2.2/chain")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  String blocV22ChainPost(ChainInput body);
  /**
   * Get chain info
   * Returns chain info from given chain ID
   * @param chainid  (required)
   * @return List&lt;NamedTuple&gt;
   */
  @RequestLine("GET /strato-api/eth/v1.2/chain?chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<NamedTuple> stratoApiEthV12ChainGet(@Param("chainid") List<String> chainid);

  /**
   * Get chain info
   * Returns chain info from given chain ID
   * Note, this is equivalent to the other <code>stratoApiEthV12ChainGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StratoApiEthV12ChainGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (required)</li>
   *   </ul>
   * @return List&lt;NamedTuple&gt;

   */
  @RequestLine("GET /strato-api/eth/v1.2/chain?chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<NamedTuple> stratoApiEthV12ChainGet(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>stratoApiEthV12ChainGet</code> method in a fluent style.
   */
  public static class StratoApiEthV12ChainGetQueryParams extends HashMap<String, Object> {
    public StratoApiEthV12ChainGetQueryParams chainid(final List<String> value) {
      put("chainid", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Create a new chain
   * 
   * @param body  (required)
   * @return String
   */
  @RequestLine("POST /strato-api/eth/v1.2/chain")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  String stratoApiEthV12ChainPost(ChainInfo body);
}

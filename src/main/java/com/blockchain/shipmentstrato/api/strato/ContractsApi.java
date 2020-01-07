package com.blockchain.shipmentstrato.api.strato;

import com.blockchain.shipmentstrato.api.ApiClient;
import com.blockchain.shipmentstrato.api.EncodingUtils;

import com.blockchain.shipmentstrato.model.strato.BlocTransactionResult;
import com.blockchain.shipmentstrato.model.strato.Contract;
import com.blockchain.shipmentstrato.model.strato.ContractDetails;
import com.blockchain.shipmentstrato.model.strato.GetContractResponse;
import com.blockchain.shipmentstrato.model.strato.PostCompileRequest;
import com.blockchain.shipmentstrato.model.strato.PostCompileResponse;
import com.blockchain.shipmentstrato.model.strato.PostMethodListRequest;
import com.blockchain.shipmentstrato.model.strato.PostUsersContractMethodRequest;
import com.blockchain.shipmentstrato.model.strato.PostUsersContractRequest;
import com.blockchain.shipmentstrato.model.strato.PostXabiResponse;
import com.blockchain.shipmentstrato.model.strato.UploadListRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public interface ContractsApi extends ApiClient.Api {

  /**
   * Compile contracts
   * 
   * @param body  (required)
   * @return List&lt;PostCompileResponse&gt;
   */
  @RequestLine("POST /bloc/v2.2/contracts/compile")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<PostCompileResponse> blocV22ContractsCompilePost(List<PostCompileRequest> body);
  /**
   * Get the details of a contract
   * 
   * @param contractAddress  (required)
   * @param chainid  (optional)
   * @return ContractDetails
   */
  @RequestLine("GET /bloc/v2.2/contracts/contract/{contractAddress}/details?chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  ContractDetails blocV22ContractsContractContractAddressDetailsGet(@Param("contractAddress") String contractAddress, @Param("chainid") String chainid);

  /**
   * Get the details of a contract
   * 
   * Note, this is equivalent to the other <code>blocV22ContractsContractContractAddressDetailsGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22ContractsContractContractAddressDetailsGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param contractAddress  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return ContractDetails

   */
  @RequestLine("GET /bloc/v2.2/contracts/contract/{contractAddress}/details?chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  ContractDetails blocV22ContractsContractContractAddressDetailsGet(@Param("contractAddress") String contractAddress, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22ContractsContractContractAddressDetailsGet</code> method in a fluent style.
   */
  public static class BlocV22ContractsContractContractAddressDetailsGetQueryParams extends HashMap<String, Object> {
    public BlocV22ContractsContractContractAddressDetailsGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get enum from a contract
   * 
   * @param contractName  (required)
   * @param contractAddress  (required)
   * @param enumName  (required)
   * @param chainid  (optional)
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /bloc/v2.2/contracts/{contractName}/{contractAddress}/enum/{enumName}?chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<String> blocV22ContractsContractNameContractAddressEnumEnumNameGet(@Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @Param("enumName") String enumName, @Param("chainid") String chainid);

  /**
   * Get enum from a contract
   * 
   * Note, this is equivalent to the other <code>blocV22ContractsContractNameContractAddressEnumEnumNameGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22ContractsContractNameContractAddressEnumEnumNameGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param contractName  (required)
   * @param contractAddress  (required)
   * @param enumName  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return List&lt;String&gt;

   */
  @RequestLine("GET /bloc/v2.2/contracts/{contractName}/{contractAddress}/enum/{enumName}?chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<String> blocV22ContractsContractNameContractAddressEnumEnumNameGet(@Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @Param("enumName") String enumName, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22ContractsContractNameContractAddressEnumEnumNameGet</code> method in a fluent style.
   */
  public static class BlocV22ContractsContractNameContractAddressEnumEnumNameGetQueryParams extends HashMap<String, Object> {
    public BlocV22ContractsContractNameContractAddressEnumEnumNameGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get a list of functions in an existing contract
   * 
   * @param contractName Name of an existing contract (required)
   * @param contractAddress Address of an existing contract (required)
   * @param chainid  (optional)
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /bloc/v2.2/contracts/{contractName}/{contractAddress}/functions?chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<String> blocV22ContractsContractNameContractAddressFunctionsGet(@Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @Param("chainid") String chainid);

  /**
   * Get a list of functions in an existing contract
   * 
   * Note, this is equivalent to the other <code>blocV22ContractsContractNameContractAddressFunctionsGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22ContractsContractNameContractAddressFunctionsGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param contractName Name of an existing contract (required)
   * @param contractAddress Address of an existing contract (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return List&lt;String&gt;

   */
  @RequestLine("GET /bloc/v2.2/contracts/{contractName}/{contractAddress}/functions?chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<String> blocV22ContractsContractNameContractAddressFunctionsGet(@Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22ContractsContractNameContractAddressFunctionsGet</code> method in a fluent style.
   */
  public static class BlocV22ContractsContractNameContractAddressFunctionsGetQueryParams extends HashMap<String, Object> {
    public BlocV22ContractsContractNameContractAddressFunctionsGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get info of a Contract
   * 
   * @param contractName  (required)
   * @param contractAddress  (required)
   * @param chainid  (optional)
   * @return ContractDetails
   */
  @RequestLine("GET /bloc/v2.2/contracts/{contractName}/{contractAddress}?chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  ContractDetails blocV22ContractsContractNameContractAddressGet(@Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @Param("chainid") String chainid);

  /**
   * Get info of a Contract
   * 
   * Note, this is equivalent to the other <code>blocV22ContractsContractNameContractAddressGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22ContractsContractNameContractAddressGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param contractName  (required)
   * @param contractAddress  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return ContractDetails

   */
  @RequestLine("GET /bloc/v2.2/contracts/{contractName}/{contractAddress}?chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  ContractDetails blocV22ContractsContractNameContractAddressGet(@Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22ContractsContractNameContractAddressGet</code> method in a fluent style.
   */
  public static class BlocV22ContractsContractNameContractAddressGetQueryParams extends HashMap<String, Object> {
    public BlocV22ContractsContractNameContractAddressGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get state of a contract
   * 
   * @param contractName  (required)
   * @param contractAddress  (required)
   * @param chainid  (optional)
   * @param name  (optional)
   * @param count  (optional)
   * @param offset  (optional)
   * @param length  (optional)
   * @return Map&lt;String, String&gt;
   */
  @RequestLine("GET /bloc/v2.2/contracts/{contractName}/{contractAddress}/state?chainid={chainid}&name={name}&count={count}&offset={offset}&length={length}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Map<String, String> blocV22ContractsContractNameContractAddressStateGet(@Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @Param("chainid") String chainid, @Param("name") String name, @Param("count") Integer count, @Param("offset") Integer offset, @Param("length") Boolean length);

  /**
   * Get state of a contract
   * 
   * Note, this is equivalent to the other <code>blocV22ContractsContractNameContractAddressStateGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22ContractsContractNameContractAddressStateGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param contractName  (required)
   * @param contractAddress  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   <li>name -  (optional)</li>
   *   <li>count -  (optional)</li>
   *   <li>offset -  (optional)</li>
   *   <li>length -  (optional)</li>
   *   </ul>
   * @return Map&lt;String, String&gt;

   */
  @RequestLine("GET /bloc/v2.2/contracts/{contractName}/{contractAddress}/state?chainid={chainid}&name={name}&count={count}&offset={offset}&length={length}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Map<String, String> blocV22ContractsContractNameContractAddressStateGet(@Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22ContractsContractNameContractAddressStateGet</code> method in a fluent style.
   */
  public static class BlocV22ContractsContractNameContractAddressStateGetQueryParams extends HashMap<String, Object> {
    public BlocV22ContractsContractNameContractAddressStateGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
    public BlocV22ContractsContractNameContractAddressStateGetQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public BlocV22ContractsContractNameContractAddressStateGetQueryParams count(final Integer value) {
      put("count", EncodingUtils.encode(value));
      return this;
    }
    public BlocV22ContractsContractNameContractAddressStateGetQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
    public BlocV22ContractsContractNameContractAddressStateGetQueryParams length(final Boolean value) {
      put("length", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get contract mapping and keys
   * 
   * @param contractName  (required)
   * @param contractAddress  (required)
   * @param mapping  (required)
   * @param key  (required)
   * @param chainid  (optional)
   * @return String
   */
  @RequestLine("GET /bloc/v2.2/contracts/{contractName}/{contractAddress}/state/{mapping}/{key}?chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  String blocV22ContractsContractNameContractAddressStateMappingKeyGet(@Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @Param("mapping") String mapping, @Param("key") String key, @Param("chainid") String chainid);

  /**
   * Get contract mapping and keys
   * 
   * Note, this is equivalent to the other <code>blocV22ContractsContractNameContractAddressStateMappingKeyGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22ContractsContractNameContractAddressStateMappingKeyGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param contractName  (required)
   * @param contractAddress  (required)
   * @param mapping  (required)
   * @param key  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return String

   */
  @RequestLine("GET /bloc/v2.2/contracts/{contractName}/{contractAddress}/state/{mapping}/{key}?chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  String blocV22ContractsContractNameContractAddressStateMappingKeyGet(@Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @Param("mapping") String mapping, @Param("key") String key, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22ContractsContractNameContractAddressStateMappingKeyGet</code> method in a fluent style.
   */
  public static class BlocV22ContractsContractNameContractAddressStateMappingKeyGetQueryParams extends HashMap<String, Object> {
    public BlocV22ContractsContractNameContractAddressStateMappingKeyGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get Symbols from contract
   * 
   * @param contractName  (required)
   * @param contractAddress  (required)
   * @param chainid  (optional)
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /bloc/v2.2/contracts/{contractName}/{contractAddress}/symbols?chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<String> blocV22ContractsContractNameContractAddressSymbolsGet(@Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @Param("chainid") String chainid);

  /**
   * Get Symbols from contract
   * 
   * Note, this is equivalent to the other <code>blocV22ContractsContractNameContractAddressSymbolsGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22ContractsContractNameContractAddressSymbolsGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param contractName  (required)
   * @param contractAddress  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return List&lt;String&gt;

   */
  @RequestLine("GET /bloc/v2.2/contracts/{contractName}/{contractAddress}/symbols?chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<String> blocV22ContractsContractNameContractAddressSymbolsGet(@Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22ContractsContractNameContractAddressSymbolsGet</code> method in a fluent style.
   */
  public static class BlocV22ContractsContractNameContractAddressSymbolsGetQueryParams extends HashMap<String, Object> {
    public BlocV22ContractsContractNameContractAddressSymbolsGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get a contract&#x27;s address
   * 
   * @param contractName Name of an existing contract (required)
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /bloc/v2.2/contracts/{contractName}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<String> blocV22ContractsContractNameGet(@Param("contractName") String contractName);
  /**
   * Get a list of all existing contracts
   * 
   * @param chainid  (optional)
   * @return GetContractResponse
   */
  @RequestLine("GET /bloc/v2.2/contracts?chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  GetContractResponse blocV22ContractsGet(@Param("chainid") String chainid);

  /**
   * Get a list of all existing contracts
   * 
   * Note, this is equivalent to the other <code>blocV22ContractsGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22ContractsGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return GetContractResponse

   */
  @RequestLine("GET /bloc/v2.2/contracts?chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  GetContractResponse blocV22ContractsGet(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22ContractsGet</code> method in a fluent style.
   */
  public static class BlocV22ContractsGetQueryParams extends HashMap<String, Object> {
    public BlocV22ContractsGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Post a Xabi Request
   * 
   * @param body  (required)
   * @return PostXabiResponse
   */
  @RequestLine("POST /bloc/v2.2/contracts/xabi")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  PostXabiResponse blocV22ContractsXabiPost(String body);
  /**
   * Search if a contract exists
   * 
   * @param contractName  (required)
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /bloc/v2.2/search/{contractName}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<String> blocV22SearchContractNameGet(@Param("contractName") String contractName);
  /**
   * Call multiple functions from existing conracts
   * 
   * @param body  (required)
   * @param user  (required)
   * @param address  (required)
   * @param chainid  (optional)
   * @param resolve  (optional)
   * @return List&lt;BlocTransactionResult&gt;
   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{address}/callList?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<BlocTransactionResult> blocV22UsersUserAddressCallListPost(PostMethodListRequest body, @Param("user") String user, @Param("address") String address, @Param("chainid") String chainid, @Param("resolve") Boolean resolve);

  /**
   * Call multiple functions from existing conracts
   * 
   * Note, this is equivalent to the other <code>blocV22UsersUserAddressCallListPost</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22UsersUserAddressCallListPostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param user  (required)
   * @param address  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   <li>resolve -  (optional)</li>
   *   </ul>
   * @return List&lt;BlocTransactionResult&gt;

   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{address}/callList?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<BlocTransactionResult> blocV22UsersUserAddressCallListPost(PostMethodListRequest body, @Param("user") String user, @Param("address") String address, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22UsersUserAddressCallListPost</code> method in a fluent style.
   */
  public static class BlocV22UsersUserAddressCallListPostQueryParams extends HashMap<String, Object> {
    public BlocV22UsersUserAddressCallListPostQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
    public BlocV22UsersUserAddressCallListPostQueryParams resolve(final Boolean value) {
      put("resolve", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Create a new contract (non-OAuth nodes)
   * 
   * @param body password: &quot;password of the user creating the contract&quot;
 contract: &quot;name of the contract being created&quot;
 src: &quot;Contract to be uploaded&quot; (required)
   * @param user Username of the user that is creating the contract (required)
   * @param address Address of the user that is creating the contract (required)
   * @param chainid  (optional)
   * @param resolve  (optional)
   * @return BlocTransactionResult
   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{address}/contract?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  BlocTransactionResult blocV22UsersUserAddressContractPost(PostUsersContractRequest body, @Param("user") String user, @Param("address") String address, @Param("chainid") String chainid, @Param("resolve") Boolean resolve);

  /**
   * Create a new contract (non-OAuth nodes)
   * 
   * Note, this is equivalent to the other <code>blocV22UsersUserAddressContractPost</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22UsersUserAddressContractPostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body password: &quot;password of the user creating the contract&quot;
 contract: &quot;name of the contract being created&quot;
 src: &quot;Contract to be uploaded&quot; (required)
   * @param user Username of the user that is creating the contract (required)
   * @param address Address of the user that is creating the contract (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   <li>resolve -  (optional)</li>
   *   </ul>
   * @return BlocTransactionResult

   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{address}/contract?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  BlocTransactionResult blocV22UsersUserAddressContractPost(PostUsersContractRequest body, @Param("user") String user, @Param("address") String address, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22UsersUserAddressContractPost</code> method in a fluent style.
   */
  public static class BlocV22UsersUserAddressContractPostQueryParams extends HashMap<String, Object> {
    public BlocV22UsersUserAddressContractPostQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
    public BlocV22UsersUserAddressContractPostQueryParams resolve(final Boolean value) {
      put("resolve", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Upload a list of contracts. NOTICE, contract source must be uploaded via the &#x60;/compile&#x60; route (or a previous call to &#x60;/contract&#x60;) ahead of time
   * 
   * @param body  (required)
   * @param user Username of the user uploading contracts (required)
   * @param address Address of the user uploading contracts (required)
   * @param chainid  (optional)
   * @param resolve  (optional)
   * @return List&lt;BlocTransactionResult&gt;
   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{address}/uploadList?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<BlocTransactionResult> blocV22UsersUserAddressUploadListPost(UploadListRequest body, @Param("user") String user, @Param("address") String address, @Param("chainid") String chainid, @Param("resolve") Boolean resolve);

  /**
   * Upload a list of contracts. NOTICE, contract source must be uploaded via the &#x60;/compile&#x60; route (or a previous call to &#x60;/contract&#x60;) ahead of time
   * 
   * Note, this is equivalent to the other <code>blocV22UsersUserAddressUploadListPost</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22UsersUserAddressUploadListPostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param user Username of the user uploading contracts (required)
   * @param address Address of the user uploading contracts (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   <li>resolve -  (optional)</li>
   *   </ul>
   * @return List&lt;BlocTransactionResult&gt;

   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{address}/uploadList?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<BlocTransactionResult> blocV22UsersUserAddressUploadListPost(UploadListRequest body, @Param("user") String user, @Param("address") String address, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22UsersUserAddressUploadListPost</code> method in a fluent style.
   */
  public static class BlocV22UsersUserAddressUploadListPostQueryParams extends HashMap<String, Object> {
    public BlocV22UsersUserAddressUploadListPostQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
    public BlocV22UsersUserAddressUploadListPostQueryParams resolve(final Boolean value) {
      put("resolve", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Call a function from an existing contract
   * 
   * @param body  (required)
   * @param user User calling the function (required)
   * @param userAddress Address of the user calling the function (required)
   * @param contractName Name of the contract containing the function being called (required)
   * @param contractAddress Address of the contract containing the function being called (required)
   * @param chainid  (optional)
   * @param resolve  (optional)
   * @return BlocTransactionResult
   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{userAddress}/contract/{contractName}/{contractAddress}/call?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  BlocTransactionResult blocV22UsersUserUserAddressContractContractNameContractAddressCallPost(PostUsersContractMethodRequest body, @Param("user") String user, @Param("userAddress") String userAddress, @Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @Param("chainid") String chainid, @Param("resolve") Boolean resolve);

  /**
   * Call a function from an existing contract
   * 
   * Note, this is equivalent to the other <code>blocV22UsersUserUserAddressContractContractNameContractAddressCallPost</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22UsersUserUserAddressContractContractNameContractAddressCallPostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param user User calling the function (required)
   * @param userAddress Address of the user calling the function (required)
   * @param contractName Name of the contract containing the function being called (required)
   * @param contractAddress Address of the contract containing the function being called (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   <li>resolve -  (optional)</li>
   *   </ul>
   * @return BlocTransactionResult

   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{userAddress}/contract/{contractName}/{contractAddress}/call?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  BlocTransactionResult blocV22UsersUserUserAddressContractContractNameContractAddressCallPost(PostUsersContractMethodRequest body, @Param("user") String user, @Param("userAddress") String userAddress, @Param("contractName") String contractName, @Param("contractAddress") String contractAddress, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22UsersUserUserAddressContractContractNameContractAddressCallPost</code> method in a fluent style.
   */
  public static class BlocV22UsersUserUserAddressContractContractNameContractAddressCallPostQueryParams extends HashMap<String, Object> {
    public BlocV22UsersUserUserAddressContractContractNameContractAddressCallPostQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
    public BlocV22UsersUserUserAddressContractContractNameContractAddressCallPostQueryParams resolve(final Boolean value) {
      put("resolve", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get a list of the existing contracts
   * 
   * @param select Filtering Columns (optional)
   * @param order Ordering (optional)
   * @param range Limiting and Pagination (optional)
   * @param rangeUnit Limiting and Pagination (optional)
   * @param offset Pagination offset (default: 0) (optional)
   * @param limit Pagination limit per page (default: 100) (optional)
   * @param prefer Preference (optional)
   * @return Contract
   */
  @RequestLine("GET /cirrus/search/contract?select={select}&order={order}&offset={offset}&limit={limit}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
    "Range: {range}",
    "Range-Unit: {rangeUnit}",
    "Prefer: {prefer}"
  })
  Contract cirrusSearchContractGet(@Param("select") String select, @Param("order") String order, @Param("range") String range, @Param("rangeUnit") String rangeUnit, @Param("offset") String offset, @Param("limit") String limit, @Param("prefer") String prefer);

  /**
   * Get a list of the existing contracts
   * 
   * Note, this is equivalent to the other <code>cirrusSearchContractGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CirrusSearchContractGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param range Limiting and Pagination (optional)
   * @param rangeUnit Limiting and Pagination (optional)
   * @param prefer Preference (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>select - Filtering Columns (optional)</li>
   *   <li>order - Ordering (optional)</li>
   *   <li>offset - Pagination offset (default: 0) (optional)</li>
   *   <li>limit - Pagination limit per page (default: 100) (optional)</li>
   *   </ul>
   * @return Contract

   */
  @RequestLine("GET /cirrus/search/contract?select={select}&order={order}&offset={offset}&limit={limit}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
      "Range: {range}",
      "Range-Unit: {rangeUnit}",
      "Prefer: {prefer}"
  })
  Contract cirrusSearchContractGet(@Param("range") String range, @Param("rangeUnit") String rangeUnit, @Param("prefer") String prefer, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>cirrusSearchContractGet</code> method in a fluent style.
   */
  public static class CirrusSearchContractGetQueryParams extends HashMap<String, Object> {
    public CirrusSearchContractGetQueryParams select(final String value) {
      put("select", EncodingUtils.encode(value));
      return this;
    }
    public CirrusSearchContractGetQueryParams order(final String value) {
      put("order", EncodingUtils.encode(value));
      return this;
    }
    public CirrusSearchContractGetQueryParams offset(final String value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
    public CirrusSearchContractGetQueryParams limit(final String value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Search if a contract&#x27;s name exists
   * 
   * @param contractName  (required)
   * @param select Filtering Columns (optional)
   * @param order Ordering (optional)
   * @param range Limiting and Pagination (optional)
   * @param rangeUnit Limiting and Pagination (optional)
   * @param offset Pagination offset (default: 0) (optional)
   * @param limit Pagination limit per page (default: 100) (optional)
   * @param prefer Preference (optional)
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /cirrus/search/{contractName}?select={select}&order={order}&offset={offset}&limit={limit}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
    "Range: {range}",
    "Range-Unit: {rangeUnit}",
    "Prefer: {prefer}"
  })
  List<String> cirrusSearchContractNameGet(@Param("contractName") String contractName, @Param("select") String select, @Param("order") String order, @Param("range") String range, @Param("rangeUnit") String rangeUnit, @Param("offset") String offset, @Param("limit") String limit, @Param("prefer") String prefer);

  /**
   * Search if a contract&#x27;s name exists
   * 
   * Note, this is equivalent to the other <code>cirrusSearchContractNameGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CirrusSearchContractNameGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param contractName  (required)
   * @param range Limiting and Pagination (optional)
   * @param rangeUnit Limiting and Pagination (optional)
   * @param prefer Preference (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>select - Filtering Columns (optional)</li>
   *   <li>order - Ordering (optional)</li>
   *   <li>offset - Pagination offset (default: 0) (optional)</li>
   *   <li>limit - Pagination limit per page (default: 100) (optional)</li>
   *   </ul>
   * @return List&lt;String&gt;

   */
  @RequestLine("GET /cirrus/search/{contractName}?select={select}&order={order}&offset={offset}&limit={limit}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
      "Range: {range}",
      "Range-Unit: {rangeUnit}",
      "Prefer: {prefer}"
  })
  List<String> cirrusSearchContractNameGet(@Param("contractName") String contractName, @Param("range") String range, @Param("rangeUnit") String rangeUnit, @Param("prefer") String prefer, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>cirrusSearchContractNameGet</code> method in a fluent style.
   */
  public static class CirrusSearchContractNameGetQueryParams extends HashMap<String, Object> {
    public CirrusSearchContractNameGetQueryParams select(final String value) {
      put("select", EncodingUtils.encode(value));
      return this;
    }
    public CirrusSearchContractNameGetQueryParams order(final String value) {
      put("order", EncodingUtils.encode(value));
      return this;
    }
    public CirrusSearchContractNameGetQueryParams offset(final String value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
    public CirrusSearchContractNameGetQueryParams limit(final String value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Search if a contract&#x27;s history exists
   * 
   * @param contractName  (required)
   * @param select Filtering Columns (optional)
   * @param order Ordering (optional)
   * @param range Limiting and Pagination (optional)
   * @param rangeUnit Limiting and Pagination (optional)
   * @param offset Pagination offset (default: 0) (optional)
   * @param limit Pagination limit per page (default: 100) (optional)
   * @param prefer Preference (optional)
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /cirrus/search/history@{contractName}?select={select}&order={order}&offset={offset}&limit={limit}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
    "Range: {range}",
    "Range-Unit: {rangeUnit}",
    "Prefer: {prefer}"
  })
  List<String> cirrusSearchHistorycontractNameGet(@Param("contractName") String contractName, @Param("select") String select, @Param("order") String order, @Param("range") String range, @Param("rangeUnit") String rangeUnit, @Param("offset") String offset, @Param("limit") String limit, @Param("prefer") String prefer);

  /**
   * Search if a contract&#x27;s history exists
   * 
   * Note, this is equivalent to the other <code>cirrusSearchHistorycontractNameGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CirrusSearchHistorycontractNameGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param contractName  (required)
   * @param range Limiting and Pagination (optional)
   * @param rangeUnit Limiting and Pagination (optional)
   * @param prefer Preference (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>select - Filtering Columns (optional)</li>
   *   <li>order - Ordering (optional)</li>
   *   <li>offset - Pagination offset (default: 0) (optional)</li>
   *   <li>limit - Pagination limit per page (default: 100) (optional)</li>
   *   </ul>
   * @return List&lt;String&gt;

   */
  @RequestLine("GET /cirrus/search/history@{contractName}?select={select}&order={order}&offset={offset}&limit={limit}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
      "Range: {range}",
      "Range-Unit: {rangeUnit}",
      "Prefer: {prefer}"
  })
  List<String> cirrusSearchHistorycontractNameGet(@Param("contractName") String contractName, @Param("range") String range, @Param("rangeUnit") String rangeUnit, @Param("prefer") String prefer, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>cirrusSearchHistorycontractNameGet</code> method in a fluent style.
   */
  public static class CirrusSearchHistorycontractNameGetQueryParams extends HashMap<String, Object> {
    public CirrusSearchHistorycontractNameGetQueryParams select(final String value) {
      put("select", EncodingUtils.encode(value));
      return this;
    }
    public CirrusSearchHistorycontractNameGetQueryParams order(final String value) {
      put("order", EncodingUtils.encode(value));
      return this;
    }
    public CirrusSearchHistorycontractNameGetQueryParams offset(final String value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
    public CirrusSearchHistorycontractNameGetQueryParams limit(final String value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }
}

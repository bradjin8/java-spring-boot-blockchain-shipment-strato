package com.blockchain.shipmentstrato.api.strato;

import com.blockchain.shipmentstrato.api.ApiClient;
import com.blockchain.shipmentstrato.api.EncodingUtils;

import com.blockchain.shipmentstrato.model.strato.Account;
import com.blockchain.shipmentstrato.model.strato.BlocTransactionResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public interface UsersOtherApi extends ApiClient.Api {

  /**
   * Faucet a user&#x27;s account
   * 
   * @param user Username to be fauceted (required)
   * @param address Address of the user to be fauceted (required)
   * @param resolve  (optional)
   * @return BlocTransactionResult
   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{address}/fill?resolve={resolve}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  BlocTransactionResult blocV22UsersUserAddressFillPost(@Param("user") String user, @Param("address") String address, @Param("resolve") Boolean resolve);

  /**
   * Faucet a user&#x27;s account
   * 
   * Note, this is equivalent to the other <code>blocV22UsersUserAddressFillPost</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22UsersUserAddressFillPostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param user Username to be fauceted (required)
   * @param address Address of the user to be fauceted (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>resolve -  (optional)</li>
   *   </ul>
   * @return BlocTransactionResult

   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{address}/fill?resolve={resolve}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  BlocTransactionResult blocV22UsersUserAddressFillPost(@Param("user") String user, @Param("address") String address, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22UsersUserAddressFillPost</code> method in a fluent style.
   */
  public static class BlocV22UsersUserAddressFillPostQueryParams extends HashMap<String, Object> {
    public BlocV22UsersUserAddressFillPostQueryParams resolve(final Boolean value) {
      put("resolve", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get account info
   * Returns account info from given parameters
   * @param address  (optional)
   * @param balance  (optional)
   * @param minbalance  (optional)
   * @param maxbalance  (optional)
   * @param nonce  (optional)
   * @param minnonce  (optional)
   * @param maxnonce  (optional)
   * @param chainid  (optional)
   * @return List&lt;Account&gt;
   */
  @RequestLine("GET /strato-api/eth/v1.2/account?address={address}&balance={balance}&minbalance={minbalance}&maxbalance={maxbalance}&nonce={nonce}&minnonce={minnonce}&maxnonce={maxnonce}&chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<Account> stratoApiEthV12AccountGet(@Param("address") String address, @Param("balance") Integer balance, @Param("minbalance") Integer minbalance, @Param("maxbalance") Integer maxbalance, @Param("nonce") Integer nonce, @Param("minnonce") Integer minnonce, @Param("maxnonce") Integer maxnonce, @Param("chainid") String chainid);

  /**
   * Get account info
   * Returns account info from given parameters
   * Note, this is equivalent to the other <code>stratoApiEthV12AccountGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StratoApiEthV12AccountGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>address -  (optional)</li>
   *   <li>balance -  (optional)</li>
   *   <li>minbalance -  (optional)</li>
   *   <li>maxbalance -  (optional)</li>
   *   <li>nonce -  (optional)</li>
   *   <li>minnonce -  (optional)</li>
   *   <li>maxnonce -  (optional)</li>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return List&lt;Account&gt;

   */
  @RequestLine("GET /strato-api/eth/v1.2/account?address={address}&balance={balance}&minbalance={minbalance}&maxbalance={maxbalance}&nonce={nonce}&minnonce={minnonce}&maxnonce={maxnonce}&chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<Account> stratoApiEthV12AccountGet(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>stratoApiEthV12AccountGet</code> method in a fluent style.
   */
  public static class StratoApiEthV12AccountGetQueryParams extends HashMap<String, Object> {
    public StratoApiEthV12AccountGetQueryParams address(final String value) {
      put("address", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12AccountGetQueryParams balance(final Integer value) {
      put("balance", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12AccountGetQueryParams minbalance(final Integer value) {
      put("minbalance", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12AccountGetQueryParams maxbalance(final Integer value) {
      put("maxbalance", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12AccountGetQueryParams nonce(final Integer value) {
      put("nonce", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12AccountGetQueryParams minnonce(final Integer value) {
      put("minnonce", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12AccountGetQueryParams maxnonce(final Integer value) {
      put("maxnonce", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12AccountGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Faucet a user&#x27;s account
   * 
   * @return List&lt;String&gt;
   */
  @RequestLine("POST /strato-api/eth/v1.2/faucet")
  @Headers({
      "Content-Type: application/x-www-form-urlencoded",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<String> stratoApiEthV12FaucetPost();
}

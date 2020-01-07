package com.blockchain.shipmentstrato.api.strato;

import com.blockchain.shipmentstrato.api.ApiClient;
import com.blockchain.shipmentstrato.api.EncodingUtils;

import com.blockchain.shipmentstrato.model.strato.BlocTransactionResult;
import com.blockchain.shipmentstrato.model.strato.KeyStoreEntry;
import com.blockchain.shipmentstrato.model.strato.PostSendParameters;
import com.blockchain.shipmentstrato.model.strato.PostUsersSendListRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public interface UsersClassicApi extends ApiClient.Api {

  /**
   * Get a list of addresses of all existing users
   * 
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /bloc/v2.2/addresses")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<String> blocV22AddressesGet();
  /**
   * Return a list of all existing users in the node
   * 
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /bloc/v2.2/users")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<String> blocV22UsersGet();
  /**
   * Retrieve encrypted user account information from Bloc for migration between nodes
   * 
   * @param body  (required)
   * @param user  (required)
   * @param address  (required)
   * @return KeyStoreEntry
   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{address}/keystore")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  KeyStoreEntry blocV22UsersUserAddressKeystorePost(String body, @Param("user") String user, @Param("address") String address);
  /**
   * Send wei from one user to another user
   * 
   * @param body toAddress: &quot;address of the user receiving the wei&quot;
 value: &quot;the amount of wei being transferred&quot;
 password: &quot;password of the user sending the wei&quot; (required)
   * @param user Username of the user sending the wei (required)
   * @param address Address of the user that is sending the wei (required)
   * @param chainid  (optional)
   * @param resolve  (optional)
   * @return BlocTransactionResult
   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{address}/send?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  BlocTransactionResult blocV22UsersUserAddressSendPost(PostSendParameters body, @Param("user") String user, @Param("address") String address, @Param("chainid") String chainid, @Param("resolve") Boolean resolve);

  /**
   * Send wei from one user to another user
   * 
   * Note, this is equivalent to the other <code>blocV22UsersUserAddressSendPost</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22UsersUserAddressSendPostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body toAddress: &quot;address of the user receiving the wei&quot;
 value: &quot;the amount of wei being transferred&quot;
 password: &quot;password of the user sending the wei&quot; (required)
   * @param user Username of the user sending the wei (required)
   * @param address Address of the user that is sending the wei (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   <li>resolve -  (optional)</li>
   *   </ul>
   * @return BlocTransactionResult

   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{address}/send?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  BlocTransactionResult blocV22UsersUserAddressSendPost(PostSendParameters body, @Param("user") String user, @Param("address") String address, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22UsersUserAddressSendPost</code> method in a fluent style.
   */
  public static class BlocV22UsersUserAddressSendPostQueryParams extends HashMap<String, Object> {
    public BlocV22UsersUserAddressSendPostQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
    public BlocV22UsersUserAddressSendPostQueryParams resolve(final Boolean value) {
      put("resolve", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get the address of a user
   * Input a username and get the address of the account in return
   * @param user  (required)
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /bloc/v2.2/users/{user}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<String> blocV22UsersUserGet(@Param("user") String user);
  /**
   * Upload encrypted user account information to Bloc for migration between nodes
   * 
   * @param body  (required)
   * @param user  (required)
   * @return Boolean
   */
  @RequestLine("POST /bloc/v2.2/users/{user}/keystore")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Boolean blocV22UsersUserKeystorePost(KeyStoreEntry body, @Param("user") String user);
  /**
   * Create a new user
   * 
   * @param body Enter a password for the new user. Place the password inside quotation marks. Ex: &quot;password&quot;  (required)
   * @param user Enter a username. No quotation marks needed. Ex: user1 (required)
   * @return String
   */
  @RequestLine("POST /bloc/v2.2/users/{user}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  String blocV22UsersUserPost(String body, @Param("user") String user);
  /**
   * Send a list of transfers from one user to others
   * 
   * @param body  (required)
   * @param user  (required)
   * @param userAddress  (required)
   * @param chainid  (optional)
   * @param resolve  (optional)
   * @return List&lt;BlocTransactionResult&gt;
   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{userAddress}/sendList?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<BlocTransactionResult> blocV22UsersUserUserAddressSendListPost(PostUsersSendListRequest body, @Param("user") String user, @Param("userAddress") String userAddress, @Param("chainid") String chainid, @Param("resolve") Boolean resolve);

  /**
   * Send a list of transfers from one user to others
   * 
   * Note, this is equivalent to the other <code>blocV22UsersUserUserAddressSendListPost</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22UsersUserUserAddressSendListPostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param user  (required)
   * @param userAddress  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   <li>resolve -  (optional)</li>
   *   </ul>
   * @return List&lt;BlocTransactionResult&gt;

   */
  @RequestLine("POST /bloc/v2.2/users/{user}/{userAddress}/sendList?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<BlocTransactionResult> blocV22UsersUserUserAddressSendListPost(PostUsersSendListRequest body, @Param("user") String user, @Param("userAddress") String userAddress, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22UsersUserUserAddressSendListPost</code> method in a fluent style.
   */
  public static class BlocV22UsersUserUserAddressSendListPostQueryParams extends HashMap<String, Object> {
    public BlocV22UsersUserUserAddressSendListPostQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
    public BlocV22UsersUserUserAddressSendListPostQueryParams resolve(final Boolean value) {
      put("resolve", EncodingUtils.encode(value));
      return this;
    }
  }
}

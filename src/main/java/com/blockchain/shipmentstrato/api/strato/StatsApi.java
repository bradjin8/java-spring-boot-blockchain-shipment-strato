package com.blockchain.shipmentstrato.api.strato;

import com.blockchain.shipmentstrato.api.ApiClient;
import com.blockchain.shipmentstrato.api.EncodingUtils;

import com.blockchain.shipmentstrato.model.strato.Block;
import com.blockchain.shipmentstrato.model.strato.Difficulty;
import com.blockchain.shipmentstrato.model.strato.GitInfo;
import com.blockchain.shipmentstrato.model.strato.Storage;
import com.blockchain.shipmentstrato.model.strato.TxCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public interface StatsApi extends ApiClient.Api {

  /**
   * Get info about software&#x27;s git commit
   * 
   * @return GitInfo
   */
  @RequestLine("GET /bloc/v2.2/")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8,text/plain;charset&#x3D;utf-8",
  })
  GitInfo blocV22Get();
  /**
   * Get block info
   * Returns block info from given parameters
   * @param number  (optional)
   * @param minnumber  (optional)
   * @param maxnumber  (optional)
   * @param gaslim  (optional)
   * @param mingaslim  (optional)
   * @param maxgaslim  (optional)
   * @param gasused  (optional)
   * @param mingasused  (optional)
   * @param maxgasused  (optional)
   * @param diff  (optional)
   * @param mindiff  (optional)
   * @param maxdiff  (optional)
   * @param txaddress  (optional)
   * @param address  (optional)
   * @param coinbase  (optional)
   * @param hash  (optional)
   * @param chainid  (optional)
   * @return List&lt;Block&gt;
   */
  @RequestLine("GET /strato-api/eth/v1.2/block?number={number}&minnumber={minnumber}&maxnumber={maxnumber}&gaslim={gaslim}&mingaslim={mingaslim}&maxgaslim={maxgaslim}&gasused={gasused}&mingasused={mingasused}&maxgasused={maxgasused}&diff={diff}&mindiff={mindiff}&maxdiff={maxdiff}&txaddress={txaddress}&address={address}&coinbase={coinbase}&hash={hash}&chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<Block> stratoApiEthV12BlockGet(@Param("number") Integer number, @Param("minnumber") Integer minnumber, @Param("maxnumber") Integer maxnumber, @Param("gaslim") Integer gaslim, @Param("mingaslim") Integer mingaslim, @Param("maxgaslim") Integer maxgaslim, @Param("gasused") Integer gasused, @Param("mingasused") Integer mingasused, @Param("maxgasused") Integer maxgasused, @Param("diff") Integer diff, @Param("mindiff") Integer mindiff, @Param("maxdiff") Integer maxdiff, @Param("txaddress") String txaddress, @Param("address") String address, @Param("coinbase") String coinbase, @Param("hash") String hash, @Param("chainid") String chainid);

  /**
   * Get block info
   * Returns block info from given parameters
   * Note, this is equivalent to the other <code>stratoApiEthV12BlockGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StratoApiEthV12BlockGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>number -  (optional)</li>
   *   <li>minnumber -  (optional)</li>
   *   <li>maxnumber -  (optional)</li>
   *   <li>gaslim -  (optional)</li>
   *   <li>mingaslim -  (optional)</li>
   *   <li>maxgaslim -  (optional)</li>
   *   <li>gasused -  (optional)</li>
   *   <li>mingasused -  (optional)</li>
   *   <li>maxgasused -  (optional)</li>
   *   <li>diff -  (optional)</li>
   *   <li>mindiff -  (optional)</li>
   *   <li>maxdiff -  (optional)</li>
   *   <li>txaddress -  (optional)</li>
   *   <li>address -  (optional)</li>
   *   <li>coinbase -  (optional)</li>
   *   <li>hash -  (optional)</li>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return List&lt;Block&gt;

   */
  @RequestLine("GET /strato-api/eth/v1.2/block?number={number}&minnumber={minnumber}&maxnumber={maxnumber}&gaslim={gaslim}&mingaslim={mingaslim}&maxgaslim={maxgaslim}&gasused={gasused}&mingasused={mingasused}&maxgasused={maxgasused}&diff={diff}&mindiff={mindiff}&maxdiff={maxdiff}&txaddress={txaddress}&address={address}&coinbase={coinbase}&hash={hash}&chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<Block> stratoApiEthV12BlockGet(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>stratoApiEthV12BlockGet</code> method in a fluent style.
   */
  public static class StratoApiEthV12BlockGetQueryParams extends HashMap<String, Object> {
    public StratoApiEthV12BlockGetQueryParams number(final Integer value) {
      put("number", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams minnumber(final Integer value) {
      put("minnumber", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams maxnumber(final Integer value) {
      put("maxnumber", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams gaslim(final Integer value) {
      put("gaslim", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams mingaslim(final Integer value) {
      put("mingaslim", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams maxgaslim(final Integer value) {
      put("maxgaslim", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams gasused(final Integer value) {
      put("gasused", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams mingasused(final Integer value) {
      put("mingasused", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams maxgasused(final Integer value) {
      put("maxgasused", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams diff(final Integer value) {
      put("diff", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams mindiff(final Integer value) {
      put("mindiff", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams maxdiff(final Integer value) {
      put("maxdiff", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams txaddress(final String value) {
      put("txaddress", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams address(final String value) {
      put("address", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams coinbase(final String value) {
      put("coinbase", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams hash(final String value) {
      put("hash", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12BlockGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get info of the x most recent blocks
   * Returns block info of x most recent blocks
   * @param integer  (required)
   * @param chainid  (optional)
   * @return List&lt;Block&gt;
   */
  @RequestLine("GET /strato-api/eth/v1.2/block/last/{integer}?chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<Block> stratoApiEthV12BlockLastIntegerGet(@Param("integer") Integer integer, @Param("chainid") String chainid);

  /**
   * Get info of the x most recent blocks
   * Returns block info of x most recent blocks
   * Note, this is equivalent to the other <code>stratoApiEthV12BlockLastIntegerGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StratoApiEthV12BlockLastIntegerGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param integer  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return List&lt;Block&gt;

   */
  @RequestLine("GET /strato-api/eth/v1.2/block/last/{integer}?chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<Block> stratoApiEthV12BlockLastIntegerGet(@Param("integer") Integer integer, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>stratoApiEthV12BlockLastIntegerGet</code> method in a fluent style.
   */
  public static class StratoApiEthV12BlockLastIntegerGetQueryParams extends HashMap<String, Object> {
    public StratoApiEthV12BlockLastIntegerGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get difficulty
   * Returns difficulty
   * @return Difficulty
   */
  @RequestLine("GET /strato-api/eth/v1.2/stats/difficulty")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  Difficulty stratoApiEthV12StatsDifficultyGet();
  /**
   * Get total number of transactions
   * Returns total number of transactions
   * @return TxCount
   */
  @RequestLine("GET /strato-api/eth/v1.2/stats/totaltx")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  TxCount stratoApiEthV12StatsTotaltxGet();
  /**
   * Get storage info
   * Returns storage info
   * @param address  (optional)
   * @param key  (optional)
   * @param minkey  (optional)
   * @param maxkey  (optional)
   * @param value  (optional)
   * @param minvalue  (optional)
   * @param maxvalue  (optional)
   * @param chainid  (optional)
   * @return List&lt;Storage&gt;
   */
  @RequestLine("GET /strato-api/eth/v1.2/storage?address={address}&key={key}&minkey={minkey}&maxkey={maxkey}&value={value}&minvalue={minvalue}&maxvalue={maxvalue}&chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<Storage> stratoApiEthV12StorageGet(@Param("address") String address, @Param("key") Integer key, @Param("minkey") Integer minkey, @Param("maxkey") Integer maxkey, @Param("value") Integer value, @Param("minvalue") Integer minvalue, @Param("maxvalue") Integer maxvalue, @Param("chainid") String chainid);

  /**
   * Get storage info
   * Returns storage info
   * Note, this is equivalent to the other <code>stratoApiEthV12StorageGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StratoApiEthV12StorageGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>address -  (optional)</li>
   *   <li>key -  (optional)</li>
   *   <li>minkey -  (optional)</li>
   *   <li>maxkey -  (optional)</li>
   *   <li>value -  (optional)</li>
   *   <li>minvalue -  (optional)</li>
   *   <li>maxvalue -  (optional)</li>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return List&lt;Storage&gt;

   */
  @RequestLine("GET /strato-api/eth/v1.2/storage?address={address}&key={key}&minkey={minkey}&maxkey={maxkey}&value={value}&minvalue={minvalue}&maxvalue={maxvalue}&chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<Storage> stratoApiEthV12StorageGet(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>stratoApiEthV12StorageGet</code> method in a fluent style.
   */
  public static class StratoApiEthV12StorageGetQueryParams extends HashMap<String, Object> {
    public StratoApiEthV12StorageGetQueryParams address(final String value) {
      put("address", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12StorageGetQueryParams key(final Integer value) {
      put("key", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12StorageGetQueryParams minkey(final Integer value) {
      put("minkey", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12StorageGetQueryParams maxkey(final Integer value) {
      put("maxkey", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12StorageGetQueryParams value(final Integer value) {
      put("value", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12StorageGetQueryParams minvalue(final Integer value) {
      put("minvalue", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12StorageGetQueryParams maxvalue(final Integer value) {
      put("maxvalue", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12StorageGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
}

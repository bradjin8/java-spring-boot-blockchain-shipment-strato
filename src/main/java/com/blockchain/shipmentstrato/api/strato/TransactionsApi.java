package com.blockchain.shipmentstrato.api.strato;

import com.blockchain.shipmentstrato.api.ApiClient;
import com.blockchain.shipmentstrato.api.EncodingUtils;

import com.blockchain.shipmentstrato.model.strato.BatchTransactionResult;
import com.blockchain.shipmentstrato.model.strato.BlocTransactionResult;
import com.blockchain.shipmentstrato.model.strato.PostBlocTransactionRequest;
import com.blockchain.shipmentstrato.model.strato.PostTransaction;
import com.blockchain.shipmentstrato.model.strato.Transaction;
import com.blockchain.shipmentstrato.model.strato.TransactionResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public interface TransactionsApi extends ApiClient.Api {

  /**
   * Post Transaction (token transfer) (non-OAuth nodes)
   * 
   * @param body  (required)
   * @param X_USER_UNIQUE_NAME  (optional)
   * @param X_USER_ID  (optional)
   * @param chainid  (optional)
   * @param resolve  (optional)
   * @return List&lt;BlocTransactionResult&gt;
   */
  @RequestLine("POST /bloc/v2.2/transaction?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8",
    "X-USER-UNIQUE-NAME: {X_USER_UNIQUE_NAME}",
    "X-USER-ID: {X_USER_ID}"
  })
  List<BlocTransactionResult> blocV22TransactionPost(PostBlocTransactionRequest body, @Param("X_USER_UNIQUE_NAME") String X_USER_UNIQUE_NAME, @Param("X_USER_ID") String X_USER_ID, @Param("chainid") String chainid, @Param("resolve") Boolean resolve);

  /**
   * Post Transaction (token transfer) (non-OAuth nodes)
   * 
   * Note, this is equivalent to the other <code>blocV22TransactionPost</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22TransactionPostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param X_USER_UNIQUE_NAME  (optional)
   * @param X_USER_ID  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   <li>resolve -  (optional)</li>
   *   </ul>
   * @return List&lt;BlocTransactionResult&gt;

   */
  @RequestLine("POST /bloc/v2.2/transaction?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8",
      "X-USER-UNIQUE-NAME: {X_USER_UNIQUE_NAME}",
      "X-USER-ID: {X_USER_ID}"
  })
  List<BlocTransactionResult> blocV22TransactionPost(PostBlocTransactionRequest body, @Param("X_USER_UNIQUE_NAME") String X_USER_UNIQUE_NAME, @Param("X_USER_ID") String X_USER_ID, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22TransactionPost</code> method in a fluent style.
   */
  public static class BlocV22TransactionPostQueryParams extends HashMap<String, Object> {
    public BlocV22TransactionPostQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
    public BlocV22TransactionPostQueryParams resolve(final Boolean value) {
      put("resolve", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get the result of a transaction 
   * 
   * @param hash Hash of a transaction (required)
   * @param chainid  (optional)
   * @param resolve  (optional)
   * @return BlocTransactionResult
   */
  @RequestLine("GET /bloc/v2.2/transactions/{hash}/result?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  BlocTransactionResult blocV22TransactionsHashResultGet(@Param("hash") String hash, @Param("chainid") String chainid, @Param("resolve") Boolean resolve);

  /**
   * Get the result of a transaction 
   * 
   * Note, this is equivalent to the other <code>blocV22TransactionsHashResultGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22TransactionsHashResultGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param hash Hash of a transaction (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   <li>resolve -  (optional)</li>
   *   </ul>
   * @return BlocTransactionResult

   */
  @RequestLine("GET /bloc/v2.2/transactions/{hash}/result?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  BlocTransactionResult blocV22TransactionsHashResultGet(@Param("hash") String hash, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22TransactionsHashResultGet</code> method in a fluent style.
   */
  public static class BlocV22TransactionsHashResultGetQueryParams extends HashMap<String, Object> {
    public BlocV22TransactionsHashResultGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
    public BlocV22TransactionsHashResultGetQueryParams resolve(final Boolean value) {
      put("resolve", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get results of multiple transactions
   * 
   * @param body  (required)
   * @param chainid  (optional)
   * @param resolve  (optional)
   * @return List&lt;BlocTransactionResult&gt;
   */
  @RequestLine("POST /bloc/v2.2/transactions/results?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<BlocTransactionResult> blocV22TransactionsResultsPost(List<String> body, @Param("chainid") String chainid, @Param("resolve") Boolean resolve);

  /**
   * Get results of multiple transactions
   * 
   * Note, this is equivalent to the other <code>blocV22TransactionsResultsPost</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlocV22TransactionsResultsPostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   <li>resolve -  (optional)</li>
   *   </ul>
   * @return List&lt;BlocTransactionResult&gt;

   */
  @RequestLine("POST /bloc/v2.2/transactions/results?chainid={chainid}&resolve={resolve}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<BlocTransactionResult> blocV22TransactionsResultsPost(List<String> body, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>blocV22TransactionsResultsPost</code> method in a fluent style.
   */
  public static class BlocV22TransactionsResultsPostQueryParams extends HashMap<String, Object> {
    public BlocV22TransactionsResultsPostQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
    public BlocV22TransactionsResultsPostQueryParams resolve(final Boolean value) {
      put("resolve", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get a transaction
   * Returns summary of transaction
   * @param from  (optional)
   * @param to  (optional)
   * @param address  (optional)
   * @param value  (optional)
   * @param maxvalue  (optional)
   * @param minvalue  (optional)
   * @param gasprice  (optional)
   * @param maxgasprice  (optional)
   * @param mingasprice  (optional)
   * @param gaslimit  (optional)
   * @param maxgaslimit  (optional)
   * @param mingaslimit  (optional)
   * @param blocknumber  (optional)
   * @param hash  (optional)
   * @param chainid  (optional)
   * @return List&lt;Transaction&gt;
   */
  @RequestLine("GET /strato-api/eth/v1.2/transaction?from={from}&to={to}&address={address}&value={value}&maxvalue={maxvalue}&minvalue={minvalue}&gasprice={gasprice}&maxgasprice={maxgasprice}&mingasprice={mingasprice}&gaslimit={gaslimit}&maxgaslimit={maxgaslimit}&mingaslimit={mingaslimit}&blocknumber={blocknumber}&hash={hash}&chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<Transaction> stratoApiEthV12TransactionGet(@Param("from") String from, @Param("to") String to, @Param("address") String address, @Param("value") Integer value, @Param("maxvalue") Integer maxvalue, @Param("minvalue") Integer minvalue, @Param("gasprice") Integer gasprice, @Param("maxgasprice") Integer maxgasprice, @Param("mingasprice") Integer mingasprice, @Param("gaslimit") Integer gaslimit, @Param("maxgaslimit") Integer maxgaslimit, @Param("mingaslimit") Integer mingaslimit, @Param("blocknumber") Integer blocknumber, @Param("hash") String hash, @Param("chainid") String chainid);

  /**
   * Get a transaction
   * Returns summary of transaction
   * Note, this is equivalent to the other <code>stratoApiEthV12TransactionGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StratoApiEthV12TransactionGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>from -  (optional)</li>
   *   <li>to -  (optional)</li>
   *   <li>address -  (optional)</li>
   *   <li>value -  (optional)</li>
   *   <li>maxvalue -  (optional)</li>
   *   <li>minvalue -  (optional)</li>
   *   <li>gasprice -  (optional)</li>
   *   <li>maxgasprice -  (optional)</li>
   *   <li>mingasprice -  (optional)</li>
   *   <li>gaslimit -  (optional)</li>
   *   <li>maxgaslimit -  (optional)</li>
   *   <li>mingaslimit -  (optional)</li>
   *   <li>blocknumber -  (optional)</li>
   *   <li>hash -  (optional)</li>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return List&lt;Transaction&gt;

   */
  @RequestLine("GET /strato-api/eth/v1.2/transaction?from={from}&to={to}&address={address}&value={value}&maxvalue={maxvalue}&minvalue={minvalue}&gasprice={gasprice}&maxgasprice={maxgasprice}&mingasprice={mingasprice}&gaslimit={gaslimit}&maxgaslimit={maxgaslimit}&mingaslimit={mingaslimit}&blocknumber={blocknumber}&hash={hash}&chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<Transaction> stratoApiEthV12TransactionGet(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>stratoApiEthV12TransactionGet</code> method in a fluent style.
   */
  public static class StratoApiEthV12TransactionGetQueryParams extends HashMap<String, Object> {
    public StratoApiEthV12TransactionGetQueryParams from(final String value) {
      put("from", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams to(final String value) {
      put("to", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams address(final String value) {
      put("address", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams value(final Integer value) {
      put("value", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams maxvalue(final Integer value) {
      put("maxvalue", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams minvalue(final Integer value) {
      put("minvalue", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams gasprice(final Integer value) {
      put("gasprice", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams maxgasprice(final Integer value) {
      put("maxgasprice", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams mingasprice(final Integer value) {
      put("mingasprice", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams gaslimit(final Integer value) {
      put("gaslimit", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams maxgaslimit(final Integer value) {
      put("maxgaslimit", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams mingaslimit(final Integer value) {
      put("mingaslimit", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams blocknumber(final Integer value) {
      put("blocknumber", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams hash(final String value) {
      put("hash", EncodingUtils.encode(value));
      return this;
    }
    public StratoApiEthV12TransactionGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get the x most recent transaction
   * Returns x most recent transactions
   * @param integer The amount of the most recent transactions to be returned (required)
   * @param chainid  (optional)
   * @return List&lt;Transaction&gt;
   */
  @RequestLine("GET /strato-api/eth/v1.2/transaction/last/{integer}?chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<Transaction> stratoApiEthV12TransactionLastIntegerGet(@Param("integer") Integer integer, @Param("chainid") String chainid);

  /**
   * Get the x most recent transaction
   * Returns x most recent transactions
   * Note, this is equivalent to the other <code>stratoApiEthV12TransactionLastIntegerGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StratoApiEthV12TransactionLastIntegerGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param integer The amount of the most recent transactions to be returned (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return List&lt;Transaction&gt;

   */
  @RequestLine("GET /strato-api/eth/v1.2/transaction/last/{integer}?chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<Transaction> stratoApiEthV12TransactionLastIntegerGet(@Param("integer") Integer integer, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>stratoApiEthV12TransactionLastIntegerGet</code> method in a fluent style.
   */
  public static class StratoApiEthV12TransactionLastIntegerGetQueryParams extends HashMap<String, Object> {
    public StratoApiEthV12TransactionLastIntegerGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Post a list of transactions
   * NOTE: The transaction must be pre-signed before using this endpoint. R, S, and V should be unique from each other
   * @param body  (required)
   * @return List&lt;String&gt;
   */
  @RequestLine("POST /strato-api/eth/v1.2/transactionList")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<String> stratoApiEthV12TransactionListPost(List<PostTransaction> body);
  /**
   * Post a transaction
   * NOTE: The transaction must be pre-signed before using this endpoint. R, S, and V should be unique from each other
   * @param body  (required)
   * @return String
   */
  @RequestLine("POST /strato-api/eth/v1.2/transaction")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: text/plain;charset&#x3D;utf-8",
  })
  String stratoApiEthV12TransactionPost(PostTransaction body);
  /**
   * See results of multiple transactions
   * 
   * @param body  (required)
   * @param chainid  (optional)
   * @return BatchTransactionResult
   */
  @RequestLine("POST /strato-api/eth/v1.2/transactionResult/batch?chainid={chainid}")
  @Headers({
      "Content-Type: text/plain;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  BatchTransactionResult stratoApiEthV12TransactionResultBatchPost(List<String> body, @Param("chainid") String chainid);

  /**
   * See results of multiple transactions
   * 
   * Note, this is equivalent to the other <code>stratoApiEthV12TransactionResultBatchPost</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StratoApiEthV12TransactionResultBatchPostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return BatchTransactionResult

   */
  @RequestLine("POST /strato-api/eth/v1.2/transactionResult/batch?chainid={chainid}")
  @Headers({
      "Content-Type: text/plain;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  BatchTransactionResult stratoApiEthV12TransactionResultBatchPost(List<String> body, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>stratoApiEthV12TransactionResultBatchPost</code> method in a fluent style.
   */
  public static class StratoApiEthV12TransactionResultBatchPostQueryParams extends HashMap<String, Object> {
    public StratoApiEthV12TransactionResultBatchPostQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get the transaction result using a particular hash
   * Returns transaction info from a given hash
   * @param hash  (required)
   * @param chainid  (optional)
   * @return List&lt;TransactionResult&gt;
   */
  @RequestLine("GET /strato-api/eth/v1.2/transactionResult/{hash}?chainid={chainid}")
  @Headers({
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<TransactionResult> stratoApiEthV12TransactionResultHashGet(@Param("hash") String hash, @Param("chainid") String chainid);

  /**
   * Get the transaction result using a particular hash
   * Returns transaction info from a given hash
   * Note, this is equivalent to the other <code>stratoApiEthV12TransactionResultHashGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StratoApiEthV12TransactionResultHashGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param hash  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>chainid -  (optional)</li>
   *   </ul>
   * @return List&lt;TransactionResult&gt;

   */
  @RequestLine("GET /strato-api/eth/v1.2/transactionResult/{hash}?chainid={chainid}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<TransactionResult> stratoApiEthV12TransactionResultHashGet(@Param("hash") String hash, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>stratoApiEthV12TransactionResultHashGet</code> method in a fluent style.
   */
  public static class StratoApiEthV12TransactionResultHashGetQueryParams extends HashMap<String, Object> {
    public StratoApiEthV12TransactionResultHashGetQueryParams chainid(final String value) {
      put("chainid", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Post Transaction (create contract, function call, token transfer) (OAuth nodes)
   * 
   * @param body  (required)
   * @param resolve  (optional)
   * @return List&lt;BlocTransactionResult&gt;
   */
  @RequestLine("POST /strato/v2.3/transaction?resolve={resolve}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<BlocTransactionResult> stratoV23TransactionPost(PostBlocTransactionRequest body, @Param("resolve") Boolean resolve);

  /**
   * Post Transaction (create contract, function call, token transfer) (OAuth nodes)
   * 
   * Note, this is equivalent to the other <code>stratoV23TransactionPost</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StratoV23TransactionPostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>resolve -  (optional)</li>
   *   </ul>
   * @return List&lt;BlocTransactionResult&gt;

   */
  @RequestLine("POST /strato/v2.3/transaction?resolve={resolve}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8",
  })
  List<BlocTransactionResult> stratoV23TransactionPost(PostBlocTransactionRequest body, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>stratoV23TransactionPost</code> method in a fluent style.
   */
  public static class StratoV23TransactionPostQueryParams extends HashMap<String, Object> {
    public StratoV23TransactionPostQueryParams resolve(final Boolean value) {
      put("resolve", EncodingUtils.encode(value));
      return this;
    }
  }
}

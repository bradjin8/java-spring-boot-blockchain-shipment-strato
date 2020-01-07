/*
 * STRATO API
 * This Swagger interactive documentation makes STRATO API calls to OAuth-protected STRATO demo node. Click 'Authorize' to sign-in with the test account.
 *
 * OpenAPI spec version: 4.5.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.blockchain.shipmentstrato.model.strato;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Transaction Parameters
 */
@Schema(description = "Transaction Parameters")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public class TransactionParameters {

  @JsonProperty("gasLimit")

  private Integer gasLimit = null;

  @JsonProperty("gasPrice")

  private Integer gasPrice = null;

  @JsonProperty("nonce")

  private Integer nonce = null;
  public TransactionParameters gasLimit(Integer gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

  

  /**
  * Get gasLimit
  * minimum: 0
  * maximum: 384
  * @return gasLimit
  **/
  @Schema(description = "")
  public Integer getGasLimit() {
    return gasLimit;
  }
  public void setGasLimit(Integer gasLimit) {
    this.gasLimit = gasLimit;
  }
  public TransactionParameters gasPrice(Integer gasPrice) {
    this.gasPrice = gasPrice;
    return this;
  }

  

  /**
  * Get gasPrice
  * minimum: 0
  * maximum: 384
  * @return gasPrice
  **/
  @Schema(description = "")
  public Integer getGasPrice() {
    return gasPrice;
  }
  public void setGasPrice(Integer gasPrice) {
    this.gasPrice = gasPrice;
  }
  public TransactionParameters nonce(Integer nonce) {
    this.nonce = nonce;
    return this;
  }

  

  /**
  * Get nonce
  * minimum: 0
  * maximum: 384
  * @return nonce
  **/
  @Schema(description = "")
  public Integer getNonce() {
    return nonce;
  }
  public void setNonce(Integer nonce) {
    this.nonce = nonce;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionParameters transactionParameters = (TransactionParameters) o;
    return Objects.equals(this.gasLimit, transactionParameters.gasLimit) &&
        Objects.equals(this.gasPrice, transactionParameters.gasPrice) &&
        Objects.equals(this.nonce, transactionParameters.nonce);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gasLimit, gasPrice, nonce);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionParameters {\n");
    
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
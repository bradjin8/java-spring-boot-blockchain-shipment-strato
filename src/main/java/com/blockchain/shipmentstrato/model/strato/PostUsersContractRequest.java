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
import com.blockchain.shipmentstrato.model.strato.TransactionParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Post Users Contract Request
 */
@Schema(description = "Post Users Contract Request")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public class PostUsersContractRequest {

  @JsonProperty("src")

  private String src = null;

  @JsonProperty("password")

  private String password = null;

  @JsonProperty("contract")

  private String contract = null;

  @JsonProperty("args")

  private Map<String, String> args = null;

  @JsonProperty("txParams")

  private TransactionParameters txParams = null;

  @JsonProperty("value")

  private String value = null;

  @JsonProperty("metadata")

  private Map<String, String> metadata = null;
  public PostUsersContractRequest src(String src) {
    this.src = src;
    return this;
  }

  

  /**
  * Solidity source code
  * @return src
  **/
  @Schema(required = true, description = "Solidity source code")
  public String getSrc() {
    return src;
  }
  public void setSrc(String src) {
    this.src = src;
  }
  public PostUsersContractRequest password(String password) {
    this.password = password;
    return this;
  }

  

  /**
  * Get password
  * @return password
  **/
  @Schema(required = true, description = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public PostUsersContractRequest contract(String contract) {
    this.contract = contract;
    return this;
  }

  

  /**
  * Contract name
  * @return contract
  **/
  @Schema(description = "Contract name")
  public String getContract() {
    return contract;
  }
  public void setContract(String contract) {
    this.contract = contract;
  }
  public PostUsersContractRequest args(Map<String, String> args) {
    this.args = args;
    return this;
  }

  
  public PostUsersContractRequest putArgsItem(String key, String argsItem) {
    if (this.args == null) {
      this.args = new HashMap<>();
    }
    this.args.put(key, argsItem);
    return this;
  }
  /**
  * Get args
  * @return args
  **/
  @Schema(description = "")
  public Map<String, String> getArgs() {
    return args;
  }
  public void setArgs(Map<String, String> args) {
    this.args = args;
  }
  public PostUsersContractRequest txParams(TransactionParameters txParams) {
    this.txParams = txParams;
    return this;
  }

  

  /**
  * Get txParams
  * @return txParams
  **/
  @Schema(description = "")
  public TransactionParameters getTxParams() {
    return txParams;
  }
  public void setTxParams(TransactionParameters txParams) {
    this.txParams = txParams;
  }
  public PostUsersContractRequest value(String value) {
    this.value = value;
    return this;
  }

  

  /**
  * Contract value in Eth
  * @return value
  **/
  @Schema(description = "Contract value in Eth")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }
  public PostUsersContractRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  
  public PostUsersContractRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }
  /**
  * Get metadata
  * @return metadata
  **/
  @Schema(description = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUsersContractRequest postUsersContractRequest = (PostUsersContractRequest) o;
    return Objects.equals(this.src, postUsersContractRequest.src) &&
        Objects.equals(this.password, postUsersContractRequest.password) &&
        Objects.equals(this.contract, postUsersContractRequest.contract) &&
        Objects.equals(this.args, postUsersContractRequest.args) &&
        Objects.equals(this.txParams, postUsersContractRequest.txParams) &&
        Objects.equals(this.value, postUsersContractRequest.value) &&
        Objects.equals(this.metadata, postUsersContractRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(src, password, contract, args, txParams, value, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUsersContractRequest {\n");
    
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    txParams: ").append(toIndentedString(txParams)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

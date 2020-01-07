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
import com.blockchain.shipmentstrato.model.strato.UploadListContract;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

/**
 * Make a request to upload a list of contracts
 */
@Schema(description = "Make a request to upload a list of contracts")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public class UploadListRequest {

  @JsonProperty("password")

  private String password = null;

  @JsonProperty("contracts")

  private List<UploadListContract> contracts = new ArrayList<>();

  @JsonProperty("resolve")

  private Boolean resolve = null;
  public UploadListRequest password(String password) {
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
  public UploadListRequest contracts(List<UploadListContract> contracts) {
    this.contracts = contracts;
    return this;
  }

  public UploadListRequest addContractsItem(UploadListContract contractsItem) {
    this.contracts.add(contractsItem);
    return this;
  }

  /**
  * Get contracts
  * @return contracts
  **/
  @Schema(required = true, description = "")
  public List<UploadListContract> getContracts() {
    return contracts;
  }
  public void setContracts(List<UploadListContract> contracts) {
    this.contracts = contracts;
  }
  public UploadListRequest resolve(Boolean resolve) {
    this.resolve = resolve;
    return this;
  }

  

  /**
  * Get resolve
  * @return resolve
  **/
  @Schema(required = true, description = "")
  public Boolean isResolve() {
    return resolve;
  }
  public void setResolve(Boolean resolve) {
    this.resolve = resolve;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadListRequest uploadListRequest = (UploadListRequest) o;
    return Objects.equals(this.password, uploadListRequest.password) &&
        Objects.equals(this.contracts, uploadListRequest.contracts) &&
        Objects.equals(this.resolve, uploadListRequest.resolve);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, contracts, resolve);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadListRequest {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
    sb.append("    resolve: ").append(toIndentedString(resolve)).append("\n");
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

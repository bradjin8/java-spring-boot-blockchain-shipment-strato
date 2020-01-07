package com.blockchain.shipmentstrato.model;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class ShipmentItem implements Serializable {

	private static final long serialVersionUID = 1L;

	private String batchId;
	private String quantity;
	private String productId;
	private String productName;
	private String variety;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	@DynamoDBAttribute
	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	@DynamoDBAttribute
	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@DynamoDBAttribute
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@DynamoDBAttribute
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@DynamoDBAttribute
	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}
}
package com.blockchain.shipmentstrato.repository;

import java.util.HashMap;
import java.util.Map;

import com.blockchain.shipmentstrato.model.Shipment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.ConditionalCheckFailedException;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;

@Repository
public class ShipmentRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(ShipmentRepository.class);

	@Autowired
	private DynamoDBMapper mapper;

	public void insertIntoDynamoDB(Shipment shipment) {
		mapper.save(shipment);
	}

	public Shipment getOneStudentDetails(String studentId, String lastName) {
		return mapper.load(Shipment.class, studentId, lastName);
	}

	public void updateStudentDetails(Shipment shipment) {
		try {
			mapper.save(shipment, buildDynamoDBSaveExpression(shipment));
		} catch (ConditionalCheckFailedException exception) {
			LOGGER.error("invalid data - " + exception.getMessage());
		}
	}

	public void deleteStudentDetails(Shipment shipment) {
		mapper.delete(shipment);
	}

	public DynamoDBSaveExpression buildDynamoDBSaveExpression(Shipment shipment) {
		DynamoDBSaveExpression saveExpression = new DynamoDBSaveExpression();
		Map<String, ExpectedAttributeValue> expected = new HashMap<>();
		expected.put("studentId", new ExpectedAttributeValue(new AttributeValue(shipment.getShipmentId()))
				.withComparisonOperator(ComparisonOperator.EQ));
		saveExpression.setExpected(expected);
		return saveExpression;
	}
}
package com.blockchain.shipmentstrato.config;

import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.blockchain.shipmentstrato.model.Shipment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Configuration
public class DynamoDbConfig {

	@Value("${amazon.access.key}")
	private String awsAccessKey;

	@Value("${amazon.access.secret-key}")
	private String awsSecretKey;

	@Value("${amazon.region}")
	private String awsRegion;

	@Value("${amazon.end-point.url}")
	private String awsDynamoDBEndPoint;

	@Bean
	public DynamoDBMapper mapper() {
		AmazonDynamoDB amazonDynamoDB = amazonDynamoDBConfig();
		DynamoDBMapper mapper = new DynamoDBMapper(amazonDynamoDB);
		CreateTableRequest tableRequest = mapper.generateCreateTableRequest(Shipment.class);
		tableRequest.setProvisionedThroughput(new ProvisionedThroughput(1L, 1L));
		try {
			amazonDynamoDB.createTable(tableRequest);
		} catch (Exception e) {
			System.out.println("Exception Handling " + e.getLocalizedMessage());
		}

		return mapper;
	}

	public AmazonDynamoDB amazonDynamoDBConfig() {
		return AmazonDynamoDBClientBuilder.standard()
				.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(awsDynamoDBEndPoint, awsRegion))
				.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(awsAccessKey, awsSecretKey)))
				.build();
	}
}
package com.difelix.pocdynamodbmovies.config

import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.client.builder.AwsClientBuilder
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableDynamoDBRepositories
class DynamoDBConfig {

   @Value("\${amazon.dynamodb.endpoint}")
   lateinit var endpoint: String

   @Value("\${amazon.dynamodb.accesskey}")
   lateinit var accesskey: String

   @Value("\${amazon.dynamodb.secretkey}")
   lateinit var secretkey: String

   @Value("\${amazon.dynamodb.region}")
   lateinit var region: String

   @Bean
   fun dynamoDBMapper() = DynamoDBMapper(amazonDynamoDB())

   @Bean
   fun amazonDynamoDB() = AmazonDynamoDBClientBuilder.standard()
      .withCredentials(AWSStaticCredentialsProvider(BasicAWSCredentials(accesskey, secretkey)))
      .withEndpointConfiguration(AwsClientBuilder.EndpointConfiguration(endpoint, region))
      .build()
}
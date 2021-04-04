package com.difelix.pocdynamodbmovies.models

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable
import java.util.*

@DynamoDBTable(tableName = "Movie")
data class Movie(

   @DynamoDBHashKey
   var id: String? = UUID.randomUUID().toString(),

   @DynamoDBAttribute
   var name: String,

   @DynamoDBAttribute
   var releaseYear: Int,

   @DynamoDBAttribute
   var description: String,

   @DynamoDBAttribute
   var mainActors: List<String>,

   @DynamoDBAttribute
   var producer: String

)

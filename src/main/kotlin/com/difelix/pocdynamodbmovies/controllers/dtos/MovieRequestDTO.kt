package com.difelix.pocdynamodbmovies.controllers.dtos

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class MovieRequestDTO(

   var name: String,
   var releaseYear: Int,
   var description: String,
   var mainActors: List<String>,
   var producer: String

)

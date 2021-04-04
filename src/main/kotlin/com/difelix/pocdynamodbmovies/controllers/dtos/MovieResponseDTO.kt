package com.difelix.pocdynamodbmovies.controllers.dtos

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class MovieResponseDTO(

   var id: String,
   var name: String,
   var releaseYear: Int,
   var description: String,
   var mainActors: List<String>,
   var producer: String

)

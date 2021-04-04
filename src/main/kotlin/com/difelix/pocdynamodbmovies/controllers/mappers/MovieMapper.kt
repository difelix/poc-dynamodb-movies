package com.difelix.pocdynamodbmovies.controllers.mappers

import com.difelix.pocdynamodbmovies.controllers.dtos.MovieRequestDTO
import com.difelix.pocdynamodbmovies.controllers.dtos.MovieResponseDTO
import com.difelix.pocdynamodbmovies.models.Movie

fun MovieRequestDTO.toEntity() = Movie(
   name = name,
   description = description,
   releaseYear = releaseYear,
   mainActors = mainActors,
   producer = producer
)

fun Movie.toResponse() = MovieResponseDTO(
   id = id!!,
   name = name,
   description = description,
   releaseYear = releaseYear,
   mainActors = mainActors,
   producer = producer
)
package com.difelix.pocdynamodbmovies.repositories.impl

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper
import com.difelix.pocdynamodbmovies.models.Movie
import com.difelix.pocdynamodbmovies.repositories.MovieRepository
import org.springframework.stereotype.Repository

@Repository
class MovieRepositoryImpl(private val dynamoDBMapper: DynamoDBMapper) : MovieRepository {

   override fun save(movie: Movie): Movie {
      dynamoDBMapper.save(movie)
      return movie
   }

}
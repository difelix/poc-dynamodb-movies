package com.difelix.pocdynamodbmovies.services

import com.difelix.pocdynamodbmovies.models.Movie
import com.difelix.pocdynamodbmovies.repositories.MovieRepository
import org.springframework.stereotype.Service

@Service
class MovieService(private val movieRepository: MovieRepository) {

   fun save(movie: Movie) = movieRepository.save(movie)

}
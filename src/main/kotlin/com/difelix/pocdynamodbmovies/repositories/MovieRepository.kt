package com.difelix.pocdynamodbmovies.repositories

import com.difelix.pocdynamodbmovies.models.Movie

interface MovieRepository {

   fun save(movie: Movie) : Movie

}
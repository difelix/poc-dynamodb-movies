package com.difelix.pocdynamodbmovies.controllers

import com.difelix.pocdynamodbmovies.controllers.dtos.MovieRequestDTO
import com.difelix.pocdynamodbmovies.controllers.dtos.MovieResponseDTO
import com.difelix.pocdynamodbmovies.controllers.mappers.toEntity
import com.difelix.pocdynamodbmovies.controllers.mappers.toResponse
import com.difelix.pocdynamodbmovies.services.MovieService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/movies")
class MovieController(private val movieService: MovieService) {

   @PostMapping
   @ResponseBody
   @ResponseStatus(HttpStatus.CREATED)
   fun save(@RequestBody movieRequestDTO: MovieRequestDTO) : MovieResponseDTO {
      val movieSaved = movieService.save(movieRequestDTO.toEntity())
      return movieSaved.toResponse()
   }

}
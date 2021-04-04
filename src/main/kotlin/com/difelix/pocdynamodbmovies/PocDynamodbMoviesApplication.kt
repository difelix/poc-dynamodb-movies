package com.difelix.pocdynamodbmovies

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocDynamodbMoviesApplication

fun main(args: Array<String>) {
	runApplication<PocDynamodbMoviesApplication>(*args)
}

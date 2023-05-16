package com.cloud.sleuth.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/movie")
class MovieController(
    @Autowired val log: Logger = LoggerFactory.getLogger("MovieController")
) {

    @GetMapping("/")
    fun getMovie(): String{
        log.info( "getMovie call" )
        return "IRON MAN"
    }
}
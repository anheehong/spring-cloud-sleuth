package com.cloud.sleuth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudSleuthApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudSleuthApplication>(*args)
}

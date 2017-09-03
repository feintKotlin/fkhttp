package com.feint.simplehttpserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SimpleHttpServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(SimpleHttpServerApplication::class.java, *args)
}

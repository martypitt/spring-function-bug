package com.orbitalhq.bug

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class FunctionalApp {

    @Bean
    fun kotlinFunction(): (String) -> String {
        return { it.toUpperCase() }
    }
}

fun main(args: Array<String>) {
    runApplication<FunctionalApp>()
}
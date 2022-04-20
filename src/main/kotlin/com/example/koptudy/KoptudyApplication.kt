package com.example.koptudy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
class KoptudyApplication

fun main(args: Array<String>) {
    runApplication<KoptudyApplication>(*args)
}

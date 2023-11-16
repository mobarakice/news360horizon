package com.news360horizon.news360horizon

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EntityScan(basePackages = ["com.news360horizon.news360horizon.database"])
@EnableJpaRepositories(basePackages = ["com.news360horizon.news360horizon.database"])
@ComponentScan(basePackages = [
    "com.news360horizon.news360horizon",
    "com.news360horizon.news360horizon.service"
    ]
)
@EnableAutoConfiguration
class News360horizonApplication

fun main(args: Array<String>) {
    runApplication<News360horizonApplication>(*args)
}

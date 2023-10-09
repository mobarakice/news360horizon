package com.news360horizon.news360horizon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EntityScan(basePackages = ["com.news360horizon.news360horizon.data.entity"])
@EnableJpaRepositories(basePackages = ["com.news360horizon.news360horizon.data.repository"])
class News360horizonApplication

fun main(args: Array<String>) {
    runApplication<News360horizonApplication>(*args)
}

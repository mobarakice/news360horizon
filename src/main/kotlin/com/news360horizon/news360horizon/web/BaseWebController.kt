package com.news360horizon.news360horizon.web

import com.news360horizon.news360horizon.data.repository.UserRepository
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@EnableWebMvc
open class BaseWebController(protected val repository: UserRepository) : WebMvcConfigurer {

    private val CLASSPATH_RESOURCE_LOCATIONS = arrayOf(
        "classpath:/META-INF/resources/",
        "classpath:/resources/",
        "classpath:/static/",
        "classpath:/public/"
    )

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("/**")
            .addResourceLocations(*CLASSPATH_RESOURCE_LOCATIONS)
    }

}
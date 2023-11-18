package com.news360horizon.news360horizon.web

import com.news360horizon.news360horizon.database.user.UserRepository
import com.news360horizon.news360horizon.service.UserService
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


//@EnableWebMvc
//open class BaseWebController(protected val userService: UserService) : WebMvcConfigurer {
//
//    private val CLASSPATH_RESOURCE_LOCATIONS = arrayOf(
//        "classpath:/META-INF/resources/",
//        "classpath:/resources/",
//        "classpath:/static/",
//        "classpath:/public/"
//    )
//
//    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
//        registry.addResourceHandler("/**")
//            .addResourceLocations(*CLASSPATH_RESOURCE_LOCATIONS)
//    }
//
//}
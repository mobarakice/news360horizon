package com.news360horizon.news360horizon.controller

import com.news360horizon.news360horizon.service.UserService
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController(private val service: UserService) {
}
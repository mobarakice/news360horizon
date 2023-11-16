package com.news360horizon.news360horizon.controller

import com.news360horizon.news360horizon.service.UserService
import com.news360horizon.news360horizon.utility.PageUrls
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController(service: UserService) {
    @RequestMapping("/api/success", method = [RequestMethod.GET])
    fun loginSucces(): String{
        return "Welcome to news360horizon"
    }

    @RequestMapping(value = [PageUrls.HOME_PAGE], method = [RequestMethod.GET])
    fun home(): String {
        return """
            {
                "result": "Ok",
                "message": "Login successful"
            }
        """.trimIndent()
    }
}
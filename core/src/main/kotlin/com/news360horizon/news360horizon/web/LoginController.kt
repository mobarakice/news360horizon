package com.news360horizon.news360horizon.web

import com.news360horizon.news360horizon.service.UserService
import com.news360horizon.news360horizon.utility.PageUrls.ADMIN_LOGIN_PAGE
import com.news360horizon.news360horizon.utility.PageUrls.HOME_PAGE
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@Controller
@EnableWebMvc
class LoginController(private val repository: UserService): WebMvcConfigurer {

    @RequestMapping(value = ["/", ADMIN_LOGIN_PAGE], method = [RequestMethod.GET])
    fun login(): ModelAndView {
        val modelAndView = ModelAndView()
        modelAndView.viewName = "login"
        return modelAndView
    }
}
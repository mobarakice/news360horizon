package com.news360horizon.news360horizon.web

import com.news360horizon.news360horizon.data.repository.UserRepository
import com.news360horizon.news360horizon.utility.PageUrls.ADMIN_LOGIN_PAGE
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.config.annotation.EnableWebMvc


@Controller
@EnableWebMvc
class LoginController(repository: UserRepository) : BaseWebController(repository) {

    @RequestMapping(value = ["/", ADMIN_LOGIN_PAGE], method = [RequestMethod.GET])
    fun loginPage() = ModelAndView().apply {
           viewName = "login"
       }
}
package com.news360horizon.news360horizon.web

import com.news360horizon.news360horizon.service.UserService
import com.news360horizon.news360horizon.utility.PageUrls.ADMIN_LOGIN_PAGE
import com.news360horizon.news360horizon.utility.PageUrls.HOME_PAGE
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.config.annotation.EnableWebMvc


@Controller
@EnableWebMvc
class LoginController(private val service: UserService): BaseWebController(service) {

    @RequestMapping(value = ["/", ADMIN_LOGIN_PAGE], method = [RequestMethod.GET])
    fun login(): ModelAndView {
        val modelAndView = ModelAndView()
        modelAndView.viewName = "login"
        return modelAndView
    }

//    @RequestMapping(value = [FORGET_PASSWORD_PAGE], method = [RequestMethod.GET])
//    fun forgotPassword(): ModelAndView {
//        val modelAndView = ModelAndView()
//        modelAndView.viewName = "forgot-password"
//        return modelAndView
//    }
//
//
//    @RequestMapping(value = [ADMIN_REGISTRATION_PAGE], method = [RequestMethod.GET])
//    fun registration(): ModelAndView {
//        val modelAndView = ModelAndView()
//        val admin = Admin()
//        modelAndView.addObject("admin", admin)
//        modelAndView.viewName = "admin/registration"
//        return modelAndView
//    }
//
//    @RequestMapping(value = [ADMIN_REGISTRATION_PAGE], method = [RequestMethod.POST])
//    fun createNewUser(@Valid admin: Admin, bindingResult: BindingResult): ModelAndView {
//        val modelAndView = ModelAndView()
//        val userExists: Admin = userService.findUserByEmail(admin.getEmail())
//        if (userExists != null) {
//            bindingResult
//                .rejectValue(
//                    "email", "error.admin",
//                    "There is already registered an admin with the email provided"
//                )
//        }
//        if (bindingResult.hasErrors()) {
//            modelAndView.viewName = "admin/registration"
//        } else {
//            try {
//                userService.insert(admin)
//            } catch (e: Exception) {
//                e.printStackTrace()
//            }
//            modelAndView.addObject("successMessage", "Admin has been registered successfully")
//            modelAndView.addObject("admin", Admin())
//            modelAndView.viewName = "admin/registration"
//        }
//        return modelAndView
//    }
//
//    @RequestMapping(value = [CHANGED_PASSWORD_PAGE], method = [RequestMethod.GET])
//    fun getChangePassword(): ModelAndView {
//        val modelAndView = ModelAndView()
//        modelAndView.addObject("changePassword", ChangePassword())
//        modelAndView.viewName = "admin/change-password"
//        return modelAndView
//    }
//
//    @RequestMapping(value = [CHANGED_PASSWORD_PAGE], method = [RequestMethod.POST])
//    fun updatePassword(@Valid changePassword: ChangePassword, bindingResult: BindingResult): ModelAndView {
//        val modelAndView = ModelAndView()
//        val auth = SecurityContextHolder.getContext().authentication
//        val user: Admin = userService.findUserByEmail(auth.name)
//        if (user == null) {
//            modelAndView.viewName = "access-denied"
//            return modelAndView
//        }
//        if (!changePassword.getNewPassWord().equals(changePassword.getConfirmNewPassword())) {
//            bindingResult
//                .rejectValue(
//                    "confirmNewPassword", "error.changePassword",
//                    "*New password and confirm new password does not match"
//                )
//        }
//        if (bindingResult.hasErrors()) {
//            modelAndView.viewName = "admin/change-password"
//        } else {
//            val index: Long =
//                userService.changePassword(user.getId(), user.getPassword(), changePassword.getNewPassWord())
//            if (index <= 0) {
//                modelAndView.addObject("successMessage", "Password change failed")
//                modelAndView.addObject("changePassword", changePassword)
//                modelAndView.viewName = "admin/change-password"
//            } else {
//                modelAndView.addObject("successMessage", "Password has been updated successfully")
//                modelAndView.addObject("changePassword", ChangePassword())
//                modelAndView.viewName = "admin/change-password"
//            }
//        }
//        return modelAndView
//    }

    @RequestMapping(value = [HOME_PAGE], method = [RequestMethod.GET])
    fun home(): ModelAndView {
        val modelAndView = ModelAndView()
        val auth = SecurityContextHolder.getContext().authentication
        val user = service.findUserByEmail(auth.name)
        modelAndView.addObject("admin", user)
        modelAndView.viewName = "home"
        return modelAndView
    }
}
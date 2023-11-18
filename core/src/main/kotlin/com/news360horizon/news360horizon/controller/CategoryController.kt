//package com.news360horizon.news360horizon.controller
//
//import com.news360horizon.news360horizon.service.CategoryService
//import com.news360horizon.news360horizon.service.UserService
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RequestMethod
//import org.springframework.web.bind.annotation.RestController
//
//
//@RestController
//class CategoryController(@Autowired private val service: CategoryService) {
//    @RequestMapping("/api/category", method = [RequestMethod.GET])
//    fun categorySucces(): String{
//        return service.findCategoryByIsActiveOrderByIdDesc(true).toString()
//    }
//}
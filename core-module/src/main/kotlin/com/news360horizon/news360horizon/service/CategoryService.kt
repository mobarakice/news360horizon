//package com.news360horizon.news360horizon.service
//
//import com.news360horizon.news360horizon.database.category.CategoryEntity
//import com.news360horizon.news360horizon.database.category.CategoryRepository
//import com.news360horizon.news360horizon.database.category.CustomizedCategoryRepository
//import com.news360horizon.news360horizon.database.language.LanguageEntity
//import org.springframework.stereotype.Service
//
//interface CategoryService : CustomizedCategoryRepository{
//
//}
//
//@Service
//class CategoryServiceImpl(private val repository: CategoryRepository) : CustomizedCategoryRepository {
//    override fun findCategoryByIsActiveOrderByIdDesc(isActive: Boolean): List<CategoryEntity> {
//        return repository.findCategoryByIsActiveOrderByIdDesc(isActive)
//    }
//
//    override fun findCategoryByIsActiveAndLanguageOrderByIdDesc(
//        isActive: Boolean,
//        language: LanguageEntity
//    ): List<CategoryEntity> {
//        return repository.findCategoryByIsActiveAndLanguageOrderByIdDesc(isActive, language)
//    }
//
//    override fun findCategoryByLanguageOrderByIdDesc(language: LanguageEntity): List<CategoryEntity> {
//        return repository.findCategoryByLanguageOrderByIdDesc(language)
//    }
//
//}
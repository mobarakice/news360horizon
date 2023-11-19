package com.news360horizon.news360horizon.service

import com.news360horizon.news360horizon.database.category.CategoryEntity
import com.news360horizon.news360horizon.database.category.CategoryRepository
import com.news360horizon.news360horizon.database.language.LanguageEntity
import org.springframework.stereotype.Service

interface CategoryService {
    fun findByIsActiveOrderByIdDesc(isActive: Boolean): List<CategoryEntity>
    fun findByIsActiveAndLanguageOrderByIdDesc(
        isActive: Boolean,
        language: LanguageEntity
    ): List<CategoryEntity>

    fun findByLanguageOrderByIdDesc(language: LanguageEntity): List<CategoryEntity>
}

@Service
class CategoryServiceImpl(private val repository: CategoryRepository): CategoryService {
    override fun findByIsActiveOrderByIdDesc(isActive: Boolean): List<CategoryEntity> {
        return repository.findByIsActiveOrderByIdDesc(isActive)
    }

    override fun findByIsActiveAndLanguageOrderByIdDesc(
        isActive: Boolean,
        language: LanguageEntity
    ): List<CategoryEntity> {
        return repository.findByIsActiveAndLanguageOrderByIdDesc(isActive, language)
    }

    override fun findByLanguageOrderByIdDesc(language: LanguageEntity): List<CategoryEntity> {
        return repository.findByLanguageOrderByIdDesc(language)
    }

}
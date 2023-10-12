package com.news360horizon.news360horizon.database.category

import com.news360horizon.news360horizon.database.language.LanguageEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : JpaRepository<CategoryEntity, Long>,CustomizedCategoryRepository

interface CustomizedCategoryRepository {
    fun findCategoryByIsActiveOrderByIdDesc(isActive: Boolean): List<CategoryEntity>
    fun findCategoryByIsActiveAndLanguageOrderByIdDesc(
        isActive: Boolean,
        language: LanguageEntity
    ): List<CategoryEntity>

    fun findCategoryByLanguageOrderByIdDesc(language: LanguageEntity): List<CategoryEntity>
}
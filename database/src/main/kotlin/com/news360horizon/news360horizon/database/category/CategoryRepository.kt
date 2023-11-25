package com.news360horizon.news360horizon.database.category

import com.news360horizon.news360horizon.database.language.LanguageEntity
import com.news360horizon.news360horizon.database.preference.PreferenceEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : JpaRepository<CategoryEntity, Long> {

    fun findByIsActiveOrderByIdDesc(isActive: Boolean): List<CategoryEntity>
    fun findByIsActiveAndLanguageOrderByIdDesc(
        isActive: Boolean,
        language: LanguageEntity
    ): List<CategoryEntity>

    fun findByLanguageOrderByIdDesc(language: LanguageEntity): List<CategoryEntity>

}
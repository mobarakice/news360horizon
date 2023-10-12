package com.news360horizon.news360horizon.database.language

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LanguageRepository : JpaRepository<LanguageEntity, Long> {
    fun findByLocale(locale: String): LanguageEntity
}
package com.news360horizon.news360horizon.database.preference

import com.news360horizon.news360horizon.database.language.LanguageEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PreferenceRepository : JpaRepository<PreferenceEntity, Long> {

    fun findByIsActiveOrderByPreferenceNameAsc(isActive: Boolean): List<PreferenceEntity>
    fun findByIsActiveAndLanguageIdOrderByPreferenceNameAsc(
        isActive: Boolean,
        language: LanguageEntity
    ): List<PreferenceEntity>

    fun findByLanguageIdOrderByPreferenceNameAsc(language: LanguageEntity): List<PreferenceEntity>
}
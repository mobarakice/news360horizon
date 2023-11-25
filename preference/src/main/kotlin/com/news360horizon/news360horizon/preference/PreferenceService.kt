package com.news360horizon.news360horizon.preference

import com.news360horizon.news360horizon.database.language.LanguageEntity
import com.news360horizon.news360horizon.database.preference.PreferenceEntity
import com.news360horizon.news360horizon.database.preference.PreferenceRepository
import org.springframework.stereotype.Service

interface PreferenceService {

    fun findByIsActiveOrderByPreferenceNameAsc(isActive: Boolean): List<PreferenceEntity>
    fun findByIsActiveAndLanguageIdOrderByPreferenceNameAsc(
        isActive: Boolean,
        language: LanguageEntity
    ): List<PreferenceEntity>

    fun findByLanguageIdOrderByPreferenceNameAsc(language: LanguageEntity): List<PreferenceEntity>
}

@Service
class PreferenceServiceImpl(private val repository: PreferenceRepository): PreferenceService {
    override fun findByIsActiveOrderByPreferenceNameAsc(isActive: Boolean): List<PreferenceEntity> {
        return repository.findByIsActiveOrderByPreferenceNameAsc(isActive)
    }

    override fun findByIsActiveAndLanguageIdOrderByPreferenceNameAsc(
        isActive: Boolean,
        language: LanguageEntity
    ): List<PreferenceEntity> {
        TODO("Not yet implemented")
    }

    override fun findByLanguageIdOrderByPreferenceNameAsc(language: LanguageEntity): List<PreferenceEntity> {
        TODO("Not yet implemented")
    }

}
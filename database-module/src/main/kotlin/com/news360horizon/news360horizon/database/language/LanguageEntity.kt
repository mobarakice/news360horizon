package com.news360horizon.news360horizon.database.language

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "Language")
data class LanguageEntity(
    @Id
    val id: Long,
    val name: String,
    val locale: String
)
package com.news360horizon.news360horizon.database.preference

import com.news360horizon.news360horizon.database.BaseEntity
import com.news360horizon.news360horizon.database.language.LanguageEntity
import jakarta.persistence.*
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "Preference")
data class PreferenceEntity(
    @Id
    override val id: Long,
    var preferenceName: String,
    var icon: String?,
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(columnDefinition = "language_id", referencedColumnName = "id", unique = false)
    var language: LanguageEntity,
    override var isActive: Boolean,
    override var isDelete: Boolean,
    override var createdBy: String?,
    override var createdAt: Instant?,
    override var updatedBy: String?,
    override var updatedAt: Timestamp?

):BaseEntity()

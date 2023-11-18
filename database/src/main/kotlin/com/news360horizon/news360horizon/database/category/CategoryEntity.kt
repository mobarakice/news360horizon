package com.news360horizon.news360horizon.database.category

import com.news360horizon.news360horizon.database.BaseEntity
import com.news360horizon.news360horizon.database.language.LanguageEntity
import jakarta.persistence.*
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "Category")
data class CategoryEntity(
    @Id
    override val id: Long,
    var categoryName: String,
    var description: String,
    var icon: String?,
    @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinColumn(columnDefinition = "language_id", referencedColumnName = "id")
    var language: LanguageEntity,
    override var isActive: Boolean,
    override var isDelete: Boolean,
    override var createdBy: String?,
    override var createdAt: Instant?,
    override var updatedBy: String?,
    override var updatedAt: Timestamp?

):BaseEntity()

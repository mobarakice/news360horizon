package com.news360horizon.news360horizon.database.contentcategory

import com.news360horizon.news360horizon.database.BaseEntity
import com.news360horizon.news360horizon.database.category.CategoryEntity
import com.news360horizon.news360horizon.database.content.ContentEntity
import jakarta.persistence.*
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "ContentCategory")
data class ContentCategoryEntity(
    @Id
    override val id: Long,
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(columnDefinition = "category_id", referencedColumnName = "id")
    var category: CategoryEntity,

    @ManyToOne
    @JoinColumn(name = "content_id", referencedColumnName = "id", nullable = false)
    private val content: ContentEntity,
    override var isActive: Boolean,
    override var isDelete: Boolean,
    override var createdBy: String?,
    override var createdAt: Instant?,
    override var updatedBy: String?,
    override var updatedAt: Timestamp?

) : BaseEntity()

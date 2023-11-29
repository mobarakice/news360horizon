package com.news360horizon.news360horizon.database.contentpreference

import com.news360horizon.news360horizon.database.BaseEntity
import com.news360horizon.news360horizon.database.content.ContentEntity
import com.news360horizon.news360horizon.database.preference.PreferenceEntity
import jakarta.persistence.*
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "ContentPreference")
data class ContentPreferenceEntity(
    @Id
    override val id: Long,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "preference_id", referencedColumnName = "id")
    var preference: PreferenceEntity,

    @ManyToOne(cascade = [CascadeType.REMOVE],fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id", referencedColumnName = "id")
    private val content: ContentEntity,
    override var isActive: Boolean,
    override var isDelete: Boolean,
    override var createdBy: String?,
    override var createdAt: Instant?,
    override var updatedBy: String?,
    override var updatedAt: Timestamp?

) : BaseEntity()

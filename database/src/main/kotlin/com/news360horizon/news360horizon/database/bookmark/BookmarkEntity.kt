package com.news360horizon.news360horizon.database.bookmark

import com.news360horizon.news360horizon.database.BaseEntity
import com.news360horizon.news360horizon.database.content.ContentEntity
import com.news360horizon.news360horizon.database.user.UserEntity
import jakarta.persistence.*
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "Bookmark")
data class BookmarkEntity(
    @Id
    override val id: Long,
    @ManyToOne(cascade = [CascadeType.REMOVE], fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    val user: UserEntity,
    @ManyToOne(cascade = [CascadeType.REMOVE], fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id", referencedColumnName = "id")
    val contents: ContentEntity,

    @Column(name = "status")
    private var status: Boolean = false,
    override var isActive: Boolean,
    override var isDelete: Boolean,
    override var createdBy: String?,
    override var createdAt: Instant?,
    override var updatedBy: String?,
    override var updatedAt: Timestamp?

) : BaseEntity()

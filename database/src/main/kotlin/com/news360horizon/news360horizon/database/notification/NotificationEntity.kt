package com.news360horizon.news360horizon.database.notification

import com.news360horizon.news360horizon.database.BaseEntity
import com.news360horizon.news360horizon.database.content.ContentEntity
import jakarta.persistence.*
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "Notification")
data class NotificationEntity(
    @Id
    override val id: Long,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id", referencedColumnName = "id", unique = false)
    var content: ContentEntity,

    @Column(name = "status")
    var status: Boolean? = null,
    override var isActive: Boolean,
    override var isDelete: Boolean,
    override var createdBy: String?,
    override var createdAt: Instant?,
    override var updatedBy: String?,
    override var updatedAt: Timestamp?

) : BaseEntity()

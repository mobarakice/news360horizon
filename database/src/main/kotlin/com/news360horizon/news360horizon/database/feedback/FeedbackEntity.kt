package com.news360horizon.news360horizon.database.feedback

import com.news360horizon.news360horizon.database.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "Feedback")
data class FeedbackEntity(
    @Id
    override val id: Long,
    @Column(name = "email")
    var email: String? = null,
    @Column(name = "comment")
    var comment: String? = null,
    override var isActive: Boolean,
    override var isDelete: Boolean,
    override var createdBy: String?,
    override var createdAt: Instant?,
    override var updatedBy: String?,
    override var updatedAt: Timestamp?

) : BaseEntity()

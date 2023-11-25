package com.news360horizon.news360horizon.database.fcm

import com.news360horizon.news360horizon.database.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "FcmToken")
data class FcmTokenEntity(
    @Id
    override val id: Long,
    @Column(name = "fcm_token")
    private var fcmToken: String? = null,
    override var isActive: Boolean,
    override var isDelete: Boolean,
    override var createdBy: String?,
    override var createdAt: Instant?,
    override var updatedBy: String?,
    override var updatedAt: Timestamp?

) : BaseEntity()

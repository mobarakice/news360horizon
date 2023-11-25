package com.news360horizon.news360horizon.database.notificationstatus

import com.news360horizon.news360horizon.database.BaseEntity
import com.news360horizon.news360horizon.database.fcm.FcmTokenEntity
import com.news360horizon.news360horizon.database.notification.NotificationEntity
import jakarta.persistence.*
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "NotificationStatus")
data class NotificationStatusEntity(
    @Id
    override val id: Long,
    @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinColumn(name = "notification_id", referencedColumnName = "id", unique = true)
    var notification: NotificationEntity,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fcm_id", referencedColumnName = "id")
    val fcm: FcmTokenEntity,

    @Column(name = "status")
    private var status: Boolean? = null,
    override var isActive: Boolean,
    override var isDelete: Boolean,
    override var createdBy: String?,
    override var createdAt: Instant?,
    override var updatedBy: String?,
    override var updatedAt: Timestamp?

) : BaseEntity()

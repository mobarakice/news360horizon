package com.news360horizon.news360horizon.database.nativeads

import com.news360horizon.news360horizon.database.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "NativeAds")
data class NativeAdsEntity(
    @Id
    override val id: Long,
    @Column(name = "title")
    var title: String,
    @Column(name = "icon")
    var icon: String? = null,
    override var isActive: Boolean,
    override var isDelete: Boolean,
    override var createdBy: String?,
    override var createdAt: Instant?,
    override var updatedBy: String?,
    override var updatedAt: Timestamp?

) : BaseEntity()

package com.news360horizon.news360horizon.data.entity

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Column
import jakarta.persistence.Id
import java.math.BigInteger
import java.sql.Timestamp
import java.time.Instant

interface IBaseEntity {
    @get:Id
    val id: BigInteger

    @set:Column(name = "is_active")
    @set:JsonProperty("is_active")
    var isActive: Boolean

    @set:Column(name = "is_delete")
    @set:JsonProperty("is_delete")
    var isDelete: Boolean

    @set:Column(name = "created_by")
    @set:JsonProperty("created_by")
    var createdBy: String?

    @set:Column(name = "created_at")
    var createdAt: Instant?

    @set:Column(name = "updated_by")
    @set:JsonProperty("updated_by")
    var updatedBy: String?

    @set:Column(name = "updated_at")
    var updatedAt: Timestamp?
}
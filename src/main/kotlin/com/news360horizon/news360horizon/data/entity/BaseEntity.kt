package com.news360horizon.news360horizon.data.entity

import jakarta.persistence.Column
import java.math.BigInteger
import java.sql.Timestamp
import java.time.Instant

abstract class BaseEntity {
        abstract val id: BigInteger
        @set:Column(name = "is_active")
        abstract var isActive: Boolean

        @set:Column(name = "is_delete")
        abstract var isDelete: Boolean

        @set:Column(name = "created_by")
        abstract var createdBy: String?

        @set:Column(name = "created_at")
        abstract var createdAt: Instant?

        @set:Column(name = "updated_by")
       abstract var updatedBy: String?

        @set:Column(name = "updated_at")
        abstract var updatedAt: Timestamp?
}

@Base
annotation class Base

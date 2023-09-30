package com.news360horizon.news360horizon.data.entity

import java.math.BigInteger
import java.sql.Timestamp
import java.time.Instant

data class BaseEntity(
        override val id: BigInteger,
        override var isActive: Boolean,
        override var isDelete: Boolean,
        override var createdBy: String?,
        override var createdAt: Instant? = Instant.now(),
        override var updatedBy: String?,
        override var updatedAt: Timestamp? = Timestamp.from(Instant.now())
):IBaseEntity

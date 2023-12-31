package com.news360horizon.news360horizon.data.entity

import jakarta.persistence.*
import java.math.BigInteger
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "User")
data class User(
    @Column(name = "name")
    var name: String,
    @Column(name = "email")
    val email: String,
    @Column(name = "phone")
    var phone: String? = null,
    @Column(name = "address")
    var address: String? = null,
    @Column(name = "password")
    var password: String,
    @Id
    override val id: BigInteger,
    override var isActive: Boolean = true,
    override var isDelete: Boolean = false,
    override var createdBy: String? = null,
    override var createdAt: Instant? = Instant.now(),
    override var updatedBy: String? = null,
    override var updatedAt: Timestamp? = Timestamp.from(Instant.now()),
    @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    var userRole: UserRole
) : BaseEntity()


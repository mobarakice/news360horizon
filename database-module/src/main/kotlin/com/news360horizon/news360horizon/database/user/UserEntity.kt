package com.news360horizon.news360horizon.database.user

import com.news360horizon.news360horizon.database.BaseEntity
import com.news360horizon.news360horizon.database.userrole.UserRoleEntity
import jakarta.persistence.*
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "User")
data class UserEntity(
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
    override val id: Long,
    override var isActive: Boolean = true,
    override var isDelete: Boolean = false,
    override var createdBy: String? = null,
    override var createdAt: Instant? = Instant.now(),
    override var updatedBy: String? = null,
    override var updatedAt: Timestamp? = Timestamp.from(Instant.now()),
    @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    var userRole: UserRoleEntity
) : BaseEntity()


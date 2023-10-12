package com.news360horizon.news360horizon.database.userrole

import jakarta.persistence.*

@Entity
@Table(name = "UserRole")
data class UserRoleEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val role: String,
)

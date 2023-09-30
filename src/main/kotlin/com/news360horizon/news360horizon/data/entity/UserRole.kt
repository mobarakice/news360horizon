package com.news360horizon.news360horizon.data.entity

import jakarta.persistence.*

@Entity
@Table(name = "UserRole")
data class UserRole(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int,
        val role: String,
        @OneToMany(mappedBy = "userRole")
        val users: List<User>
)

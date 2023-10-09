package com.news360horizon.news360horizon.database.entity

import jakarta.persistence.*
import org.hibernate.validator.constraints.Length

@Entity
@Table(name = "UserRole")
data class UserRole(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Length(min = 1, max = 3)
        val id: Int,
        @Length(min = 1, max = 10)
        val role: String,
)

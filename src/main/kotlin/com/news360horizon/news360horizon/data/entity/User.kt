package com.news360horizon.news360horizon.data.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.Table

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
        @OneToOne
        @JoinColumn(name = "role_id")
        var userRole: UserRole,
        val base: IBaseEntity) : IBaseEntity by base


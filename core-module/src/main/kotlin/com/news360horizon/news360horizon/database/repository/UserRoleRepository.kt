package com.news360horizon.news360horizon.database.repository

import com.news360horizon.news360horizon.database.entity.UserRole
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRoleRepository : JpaRepository<UserRole, Int>
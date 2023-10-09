package com.news360horizon.news360horizon.database.userrole

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRoleRepository : JpaRepository<UserRoleEntity, Int>
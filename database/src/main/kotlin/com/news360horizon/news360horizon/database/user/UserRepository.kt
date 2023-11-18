package com.news360horizon.news360horizon.database.user

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.math.BigInteger

@Repository
interface UserRepository : JpaRepository<UserEntity, BigInteger> {
    fun findByEmail(@Param("email") email: String): UserEntity
}

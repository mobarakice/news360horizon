package com.news360horizon.news360horizon.data.repository

import com.news360horizon.news360horizon.data.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.math.BigInteger

@Repository
interface UserRepository : JpaRepository<User, BigInteger> {
    fun findByEmail(@Param("email") email: String): User
}

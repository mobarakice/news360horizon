package com.news360horizon.news360horizon.data.repository

import com.news360horizon.news360horizon.data.entity.User
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.math.BigInteger

@Repository
interface UserRepository : JpaRepository<User, BigInteger>{
    //@Query("select * from user u inner join user_role r where u.email = :email and u.role_id = r.role")
    fun findByEmail(@Param("email") email: String): User
}
package com.news360horizon.news360horizon.service

import com.news360horizon.news360horizon.data.entity.User
import com.news360horizon.news360horizon.data.repository.UserRepository
import org.springframework.stereotype.Service
import java.math.BigInteger
import java.util.*

interface UserService {
    suspend fun addNewUser(user: User)
    suspend fun findUserByEmail(id: BigInteger): User
//    suspend fun findUserByEmail(email: String) : User
//    fun findAllUser() : Flow
}

@Service
class UserServiceImpl(private val repository: UserRepository) : UserService {
    override suspend fun addNewUser(user: User) {
        repository.save(user)
    }

    override suspend fun findUserByEmail(id: BigInteger): User {
        return repository.findById(id).get()
    }
}
package com.news360horizon.news360horizon.service

import com.news360horizon.news360horizon.database.user.UserEntity
import com.news360horizon.news360horizon.database.user.UserRepository
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service
import java.math.BigInteger

interface UserService : BaseService<UserEntity> {
    fun findUserByEmail(email: String): UserEntity
}

@Service
class UserServiceImpl(private val repository: UserRepository) : UserService {
    override fun findUserByEmail(email: String): UserEntity {
        return repository.findByEmail(email)
    }

    override suspend fun save(entity: UserEntity): UserEntity {
        return repository.save(entity)
    }

    override fun deleteById(id: BigInteger) {
        repository.deleteById(id)
    }

    override fun observeAll(): Flow<List<UserEntity>> {
        TODO("Not yet implemented")
    }

    override suspend fun findAll(): List<UserEntity> {
        TODO("Not yet implemented")
    }

    override fun findById(id: BigInteger): UserEntity {
        TODO("Not yet implemented")
    }
}
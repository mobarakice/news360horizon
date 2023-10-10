package com.news360horizon.news360horizon.service

import com.news360horizon.news360horizon.database.user.UserEntity
import com.news360horizon.news360horizon.database.user.UserRepository
import com.news360horizon.news360horizon.database.userrole.UserRoleEntity
import kotlinx.coroutines.flow.Flow
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import java.math.BigInteger

interface UserService : BaseService<UserEntity>, UserDetailsService {
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

    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(email: String): UserDetails {
        val user = repository.findByEmail(email)
        return org.springframework.security.core.userdetails.User(
            user.email,
            user.password,
            mapRolesToAuthorities(listOf(user.userRole))
        )
    }

    private fun mapRolesToAuthorities(roles: List<UserRoleEntity>): List<GrantedAuthority?> {
        return roles.map { role -> SimpleGrantedAuthority(role.role) }
    }
}
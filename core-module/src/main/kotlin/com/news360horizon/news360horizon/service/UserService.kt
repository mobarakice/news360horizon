package com.news360horizon.news360horizon.service

import com.news360horizon.news360horizon.database.entity.User
import com.news360horizon.news360horizon.database.entity.UserRole
import com.news360horizon.news360horizon.database.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import java.math.BigInteger

interface UserService : BaseService<User>, UserDetailsService {
    fun findUserByEmail(email: String): User
}

@Service
class UserServiceImpl(private val repository: UserRepository) : UserService {
    override fun findUserByEmail(email: String): User {
        return repository.findByEmail(email)
    }

    override suspend fun save(entity: User): User {
        return repository.save(entity)
    }

    override fun deleteById(id: BigInteger) {
        repository.deleteById(id)
    }

    override fun observeAll(): Flow<List<User>> {
        TODO("Not yet implemented")
    }

    override suspend fun findAll(): List<User> {
        TODO("Not yet implemented")
    }

    override fun findById(id: BigInteger): User {
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

    private fun mapRolesToAuthorities(roles: List<UserRole>): List<GrantedAuthority?> {
        return roles.map { role -> SimpleGrantedAuthority(role.role) }
    }
}
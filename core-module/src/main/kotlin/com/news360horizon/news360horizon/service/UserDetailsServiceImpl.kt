package com.news360horizon.news360horizon.service

import com.news360horizon.news360horizon.database.user.UserRepository
import com.news360horizon.news360horizon.database.userrole.UserRoleEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class UserDetailsServiceImpl : UserDetailsService {

    @Autowired
    private lateinit var repository: UserRepository

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
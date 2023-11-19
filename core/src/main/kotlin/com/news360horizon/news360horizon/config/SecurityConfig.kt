package com.news360horizon.news360horizon.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher
import org.springframework.security.web.util.matcher.AntPathRequestMatcher
import org.springframework.web.servlet.handler.HandlerMappingIntrospector


@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Autowired
    private lateinit var userServiceImpl: UserDetailsService

    @Autowired
    private lateinit var handlerMappingIntrospector: HandlerMappingIntrospector


    @Bean
    @Throws(Exception::class)
    fun customFilterChain(http: HttpSecurity)
            : SecurityFilterChain {

        println("Password: ${passwordEncoder().encode("1234")}")
        return http.cors(Customizer.withDefaults())
            .authorizeHttpRequests { auth ->
                auth
                    .requestMatchers(*getUnsecuredPaths()).permitAll()
                    .requestMatchers(
                        getSecuredPathBuilder().pattern("/admin/**")
                    ).hasRole("ADMIN")
                    .anyRequest().authenticated()
            }.formLogin { login ->
                login.loginPage("/login")
                    .loginProcessingUrl("/login")
                    .defaultSuccessUrl("/admin/home", true)
                    .failureUrl("/login?error=true")
                    .usernameParameter("email")
                    .passwordParameter("password")
                    .permitAll()
            }.logout { logout ->
                logout.deleteCookies("remove")
                    .invalidateHttpSession(true)
                    .logoutRequestMatcher(getSecuredPathBuilder().pattern("/logout"))
                    .logoutSuccessUrl("/")
            }.csrf(Customizer.withDefaults())
            .exceptionHandling {
                it.accessDeniedPage("/access-denied")
            }.sessionManagement {
                it.sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
            }.httpBasic { it.disable() }
            .build()
    }

    fun getUnsecuredPaths(): Array<AntPathRequestMatcher> {
        return arrayOf(
            "/static/**", "/css/**", "/js/**", "/images/**", "/resources/**",
            "/icon/**", "/api/**", "/login", "/forgot-password", "/registration"
        ).map {
            AntPathRequestMatcher.antMatcher(it)
        }.toTypedArray()
    }

    fun getSecuredPathBuilder(): MvcRequestMatcher.Builder = MvcRequestMatcher
        .Builder(handlerMappingIntrospector)
        .servletPath("/path")

    @Bean
    fun passwordEncoder() = BCryptPasswordEncoder()
}
package com.news360horizon.news360horizon.config

import com.news360horizon.news360horizon.service.UserServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher
import org.springframework.web.servlet.handler.HandlerMappingIntrospector


@Configuration
@EnableWebSecurity
class SecurityConfig {


    @Bean
    fun filterChain(http: HttpSecurity, interseptors: HandlerMappingIntrospector)
            : SecurityFilterChain {

        val builder = MvcRequestMatcher.Builder(interseptors).servletPath("/path")
        val pattern = arrayOf("/static/**", "/css/**", "/js/**", "/images/**", "/resources/**",
            "/icon/**", "/api/**", "/login", "/forgot-password", "/registration"
        ).map { builder.pattern(it) }.toTypedArray()
        return http.cors(Customizer.withDefaults())
            .authorizeHttpRequests { auth ->
                auth
                    .requestMatchers(*pattern).permitAll()
                    .requestMatchers(builder.pattern("/admin/**")).hasRole("ADMIN")
                    .anyRequest().authenticated()
            }.formLogin { login ->
                login.loginPage("/login")
                    .loginProcessingUrl("/login")
                    .defaultSuccessUrl("/api/success", true)
                    .failureUrl("/login?error=true")
                    .usernameParameter("email")
                    .passwordParameter("password")
                    .permitAll()
            }.logout { logout ->
                logout.deleteCookies("remove")
                    .invalidateHttpSession(true)
                    .logoutRequestMatcher(builder.pattern("/logout"))
                    .logoutSuccessUrl("/")
            }.csrf(Customizer.withDefaults())
            .exceptionHandling {
                it.accessDeniedPage("/access-denied")
            }.sessionManagement {
                it.sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
            }.httpBasic { it.disable() }
            .build()
    }
    @Autowired
    @Throws(Exception::class)
    fun configGlobal(authBuilder: AuthenticationManagerBuilder,
                     userServiceImpl: UserServiceImpl,
                     passwordEncoder: PasswordEncoder) {
        authBuilder.userDetailsService(userServiceImpl).passwordEncoder(passwordEncoder)
    }

    @Bean
    fun passwordEncoder() = BCryptPasswordEncoder()
}
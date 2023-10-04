package com.news360horizon.news360horizon.service

import kotlinx.coroutines.flow.Flow
import java.math.BigInteger

interface BaseService<T> {
    suspend fun save(entity: T): T
    fun deleteById(id: BigInteger)
    fun observeAll(): Flow<List<T>>
    suspend fun findAll(): List<T>
    fun findById(id: BigInteger): T
}

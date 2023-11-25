package com.news360horizon.news360horizon.database.poll

import com.news360horizon.news360horizon.database.language.LanguageEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PollRepository : JpaRepository<PollEntity, Long> {

}
package com.news360horizon.news360horizon.database.content

import com.news360horizon.news360horizon.database.language.LanguageEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContentRepository : JpaRepository<ContentEntity, Long> {

}
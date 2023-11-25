package com.news360horizon.news360horizon.database.bookmark

import com.news360horizon.news360horizon.database.language.LanguageEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookmarkRepository : JpaRepository<BookmarkEntity, Long> {

}
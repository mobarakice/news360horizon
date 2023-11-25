package com.news360horizon.news360horizon.database.contentresource

import com.news360horizon.news360horizon.database.language.LanguageEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContentResourceRepository : JpaRepository<ContentResourceEntity, Long> {

}
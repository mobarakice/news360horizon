package com.news360horizon.news360horizon.database.nativeads

import com.news360horizon.news360horizon.database.language.LanguageEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NativeAdsRepository : JpaRepository<NativeAdsEntity, Long> {

}
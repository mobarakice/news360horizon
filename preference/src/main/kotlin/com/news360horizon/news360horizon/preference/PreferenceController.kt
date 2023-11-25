package com.news360horizon.news360horizon.preference

import com.news360horizon.news360horizon.database.preference.PreferenceEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class PreferenceController (@Autowired private val service: PreferenceService) {

    @RequestMapping("/api/preferences/active", method = [RequestMethod.GET])
    fun getAllActivePreference(): List<PreferenceEntity>{
        return service.findByIsActiveOrderByPreferenceNameAsc(true)
    }
}
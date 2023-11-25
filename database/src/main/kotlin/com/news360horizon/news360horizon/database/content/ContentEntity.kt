package com.news360horizon.news360horizon.database.content

import com.news360horizon.news360horizon.database.BaseEntity
import com.news360horizon.news360horizon.database.contentcategory.ContentCategoryEntity
import com.news360horizon.news360horizon.database.contentpreference.ContentPreferenceEntity
import com.news360horizon.news360horizon.database.contentresource.ContentResourceEntity
import com.news360horizon.news360horizon.database.language.LanguageEntity
import com.news360horizon.news360horizon.database.question.QuestionEntity
import com.news360horizon.news360horizon.database.question.QuestionRepository
import jakarta.persistence.*
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "Content")
data class ContentEntity(
    @Id
    override val id: Long,
    @Column(name = "title")
    var title: String? = null,

    @Column(name = "short_description")
    var shortDescription: String? = null,

    @Column(name = "description")
    var description: String? = null,

    @Column(name = "content_url")
    var contentUrl: String? = null,

    @Column(name = "site_url")
    var siteUrl: String? = null,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "language_id", referencedColumnName = "id")
    var language: LanguageEntity,
    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var contentCategories: List<ContentCategoryEntity>,
    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var contentPreferences: List<ContentPreferenceEntity>,
    @OneToOne(cascade = [CascadeType.REMOVE], fetch = FetchType.LAZY)
    var contentResource: ContentResourceEntity,
    @OneToOne(cascade = [CascadeType.REMOVE], fetch = FetchType.LAZY)
    var question: QuestionEntity? = null,
    override var isActive: Boolean,
    override var isDelete: Boolean,
    override var createdBy: String?,
    override var createdAt: Instant?,
    override var updatedBy: String?,
    override var updatedAt: Timestamp?

) : BaseEntity()

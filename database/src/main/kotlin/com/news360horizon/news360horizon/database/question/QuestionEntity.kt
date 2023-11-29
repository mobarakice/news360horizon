package com.news360horizon.news360horizon.database.question

import com.news360horizon.news360horizon.database.BaseEntity
import com.news360horizon.news360horizon.database.content.ContentEntity
import com.news360horizon.news360horizon.database.language.LanguageEntity
import jakarta.persistence.*
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "Questions")
data class QuestionEntity(
    @Id
    override val id: Long,
    @Column(name = "question_text")
    var questionText: String,

    @OneToOne(cascade = [CascadeType.REMOVE], fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id", referencedColumnName = "id", unique = true)
    val content: ContentEntity,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "language_id", referencedColumnName = "id")
    var language: LanguageEntity,
    override var isActive: Boolean,
    override var isDelete: Boolean,
    override var createdBy: String?,
    override var createdAt: Instant?,
    override var updatedBy: String?,
    override var updatedAt: Timestamp?

) : BaseEntity()

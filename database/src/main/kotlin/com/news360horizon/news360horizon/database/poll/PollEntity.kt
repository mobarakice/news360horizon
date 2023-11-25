package com.news360horizon.news360horizon.database.poll

import com.news360horizon.news360horizon.database.BaseEntity
import com.news360horizon.news360horizon.database.question.QuestionEntity
import jakarta.persistence.*
import java.sql.Timestamp
import java.time.Instant

@Entity
@Table(name = "Poll")
data class PollEntity(
    @Id
    override val id: Long,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "question_id", referencedColumnName = "id")
    private var question: QuestionEntity,

    @Column(name = "voter")
    var voter: String? = null,

    @Column(name = "is_yes")
    var isYes: Boolean? = null,

    @Column(name = "voted_at")
    var votedAt: Timestamp? = null,
    override var isActive: Boolean,
    override var isDelete: Boolean,
    override var createdBy: String?,
    override var createdAt: Instant?,
    override var updatedBy: String?,
    override var updatedAt: Timestamp?

) : BaseEntity()

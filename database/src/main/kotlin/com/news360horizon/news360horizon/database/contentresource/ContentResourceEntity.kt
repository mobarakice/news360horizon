package com.news360horizon.news360horizon.database.contentresource

import com.news360horizon.news360horizon.database.content.ContentEntity
import jakarta.persistence.*
import java.sql.Timestamp

@Entity
@Table(name = "ContentResource")
data class ContentResourceEntity(
    @Id
    val id: Long,

    @Column(name = "image_url")
    val imageUrl: String? = null,
    @Column(name = "video_url")
    val videoUrl: String? = null,
    @OneToOne(cascade = [CascadeType.REMOVE], fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id", referencedColumnName = "id", unique = true)
    val content: ContentEntity,
    @Column(name = "uploaded_at")
    val uploadedAt: Timestamp? = null
)

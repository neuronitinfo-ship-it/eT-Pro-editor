package com.mobilepro.editor.domain.model

data class Document(
    val id: String,
    val title: String,
    val content: String,
    val createdAt: Long,
    val updatedAt: Long
)
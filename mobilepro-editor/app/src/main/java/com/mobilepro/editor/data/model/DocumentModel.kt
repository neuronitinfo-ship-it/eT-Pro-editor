package com.mobilepro.editor.data.model

data class DocumentModel(
    val id: String,
    val title: String,
    val content: String,
    val createdAt: Long,
    val updatedAt: Long
)
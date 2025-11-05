package com.mobilepro.editor.domain.repository

interface EditorRepository {
    fun getDocument(documentId: String): Document?
    fun saveDocument(document: Document): Boolean
    fun deleteDocument(documentId: String): Boolean
}
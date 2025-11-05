package com.mobilepro.editor.data.repository

import com.mobilepro.editor.data.local.LocalDataSource
import com.mobilepro.editor.data.remote.RemoteDataSource
import com.mobilepro.editor.domain.model.Document
import com.mobilepro.editor.domain.repository.EditorRepository

class EditorRepositoryImpl(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : EditorRepository {

    override suspend fun getDocument(documentId: String): Document? {
        return localDataSource.getDocument(documentId) ?: remoteDataSource.fetchDocument(documentId)
    }

    override suspend fun saveDocument(document: Document) {
        localDataSource.saveDocument(document)
        remoteDataSource.uploadDocument(document)
    }

    // Additional methods can be implemented as needed
}
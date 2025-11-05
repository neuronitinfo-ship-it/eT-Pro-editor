package com.mobilepro.editor.domain.usecase

import com.mobilepro.editor.domain.repository.EditorRepository

class GetDocumentUseCase(private val editorRepository: EditorRepository) {
    suspend operator fun invoke(documentId: String) = editorRepository.getDocument(documentId)
}
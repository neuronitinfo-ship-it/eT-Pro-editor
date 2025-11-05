package com.mobilepro.editor.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.mobilepro.editor.domain.usecase.GetDocumentUseCase
import com.mobilepro.editor.domain.model.Document

class EditorViewModel(private val getDocumentUseCase: GetDocumentUseCase) : ViewModel() {

    private var document: Document? = null

    fun loadDocument(documentId: String) {
        viewModelScope.launch {
            document = getDocumentUseCase.execute(documentId)
            // Update UI or notify observers about the loaded document
        }
    }

    fun getDocument(): Document? {
        return document
    }
}
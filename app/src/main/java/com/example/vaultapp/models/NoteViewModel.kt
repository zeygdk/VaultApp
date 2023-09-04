package com.example.vaultapp.models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vaultapp.data.Note
import com.example.vaultapp.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
@HiltViewModel
class NoteViewModel(private val repository: NoteRepository) : ViewModel() {

    val allNotes = repository.getAllNotes()

    fun insert(note: Note) {
        repository.insert(note)
    }

    fun delete(note: Note) {
        repository.delete(note)
    }

    fun update(note: Note) = viewModelScope.launch {
        repository.update(note)
    }
}

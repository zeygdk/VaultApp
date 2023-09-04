package com.example.vaultapp.repository



import com.example.vaultapp.data.Note
import com.example.vaultapp.sources.dao.NoteDao
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDao: NoteDao) {

    fun getAllNotes() = noteDao.getAllNotes()

     fun insert(note: Note) {
        noteDao.insert(note)
    }

     fun delete(note: Note) {
        noteDao.delete(note)
    }

    suspend fun update(note: Note) {
        noteDao.update(note)
    }
}

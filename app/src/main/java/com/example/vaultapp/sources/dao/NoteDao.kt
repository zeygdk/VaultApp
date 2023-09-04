package com.example.vaultapp.sources.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Delete
import androidx.room.OnConflictStrategy
import androidx.room.Update
import com.example.vaultapp.data.Note

@Dao
interface NoteDao {
    @Query("SELECT * FROM notes  order by id ASC")
    fun getAllNotes(): LiveData<List<Note>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note: Note)

    @Delete
    fun delete(note: Note)
    @Update
    suspend fun update(note: Note)
}
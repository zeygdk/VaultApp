package com.example.vaultapp.mvvm

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface PhotoDao {
    @Insert
    suspend fun insert(photo: Photo)

    @Delete
    suspend fun delete(photo: Photo)

    @Query("SELECT * FROM photos WHERE albumId = :albumId")
    fun getPhotosForAlbum(albumId: Long): LiveData<List<Photo>>
}



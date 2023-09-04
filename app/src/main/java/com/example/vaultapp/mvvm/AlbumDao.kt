package com.example.vaultapp.mvvm

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update


@Dao
interface AlbumDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(album: Album)

    @Delete
    suspend fun delete(album: Album)

    @Query("SELECT * FROM albums")
    fun getAllAlbums(): LiveData<List<Album>>
    @Update
    suspend fun update(album: Album)


    @Query("SELECT * FROM albums WHERE id = :albumId")
    suspend fun getAlbumById(albumId: Long): Album?


}

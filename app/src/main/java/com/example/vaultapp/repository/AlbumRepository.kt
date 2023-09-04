package com.example.vaultapp.repository




import androidx.lifecycle.LiveData
import com.example.vaultapp.mvvm.Album
import com.example.vaultapp.mvvm.AlbumDao
import javax.inject.Inject

class AlbumRepository@Inject constructor(private val albumDao: AlbumDao) {

    val allAlbums: LiveData<List<Album>> = albumDao.getAllAlbums()

    suspend fun insert(album: Album) {
        albumDao.insert(album)
    }

    suspend fun delete(album: Album) {
        albumDao.delete(album)
    }

    suspend fun update(album: Album) {
        albumDao.update(album)
    }
}
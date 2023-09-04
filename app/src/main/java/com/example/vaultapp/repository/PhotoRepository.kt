package com.example.vaultapp.repository

import androidx.lifecycle.LiveData
import com.example.vaultapp.mvvm.Photo

import com.example.vaultapp.mvvm.PhotoDao

class PhotoRepository(private val photoDao: PhotoDao) {

    fun getPhotosForAlbum(albumId: Long): LiveData<List<Photo>> {
        return photoDao.getPhotosForAlbum(albumId)
    }

    suspend fun insert(photo: Photo) {
        photoDao.insert(photo)
    }

    suspend fun delete(photo: Photo) {
        photoDao.delete(photo)
    }
}
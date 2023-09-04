package com.example.vaultapp.models



import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vaultapp.mvvm.Album
import com.example.vaultapp.repository.AlbumRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlbumViewModel @Inject constructor(private val repository: AlbumRepository) : ViewModel() {

    val allAlbums = repository.allAlbums

    fun insert(album: Album) = viewModelScope.launch {
        repository.insert(album)
    }

    fun delete(album: Album) = viewModelScope.launch {
        repository.delete(album)
    }

    fun update(album: Album) = viewModelScope.launch {
        repository.update(album)
    }
}

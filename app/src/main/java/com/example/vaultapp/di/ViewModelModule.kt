package com.example.vaultapp.di


import android.content.Context
import androidx.room.Room
import com.example.vaultapp.mvvm.AppDatabase
import com.example.vaultapp.repository.AlbumRepository

import com.example.vaultapp.repository.NoteRepository
import com.example.vaultapp.sources.dao.NoteDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ViewModelModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "app_database"
        ).build()
    }

    @Singleton
    @Provides
    fun provideAlbumRepository(database: AppDatabase): AlbumRepository {
        return AlbumRepository(database.albumDao())
    }

    @Singleton
    @Provides
    fun provideNoteRepository(noteDao: NoteDao): NoteRepository {
        return NoteRepository(noteDao)
    }
}

package com.example.vaultapp.mvvm

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "photos")
data class Photo(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val albumId: Long,
    val imageUrl: String,
    val isSelected: Boolean = false
)

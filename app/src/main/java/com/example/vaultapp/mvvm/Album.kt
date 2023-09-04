package com.example.vaultapp.mvvm


import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "albums")
data class Album(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String
)

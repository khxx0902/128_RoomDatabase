package com.example.praktikum7.data

import androidx.room.OnConflictStrategy
import androidx.room.Update

interface SiswaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)

    @Update
    suspend fun update(siswa: Siswa)
}
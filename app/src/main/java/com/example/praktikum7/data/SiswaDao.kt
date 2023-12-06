package com.example.praktikum7.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

interface SiswaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)

    @Update
    suspend fun update(siswa: Siswa)

    @Delete
    suspend fun delete(siswa: Siswa)

}
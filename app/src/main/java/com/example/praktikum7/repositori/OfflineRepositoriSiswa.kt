package com.example.praktikum7.repositori

import com.example.praktikum7.data.Siswa
import com.example.praktikum7.data.SiswaDao
import kotlinx.coroutines.flow.Flow

class OfflineRepositoriSiswa(private val siswaDao: SiswaDao):RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> {
        return siswaDao.getAllSiswa()
    }

    override fun getSiswaStream(id: Int): Flow<Siswa?> {
        TODO("Not yet implemented")
    }

    override suspend fun insertSiswa(siswa: Siswa) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteSiswa(siswa: Siswa) {
        TODO("Not yet implemented")
    }

    override suspend fun updateSiswa(siswa: Siswa) {
        TODO("Not yet implemented")
    }
}
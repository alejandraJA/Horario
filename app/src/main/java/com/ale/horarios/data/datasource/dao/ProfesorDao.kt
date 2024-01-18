package com.ale.horarios.data.datasource.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.ale.horarios.data.datasource.entities.Profesor

@Dao
interface ProfesorDao {
    @Query("SELECT * FROM profesores")
    fun getAllProfesores(): List<Profesor>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProfesor(profesor: Profesor)

    @Update
    fun updateProfesor(profesor: Profesor)

    @Delete
    fun deleteProfesor(profesor: Profesor)
}
package com.ale.horarios.data.datasource.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.ale.horarios.data.datasource.entities.Estudiante

@Dao
interface EstudianteDao {
    @Query("SELECT * FROM estudiantes")
    fun getAllEstudiantes(): List<Estudiante>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertEstudiante(estudiante: Estudiante)

    @Update
    fun updateEstudiante(estudiante: Estudiante)

    @Delete
    fun deleteEstudiante(estudiante: Estudiante)
}
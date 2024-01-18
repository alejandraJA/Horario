package com.ale.horarios.data.datasource.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.ale.horarios.data.datasource.entities.Curso

@Dao
interface CursoDao {
    @Query("SELECT * FROM cursos")
    fun getAllCursos(): List<Curso>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCurso(curso: Curso)

    @Update
    fun updateCurso(curso: Curso)

    @Delete
    fun deleteCurso(curso: Curso)
}
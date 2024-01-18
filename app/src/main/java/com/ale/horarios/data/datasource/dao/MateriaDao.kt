package com.ale.horarios.data.datasource.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.ale.horarios.data.datasource.entities.Materia

@Dao
interface MateriaDao {
    @Query("SELECT * FROM materias")
    fun getAllMaterias(): List<Materia>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMateria(materia: Materia)

    @Update
    fun updateMateria(materia: Materia)

    @Delete
    fun deleteMateria(materia: Materia)
}
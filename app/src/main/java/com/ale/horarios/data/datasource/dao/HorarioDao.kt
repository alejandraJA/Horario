package com.ale.horarios.data.datasource.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.ale.horarios.data.datasource.entities.Horario

@Dao
interface HorarioDao {
    @Query("SELECT * FROM horarios")
    fun getAllHorarios(): List<Horario>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertHorario(horario: Horario)

    @Update
    fun updateHorario(horario: Horario)

    @Delete
    fun deleteHorario(horario: Horario)
}

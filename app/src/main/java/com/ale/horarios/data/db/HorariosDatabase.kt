package com.ale.horarios.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ale.horarios.data.datasource.dao.CursoDao
import com.ale.horarios.data.datasource.dao.EstudianteDao
import com.ale.horarios.data.datasource.dao.HorarioDao
import com.ale.horarios.data.datasource.dao.MateriaDao
import com.ale.horarios.data.datasource.dao.ProfesorDao
import com.ale.horarios.data.datasource.entities.Curso
import com.ale.horarios.data.datasource.entities.Estudiante
import com.ale.horarios.data.datasource.entities.Horario
import com.ale.horarios.data.datasource.entities.Materia
import com.ale.horarios.data.datasource.entities.Profesor

@Database(
    entities = [
        Curso::class,
        Estudiante::class,
        Horario::class,
        Materia::class,
        Profesor::class

    ], version = 1,
    exportSchema = true
)
abstract class HorariosDatabase : RoomDatabase() {
    abstract fun getCursoDao(): CursoDao
    abstract fun getEstudianteDao(): EstudianteDao
    abstract fun getHorarioDao(): HorarioDao
    abstract fun getMateriaDao(): MateriaDao
    abstract fun getProfesorDao(): ProfesorDao
}
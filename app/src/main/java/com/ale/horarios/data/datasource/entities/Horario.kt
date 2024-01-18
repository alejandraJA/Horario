package com.ale.horarios.data.datasource.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "horarios",
    foreignKeys = [
        ForeignKey(
            entity = Curso::class,
            parentColumns = ["idCurso"],
            childColumns = ["idCurso"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Profesor::class,
            parentColumns = ["idProfesor"],
            childColumns = ["idProfesor"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Estudiante::class,
            parentColumns = ["idEstudiante"],
            childColumns = ["idEstudiante"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Materia::class,
            parentColumns = ["idMateria"],
            childColumns = ["idMateria"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Horario(
    @PrimaryKey(autoGenerate = true)
    val idHorario: Long = 0,
    val idCurso: Long,
    val idProfesor: Long,
    val idEstudiante: Long,
    val idMateria: Long,
    val diaSemana: String,
    val horaInicio: String,
    val horaFin: String
)

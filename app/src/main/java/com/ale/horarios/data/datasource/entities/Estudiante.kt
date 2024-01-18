package com.ale.horarios.data.datasource.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "estudiantes")
data class Estudiante(
    @PrimaryKey(autoGenerate = true)
    val idEstudiante: Long = 0,
    val nombreEstudiante: String,
    val emailEstudiante: String
)
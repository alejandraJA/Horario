package com.ale.horarios.data.datasource.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cursos")
data class Curso(
    @PrimaryKey(autoGenerate = true)
    val idCurso: Long = 0,
    val nombreCurso: String
)
package com.ale.horarios.data.datasource.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profesores")
data class Profesor(
    @PrimaryKey(autoGenerate = true)
    val idProfesor: Long = 0,
    val nombreProfesor: String,
    val emailProfesor: String
)
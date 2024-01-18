package com.ale.horarios.data.datasource.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "materias")
data class Materia(
    @PrimaryKey(autoGenerate = true)
    val idMateria: Long = 0,
    val nombreMateria: String
)
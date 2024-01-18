package com.ale.horarios.sys.di

import android.content.Context
import androidx.room.Room
import com.ale.horarios.data.datasource.dao.CursoDao
import com.ale.horarios.data.datasource.dao.EstudianteDao
import com.ale.horarios.data.datasource.dao.HorarioDao
import com.ale.horarios.data.datasource.dao.MateriaDao
import com.ale.horarios.data.datasource.dao.ProfesorDao
import com.ale.horarios.data.db.HorariosDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Singleton
    @Provides
    fun providerDatabase(@ApplicationContext app: Context?): HorariosDatabase =
        Room.databaseBuilder(
            app!!,
            HorariosDatabase::class.java,
            "horario"
        ).build()

    @Singleton
    @Provides
    fun provideCursoDao(db: HorariosDatabase): CursoDao = db.getCursoDao()

    @Singleton
    @Provides
    fun provideEstudianteDao(db: HorariosDatabase): EstudianteDao = db.getEstudianteDao()

    @Singleton
    @Provides
    fun provideHorarioDao(db: HorariosDatabase): HorarioDao = db.getHorarioDao()

    @Singleton
    @Provides
    fun provideMateriaDao(db: HorariosDatabase): MateriaDao = db.getMateriaDao()

    @Singleton
    @Provides
    fun provideProfesorDao(db: HorariosDatabase): ProfesorDao = db.getProfesorDao()
}
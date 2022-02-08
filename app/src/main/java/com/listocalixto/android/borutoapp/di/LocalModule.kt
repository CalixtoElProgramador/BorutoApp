package com.listocalixto.android.borutoapp.di

import android.content.Context
import androidx.room.Room
import com.listocalixto.android.borutoapp.app.Constants.DATABASE_NAME
import com.listocalixto.android.borutoapp.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context, AppDatabase::class.java, DATABASE_NAME
    ).build()


}
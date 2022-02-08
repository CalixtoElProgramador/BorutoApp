package com.listocalixto.android.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.listocalixto.android.borutoapp.data.local.dao.HeroDao
import com.listocalixto.android.borutoapp.data.local.dao.HeroRemoteKeyDao
import com.listocalixto.android.borutoapp.domain.model.Hero
import com.listocalixto.android.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1, exportSchema = false)
@TypeConverters(DatabaseConverter::class)
abstract class AppDatabase: RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao

}
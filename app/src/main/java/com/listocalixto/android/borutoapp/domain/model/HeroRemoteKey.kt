package com.listocalixto.android.borutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.listocalixto.android.borutoapp.app.Constants.TABLE_HERO_REMOTE

@Entity(tableName = TABLE_HERO_REMOTE)
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevPage: Int?,
    val nextPage: Int?
)

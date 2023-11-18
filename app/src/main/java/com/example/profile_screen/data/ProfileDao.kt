package com.example.profile_screen.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ProfileDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun save(profile: Profile)

    @Query("SELECT * FROM profile ")
    suspend fun getAll(): List<Profile>
}
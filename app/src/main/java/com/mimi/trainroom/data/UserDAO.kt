package com.mimi.trainroom.data

import androidx.room.Dao
import androidx.room.Query

@Dao
interface UserDAO {
    @Query("SELECT * FROM userentity")
    suspend fun getAll (): List<UserEntity>

}
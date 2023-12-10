package com.mimi.trainroom.data

import android.content.Context
import androidx.room.Room

class ConnectionDatabase {

    private fun connect(context : Context) : AppDatabase{
        return Room.databaseBuilder(context,
            AppDatabase::class.java,"database-name").build()
    }

    suspend fun getAllUsers(context: Context) : List<UserEntity>{
        return connect(context).userDao().getAll()
    }
}
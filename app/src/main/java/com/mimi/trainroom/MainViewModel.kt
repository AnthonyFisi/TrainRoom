package com.mimi.trainroom

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mimi.trainroom.data.ConnectionDatabase
import com.mimi.trainroom.data.DogResponse

class MainViewModel() : ViewModel() {

    private val connection : ConnectionDatabase = ConnectionDatabase()

    private var number = MutableLiveData<Int>()
    val numberValue : LiveData<Int>
        get() = number

    private var listPuppies = MutableLiveData<List<DogResponse>>()
    val listPuppiesValue : LiveData<List<DogResponse>>
        get() = listPuppies

    init {
        number.value = 0
    }

    suspend fun updateCount(context : Context){
        connection.getAllUsers(context)
        //number.value = (number.value)?.plus(1)
    }



}
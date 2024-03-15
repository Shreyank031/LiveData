package com.shrey.live_data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val galaxyLiveObject = MutableLiveData<String>("Hello Andromeda!")

    val galaxyLive: LiveData<String>
        get() = galaxyLiveObject

    fun updateLiveData() {
        galaxyLiveObject.value = "Hello Whirlpool!"
    }
}
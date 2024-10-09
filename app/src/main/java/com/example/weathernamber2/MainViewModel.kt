package com.example.weathernamber2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weathernamber2.Adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()

}
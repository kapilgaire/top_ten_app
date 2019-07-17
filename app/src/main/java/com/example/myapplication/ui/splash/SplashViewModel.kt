package com.example.myapplication.ui.splash

import androidx.lifecycle.MutableLiveData
import com.example.myapplication.ui.base.BaseViewModel
import com.example.myapplication.utils.network.NetworkHelper

class SplashViewModel(networkHelper: NetworkHelper) : BaseViewModel(networkHelper) {

    val launchMain: MutableLiveData<Event<Map<String, String>>> = MutableLiveData()

    override fun onCreate() {

        // Empty map of key and serialized value is passed to Activity in Event that is needed by the other Activity
        launchMain.postValue(Event(emptyMap()))


    }
}
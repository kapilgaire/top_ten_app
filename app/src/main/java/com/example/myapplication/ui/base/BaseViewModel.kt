package com.example.myapplication.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.R
import com.example.myapplication.utils.commons.Resources

import com.example.myapplication.utils.network.NetworkHelper

abstract class BaseViewModel(
    protected val networkHelper: NetworkHelper
    ) : ViewModel() {

    val messageStringId: MutableLiveData<Resources<Int>> = MutableLiveData()

    val messageString: MutableLiveData<Resources<String>> = MutableLiveData()

    fun checkInternetConnection(): Boolean = networkHelper.isNetworkConnected()


    fun checkInternetConnectionWithoutMessage(): Boolean =
        if (networkHelper.isNetworkConnected()) {
            true
        } else {
            messageStringId.postValue(Resources.error(R.string.network_connection_error))
            false
        }

}
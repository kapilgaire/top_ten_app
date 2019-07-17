package com.example.myapplication.di.module

import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.ui.base.BaseActivity
import com.example.myapplication.ui.splash.SplashViewModel
import com.example.myapplication.utils.ViewModelProviderFactory
import com.example.myapplication.utils.network.NetworkHelper
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: BaseActivity<*>) {


    @Provides
    fun provideSplashViewModel(networkHelper: NetworkHelper): SplashViewModel =ViewModelProviders
        .of(activity,ViewModelProviderFactory(SplashViewModel::class){
            SplashViewModel(networkHelper)
        }).get(SplashViewModel::class.java)


}
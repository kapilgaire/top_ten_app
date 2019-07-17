package com.example.myapplication.di.module

import android.app.Application
import android.content.Context
import com.example.myapplication.MyApp
import com.example.myapplication.di.ApplicationContext
import com.example.myapplication.utils.network.NetworkHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: MyApp) {

    @Provides
    @Singleton
    fun provideApplication(): Application = application

    @Provides
    @Singleton
    @ApplicationContext
    fun provideContext(): Context= application


    @Singleton
    @Provides
    fun provideNetworkHelper(): NetworkHelper = NetworkHelper(application)


}
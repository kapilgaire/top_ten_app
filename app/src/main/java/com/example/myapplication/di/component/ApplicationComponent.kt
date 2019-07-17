package com.example.myapplication.di.component

import android.app.Application
import android.content.Context
import com.example.myapplication.MyApp
import com.example.myapplication.di.ApplicationContext
import com.example.myapplication.di.module.ApplicationModule
import com.example.myapplication.utils.network.NetworkHelper
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent{

    fun inject(app: MyApp)

    fun getApplication(): Application

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkHelper(): NetworkHelper

}
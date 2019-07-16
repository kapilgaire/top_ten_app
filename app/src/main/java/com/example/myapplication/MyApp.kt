package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.component.ApplicationComponent
import com.example.myapplication.di.component.DaggerApplicationComponent
import com.example.myapplication.di.module.ApplicationModule

class MyApp : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()


    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()

        applicationComponent.inject(this)


    }
}
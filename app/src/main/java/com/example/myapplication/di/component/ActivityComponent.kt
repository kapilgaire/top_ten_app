package com.example.myapplication.di.component

import com.example.myapplication.ui.main.MainActivity
import com.example.myapplication.di.ActivityScope
import com.example.myapplication.di.module.ActivityModule
import com.example.myapplication.ui.splash.SplashActivity
import dagger.Component

@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ActivityModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: SplashActivity)

}
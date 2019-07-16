package com.example.myapplication.di.component

import com.example.myapplication.MainActivity
import com.example.myapplication.di.ActivityScope
import com.example.myapplication.di.module.ActivityModule
import dagger.Component

@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ActivityModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)

}
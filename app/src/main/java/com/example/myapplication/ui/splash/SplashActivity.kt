package com.example.myapplication.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.myapplication.R
import com.example.myapplication.di.component.ActivityComponent
import com.example.myapplication.ui.base.BaseActivity
import com.example.myapplication.ui.main.MainActivity

class SplashActivity : BaseActivity<SplashViewModel>() {

    companion object {
        const val TAG = "SplashActivity"
    }

    override fun provideLayoutInt(): Int = R.layout.activity_splash

    override fun injectDependencies(activityComponent: ActivityComponent) {
        activityComponent.inject(this)
    }

    override fun setupView(savedInstanceState: Bundle?) {

    }

    override fun setUpObservers() {
        super.setUpObservers()

        viewModel.launchMain.observe(this, Observer<Event<Map<String, String>>> {
            it.getIfNotHandled()?.run {

                startActivity(Intent(applicationContext, MainActivity::class.java))
            }
        })
    }

}

package com.example.myapplication.ui.main

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import com.example.myapplication.R
import com.example.myapplication.di.component.ActivityComponent
import com.example.myapplication.ui.base.BaseActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainViewModel>() {

    companion object{
        const val TAG = "MainActivity"
    }

    override fun provideLayoutInt(): Int =R.layout.activity_main

    override fun injectDependencies(activityComponent: ActivityComponent) {
        activityComponent.inject(this)
    }

    override fun setupView(savedInstanceState: Bundle?) {

    }
    override fun setUpObservers() {
        super.setUpObservers()
    }

}

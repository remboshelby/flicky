package com.example.flicky.app

import android.app.Application
import com.example.common.di.CommonApplication
import com.example.common.di.CommonComponent
import com.example.flicky.app.di.ApplicationComponent
import com.example.flicky.app.di.DaggerApplicationComponent

class App : Application(), CommonApplication {
    private lateinit var applicationComponent : ApplicationComponent;


    override fun onCreate() {
        super.onCreate()

        makeComponent()
    }

    private fun makeComponent() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .application(this)
            .context(this)
            .build();
    }

    override fun component(): CommonComponent {
        return applicationComponent;
    }
}

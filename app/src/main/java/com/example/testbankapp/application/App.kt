package com.example.testbankapp.application

import android.app.Application
import com.example.testbankapp.di.dataModule
import com.example.testbankapp.di.interactorModule
import com.example.testbankapp.di.repositoryModule
import com.example.testbankapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(dataModule, repositoryModule, interactorModule, viewModelModule)
        }
    }

}
package com.example.testbankapp.di

import com.example.testbankapp.domain.api.Interactor
import com.example.testbankapp.domain.impl.InteractorImpl
import org.koin.dsl.module

val interactorModule = module {

    single<Interactor> {
        InteractorImpl(get())
    }
}
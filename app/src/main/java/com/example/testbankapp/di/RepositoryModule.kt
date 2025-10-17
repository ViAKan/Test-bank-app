package com.example.testbankapp.di

import com.example.testbankapp.data.impl.RepositoryImpl
import com.example.testbankapp.domain.api.Repository
import org.koin.dsl.module

val repositoryModule = module {

    single<Repository> {
        RepositoryImpl(get(), get())
    }
}
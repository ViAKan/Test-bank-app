package com.example.testbankapp.di

import com.example.testbankapp.presentation.ViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        ViewModel(get())
    }

}
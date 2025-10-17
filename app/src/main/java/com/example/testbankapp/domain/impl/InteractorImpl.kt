package com.example.testbankapp.domain.impl

import com.example.testbankapp.domain.api.Interactor
import com.example.testbankapp.domain.api.Repository

class InteractorImpl(private val repository: Repository): Interactor {
}
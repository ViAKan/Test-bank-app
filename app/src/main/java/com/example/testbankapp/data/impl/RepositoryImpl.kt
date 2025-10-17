package com.example.testbankapp.data.impl

import com.example.testbankapp.data.db.dao.HistoryDao
import com.example.testbankapp.data.network.NetworkClient
import com.example.testbankapp.domain.api.Repository

class RepositoryImpl(private val networkClient: NetworkClient, private val dao: HistoryDao): Repository {
}
package com.example.testbankapp.di

import androidx.room.Room
import com.example.testbankapp.data.db.AppDatabase
import com.example.testbankapp.data.network.BinListAPI
import com.example.testbankapp.data.network.NetworkClient
import com.example.testbankapp.data.network.RetrofitNetworkClient
import com.google.gson.Gson
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataModule = module {
    // retrofit
    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl("https://dictionary.skyeng.ru")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory { Gson() }

    single<NetworkClient> {
        RetrofitNetworkClient(get(), get())
    }

    single<BinListAPI> {
        get<Retrofit>().create(BinListAPI::class.java)
    }

    single {
        Room.databaseBuilder(androidContext(), AppDatabase::class.java, "database.db")
            .build()
    }

    single { get<AppDatabase>().historyDao() }

}
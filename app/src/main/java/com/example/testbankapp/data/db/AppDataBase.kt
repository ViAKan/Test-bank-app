package com.example.testbankapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.testbankapp.data.db.dao.HistoryDao
import com.example.testbankapp.data.db.entity.HistoryEntity

@Database(
    entities = [HistoryEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}
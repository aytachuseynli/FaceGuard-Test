package com.aytachuseynli.facedetectorapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aytachuseynli.facedetectorapp.data.model.Result

@Database(entities = [Result::class], version = 2, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun testResultDao(): TestResultDao
}
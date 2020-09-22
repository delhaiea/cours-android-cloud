package com.example.myapplication.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.databases.dao.MySecondObjectDao
import com.example.myapplication.pojos.MySecondObject

@Database(
    entities = [
        MySecondObject::class
    ],
    version = 1,
    exportSchema = false
)
abstract class Database: RoomDatabase() {

    abstract fun mySecondDao() : MySecondObjectDao

}
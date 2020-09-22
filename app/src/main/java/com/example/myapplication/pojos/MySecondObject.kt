package com.example.myapplication.pojos

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "my_pojo_table")
data class MySecondObject(

    @PrimaryKey(autoGenerate = true)
    var id: Long? = null,

    val url : String,
    val text : String,
    val value : Int
)

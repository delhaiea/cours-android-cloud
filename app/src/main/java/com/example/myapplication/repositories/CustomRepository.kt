package com.example.myapplication.repositories

import androidx.lifecycle.LiveData
import com.example.myapplication.MyApplication
import com.example.myapplication.pojos.MySecondObject
import com.example.myapplication.pojos.ObjectDataSample
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CustomRepository {

    private val dao = MyApplication.instance.applicationDatabase.mySecondDao()

    ////////////////////////////////////////////
    // Public methods //////////////////////////
    ////////////////////////////////////////////

    fun getDataFromDatabase(): LiveData<List<MySecondObject>> {
        return dao.selectAll()
    }

    suspend fun insert(myData: MySecondObject) = withContext(Dispatchers.IO) {
        dao.insert(myData)
    }

}
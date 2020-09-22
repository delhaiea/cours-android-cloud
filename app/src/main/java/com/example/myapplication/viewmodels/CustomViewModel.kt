package com.example.myapplication.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.pojos.MySecondObject
import com.example.myapplication.pojos.ObjectDataSample
import com.example.myapplication.repositories.CustomRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CustomViewModel: ViewModel() {

    private val repository: CustomRepository by lazy { CustomRepository() }
    var mutable: LiveData<List<MySecondObject>> = repository.getDataFromDatabase()

    fun insertData(url: String, text: String, value: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insert(MySecondObject(null, url, text, value))
        }
    }
}
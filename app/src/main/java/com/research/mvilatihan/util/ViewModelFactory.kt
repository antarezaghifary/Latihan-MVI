package com.research.mvilatihan.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.research.mvilatihan.data.api.ApiHelper
import com.research.mvilatihan.data.repository.MainRepository
import com.research.mvilatihan.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}
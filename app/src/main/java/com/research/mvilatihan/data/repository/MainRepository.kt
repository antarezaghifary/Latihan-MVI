package com.research.mvilatihan.data.repository

import com.research.mvilatihan.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()

}
package com.research.mvilatihan.data.api

import com.research.mvilatihan.data.model.User

interface ApiHelper {
    suspend fun getUsers(): List<User>
}
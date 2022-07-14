package com.research.mvilatihan.data.api

import com.research.mvilatihan.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}
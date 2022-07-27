package com.example.submission2.Api

import com.example.submission2.Gson.SearchResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id: String
    ): Call<SearchResponse>
}
package com.deepshikhayadav.makeupclub.retrofit

import com.airbnb.lottie.animation.content.Content
import com.deepshikhayadav.makeupclub.model.MyResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface MyServices {

    @GET("api/v1/products.json")
    suspend fun getData(/*@Query("brand") brand: String, @Query("api_key") key: String*/ ): List<MyResponse>
    @GET("api/v1/products.json")
    suspend fun getData2(@Query("brand") brand: String): List<MyResponse>
    @GET("api/v1/products.json")
    suspend fun getData3(@Query("category") category: String): List<MyResponse>
}

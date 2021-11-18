package com.deepshikhayadav.makeupclub.retrofit

import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

object RetrofitBuilder {
    private const val BASE_URL = "https://makeup-api.herokuapp.com/"
   // https://test.oye.direct/players.json
//https://api.themoviedb.org/3/movie/550?api_key=2c94efd8b816eb69721245b5ab9dc8b0
    private val client = OkHttpClient.Builder().build()
    private val gson: Gson = GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create()

    private val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
           // .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
           // .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .client(client)
            .build()

    fun buildService(): MyServices {
        return retrofit.create(MyServices::class.java)
    }
}
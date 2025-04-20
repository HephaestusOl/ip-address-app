package com.example.getip.api
import kotlin.lazy
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
//    private const val BASE_URL = "https://functions.yandexcloud.net/d4e2bt6jba6cmiekqmsv"

    val service: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://functions.yandexcloud.net/d4e2bt6jba6cmiekqmsv/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}
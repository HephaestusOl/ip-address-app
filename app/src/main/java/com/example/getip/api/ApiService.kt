package com.example.getip.api
import com.example.getip.model.IpInfo
import retrofit2.http.GET

interface ApiService {
    @GET(".")
    suspend fun getIp(): IpInfo
}
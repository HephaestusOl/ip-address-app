package com.example.getip.model

import com.google.gson.annotations.SerializedName

data class IpInfo(
    @SerializedName("myip")
    val ip: String
)
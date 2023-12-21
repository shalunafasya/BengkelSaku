package com.dicoding.bengkelsaku.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("loginResult")
    val loginResult: login
)

data class login(
    @field:SerializedName("userId")
    val userId: String?,

    @field:SerializedName("name")
    val name: String?,

    @field:SerializedName("token")
    val token: String?
)
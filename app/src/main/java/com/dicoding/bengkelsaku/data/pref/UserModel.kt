package com.dicoding.bengkelsaku
data class UserModel(
    val email: String,
    val token: String,
    val name: String,
    val isLogin: Boolean = false
)
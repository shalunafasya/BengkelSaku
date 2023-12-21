package com.dicoding.bengkelsaku.view.signup

import androidx.lifecycle.ViewModel
import com.dicoding.bengkelsaku.data.UserRepository

class SignupViewModel (private val repository: UserRepository): ViewModel() {
    fun register(name: String, email: String, password: String) = repository.signup(name, email, password)
}
package com.dicoding.bengkelsaku.di

import android.content.Context
import com.dicoding.bengkelsaku.UserPreference
import com.dicoding.bengkelsaku.data.UserRepository
import com.dicoding.bengkelsaku.dataStore

import com.dicoding.bengkelsaku.retrofit.ApiConfig

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        val apiService = ApiConfig.getApiService()
        return UserRepository.getInstance(apiService, pref)
    }
}
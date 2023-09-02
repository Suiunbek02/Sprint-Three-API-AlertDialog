package com.example.sprint_three_api_alertdialog.data.remote

import com.example.sprint_three_api_alertdialog.data.remote.apiservices.DialogApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://2eb7-185-117-148-226.ngrok-free.app/")
        .client(provideOkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private fun provideOkHttpClient() = OkHttpClient()
        .newBuilder()
        .addInterceptor(provideLoggingInspector())
        .callTimeout(30, TimeUnit.SECONDS)
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private fun provideLoggingInspector(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    fun providerDialogApiService(): DialogApiService {
        return retrofit.create(DialogApiService::class.java)
    }

}
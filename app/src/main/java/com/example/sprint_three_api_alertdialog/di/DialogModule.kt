package com.example.sprint_three_api_alertdialog.di

import com.example.sprint_three_api_alertdialog.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DialogModule {

    @Singleton
    @Provides
    fun provideRetrofitClient() = RetrofitClient()

    @Singleton
    @Provides
    fun provideDialogApiService(retrofitClient: RetrofitClient) =
        retrofitClient.providerDialogApiService()

}
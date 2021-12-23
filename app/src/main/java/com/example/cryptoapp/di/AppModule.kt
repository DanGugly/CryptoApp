package com.example.cryptoapp.di

import com.example.cryptoapp.rest.CryptoAPI
import com.example.cryptoapp.rest.CryptoRepository
import com.example.cryptoapp.rest.CryptoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    fun provideIODispatcher() : CoroutineDispatcher = Dispatchers.IO

    @Provides
    @Singleton
    fun provideCryptoRepo(cryptoAPI: CryptoAPI) : CryptoRepository =
        CryptoRepositoryImpl(cryptoAPI)
}
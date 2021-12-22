package com.example.cryptoapp.rest

import com.example.cryptoapp.model.Cryptos
import retrofit2.Response
import retrofit2.http.GET

interface CryptoAPI {

    @GET(CRYPTO_PRICE)
    suspend fun getCryptoPrices(): Response<Cryptos>

    companion object{
        const val BASE_URL = "https://api.exchange.cryptomkt.com/api/3/"
        const val CRYPTO_PRICE = "public/ticker"
    }
}
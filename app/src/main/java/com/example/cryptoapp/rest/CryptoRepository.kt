package com.example.cryptoapp.rest

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

interface CryptoRepository {
    val cryptoResponse: StateFlow<UIState>
    suspend fun getCryptoPrices()
}

class CryptoRepositoryImpl @Inject constructor(
    private val cryptoAPI: CryptoAPI
) : CryptoRepository{

    private var _cryptosResponse : MutableStateFlow<UIState> = MutableStateFlow(UIState.LOADING())

    override val cryptoResponse: StateFlow<UIState>
        get() = _cryptosResponse

    override suspend fun getCryptoPrices() {
        try{
            val response = cryptoAPI.getCryptoPrices()
            if (response.isSuccessful) {
                response.body()?.let { body ->
                    _cryptosResponse.value = UIState.SUCCESS(body)
                } ?: run {
                   _cryptosResponse.value = UIState.ERROR(Throwable("Response from cryptoPrices is null"))
                }
            } else{
                _cryptosResponse.value = UIState.ERROR(Throwable(response.errorBody()?.string()))
            }
        }catch (e : Exception) {
            _cryptosResponse.value = UIState.ERROR(Throwable(e))
        }
    }

}
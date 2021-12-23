package com.example.cryptoapp.rest

import com.example.cryptoapp.model.Cryptos

sealed class UIState {
    class LOADING : UIState()
    class SUCCESS(val cryptos: Cryptos) : UIState()
    class ERROR(val error:Throwable) : UIState()
}
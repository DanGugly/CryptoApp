package com.example.cryptoapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptoapp.rest.CryptoRepository
import com.example.cryptoapp.rest.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect
import javax.inject.Inject

@HiltViewModel
class CryptoViewModel @Inject constructor(
    private val repository: CryptoRepository,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel(){

    private var _cryptoLiveData: MutableLiveData<UIState> = MutableLiveData(UIState.LOADING())
    val cryptoPrices : LiveData<UIState> get() = _cryptoLiveData

    fun resetLiveData(){
        _cryptoLiveData.postValue(UIState.LOADING())
    }

    fun subscribeToCryptoPricesResponse(){
        collectCryptoResponse()
        viewModelScope.launch(ioDispatcher) {
            repository.getCryptoPrices()
        }
    }

    private fun collectCryptoResponse() {
        viewModelScope.launch(ioDispatcher)  {
            repository.cryptoResponse.collect { uiState ->
                when(uiState){
                    is UIState.LOADING -> { _cryptoLiveData.postValue(uiState) }
                    is UIState.SUCCESS -> { _cryptoLiveData.postValue(uiState) }
                    is UIState.ERROR -> { _cryptoLiveData.postValue(uiState) }
                }
            }
        }
    }
}
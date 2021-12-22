package com.example.cryptoapp.model


import com.google.gson.annotations.SerializedName

data class COMPBTC(
    @SerializedName("ask")
    val ask: String,
    @SerializedName("bid")
    val bid: String,
    @SerializedName("high")
    val high: String,
    @SerializedName("last")
    val last: String,
    @SerializedName("low")
    val low: String,
    @SerializedName("open")
    val `open`: String,
    @SerializedName("timestamp")
    val timestamp: String,
    @SerializedName("volume")
    val volume: String,
    @SerializedName("volume_quote")
    val volumeQuote: String
)
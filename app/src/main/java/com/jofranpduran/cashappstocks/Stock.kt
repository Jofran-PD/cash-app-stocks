package com.jofranpduran.cashappstocks

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Stock(
    val ticker: String,
    val name: String,
    val currency: String,
    @Json(name = "current_price_cents")
    val currentPriceCents: Int,
    val quantity: Int?,
    @Json(name ="current_price_timestamp")
    val currentPriceTimestamp: Int
)

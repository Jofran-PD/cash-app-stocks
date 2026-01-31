package com.jofranpduran.cashappstocks.ui.theme

import android.icu.util.Currency
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jofranpduran.cashappstocks.Stock
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
fun StockListItem(stock: Stock) {
    val dateFormatter = remember { SimpleDateFormat("MM/dd/yyyy", Locale.getDefault()) }
    val timeFormatter = remember { SimpleDateFormat("HH:mm:ss", Locale.getDefault()) }

    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
        ) {
            Text(
                text = stock.ticker,
                fontWeight = FontWeight(500),
                style = MaterialTheme.typography.titleLarge,
            )
            Text(
                text = stock.name,
                fontWeight = FontWeight(350),
                style = MaterialTheme.typography.labelSmall
            )
        }
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Price on ${dateFormatter.format(stock.currentPriceTimestamp)} " +
                        "at ${timeFormatter.format(stock.currentPriceTimestamp)}",
                fontWeight = FontWeight(350),
                style = MaterialTheme.typography.labelSmall
            )
            PriceText(stock.currency, stock.currentPriceCents)
            Text(
                text = "Quantity: ${stock.quantity}",
                fontWeight = FontWeight(350),
                style = MaterialTheme.typography.labelSmall
            )
        }
    }
}

@Composable
fun PriceText(currency: String, priceCents: Int) {
    Text(
        text =  "${Currency
                    .getInstance(currency)
                    .symbol}" +
                " ${String.format(
                    Locale.getDefault(), 
                    "%.2f", 
                    priceCents / 100.0
                )}",
        fontWeight = FontWeight(500),
        style = MaterialTheme.typography.titleLarge,
    )
}

@Preview(showBackground = true)
@Composable
fun StockListItemPreview() {
    CashAppStocksTheme {
        StockListItem(
            stock = Stock(
                ticker = "AAPL",
                name = "Apple Inc.",
                currency = "USD",
                currentPriceCents = 150000,
                quantity = 10,
                currentPriceTimestamp = 1
            )
        )
    }
}
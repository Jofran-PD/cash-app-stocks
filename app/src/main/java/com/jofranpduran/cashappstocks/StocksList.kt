package com.jofranpduran.cashappstocks

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jofranpduran.cashappstocks.ui.theme.CashAppStocksTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StocksList(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Stocks List") }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Text(text = "Here goes the list")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StocksListPreview() {
    CashAppStocksTheme {
        StocksList()
    }
}

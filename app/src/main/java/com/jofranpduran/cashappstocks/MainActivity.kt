package com.jofranpduran.cashappstocks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jofranpduran.cashappstocks.ui.theme.CashAppStocksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CashAppStocksTheme {
                CashAppStocks()
            }
        }
    }
}

@Composable
fun CashAppStocks(modifier: Modifier = Modifier) {
    Navigation()
}

@Preview(showBackground = true)
@Composable
fun CashAppStocksPreview() {
    CashAppStocksTheme {
        CashAppStocks()
    }
}
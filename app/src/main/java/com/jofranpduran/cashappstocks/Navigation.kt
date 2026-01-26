package com.jofranpduran.cashappstocks

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    Box(modifier = modifier.fillMaxSize()) {
        NavHost(
            modifier = modifier,
            navController = navController,
            startDestination = CashAppStocksDestinations.STOCKS_LIST
        ) {
            composable(CashAppStocksDestinations.STOCKS_LIST) {
                StocksList()
            }
        }
    }
}

object CashAppStocksDestinations {
    const val STOCKS_LIST = "stocksList"
}
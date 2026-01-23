package com.jofranpduran.cashappstocks

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = CashAppStocksDestinations.STOCKS_LIST
    ) { }
}

object CashAppStocksDestinations {
    const val STOCKS_LIST = "stocksList"
}
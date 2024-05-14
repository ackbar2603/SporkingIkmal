package com.example.sporking.navigation

sealed class Screen (val route: String){
    data object Splash: Screen("splash")
    data object Login: Screen("login")
}
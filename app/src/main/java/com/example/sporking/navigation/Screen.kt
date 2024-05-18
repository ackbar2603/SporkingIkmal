package com.example.sporking.navigation

sealed class Screen (val route: String){
    data object Splash: Screen("splash")
    data object Login: Screen("login")
    data object SignIn: Screen("sign_in")
    data object SignUp: Screen("sign_up")
    data object Otp: Screen("otp")
}
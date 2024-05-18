package com.example.sporking.presentation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sporking.navigation.Screen
import com.example.sporking.presentation.login.loginScreen
import com.example.sporking.presentation.otp.otpScreen
import com.example.sporking.presentation.signin.signInScreen
import com.example.sporking.presentation.signup.signUpScreen
import com.example.sporking.presentation.splash.splashScreen

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun sporkingApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController = navController,
        startDestination = Screen.Otp.route
    ) {
        composable(Screen.Splash.route){
            splashScreen(navController)
        }
        composable(Screen.Login.route){
            loginScreen(navController)
        }
        composable(Screen.SignIn.route){
            signInScreen(navController)
        }
        composable(Screen.SignUp.route){
            signUpScreen(navController)
        }
        composable(Screen.Otp.route){
            otpScreen(navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SporkingAppPev() {
    sporkingApp()
}
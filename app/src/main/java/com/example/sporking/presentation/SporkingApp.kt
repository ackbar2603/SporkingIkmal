package com.example.sporking.presentation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sporking.navigation.Screen

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun sporkingApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(Screen.Splash.route){
            splashScreen(navController)
        }
        composable(Screen.Login.route){
            loginScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SporkingAppPev() {
    sporkingApp()
}
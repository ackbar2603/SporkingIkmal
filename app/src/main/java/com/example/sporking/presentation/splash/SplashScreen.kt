package com.example.sporking.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sporking.R
import com.example.sporking.navigation.Screen
import com.example.sporking.ui.theme.Orange01

@Composable
fun splashScreen(
    navController: NavController,
    modifier: Modifier = Modifier
){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.sporkinglogoorange),
            contentDescription = "Sporking logo"
        )
        Text(text = "Booking Lapanganmu Dari Rumah", fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Orange01
        )
    }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(
            onClick = { navController.navigate(Screen.Login.route) },
            modifier = Modifier.size(width = 320.dp, height = 50.dp),
            shape = RoundedCornerShape(7.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color(0xFFFD7900)
            )
        ) {
            Text(text = "Lanjut", fontSize = 14.sp,fontWeight = FontWeight.SemiBold)
        }
        Spacer(modifier = Modifier.height(70.dp))
    }

}
package com.example.sporking.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
fun loginScreen (
    navController: NavController,
    modifier: Modifier = Modifier
){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.sporkinglogoorange),
            contentDescription = "SporkingLogo"
        )

        Text(text = "Booking Lapanganmu Dari Rumah", fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Orange01
        )
//        Spacer(modifier = Modifier.height(80.dp))
//
//
//        Spacer(modifier = Modifier.height(24.dp))
//
//        //Buttons
//
//
//        Spacer(modifier = Modifier.height(14.dp))
//
//
//
//        Spacer(modifier = Modifier.height(50.dp))
//
//
//        Spacer(modifier = Modifier.height(70.dp))

    }
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Text(text = "Welcome to Sporking", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "Temukan lapangan untuk bermain dan berolahraga")

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(width = 320.dp, height = 50.dp),
            shape = RoundedCornerShape(7.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color(0xFFFD7900)
            )
        ) {
            Text(text = "Daftar dengan nomor handphone", fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }

        Spacer(modifier = Modifier.height(14.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(width = 320.dp, height = 50.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(7.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xffe9e9e9)
            )
        ) {
            Image(painter = painterResource(id = R.drawable.icongoogle), contentDescription = null,
                modifier = Modifier.size(28.dp)
            )

            Spacer(Modifier.size(ButtonDefaults.IconSpacing))

            Text(text = "Daftar dengan Google", fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Orange01
            )

        }

        Spacer(modifier = Modifier.height(50.dp))

        Row (
        ){
            Text(text = "Sudah punya akun?")
            Spacer(Modifier.size(5.dp))
            Text(text = "Masuk di sini",
                modifier = Modifier.clickable { navController.navigate(Screen.SignIn.route) },
                color = Color.Blue
            )
        }

        Spacer(modifier = Modifier.height(70.dp))
    }
}
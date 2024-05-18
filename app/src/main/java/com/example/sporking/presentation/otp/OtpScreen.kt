package com.example.sporking.presentation.otp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.sporking.R
import com.example.sporking.navigation.Screen
import com.example.sporking.ui.theme.Orange01

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun otpScreen(
    navController: NavController,
    modifier: Modifier = Modifier
){
    TopAppBar(
        navigationIcon = { IconButton(onClick = { navController.navigate(Screen.SignUp.route)}) {
            Image(painter = painterResource(id = R.drawable.arrowleft), contentDescription = "")
        }},
        title = { /*TODO*/ }
    )
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(18.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = """Masukkan Kode OTP yang telah dikirimkan ke email <Email User>""",
            fontWeight = FontWeight.Bold, textAlign = TextAlign.Left, color = Orange01
        )
        Text(text = "Kirim Ulang OTP ('detik')", fontWeight = FontWeight.Bold,
            color = Orange01
        )

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.size(width = 320.dp, height = 50.dp),
            shape = RoundedCornerShape(7.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color(0xFFFD7900))
        )
        {
            Text(text = "Masuk")
        }

    }
}
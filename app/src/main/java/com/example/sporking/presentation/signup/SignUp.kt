@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.sporking.presentation.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sporking.R
import com.example.sporking.navigation.Screen
import com.example.sporking.ui.theme.Orange01

@Composable
fun signUpScreen(
    navController: NavController,
    modifier: Modifier = Modifier


){
    var name by remember {
        mutableStateOf("")
    }
    var email by remember{
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var confirmpassword by remember {
        mutableStateOf("")
    }

    TopAppBar(
        navigationIcon = { IconButton(onClick = {navController.navigate(Screen.SignIn.route)}) {
            Image(painter = painterResource(id = R.drawable.arrowleft), contentDescription = "Back to SignIn")
        }},
        title = { /*TODO*/ })

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Daftar", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Orange01)
        Spacer(modifier = Modifier.height(24.dp))

        //input
        Text(text = "Nama", modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
            textAlign = TextAlign.Left,
            color = Orange01, fontWeight = FontWeight.Bold
        )
        OutlinedTextField(modifier = Modifier.size(width = 320.dp, height = 50.dp),
            shape = RoundedCornerShape(7.dp),value = name, onValueChange = {name = it}
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Email", modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
            textAlign = TextAlign.Left,
            color = Orange01, fontWeight = FontWeight.Bold
        )
        OutlinedTextField(modifier = Modifier.size(width = 320.dp, height = 50.dp),
            shape = RoundedCornerShape(7.dp),value = email, onValueChange = {email = it}
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Password", modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
            textAlign = TextAlign.Left,
            color = Orange01, fontWeight = FontWeight.Bold
        )
        OutlinedTextField(modifier = Modifier.size(width = 320.dp, height = 50.dp),
            shape = RoundedCornerShape(7.dp),value = password, onValueChange = {password = it}
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Confirm Password", modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
            textAlign = TextAlign.Left,
            color = Orange01, fontWeight = FontWeight.Bold
        )
        OutlinedTextField(modifier = Modifier.size(width = 320.dp, height = 50.dp),
            shape = RoundedCornerShape(7.dp),value = confirmpassword, onValueChange = {confirmpassword =it}
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { navController.navigate(Screen.Otp.route) },
            modifier = Modifier.size(width = 320.dp, height = 50.dp),
            shape = RoundedCornerShape(7.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color(0xFFFD7900)
            )
        ) {
            Text(text = "Masuk", fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row {
            Text(text = "Sudah punya akun?")
            Spacer(modifier.size(5.dp))
            Text(modifier = Modifier.clickable { navController.navigate(Screen.SignIn.route) },
                text = "Masuk", color = Color.Blue)
        }
    }
}
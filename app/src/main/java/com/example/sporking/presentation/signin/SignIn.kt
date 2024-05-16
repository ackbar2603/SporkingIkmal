package com.example.sporking.presentation.signin

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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sporking.R
import com.example.sporking.ui.theme.Orange01
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.sporking.navigation.Screen

@Composable
fun signInScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    var email by remember {
        mutableStateOf("")
    }
    var password by rememberSaveable {
        mutableStateOf("")
    }
    var passwordVisibility by remember{
        mutableStateOf(false)
    }

    val icon = if (passwordVisibility)
        painterResource(id = R.drawable.visible)
    else
        painterResource(id = R.drawable.unvisible)



    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(30.dp))
        Image(painter = painterResource(id = R.drawable.sporkinglogoorange),
            contentDescription = "Logo Sporking"
        )
        Text(text = "Booking Lapanganmu Dari Rumah", fontSize = 18.sp,
            fontWeight = FontWeight.Bold, color = Orange01
        )

        Spacer(modifier = Modifier.height(45.dp))
        Text(text = "Welcome to Sporking", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text(text = """Temukan lapangan untuk bermain dan 
            |                       berolahraga""".trimMargin())
        
        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Email",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            textAlign = TextAlign.Left,
            color = Orange01, fontWeight = FontWeight.Bold
        )
        OutlinedTextField(modifier = Modifier.size(width = 320.dp, height = 50.dp),
            shape = RoundedCornerShape(7.dp),value = email, onValueChange = {email = it})

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Password", modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
            textAlign = TextAlign.Left,
            color = Orange01, fontWeight = FontWeight.Bold
        )
        OutlinedTextField(modifier = Modifier.size(width = 320.dp, height = 50.dp),
            shape = RoundedCornerShape(7.dp), value = password, onValueChange = {password = it})

        Spacer(modifier = Modifier.height(48.dp))

        Button(
            onClick = { /*TODO*/ },
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
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = "Lupa password?")
        Row {
            Text(text = "Belum punya akun?")
            Spacer(Modifier.size(5.dp))
            Text(modifier = Modifier.clickable { navController.navigate(Screen.SignUp.route) },
                text = "Daftar", color = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(18.dp))
        Text(text = "Atau")
        Spacer(modifier = Modifier.height(18.dp))

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


    }


}


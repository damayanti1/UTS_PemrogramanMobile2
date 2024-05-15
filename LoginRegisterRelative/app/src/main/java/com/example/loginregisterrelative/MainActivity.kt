package com.example.loginregisterrelative

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginregisterrelative.ui.theme.LoginRegisterRelativeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginRegisterRelativeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")

                    btnLoginListener()
                    btnRegisterListener()
                }
           private fun btnLoginListener() {
btn_1.setOnClickListener {
    startActivity(intent(this, LoginActivity::class.java))
}
                }

            private fun btnRegisterListener() {
                btn_2.setOnClickListener {
                    startActivity(intent(this, RegisterActivity::class.java))
        }
    }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginRegisterRelativeTheme {
        Greeting("Android")
    }
}
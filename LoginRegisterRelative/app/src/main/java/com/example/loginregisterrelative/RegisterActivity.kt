package com.example.loginregisterrelative

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            txtLoginListener()
            btnBackListener()
        }

        private fun txtLoginListener(){
            txt_Login.setOnClickListener {
                startActivity(Intent(this, LoginActivity::class.java))
            }
            private fun btnBackListener(){
               R_img_1.setOnClickListener {
                    startActivity(Intent(this, MainActivity::class.java))
        }

    }
}
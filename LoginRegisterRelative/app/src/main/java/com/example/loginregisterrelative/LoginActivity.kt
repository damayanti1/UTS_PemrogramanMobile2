package com.example.loginregisterrelative

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
       supportActionBar?.hide()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

btnBackLoginlistener()
            txtRegisterListener()
        }
        private fun btnBackLoginListener()
    L.img_1.setOnClickListener {
        startActivity(intent(this, MainActivity::class.java))
    }
    }
    private fun txtRegisterListener()
    txt_register.setOnClickListener {
        startActivity(intent(this, RegisterActivity::class.java))
}
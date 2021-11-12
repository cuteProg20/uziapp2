package com.example.project101

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.net.PasswordAuthentication
import java.security.KeyStore

class LoginPage: AppCompatActivity() {

lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        imageView = findViewById(R.id.imageView3)


        var email

        email.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_user, 0, 0, 0)

    }


}
package com.example.project101

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class LoginPage: AppCompatActivity() {

lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        imageView = findViewById(R.id.imageView3)
    }

}
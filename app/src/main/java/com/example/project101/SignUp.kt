package com.example.project101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*


class SignUp : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

    }

    fun goToLogin(v: View) {
        // Open your SignUp Activity if the user wants to signup
        // Visit this article to get SignupActivity code https://handyopinion.com/signup-activity-in-android-studio-kotlin-java/
        val intent = Intent(this, LoginPage::class.java)
        startActivity(intent)
    }

    fun goToHome(v: View) {
        // Open your SignUp Activity if the user wants to signup
        // Visit this article to get SignupActivity code https://handyopinion.com/signup-activity-in-android-studio-kotlin-java/
        val intent = Intent(this, HomeScreen::class.java)
        startActivity(intent)
    }

}
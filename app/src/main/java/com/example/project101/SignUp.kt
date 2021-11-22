package com.example.project101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*


class SignUp : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val countryCode = country_code_picker!!.selectedCountryCode

        Toast.makeText(this,
            "Country Code :  $countryCode",
            Toast.LENGTH_SHORT).show()

    }



}
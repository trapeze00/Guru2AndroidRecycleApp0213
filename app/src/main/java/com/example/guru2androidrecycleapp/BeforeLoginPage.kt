package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BeforeLoginPage : AppCompatActivity() {

    //변수 선언
    lateinit var BeforeSignIn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_before_login_page)

        //변수와 아이디 연결
        BeforeSignIn=findViewById(R.id.BeforeSignIn)

        BeforeSignIn.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
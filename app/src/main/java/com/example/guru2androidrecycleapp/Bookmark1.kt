package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bookmark1 : AppCompatActivity() {

    lateinit var btn_authentication : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookmark1)

        btn_authentication = findViewById(R.id.btn_authentication)

        btn_authentication.setOnClickListener {
            var intent = Intent(this, Bookmark2::class.java)
            startActivity(intent)
        }
    }
}
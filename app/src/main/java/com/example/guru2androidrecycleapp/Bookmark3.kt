package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class Bookmark3 : AppCompatActivity() {

    lateinit var authentication_ok: Button  //확인 버튼

    lateinit var check_1: CheckBox
    lateinit var check_2: CheckBox
    lateinit var check_3: CheckBox
    lateinit var check_4: CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookmark3)

        authentication_ok = findViewById(R.id.authentication_ok)

        check_1 = findViewById<CheckBox>(R.id.check_1)
        check_2 = findViewById<CheckBox>(R.id.check_2)
        check_3 = findViewById<CheckBox>(R.id.check_3)
        check_4 = findViewById<CheckBox>(R.id.check_4)

        authentication_ok.setOnClickListener {
            var intent = Intent(this, MyPage::class.java)
            startActivity(intent)
        }
    }
}
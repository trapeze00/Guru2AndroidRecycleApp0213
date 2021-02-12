package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class MyPage : AppCompatActivity() {

    lateinit var home4: ImageButton
    lateinit var bookmark4: ImageButton
    lateinit var quiz4:ImageButton
    //마이 페이지 버튼은 비활성화

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        home4=findViewById(R.id.home4)
        bookmark4=findViewById(R.id.bookmark4)
        quiz4=findViewById(R.id.quiz4)

        home4.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        bookmark4.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        quiz4.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }



    }
}
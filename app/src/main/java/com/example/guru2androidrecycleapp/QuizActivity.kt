package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class QuizActivity : AppCompatActivity() {

    lateinit var mypage1: ImageButton
    lateinit var home1: ImageButton
    lateinit var quiz1: ImageButton
    lateinit var bookmark1: ImageButton

    lateinit var btnQuizPaper: Button
    lateinit var btnQuizPlastic: Button
    lateinit var btnQuizGlass: Button
    lateinit var btnQuizCan: Button
    lateinit var btnQuizVinyl: Button
    lateinit var btnQuizStyrofoam: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        mypage1 = findViewById<ImageButton>(R.id.mypage1)
        home1 = findViewById<ImageButton>(R.id.home1)
        quiz1 = findViewById<ImageButton>(R.id.quiz1)
        bookmark1 = findViewById<ImageButton>(R.id.bookmark1)

        //변수와 xml의 아이디 연결하기
        btnQuizPaper = findViewById(R.id.btnQuizPaper)
        btnQuizPlastic = findViewById(R.id.btnQuizPlastic)
        btnQuizGlass = findViewById(R.id.btnQuizGlass)
        btnQuizCan = findViewById(R.id.btnQuizCan)
        btnQuizVinyl = findViewById(R.id.btnQuizVinyl)
        btnQuizStyrofoam = findViewById(R.id.btnQuizStyrofoam)


        mypage1.setOnClickListener {
            var intent = Intent(this, MyPage::class.java)
            startActivity(intent)
        }

        home1.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        quiz1.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        bookmark1.setOnClickListener {
            var intent = Intent(this, Bookmark1::class.java)
            startActivity(intent)
        }

        //종이 버튼을 누르면 종이 퀴즈 페이지로 이동
        btnQuizPaper.setOnClickListener {
            var intent = Intent(this, pageQuizPaper::class.java)
            startActivity(intent)
        }
    }
}
package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QuizActivity : AppCompatActivity() {

    lateinit var btnQuizPaper:Button
    lateinit var btnQuizPlastic:Button
    lateinit var btnQuizGlass:Button
    lateinit var btnQuizCan:Button
    lateinit var btnQuizVinyl:Button
    lateinit var btnQuizStyrofoam:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)


        //변수와 xml의 아이디 연결하기
        btnQuizPaper=findViewById(R.id.btnQuizPaper)
        btnQuizPlastic=findViewById(R.id.btnQuizPlastic)
        btnQuizGlass=findViewById(R.id.btnQuizGlass)
        btnQuizCan=findViewById(R.id.btnQuizCan)
        btnQuizVinyl=findViewById(R.id.btnQuizVinyl)
        btnQuizStyrofoam=findViewById(R.id.btnQuizStyrofoam)

        //종이 버튼을 누르면 종이 퀴즈 페이지로 이동
        btnQuizPaper.setOnClickListener {
            var intent = Intent(this, pageQuizPaper::class.java)
            startActivity(intent)
        }

        //플라스틱 버튼을 누르면 플라스틱 퀴즈 페이지로 이동
        btnQuizPlastic.setOnClickListener {
            var intent = Intent(this, pageQuizPlastic::class.java)
            startActivity(intent)
        }

        //유리버튼을 누르면 유리 퀴즈 페이지로 이동
        btnQuizGlass.setOnClickListener {
            var intent = Intent(this, pageQuizGlass::class.java)
            startActivity(intent)
        }

        //금속 버튼을 누르면 플라스틱 퀴즈 페이지로 이동
        btnQuizCan.setOnClickListener {
            var intent = Intent(this, pageQuizCan::class.java)
            startActivity(intent)
        }

        //비닐 버튼을 누르면 플라스틱 퀴즈 페이지로 이동
        btnQuizVinyl.setOnClickListener {
            var intent = Intent(this, pageQuizVinyl::class.java)
            startActivity(intent)
        }

        //스티로폼 버튼을 누르면 플라스틱 퀴즈 페이지로 이동
        btnQuizStyrofoam.setOnClickListener {
            var intent = Intent(this, pageQuizStyrofoam::class.java)
            startActivity(intent)
        }
    }
}
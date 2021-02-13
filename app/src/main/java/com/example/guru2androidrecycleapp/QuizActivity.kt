package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class QuizActivity : AppCompatActivity() {

    lateinit var btnQuizPaper:Button
    lateinit var btnQuizPlastic:Button
    lateinit var btnQuizGlass:Button
    lateinit var btnQuizCan:Button
    lateinit var btnQuizVinyl:Button
    lateinit var btnQuizStyrofoam:Button

    //퀴즈 버튼은 비활성화
    lateinit var Quizhome: ImageButton
    lateinit var Quizbookmark: ImageButton
    lateinit var Quizmypage: ImageButton

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

        Quizbookmark=findViewById(R.id.Quizbookmark)
        Quizhome=findViewById(R.id.Quizhome)
        Quizmypage=findViewById(R.id.Quizmypage)

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

        //금속 버튼을 누르면 금속 퀴즈 페이지로 이동
        btnQuizCan.setOnClickListener {
            var intent = Intent(this, pageQuizCan::class.java)
            startActivity(intent)
        }

        //비닐 버튼을 누르면 비닐 퀴즈 페이지로 이동
        btnQuizVinyl.setOnClickListener {
            var intent = Intent(this, pageQuizVinyl::class.java)
            startActivity(intent)
        }

        //스티로폼 버튼을 누르면 스티로폼 퀴즈 페이지로 이동
        btnQuizStyrofoam.setOnClickListener {
            var intent = Intent(this, pageQuizStyrofoam::class.java)
            startActivity(intent)
        }

        //버튼 클릭시 화면 전환 (메뉴)
        Quizbookmark.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        Quizhome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        Quizmypage.setOnClickListener {
            var intent = Intent(this, MyPage::class.java)
            startActivity(intent)
        }

    }
}
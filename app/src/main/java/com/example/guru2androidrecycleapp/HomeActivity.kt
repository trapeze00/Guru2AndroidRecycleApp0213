package com.example.guru2androidrecycleapp

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import kotlin.concurrent.timer

class HomeActivity : AppCompatActivity() {

    lateinit var mypage3: ImageButton
    lateinit var home3: ImageButton
    lateinit var quiz3: ImageButton
    lateinit var bookmark3: ImageButton
    lateinit var quizPaper: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        mypage3 = findViewById<ImageButton>(R.id.mypage3)
        home3 = findViewById<ImageButton>(R.id.home3)
        quiz3 = findViewById<ImageButton>(R.id.quiz3)
        bookmark3 = findViewById<ImageButton>(R.id.bookmark3)
        quizPaper = findViewById<ImageButton>(R.id.quizPaper)


            //mypage 버튼 클릭 시 마이페이지 이동
            mypage3.setOnClickListener {
                var intent = Intent(this, MyPage::class.java)
                startActivity(intent)
            }

            //home 버튼 클릭 시 홈으로 이동
            home3.setOnClickListener {
                var intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }

            //quiz 버튼 클릭 시 퀴즈로 이동
            quiz3.setOnClickListener {
                var intent = Intent(this, QuizActivity::class.java)
                startActivity(intent)
            }

            //bookmark 버튼 클릭 시 인증으로 이동
            bookmark3.setOnClickListener {
                var intent = Intent(this, Bookmark1::class.java)
                startActivity(intent)
            }

            quizPaper.setOnClickListener {
                var intent = Intent(this, HomePaper::class.java)
                startActivity(intent)
            }





            }
        }

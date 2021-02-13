package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class BookmarkActivity : AppCompatActivity() {

    lateinit var btn_authentication : Button

    //메뉴 버튼 변수 선언
    //인증 버튼은 비활성화
    lateinit var Bookmarkhome: ImageButton
    lateinit var Bookmarkquiz: ImageButton
    lateinit var Bookmarkmypage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookmark)


        btn_authentication = findViewById(R.id.btn_authentication)

        Bookmarkhome=findViewById(R.id.Bookmarkhome)
        Bookmarkquiz=findViewById(R.id.Bookmarkquiz)
        Bookmarkmypage=findViewById(R.id.Bookmarkmypage)

        btn_authentication.setOnClickListener {
            var intent = Intent(this, BookmarkPageAuthentication::class.java)
            startActivity(intent)
        }

        //메뉴 버튼 이동
        Bookmarkhome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        Bookmarkquiz.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        Bookmarkmypage.setOnClickListener{
            var intent= Intent(this,MyPage::class.java)
            startActivity(intent)
        }
    }
}
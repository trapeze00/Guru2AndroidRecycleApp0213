package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PageTipCan : AppCompatActivity() {

    lateinit var TipCanHome: ImageButton
    lateinit var TipCanbookmark: ImageButton
    lateinit var TipCanquiz: ImageButton
    lateinit var TipCanmypage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_tip_can)

        TipCanHome=findViewById(R.id.TipCanhome)
        TipCanbookmark=findViewById(R.id.TipCanbookmark)
        TipCanquiz=findViewById(R.id.TipCanquiz)
        TipCanmypage=findViewById(R.id.TipCanmypage)

        //버튼 클릭시 화면 전환 (메뉴)
        TipCanHome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        TipCanbookmark.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        TipCanquiz.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        TipCanmypage.setOnClickListener {
            var intent = Intent(this, MyPage::class.java)
            startActivity(intent)
        }

    }
}
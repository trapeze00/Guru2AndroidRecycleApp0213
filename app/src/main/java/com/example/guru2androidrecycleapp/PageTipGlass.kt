package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PageTipGlass : AppCompatActivity() {

    lateinit var TipGlassHome: ImageButton
    lateinit var TipGlassbookmark: ImageButton
    lateinit var TipGlassquiz: ImageButton
    lateinit var TipGlassmypage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_tip_glass)

        TipGlassHome=findViewById(R.id.TipGlasshome)
        TipGlassbookmark=findViewById(R.id.TipGlassbookmark)
        TipGlassquiz=findViewById(R.id.TipGlassquiz)
        TipGlassmypage=findViewById(R.id.TipGlassmypage)

        //버튼 클릭시 화면 전환 (메뉴)
        TipGlassHome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        TipGlassbookmark.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        TipGlassquiz.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        TipGlassmypage.setOnClickListener {
            var intent = Intent(this, MyPage::class.java)
            startActivity(intent)
        }

    }
}
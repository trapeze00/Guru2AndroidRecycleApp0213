package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PageTipStyrofoam : AppCompatActivity() {

    lateinit var TipStyrofoamHome: ImageButton
    lateinit var TipStyrofoambookmark: ImageButton
    lateinit var TipStyrofoamquiz: ImageButton
    lateinit var TipStyrofoammypage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_tip_styrofoam)

        TipStyrofoamHome=findViewById(R.id.TipStyrofoamhome)
        TipStyrofoambookmark=findViewById(R.id.TipStyrofoambookmark)
        TipStyrofoamquiz=findViewById(R.id.TipStyrofoamquiz)
        TipStyrofoammypage=findViewById(R.id.TipStyrofoammypage)

        //버튼 클릭시 화면 전환 (메뉴)
        TipStyrofoamHome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        TipStyrofoambookmark.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        TipStyrofoamquiz.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        TipStyrofoammypage.setOnClickListener {
            var intent = Intent(this, MyPage::class.java)
            startActivity(intent)
        }
    }
}
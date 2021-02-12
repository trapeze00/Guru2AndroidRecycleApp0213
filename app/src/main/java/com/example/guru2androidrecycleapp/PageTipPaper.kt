package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PageTipPaper : AppCompatActivity() {

    lateinit var TipPaperHome: ImageButton
    lateinit var TipPaperbookmark:ImageButton
    lateinit var TipPaperquiz:ImageButton
    lateinit var TipPapermypage:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_tip_paper)

        TipPaperHome=findViewById(R.id.TipPaperhome)
        TipPaperbookmark=findViewById(R.id.TipPaperbookmark)
        TipPaperquiz=findViewById(R.id.TipPaperquiz)
        TipPapermypage=findViewById(R.id.TipPapermypage)

        //버튼 클릭시 화면 전환 (메뉴)
        TipPaperHome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        TipPaperbookmark.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        TipPaperquiz.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        TipPapermypage.setOnClickListener {
            var intent = Intent(this, MyPage::class.java)
            startActivity(intent)
        }
    }
}
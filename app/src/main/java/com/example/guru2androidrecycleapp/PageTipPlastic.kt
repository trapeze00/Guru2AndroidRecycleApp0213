package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PageTipPlastic : AppCompatActivity() {
    lateinit var TipPlasticHome: ImageButton
    lateinit var TipPlasticbookmark: ImageButton
    lateinit var TipPlasticquiz: ImageButton
    lateinit var TipPlasticmypage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_tip_plastic)

        TipPlasticHome=findViewById(R.id.TipPlastichome)
        TipPlasticbookmark=findViewById(R.id.TipPlasticbookmark)
        TipPlasticquiz=findViewById(R.id.TipPlasticquiz)
        TipPlasticmypage=findViewById(R.id.TipPlasticmypage)

        //버튼 클릭시 화면 전환 (메뉴)
        TipPlasticHome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        TipPlasticbookmark.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        TipPlasticquiz.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        TipPlasticmypage.setOnClickListener {
            var intent = Intent(this, MyPage::class.java)
            startActivity(intent)
        }
    }
}
package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PageTipVinyl : AppCompatActivity() {

    lateinit var TipVinylHome: ImageButton
    lateinit var TipVinylbookmark: ImageButton
    lateinit var TipVinylquiz: ImageButton
    lateinit var TipVinylmypage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_tip_vinyl)

        TipVinylHome=findViewById(R.id.TipVinylhome)
        TipVinylbookmark=findViewById(R.id.TipVinylbookmark)
        TipVinylquiz=findViewById(R.id.TipVinylquiz)
        TipVinylmypage=findViewById(R.id.TipVinylmypage)

        //버튼 클릭시 화면 전환 (메뉴)
        TipVinylHome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        TipVinylbookmark.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        TipVinylquiz.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        TipVinylmypage.setOnClickListener {
            var intent = Intent(this, MyPage::class.java)
            startActivity(intent)
        }
    }
}
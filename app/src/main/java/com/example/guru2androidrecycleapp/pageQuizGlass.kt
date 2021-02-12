package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class pageQuizGlass : AppCompatActivity() {

    //O,X,답에 대한 변수 선언
    lateinit var Quiz1GlassO: Button
    lateinit var Quiz1GlassX: Button
    lateinit var Quiz1GlassAns: TextView
    lateinit var Quiz2GlassO: Button
    lateinit var Quiz2GlassX: Button
    lateinit var Quiz2GlassAns: TextView

    //메뉴 버튼 변수 선언
    lateinit var QuizGlasshome: ImageButton
    lateinit var QuizGlassbookmark: ImageButton
    lateinit var QuizGlassquiz: ImageButton
    lateinit var QuizGlassmypage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_quiz_glass)

        //변수와 xml아이디 연결하기
        Quiz1GlassO=findViewById(R.id.Quiz1GlassO)
        Quiz1GlassX=findViewById(R.id.Quiz1GlassX)
        Quiz1GlassAns=findViewById(R.id.Quiz1GlassAns)
        Quiz2GlassO=findViewById(R.id.Quiz2GlassO)
        Quiz2GlassX=findViewById(R.id.Quiz2GlassX)
        Quiz2GlassAns=findViewById(R.id.Quiz2GlassAns)

        QuizGlasshome=findViewById(R.id.QuizGlasshome)
        QuizGlassbookmark=findViewById(R.id.QuizGlassbookmark)
        QuizGlassquiz=findViewById(R.id.QuizGlassquiz)
        QuizGlassmypage=findViewById(R.id.QuizGlassmypage)

        //O,X 버튼을 누르면 하단의 정답이 보이도록
        Quiz1GlassO.setOnClickListener {
            Quiz1GlassAns.visibility= View.VISIBLE
        }
        Quiz1GlassX.setOnClickListener {
            Quiz1GlassAns.visibility= View.VISIBLE
        }
        Quiz2GlassO.setOnClickListener {
            Quiz2GlassAns.visibility= View.VISIBLE
        }
        Quiz2GlassX.setOnClickListener {
            Quiz2GlassAns.visibility= View.VISIBLE
        }

        //정답을 선택했을 경우 5point를 얻게 된다.

        //메뉴 버튼 이동
        QuizGlasshome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        QuizGlassbookmark.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        QuizGlassquiz.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        QuizGlassmypage.setOnClickListener{
            var intent= Intent(this,MyPage::class.java)
            startActivity(intent)
        }
    }
}
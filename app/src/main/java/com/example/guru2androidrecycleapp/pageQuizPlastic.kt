package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class pageQuizPlastic : AppCompatActivity() {

    //O,X,답에 대한 변수 선언
    lateinit var Quiz1PlasticO: Button
    lateinit var Quiz1PlasticX: Button
    lateinit var Quiz1PlasticAns: TextView
    lateinit var Quiz2PlasticO: Button
    lateinit var Quiz2PlasticX: Button
    lateinit var Quiz2PlasticAns: TextView

    //메뉴 버튼 변수 선언
    lateinit var QuizPlastichome: ImageButton
    lateinit var QuizPlasticbookmark: ImageButton
    lateinit var QuizPlasticquiz: ImageButton
    lateinit var QuizPlasticmypage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_quiz_plastic)

        //변수와 xml아이디 연결하기
        Quiz1PlasticO=findViewById(R.id.Quiz1PlasticO)
        Quiz1PlasticX=findViewById(R.id.Quiz1PlasticX)
        Quiz1PlasticAns=findViewById(R.id.Quiz1PlasticAns)
        Quiz2PlasticO=findViewById(R.id.Quiz2PlasticO)
        Quiz2PlasticX=findViewById(R.id.Quiz2PlasticX)
        Quiz2PlasticAns=findViewById(R.id.Quiz2PlasticAns)

        QuizPlastichome=findViewById(R.id.QuizPlastichome)
        QuizPlasticbookmark=findViewById(R.id.QuizPlasticbookmark)
        QuizPlasticquiz=findViewById(R.id.QuizPlasticquiz)
        QuizPlasticmypage=findViewById(R.id.QuizPlasticmypage)

        //O,X 버튼을 누르면 하단의 정답이 보이도록
        Quiz1PlasticO.setOnClickListener {
            Quiz1PlasticAns.visibility= View.VISIBLE
        }
        Quiz1PlasticX.setOnClickListener {
            Quiz1PlasticAns.visibility= View.VISIBLE
        }
        Quiz2PlasticO.setOnClickListener {
            Quiz2PlasticAns.visibility= View.VISIBLE
        }
        Quiz2PlasticX.setOnClickListener {
            Quiz2PlasticAns.visibility= View.VISIBLE
        }

        //정답을 선택했을 경우 5point를 얻게 된다.

        //메뉴 버튼 이동
        QuizPlastichome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        QuizPlasticbookmark.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        QuizPlasticquiz.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        QuizPlasticmypage.setOnClickListener{
            var intent= Intent(this,MyPage::class.java)
            startActivity(intent)
        }
    }
}
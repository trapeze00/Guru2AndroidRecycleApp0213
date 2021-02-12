package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class pageQuizCan : AppCompatActivity() {

    //O,X,답에 대한 변수 선언
    lateinit var Quiz1CanO: Button
    lateinit var Quiz1CanX: Button
    lateinit var Quiz1CanAns: TextView
    lateinit var Quiz2CanO: Button
    lateinit var Quiz2CanX: Button
    lateinit var Quiz2CanAns: TextView

    //메뉴 버튼 변수 선언
    lateinit var QuizCanhome: ImageButton
    lateinit var QuizCanbookmark: ImageButton
    lateinit var QuizCanquiz: ImageButton
    lateinit var QuizCanmypage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_quiz_can)

        //변수와 xml아이디 연결하기
        Quiz1CanO=findViewById(R.id.Quiz1CanO)
        Quiz1CanX=findViewById(R.id.Quiz1CanX)
        Quiz1CanAns=findViewById(R.id.Quiz1CanAns)
        Quiz2CanO=findViewById(R.id.Quiz2CanO)
        Quiz2CanX=findViewById(R.id.Quiz2CanX)
        Quiz2CanAns=findViewById(R.id.Quiz2CanAns)

        QuizCanhome=findViewById(R.id.QuizCanhome)
        QuizCanbookmark=findViewById(R.id.QuizCanbookmark)
        QuizCanquiz=findViewById(R.id.QuizCanquiz)
        QuizCanmypage=findViewById(R.id.QuizCanmypage)

        //O,X 버튼을 누르면 하단의 정답이 보이도록
        Quiz1CanO.setOnClickListener {
            Quiz1CanAns.visibility= View.VISIBLE
        }
        Quiz1CanX.setOnClickListener {
            Quiz1CanAns.visibility= View.VISIBLE
        }
        Quiz2CanO.setOnClickListener {
            Quiz2CanAns.visibility= View.VISIBLE
        }
        Quiz2CanX.setOnClickListener {
            Quiz2CanAns.visibility= View.VISIBLE
        }

        //정답을 선택했을 경우 5point를 얻게 된다.

        //메뉴 버튼 이동
        QuizCanhome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        QuizCanbookmark.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        QuizCanquiz.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        QuizCanmypage.setOnClickListener{
            var intent= Intent(this,MyPage::class.java)
            startActivity(intent)
        }
    }
}
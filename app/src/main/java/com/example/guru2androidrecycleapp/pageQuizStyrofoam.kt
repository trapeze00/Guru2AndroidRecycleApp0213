package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class pageQuizStyrofoam : AppCompatActivity() {

    //O,X,답에 대한 변수 선언
    lateinit var Quiz1StyrofoamO: Button
    lateinit var Quiz1StyrofoamX: Button
    lateinit var Quiz1StyrofoamAns: TextView
    lateinit var Quiz2StyrofoamO: Button
    lateinit var Quiz2StyrofoamX: Button
    lateinit var Quiz2StyrofoamAns: TextView

    //메뉴 버튼 변수 선언
    lateinit var QuizStyrofoamhome: ImageButton
    lateinit var QuizStyrofoambookmark: ImageButton
    lateinit var QuizStyrofoamquiz: ImageButton
    lateinit var QuizStyrofoammypage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_quiz_styrofoam)

        //변수와 xml아이디 연결하기
        Quiz1StyrofoamO=findViewById(R.id.Quiz1StyrofoamO)
        Quiz1StyrofoamX=findViewById(R.id.Quiz1StyrofoamX)
        Quiz1StyrofoamAns=findViewById(R.id.Quiz1StyrofoamAns)
        Quiz2StyrofoamO=findViewById(R.id.Quiz2StyrofoamO)
        Quiz2StyrofoamX=findViewById(R.id.Quiz2StyrofoamX)
        Quiz2StyrofoamAns=findViewById(R.id.Quiz2StyrofoamAns)

        QuizStyrofoamhome=findViewById(R.id.QuizStyrofoamhome)
        QuizStyrofoambookmark=findViewById(R.id.QuizStyrofoambookmark)
        QuizStyrofoamquiz=findViewById(R.id.QuizStyrofoamquiz)
        QuizStyrofoammypage=findViewById(R.id.QuizStyrofoammypage)

        //O,X 버튼을 누르면 하단의 정답이 보이도록
        Quiz1StyrofoamO.setOnClickListener {
            Quiz1StyrofoamAns.visibility= View.VISIBLE
        }
        Quiz1StyrofoamX.setOnClickListener {
            Quiz1StyrofoamAns.visibility= View.VISIBLE
        }
        Quiz2StyrofoamO.setOnClickListener {
            Quiz2StyrofoamAns.visibility= View.VISIBLE
        }
        Quiz2StyrofoamX.setOnClickListener {
            Quiz2StyrofoamAns.visibility= View.VISIBLE
        }

        //정답을 선택했을 경우 5point를 얻게 된다.

        //메뉴 버튼 이동
        QuizStyrofoamhome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        QuizStyrofoambookmark.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        QuizStyrofoamquiz.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        QuizStyrofoammypage.setOnClickListener{
            var intent= Intent(this,MyPage::class.java)
            startActivity(intent)
        }
    }

}

package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class pageQuizVinyl : AppCompatActivity() {

    //O,X,답에 대한 변수 선언
    lateinit var Quiz1VinylO: Button
    lateinit var Quiz1VinylX: Button
    lateinit var Quiz1VinylAns: TextView
    lateinit var Quiz2VinylO: Button
    lateinit var Quiz2VinylX: Button
    lateinit var Quiz2VinylAns: TextView

    //메뉴 버튼 변수 선언
    lateinit var QuizVinylhome: ImageButton
    lateinit var QuizVinylbookmark: ImageButton
    lateinit var QuizVinylquiz: ImageButton
    lateinit var QuizVinylmypage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_quiz_vinyl)

        //변수와 xml아이디 연결하기
        Quiz1VinylO=findViewById(R.id.Quiz1VinylO)
        Quiz1VinylX=findViewById(R.id.Quiz1VinylX)
        Quiz1VinylAns=findViewById(R.id.Quiz1VinylAns)
        Quiz2VinylO=findViewById(R.id.Quiz2VinylO)
        Quiz2VinylX=findViewById(R.id.Quiz2VinylX)
        Quiz2VinylAns=findViewById(R.id.Quiz2VinylAns)

        QuizVinylhome=findViewById(R.id.QuizVinylhome)
        QuizVinylbookmark=findViewById(R.id.QuizVinylbookmark)
        QuizVinylquiz=findViewById(R.id.QuizVinylquiz)
        QuizVinylmypage=findViewById(R.id.QuizVinylmypage)

        //O,X 버튼을 누르면 하단의 정답이 보이도록
        Quiz1VinylO.setOnClickListener {
            Quiz1VinylAns.visibility= View.VISIBLE
        }
        Quiz1VinylX.setOnClickListener {
            Quiz1VinylAns.visibility= View.VISIBLE
        }
        Quiz2VinylO.setOnClickListener {
            Quiz2VinylAns.visibility= View.VISIBLE
        }
        Quiz2VinylX.setOnClickListener {
            Quiz2VinylAns.visibility= View.VISIBLE
        }

        //정답을 선택했을 경우 5point를 얻게 된다.

        //메뉴 버튼 이동
        QuizVinylhome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        QuizVinylbookmark.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        QuizVinylquiz.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        QuizVinylmypage.setOnClickListener{
            var intent= Intent(this,MyPage::class.java)
            startActivity(intent)
        }
    }

}

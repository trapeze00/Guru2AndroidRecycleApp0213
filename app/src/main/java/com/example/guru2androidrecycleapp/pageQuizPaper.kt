package com.example.guru2androidrecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class pageQuizPaper : AppCompatActivity() {

    //O,X,답에 대한 변수 선언
    lateinit var Quiz1PaperO:Button
    lateinit var Quiz1PaperX:Button
    lateinit var Quiz1PaperAns:TextView
    lateinit var Quiz2PaperO: Button
    lateinit var Quiz2PaperX:Button
    lateinit var Quiz2PaperAns: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_paper)

        //변수와 xml아이디 연결하기
        Quiz1PaperO=findViewById(R.id.Quiz1PaperO)
        Quiz1PaperX=findViewById(R.id.Quiz1PaperX)
        Quiz1PaperAns=findViewById(R.id.Quiz1PaperAns)
        Quiz2PaperO=findViewById(R.id.Quiz2PaperO)
        Quiz2PaperX=findViewById(R.id.Quiz2PaperX)
        Quiz2PaperAns=findViewById(R.id.Quiz2PaperAns)

        //O,X 버튼을 누르면 하단의 정답이 보이도록
        Quiz1PaperO.setOnClickListener {
            Quiz1PaperAns.visibility=View.VISIBLE
        }
        Quiz1PaperX.setOnClickListener {
            Quiz1PaperAns.visibility= View.VISIBLE
        }
        Quiz2PaperO.setOnClickListener {
            Quiz2PaperAns.visibility=View.VISIBLE
        }
        Quiz2PaperX.setOnClickListener {
            Quiz2PaperAns.visibility=View.VISIBLE
        }

        //정답을 선택했을 경우 5point를 얻게 된다.

    }
}
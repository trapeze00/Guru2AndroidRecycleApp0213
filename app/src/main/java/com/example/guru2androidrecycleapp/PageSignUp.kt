package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.regex.PatternSyntaxException


class PageSignUp : AppCompatActivity() {

    private lateinit var auth:FirebaseAuth

    lateinit var btnSignUpSuccess :Button
    lateinit var SignUpTextEmail : EditText
    lateinit var SignUpTextPasswd :EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_sign_up)

        auth = FirebaseAuth.getInstance()

        btnSignUpSuccess=findViewById(R.id.btnSignUpSuccess)
        SignUpTextEmail=findViewById(R.id.SignUpTextEmail)
        SignUpTextPasswd=findViewById(R.id.SignUpTextPasswd)

        btnSignUpSuccess.setOnClickListener{
            signUpUser()
        }

    }
    private fun signUpUser(){
        if(SignUpTextEmail.text.toString().isEmpty()){
            SignUpTextEmail.error="Please enter email"
            SignUpTextEmail.requestFocus()
            return
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(SignUpTextEmail.text.toString()).matches()){
            SignUpTextEmail.error="Please enter valid email"
            SignUpTextEmail.requestFocus()
            return
        }

        if(SignUpTextPasswd.text.toString().isEmpty()){
            SignUpTextPasswd.error="Please enter password"
            SignUpTextPasswd.requestFocus()
            return
        }

        auth.createUserWithEmailAndPassword(SignUpTextEmail.text.toString(),SignUpTextPasswd.text.toString()).addOnCompleteListener(this){ task->
            if (task.isSuccessful){
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }else{
                Toast.makeText(baseContext,"Sign up failed",
                Toast.LENGTH_SHORT).show()
            }
        }
    }
}

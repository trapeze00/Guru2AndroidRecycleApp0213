package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainActivity : AppCompatActivity() {

    private lateinit var auth:FirebaseAuth

    lateinit var SignUpTextEmail:EditText
    lateinit var SignUpTextPasswd:EditText
    lateinit var btnSignIn:Button
    lateinit var btnSignUp:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth =FirebaseAuth.getInstance()

        btnSignIn=findViewById(R.id.btnSignIn)
        btnSignUp = findViewById(R.id.btnSignUp)
        SignUpTextEmail=findViewById(R.id.SignUpTextEmail)
        SignUpTextPasswd=findViewById(R.id.SignUpTextPasswd)

        btnSignUp.setOnClickListener {
            startActivity(Intent(this,PageSignUp::class.java))
            finish()
        }

        btnSignIn.setOnClickListener {
            doLogin()
            startActivity(Intent(this,MyPage::class.java))
        }

    }

    private fun doLogin(){
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

        auth.signInWithEmailAndPassword(SignUpTextEmail.text.toString(), SignUpTextPasswd.text.toString())
            .addOnCompleteListener(this){ task ->
                if(task.isSuccessful){
                    val user=auth.currentUser
                    updateUI(user)
                }else{
                    updateUI(null)
                }
            }
    }

    public override fun onStart() {
        super.onStart()
        val currentUser = auth.currentUser
        updateUI(currentUser)
    }

    private fun updateUI(currentUser: FirebaseUser?){
        if(currentUser != null){
            Toast.makeText(baseContext,"Login Success",
                Toast.LENGTH_SHORT).show()

        }else{
            Toast.makeText(baseContext,"Login failed",
                Toast.LENGTH_SHORT).show()
        }
    }
}
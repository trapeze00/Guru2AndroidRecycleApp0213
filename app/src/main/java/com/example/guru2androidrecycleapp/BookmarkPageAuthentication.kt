package com.example.guru2androidrecycleapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import java.lang.Exception

class BookmarkPageAuthentication : AppCompatActivity() {
    lateinit var camera_photo: ImageView
    lateinit var check: Button
    lateinit var photo_icon: ImageButton
    private val OPEN_GALLERY = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookmark_page_authentication)

        check = findViewById(R.id.check)    //확인
        photo_icon = findViewById(R.id.photo_icon)  //카메라 버튼
        camera_photo = findViewById(R.id.camera_photo)  //이미지뷰


        //버튼에 리스너 추가하고 intent로 갤러리 앱을 접근하도록 함
        //이미지 클릭 시 data에 uri 값으로 오는데 그 값을 bitmap으로 바꿔주는 함수 이용해 imageView에 띄우기

        check.setOnClickListener {
            var intent = Intent(this, BookmarkPagePosting::class.java)
            startActivity(intent)
        }


        photo_icon.setOnClickListener { openGallery() }
    }

    private fun openGallery() {

        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.setType("image/*")
        startActivityForResult(intent, OPEN_GALLERY)

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == Activity.RESULT_OK) {
            if(requestCode == OPEN_GALLERY) {

                var currentImageUrl : Uri? = data?.data

                try {
                    val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, currentImageUrl)
                    camera_photo.setImageBitmap(bitmap)
                }catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        } else {
            Log.d("ActivityResult", "오류입니다")
        }
    }
}
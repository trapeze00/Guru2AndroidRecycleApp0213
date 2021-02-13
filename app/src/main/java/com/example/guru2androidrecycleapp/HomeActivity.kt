package com.example.guru2androidrecycleapp

import android.content.Intent
import android.widget.ImageButton
import android.Manifest

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import kotlin.concurrent.timer

class HomeActivity : AppCompatActivity() {

    //홈 버튼은 비활성화
    lateinit var bookmark1: ImageButton
    lateinit var quiz1: ImageButton
    lateinit var mypage1: ImageButton

    //배너 변수
    private val REQUEST_READ_EXTERNAL_STORAGE =1000
    lateinit var viewPager : ViewPager

    //분리수거 Tip변수
    lateinit var TipPaper:ImageButton
    lateinit var TipPlastic:ImageButton
    lateinit var TipGlass:ImageButton
    lateinit var TipCan:ImageButton
    lateinit var TipVinyl:ImageButton
    lateinit var TipStyrofoam:ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bookmark1=findViewById(R.id.bookmark1)
        quiz1=findViewById(R.id.quiz1)
        mypage1=findViewById(R.id.mypage1)

        TipPaper=findViewById(R.id.TipPaper)
        TipPlastic=findViewById(R.id.TipPlastic)
        TipGlass=findViewById(R.id.TipGlass)
        TipCan=findViewById(R.id.TipCan)
        TipVinyl=findViewById(R.id.TipVinyl)
        TipStyrofoam=findViewById(R.id.TipStyrofoam)

        //버튼 클릭 시 화면 전환 (분리수거 Tip)
        TipPaper.setOnClickListener {
            var intent = Intent(this, PageTipPaper::class.java)
            startActivity(intent)
        }
        
        //버튼 클릭 시 화면 전환 (분리수거 Tip)
        TipPlastic.setOnClickListener {
            var intent = Intent(this, PageTipPlastic::class.java)
            startActivity(intent)
        }
        
        //버튼 클릭 시 화면 전환 (분리수거 Tip)
        TipGlass.setOnClickListener {
            var intent = Intent(this, PageTipGlass::class.java)
            startActivity(intent)
        }
        
        //버튼 클릭 시 화면 전환 (분리수거 Tip)
        TipCan.setOnClickListener {
            var intent = Intent(this, PageTipCan::class.java)
            startActivity(intent)
        }
        
        //버튼 클릭 시 화면 전환 (분리수거 Tip)
        TipVinyl.setOnClickListener {
            var intent = Intent(this, PageTipVinyl::class.java)
            startActivity(intent)
        }
        
        //버튼 클릭 시 화면 전환 (분리수거 Tip)
        TipStyrofoam.setOnClickListener {
            var intent = Intent(this, PageTipStyrofoam::class.java)
            startActivity(intent)
        }
        


        //버튼 클릭시 화면 전환 (메뉴)
        bookmark1.setOnClickListener {
            var intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        quiz1.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        mypage1.setOnClickListener {
            var intent = Intent(this, MyPage::class.java)
            startActivity(intent)
        }

        //배너 변수
        viewPager = findViewById(R.id.viewPager)


        //권한이 부여되었는지 확인
        if(ContextCompat.checkSelfPermission(this,
                Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)
        //권한이 허용되지 않음
            if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.READ_EXTERNAL_STORAGE)){
                //이전에 거부한 적이 있으면 설명(경고)
                var dlg = AlertDialog.Builder(this)
                dlg.setTitle("권한이 필요한 이유")
                dlg.setMessage("사진 정보를 얻기 위해서는 외부 저장소 권한이 필수로 필요합니다.")
                dlg.setPositiveButton("확인"){dialog, which ->
                    ActivityCompat.requestPermissions(this@HomeActivity,
                    arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), REQUEST_READ_EXTERNAL_STORAGE)}

                dlg.setNegativeButton("취소",null)
                dlg.show()
            }else{
                //처음 권한 요청청
                ActivityCompat.requestPermissions(this@HomeActivity,
                    arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), REQUEST_READ_EXTERNAL_STORAGE)
            }else{
            //권한이 이미 허용됨
            getAllPhotos()
        }
    }

    private fun getAllPhotos(){
        //모든 사진 정보 가져오기
        val cursor = contentResolver.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
            null, //가져올 항목 배열
            null, //조건
            null, //조건
            MediaStore.Images.ImageColumns.DATE_TAKEN+" DESC") //활영 최신 날짜순

        val fragments = ArrayList<Fragment>()

        if(cursor != null){
            while(cursor.moveToNext()){
                //사진 경로 uri가져오기
                val uri =
                    cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA))
                Log.d("HomeActivity",uri)
                fragments.add(PhotoFragment.newInstance(uri))
            }
            cursor.close()
        }

        val adapter = MyPagerAdapter(supportFragmentManager)
        adapter.updateFragments(fragments)
        viewPager.adapter = adapter

        //3초마다 자동으로 슬라이드
        timer(period = 3000){
            runOnUiThread {
                if(viewPager.currentItem < adapter.count-1){
                    viewPager.currentItem++
                }else{
                    viewPager.currentItem=0
                }
            }
        }
    }
    //여기까지 배너 작동코드
}


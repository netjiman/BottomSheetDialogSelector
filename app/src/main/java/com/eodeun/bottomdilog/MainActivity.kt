package com.eodeun.bottomdilog

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    val btn by lazy {  findViewById<Button>(R.id.button) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val b = BottomDate().apply {
                addOnSelectorDateListener { Year, Month, DayOfMonth ->
                    btn.text =  "${Year}년 ${Month}월 ${DayOfMonth}일 "
                }
            }
            b.show(supportFragmentManager, "바닥에서 선택")
        }
    }

}

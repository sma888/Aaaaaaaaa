package com.example.practice18

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val blankFragment = BlankFragment()
    val firstFragment = FirstFragment()
    supportFragmentManager.beginTransaction().apply{
        replace(R.id.frameLayoutMain, firstFragment)
        replace(R.id.blanck, blankFragment)
        commit()
    }



    }
}



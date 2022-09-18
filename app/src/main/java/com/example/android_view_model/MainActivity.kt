package com.example.android_view_model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState== null){
           val mainFragment = MainFragment()
            val fragmentManager = supportFragmentManager
            fragmentManager.beginTransaction().apply {
                add(R.id.fragment_container, mainFragment)
                addToBackStack(null)
                commit()
            }
        }


    }
}
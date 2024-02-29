package com.example.actividad7android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_movie1).setOnClickListener{
            startActivity(Intent(this, activity_movie1::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
        }
    }
}
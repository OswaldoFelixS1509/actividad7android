package com.example.actividad7android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_movie1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie1)

        findViewById<Button>(R.id.btn_back).setOnClickListener{
            onBackPressed();
        }
    }

    @Deprecated("Deprecated in Java")
    public final override fun onBackPressed(){
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

}
package com.example.a3button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class scendActivity : AppCompatActivity() {

    lateinit var  tv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scend)
        tv = findViewById(R.id.scendTV)
        val txt = intent.getStringExtra("text")
        tv.text = txt


    }
}
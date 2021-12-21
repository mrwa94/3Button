package com.example.a3button

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var ed1 :EditText
    lateinit var ed2 :EditText
    lateinit var  ed3 :EditText
    lateinit var button1 : Button
    lateinit var  button2 :Button
    lateinit var button3 :Button
    lateinit var tv : TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed1 = findViewById(R.id.Ed1)
        ed2 = findViewById(R.id.Ed2)
        ed3 = findViewById(R.id.Ed3)
        button1 =findViewById(R.id.button)
        button2 =findViewById(R.id.button2)
        button3 =findViewById(R.id.button3)
        tv =findViewById(R.id.tv)


        button1.setOnClickListener {
            Toast.makeText(this, "${ed1.text}",Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener {
            tv.text = "You write in Edit Text is : " + ed2.text
        }

        button3.setOnClickListener {
          intent = Intent(this,scendActivity::class.java)
            intent.putExtra("text", "${ed3.text}")
            startActivity(intent)
        }

    }
}
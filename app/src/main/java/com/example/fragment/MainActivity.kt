package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
  lateinit var inputName: EditText
  lateinit var btnLog: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                inputName= findViewById(R.id.inputName)
                btnLog = findViewById(R.id.btnLog)


                btnLog.setOnClickListener {
            val input=inputName.text.toString()
            Log.d("TEST", input)
        }
    }
}


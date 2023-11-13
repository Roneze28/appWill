package com.example.appwill

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val Monthbutton = findViewById<Button>(R.id.Monthbutton)
         val Weekbutton = findViewById<Button>(R.id.Weekbutton)

        Monthbutton.setOnClickListener {
            val intent = Intent (this, SixMonthCourses:: class.java)
            startActivity(intent)

        Weekbutton.setOnClickListener {
           val intent = Intent ( this, SixWeekCourse::  class.java)
            startActivity(intent)
        }
        }

        


    }
}
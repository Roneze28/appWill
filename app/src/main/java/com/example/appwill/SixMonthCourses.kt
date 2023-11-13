package com.example.appwill

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SixMonthCourses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_month_courses)

        val bundle: Bundle? = intent.extras
        val Firstaidbutton = findViewById<Button>(R.id.Firstaidbutton)
        val Sewingbutton = findViewById<Button>(R.id.Sewingbutton)
        val Ladscapingbutton = findViewById<Button>(R.id.Landscapingbutton)
        val Lifeskillbutton = findViewById<Button>(R.id.Lifeskillbutton)

            
    }
}
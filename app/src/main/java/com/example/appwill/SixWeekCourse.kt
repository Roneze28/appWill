package com.example.appwill

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SixWeekCourse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_week_course)

        val bundle: Bundle? = intent.extras
        val buttonChildMinding = findViewById<Button>(R.id.buttonChildMinding)
        val buttonCooking = findViewById<Button>(R.id.buttonCooking)
        val buttonGardenMaintenance = findViewById<Button>(R.id.buttonGardenMaintenance)

    }
}
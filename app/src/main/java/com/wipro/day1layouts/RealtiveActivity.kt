package com.wipro.day1layouts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RelativeActivity : AppCompatActivity() {
    private lateinit var goButton: Button
    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        goButton = findViewById(R.id.button_login_relative)
        backButton = findViewById(R.id.button_back_relative)

        goButton.setOnClickListener {
            val goToTableActivityIntent = Intent(applicationContext, TableActivity::class.java)
            startActivity(goToTableActivityIntent)
        }

        backButton.setOnClickListener {
            val backToLinearActivityIntent = Intent(applicationContext, MainActivity::class.java)
            startActivity(backToLinearActivityIntent)
        }
    }
}

package com.wipro.day1layouts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var goButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goButton = findViewById(R.id.button_login_linear)

        goButton.setOnClickListener {
            intent = Intent(applicationContext, RelativeActivity::class.java)
            startActivity(intent)
        }
    }
}

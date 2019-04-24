package com.wipro.day1layouts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TableActivity : AppCompatActivity() {
    private lateinit var goBackButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_layout)

        goBackButton = findViewById(R.id.button_back_table)

        goBackButton.setOnClickListener {
            val goBackToRelativeLayoutIntent = Intent(applicationContext, RelativeActivity::class.java)
            startActivity(goBackToRelativeLayoutIntent)
        }
    }
}

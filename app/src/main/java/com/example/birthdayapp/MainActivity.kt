package com.example.birthdayapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.imgButton)
        button.setBackgroundColor(Color.MAGENTA)

        var layout: View? = findViewById(R.id.layout)

        val image = ImageView(this).apply {
            setImageResource(R.drawable.birthday)

            adjustViewBounds = true
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        }

        layout = ConstraintLayout(this).apply {
            addView(image)
        }

        button.setOnClickListener {
            Toast.makeText(this@MainActivity, "Happy birthday, Howdy", Toast.LENGTH_LONG).show()
            setContentView(layout)
        }
    }


}
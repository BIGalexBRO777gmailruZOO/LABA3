package com.example.pr3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView2)
        var imageButton : ImageButton = findViewById(R.id.imageButton6)
        var editTextText: EditText = findViewById(R.id.editTextText)
        imageButton.setOnClickListener{
            if (editTextText.text.isEmpty()){
                textView.text = "Привет, друг!"
            }
            else{
                textView.text = "Привет, " + editTextText.text
            }
        }
    }
}
package com.example.mycoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    lateinit var spin: ProgressBar
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spin = findViewById(R.id.progressBar)
        text = findViewById(R.id.textView)

        lifecycleScope.launch(Dispatchers.Main) {
            while (true) {
                spin.setVisibility(View.INVISIBLE)
                text.text = "Spinner hides"
                delay(1000L)
                spin.setVisibility(View.VISIBLE)
                text.text = "Spinner spin"
                delay(1000L)
            }
        }
    }
}
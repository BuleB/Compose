package com.example.compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.compose.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        binding.textView.apply {
            text = "Hello Worktile"
        }
    }
}
package com.example.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview
import com.example.compose.ui.ComposeTheme

class LayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    val greetingNames = remember { listOf("Worktile", "Android") }
                    Greeting(greetingNames)
                }
            }
        }
    }

    @Composable
    fun Greeting(names: List<String>) {
        for (name in names) {
            Text(text = "Hello $name!")
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun LayoutPreview() {
        ComposeTheme {
            val greetingNames = remember { listOf("Worktile", "Android") }
//            Column {
//                Greeting(greetingNames)
//            }

            Row {
                Greeting(greetingNames)
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ComposeTheme {
            val greetingNames = remember { listOf("Worktile", "Android") }
            Greeting(greetingNames)
        }
    }
}


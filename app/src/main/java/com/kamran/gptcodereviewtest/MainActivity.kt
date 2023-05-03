package com.kamran.gptcodereviewtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kamran.gptcodereviewtest.ui.theme.GPTCodeReviewTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GPTCodeReviewTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}


fun calculateGrade(score: Int): String {
    if (score >= 90 && score <= 100) {
        return "A"
    } else if (score >= 80 && score < 90) {
        return "B"
    } else if (score >= 70 && score < 80) {
        return "C"
    } else if (score >= 60 && score < 70) {
        return "D"
    } else {
        return "F"
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GPTCodeReviewTestTheme {
        Greeting("Android")
    }
}


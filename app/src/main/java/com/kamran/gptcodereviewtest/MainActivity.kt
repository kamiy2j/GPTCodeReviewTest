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

// Code Review Test


fun modifyList(list: MutableList<Int>) {
    list.add(42)
}

fun divide(x: Int, y: Int): Int {
    var result = 0
    try {
        result = x / y
    } catch (e: Exception) {
        // Do nothing
    }
    return result
}

fun printArray(array: Array<Int>) {
    var i = 0
    for (i in 0 until array.size) {
        println(array[i])
    }
    println("The array has ${i} elements")
}

var counter = 0
fun incrementCounter() {
    counter++
}

fun getGrade(score: Int): String {
    if (score >= 90) {
        return "A"
    } else if (score >= 80) {
        return "B"
    } else if (score >= 70) {
        return "C"
    } else if (score >= 60) {
        return "D"
    } else {
        return "F"
    }
}

fun divideZero(x: Int, y: Int): Int {
    if (y == 0) {
        throw RuntimeException("Cannot divide by zero")
    }
    return x / y
}

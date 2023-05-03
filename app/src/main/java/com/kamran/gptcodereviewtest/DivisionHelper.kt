package com.kamran.gptcodereviewtest

class DivisionHelper {

    fun divideZero(x: Int, y: Int): Int {
        if (y == 0) {
            throw RuntimeException("Cannot divide by zero")
        }
        return x / y
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
}
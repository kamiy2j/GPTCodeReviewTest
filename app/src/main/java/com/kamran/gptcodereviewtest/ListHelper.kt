package com.kamran.gptcodereviewtest

class ListHelper {

    fun modifyList(list: MutableList<Int>) {
        list.add(42)
    }


    fun printArray(array: Array<Int>) {
        var i = 0
        for (i in 0 until array.size) {
            println(array[i])
        }
        println("The array has ${i} elements")
    }
}
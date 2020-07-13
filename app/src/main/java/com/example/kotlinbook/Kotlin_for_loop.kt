package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args :Array<String>) {
    for (n in 10..15) {
        println("Loop: $n")
    }

    //Kotlin loop using array
    val myArray = arrayOf("ab", "bc", "cd", "da")
    for (str in myArray){
        println(str)
    }

    //Kotlin for loop iterating though array indices
    val myArray2 = arrayOf("steve", "Robin", "kate", "Lucy")
    for (n in myArray2.indices){
        println("myArray2[$n] : ${myArray2[n]}")
    }

    //Function withIndex() in for loop

    val myLoop =arrayOf("steve", "Robin", "kate", "Lucy")
    for((index, value) in myLoop.withIndex()){
        println("Value at Index $index is: $value")
    }
}

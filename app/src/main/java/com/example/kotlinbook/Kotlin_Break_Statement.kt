package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */
fun main(args : Array<String>) {
    for (n in 1..10){
        println("before break, Loop: $n")
        if (n ==5){
            println("I am terminating loop")
            break
        }
    }
    //Kotlin break example in nested loop
    for (ch in 'A'..'C'){
        for (n in 1..4){
            println("$ch and $n")
            if (n ==2)
                break
        }
    }
    //kotlin break labels
    myloop@ for (ch in 'A'..'C'){
        for (n in 1..4){
            println("$ch and $n")
            if (n ==2)
                break@myloop
        }
    }
}
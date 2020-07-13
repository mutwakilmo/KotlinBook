package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args : Array<String>){

    val marks = 90
    if (marks < 30){
        println("Father will get angry")
    } else{
        println("Father will give me money")
    }
    //____________________________________________________________
    // Traditional usage
    val num = -101
    if (num < 0) {
        println("Negative number")
    }
    else {
        println("Positive number")
    }
    println("Out of if else statement")

    //-------------------------------------------------------------
    //Kotlin Nested Expression
    val number = 101
    if (number < 0)
        println("Negative Number")
    else{
        //nested expression
        if(number%2 ==0)
            println("Even Number")
        else
            println("Odd Number")
    }
}
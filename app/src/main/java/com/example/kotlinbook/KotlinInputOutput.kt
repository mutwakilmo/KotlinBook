package com.example.kotlinbook

import java.util.*

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args:Array<String>){
//    print("Write anything here: ")
////
////    val enteredString = readLine()
////    println("You Have entered this: $enteredString")
////
////    //Taking the input as String and converting it to an int
////    val number = Integer.valueOf(readLine())
////    println("The entered number is : $number")

    //creating Scanner object
    val read = Scanner(System.`in`)

    //Taking integer input
    println("Enter an integer number: ")
    var num1 = read.nextInt()

    //Taking float input
    println("Enter a float number: ")
    var num2 = read.nextFloat()

    //Displaying input numbers
    println("First Input Number: "+num1)
    println("Second Input Number: "+num2)
}
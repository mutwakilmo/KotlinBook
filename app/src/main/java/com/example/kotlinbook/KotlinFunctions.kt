package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */
//Created the function

fun main(args : Array<String>){

    //Calling the function
    sayHello()
    println("Sum: ${sum(10, 20, 30, 40)}")

    val sum = {num1: Int, num2: Int -> num1 + num2}
    println("6 + 4 = ${sum(6,4)}")

}

fun sayHello(){
    println("Hello")

}

fun sum(vararg numbers: Int): Int
{
    var sum = 0
    numbers.forEach {num -> sum +=  num}

    return sum
}
package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args: Array<String>) {
    //lambada function
    val sum = {num1: Int, num2:Int -> num1 + num2}
    println("10+5 : ${sum(10,5)}")
}
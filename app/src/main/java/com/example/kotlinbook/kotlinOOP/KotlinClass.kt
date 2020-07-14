package com.example.kotlinbook.kotlinOOP

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */
class KotlinClass{
    //data member
    private var number :Int = 5

    //member function
    fun calculateSquare(): Int{
        return  number*number
    }
}

fun main(args: Array<String>) {
    val obj = KotlinClass()
    println("${obj.calculateSquare()}")

}
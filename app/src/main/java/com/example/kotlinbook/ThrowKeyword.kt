package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args: Array<String>) {
    print("Enter your name: ")
    val name = readLine()

    try{
        if (name == "Chaitanya"){
            throw Exception("You don't have access")
        }
        else
        {
            println("Welcome! You have access")
        }
    }
    catch (e: Exception){
        println(e.message)
    }
}
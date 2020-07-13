package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args: Array<String>) {
    try {

        var num = 10/0
        println("BeginnersBook.com")
        println(num)


    } catch (e: ArithmeticException) {
        println("Arithmetic Exception")
    } catch (e: Exception) {
        println(e)
    } finally {
        println("It will print in any case.")
    }
}
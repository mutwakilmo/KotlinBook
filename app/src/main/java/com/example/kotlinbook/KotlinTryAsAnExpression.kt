package com.example.kotlinbook

import java.lang.NumberFormatException

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
µ */

fun main(args :Array<String>) {
    var website = "KotlinBook.com"
    var num = try {
        website.toInt()
    }
    catch (e: NumberFormatException){
        "Cnnot convert String to integer"
    }
    println(num)

    var number = "100"
    var num2 = try {
        number.toInt()
    }
    catch (e : NumberFormatException){
        "Can not convert String to integer"
    }
    println(num2)
}
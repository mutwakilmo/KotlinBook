package com.example.kotlinbook

import java.lang.ArithmeticException

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args:Array<String>) {
    try {
        //code where an exception can occur
        var num = 100/0
        println(num)
    }
    catch (e: ArithmeticException) {
        // handle the exception
        println("Arithmetic error in the code")
    }
    finally {
        // optional block but executes always
        println("Out of try catch block")
    }
}
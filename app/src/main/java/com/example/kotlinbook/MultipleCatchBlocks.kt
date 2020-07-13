package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */
fun main(args: Array<String>) {
    try{
        val a = IntArray(5)
        a[10] = 99
    }
    catch(e: Exception){
        println("Some error occurred")
    }
    catch(e: ArithmeticException){
        println("ArithmeticException occurred")
    }
    catch(e: NumberFormatException){
        println("Number format exception")
    }
    catch(e: ArrayIndexOutOfBoundsException){
        println("Array index is out of range")
    }
    println("Out of try catch block")
}
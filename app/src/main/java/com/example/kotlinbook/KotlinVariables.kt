package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */


fun main(args : Array<String>){
    /**
     * This is an immutable variable
     * also called unchangeable variable
     * or read-only variable.
     */
    val myName = "Chaitanya"
    println("My Name is: $myName")

    /**
     * This is an mutable variable
     * we can change the value of this
     * variable
     */
    var lastName ="Mo"
    lastName ="Mohamed Osman"
    println("My last Name is $lastName")
    //Type reference
    var website = "Beginner book"
    var app :String ="Go4lunch"

    //Byte
    val num : Byte = 99
    println("$num")
    val bigByte: Byte = Byte.MAX_VALUE
    val smallByte: Byte = Byte.MIN_VALUE
    println("$smallByte")
    println("$bigByte")

    //Short
    val numShort :Short = 29999
    println("$numShort")

    //Int
    val numInt :Int = Int.MAX_VALUE
    println("$numInt")

    //long
    val numLong :Long = 123456
    println("$numLong")

    //Double
    val numDouble = 101.11
    println("$numDouble")

    //float
    val numFloat = 101.99F
    println("$numFloat")

    //Boolean
    val bookValue = false
    println("$bookValue")

    //Char
    val ch = 'A'
    println("$ch")
}

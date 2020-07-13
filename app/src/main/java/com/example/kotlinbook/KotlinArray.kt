package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args : Array<String>){
    /*
    Array that holds multiple different data types
     */

    var arr = arrayOf(10,"Books",10.99, 'A')
    //Displaying 4th element
    println(arr[3])
    //Modifying 4th element
    arr[3] = 100
    println(arr[3])
    arr.set(3,200)
    println(arr[3])

    //Size array
    var arr2 = arrayOf(1,2,3,4,5)
    println("Size of array is: ${arr2.size}")

    //check the size of an array
    println("Array contains 4: ${arr2.contains(4)}")
    //kotlin array first() and last functions
    println("First Element: ${arr2.first()}")
    println("Last Element: ${arr2.last()}")

    //Finding the index of an element in an array
    println("Index of 3: ${arr2.indexOf(3)}")
}
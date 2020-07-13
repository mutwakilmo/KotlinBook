package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args: Array<String>) {
    println("Number of range")


    for (num in 1..4){
        println(num)
    }

    println("Character of range")
    for (ch in 'A'..'Z'){
        println(ch)
    }
    //check element in Range

    val oneToTen = 1..10

    println("3 in oneToTen: ${3 in oneToTen}")
    println("11 in oneToTen: ${11 in oneToTen}")

    //rangeTo()...and downTo()

    val oneToFive = 1.rangeTo(5)
    val sixToThree = 6.downTo(3)

    println("rangeTo:")
    for(x in oneToFive){
        println(x)
    }

    println("downTo")
    for(n in sixToThree){
        println(n)
    }
    //Kotlin Range Step
    val oneToEight = 1..8
    val odd = oneToEight.step(2)

    for(z in odd){
        println(z)
    }

    //Range reverse
    val oneToSix = 1..6
    for (n in oneToSix.reversed()){
        println(n)
    }
}
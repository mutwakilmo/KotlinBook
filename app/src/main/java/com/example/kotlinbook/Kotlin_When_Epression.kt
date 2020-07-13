package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args: Array<String>) {
    var ch = 'A'

    when (ch) {
        'A', 'E', 'I', 'O', 'U' -> println("$ch is a Vowel")
        else -> println("$ch is a Constant")
    }

    //kotlin when expression with ranges
    var number = 78
    when (number) {
        in 1..9 -> println("$number is a single digit number")
        in 10..99 -> println("$number is a two digit number")
        in 100..999 -> println("$number is a three digit number")
        else -> println("$number has more than three digits")
    }

    //Arithmetic operation inside when expression

    var age = 16
    when(age){
        in 1..17 ->{
            val numberVote = 18-age
            println("You will be eligible for voting in $numberVote years")
        }
        in 18..100 -> println("You are eligible for voting")
    }
}
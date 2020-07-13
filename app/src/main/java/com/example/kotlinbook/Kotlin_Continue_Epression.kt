package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args : Array<String>) {
    for (n in 1..5){
        println("before continue, Loop: $n")
        if(n==2||n==4)
            continue
        println("after continue, loop : $n")
    }

    for (x in 'A'..'D'){
        for (n in 1..4){
            if (n==2 || n==4)
                continue
            println("$x and $n")
        }
    }

    //Nested loop example with continue label
    myloop@ for (x in 'A'..'D'){
        for (n in 1..4){
            if (n==2||n==4)
                continue@myloop

            println("$x and $n")
        }

    }
}
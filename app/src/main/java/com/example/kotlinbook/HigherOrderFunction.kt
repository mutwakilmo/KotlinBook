package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args : Array<String>) {
    func("KotlinBook", ::demo)
    val sum = function(10)
    println("10 + 20 : ${sum(20)}")
}
fun function (num:Int) :(Int) -> Int ={num2-> num2 + num}


fun func(str: String, myfunc:(String) ->Unit){
    print("Welcome to kotlin tutorial at ")
    myfunc(str)
}

fun demo(str: String){
    println(str)
}
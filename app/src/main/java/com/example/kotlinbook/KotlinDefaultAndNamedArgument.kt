package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */
fun main(args : Array<String>) {
    demo(99, 'z')
}
fun demo(number: Int = 100, ch :Char = 'A'){
    print("Number is: $number and Character is :$ch")
}
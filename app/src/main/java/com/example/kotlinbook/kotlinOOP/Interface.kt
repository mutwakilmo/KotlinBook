package com.example.kotlinbook.kotlinOOP

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

interface MyInterface{
    var str: String

    fun demo()

    fun func(){
        println("Hello")
    }
}

class MyClass: MyInterface{
    override var str: String = "BeginnersBook.com"
    override fun demo() {
        println("demo function")
    }
}
fun main(args: Array<String>) {
    val obj = MyClass()
    obj.demo()
    obj.func()
    println(obj.str)

}
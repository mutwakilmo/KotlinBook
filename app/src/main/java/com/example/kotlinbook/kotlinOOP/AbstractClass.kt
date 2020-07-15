//package com.example.kotlinbook.kotlinOOP
//
///**
// * Created by Mutwakil-Mo 🤩
// * Android Engineer,
// * Brussels
// */
//
//abstract class Student(name: String, age: Int) {
//
//    init {
//        println("Student name is: $name")
//        println("Student age is: $age")
//    }
//
//    //non-abstract function
//    fun demo() {
//        println("Non-abstract function of abstract class")
//    }
//
//    //abstract function
//    abstract fun func(message: String)
//}
//
//class College(name: String, age: Int): Student(name, age) {
//
//    override fun func(message: String) {
//        println(message)
//    }
//}
//
//fun main(args: Array<String>) {
//    val obj = College("Chaitanya", 31)
//    obj.func("I'm a Blogger")
//    obj.demo()
//}
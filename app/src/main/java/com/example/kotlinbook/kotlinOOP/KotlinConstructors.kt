package com.example.kotlinbook.kotlinOOP

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args:Array<String>) {
    //creating object of class Student
    val stu = Student("Jack", 30)
    val stu2 = Student("XMan")

    println("Student Name: ${stu.name}")
    println("Student Age: ${stu.age}")

    println("Student Age: ${stu2.name}")
    println("Student Age: ${stu2.age}")
}

class Student(val name:String, var age:Int =99){
    //This is my class. For now I am leaving it empty
}
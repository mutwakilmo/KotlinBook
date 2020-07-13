package com.example.kotlinbook

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

fun main(args:Array<String>){
    /**
     * These Strings are Immutable which
     * means they are read-only and
     * unchangeable
     */
    val website = "MyNewsApp"
    val longString ="""Welcome to My App"""

    /*
    Mutable Strings
     */

    var name = "Mutwakil"
    var lName = "Singh"
    name = "$name $lName"
    println("Name is: $name")

//Get String Length in kotlin
    var firstName ="Jack"
    /*
    String interpolation
     */

    println("String Length: " + firstName.length)


    //Compare Strings in Kotlin
    var str1 = "KotlinBook"
    var str2 = "KotlinBook"

    /**
     * true if equals, otherwise false
     */
    println("String Equals? : ${str1.equals(str2)}")

    /**
     * 0 if equals, otherwise false
     */
    println("String Equals? : ${str1.compareTo(str2)}")

    //Access character in a string at specific index
    var str = "Kotlin"
    println("3rd Index: ${str.get(3)}")

    //Substring$
    var test ="BeginnersBook"
    /**
     * Here fromIndex is inclusive and
     * toIndex is exclusive which means
     * 5th index char will not be included
     */
    println("Index from 2 to 5 :" + test.subSequence(2,5))

    //Check weather the String contains another string
    var str3 = "beginnersbook.com"

    println("Contains .com: ${str3.contains(".com")}")
}
# KotlinBook


#### 1. How does Kotlin work on Android?

Just like Java, the Kotlin code is also compiled into the Java bytecode and is executed at runtime by the Java Virtual Machine i.e. JVM. When a Kotlin file named  `Main.kt`  is compiled then it will eventually turn into a class and then the bytecode of the class will be generated. The name of the bytecode file will be  `MainKt.class`  and this file will be executed by the JVM.

#### 2. Why should we use Kotlin?

-   Kotlin is concise
-   Kotlin is null-safe
-   Kotlin is interoperable

[Learn about these features from MindOrks video](https://www.youtube.com/watch?v=kRhivT-jKzY&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8).

#### 3. What is the difference between the variable declaration with var and val?

If you want to declare some mutable(changeable) variable, then you can use  `var`. For the immutable variable, use  `val`  i.e.  `val`  variables can't be changed once assigned.

#### 4. What is the difference between the variable declaration with val and const?

Both the variables that are declared with  `val`  and  `const`  are immutable in nature. But the value of the  `const`  variable must be known at the compile-time whereas the value of the  `val`  variable can be assigned at runtime also.

[Learn more about the difference between const and val from MindOrks blog](https://blog.mindorks.com/what-is-the-difference-between-const-and-val).

#### 5. How to ensure null safety in Kotlin?

One of the major advantages of using Kotlin is null safety. In Java, if you access some null variable then you will get a  `NullPointerException`. So, the following code in Kotlin will produce a compile-time error:

```java
var name: String = "MindOrks"
name = null //error
```

So, to assign null values to a variable, you need to declare the  `name`  variable as a nullable string and then during the access of this variable, you need to use a safe call operator i.e.  `?.`

```java
var name: String? = "MindOrks"
print(name?.length) // ok
name = null // ok
```

[Learn more about safe calls(?.) and null check(!!) from MindOrks blog](https://blog.mindorks.com/safecalls-vs-nullchecks-in-kotlin).

#### 6. What is the difference between safe calls(?.) and null check(!!)?

Safe call operator i.e.  `?.`  is used to check if the value of the variable is null or not. If it is null then null will be returned otherwise it will return the desired value.

```java
var name: String? = "MindOrks"
println(name?.length) // 8
name = null
println(name?.length) // null
```

If you want to throw NullPointerException when the value of the variable is null, then you can use the null check or  `!!`  operator.

```java
var name: String? = "MindOrks"
println(name?.length) // 8
name = null
println(name!!.length) // KotlinNullPointerException
```

[Learn more about safe calls(?.) and null check(!!) from MindOrks blog](https://blog.mindorks.com/safecalls-vs-nullchecks-in-kotlin).

#### 7. Do we have a ternary operator in Kotlin just like java?

No, we don't have a ternary operator in Kotlin but you can use the functionality of ternary operator by using if-else or Elvis operator.

#### 8. What is Elvis operator in Kotlin?

In Kotlin, you can assign null values to a variable by using the null safety property. To check if a value is having null value then you can use if-else or can use the Elvis operator i.e.  `?:`  For example:

```java
var name:String? = "Mindorks"
val nameLength = name?.length ?: -1
println(nameLength)
```

The Elvis operator(`?:`) used above will return the length of name if the value is not null otherwise if the value is null, then it will return  `-1`.

#### 9. How to convert a Kotlin source file to a Java source file?

Steps to convert your Kotlin source file to Java source file:

1.  Open your Kotlin project in the IntelliJ IDEA / Android Studio.
2.  Then navigate to  **Tools > Kotlin > Show Kotlin Bytecode.**
3.  Now click on the  **Decompile**  button to get your Java code from the bytecode.

[Learn more about the conversion steps from MindOrks blog](https://blog.mindorks.com/how-to-convert-a-kotlin-source-file-to-a-java-source-file).

#### 10. What is the use of @JvmStatic, @JvmOverloads, and @JvmFiled in Kotlin?

-   **@JvmStatic:**  This annotation is used to tell the compiler that the method is a static method and can be used in Java code.
-   **@JvmOverloads:**  To use the default values passed as an argument in Kotlin code from the Java code, we need to use the  `@JvmOverloads`  annotation.
-   **@JvmField:**  To access the fields of a Kotlin class from Java code without using any getters and setters, we need to use the  `@JvmField`  in the Kotlin code.

[Learn more about @JvmStatic, @JvmOverloads, and @JvmField in Kotlin from MindOrks blog](https://blog.mindorks.com/jvmstatic-jvmoverloads-and-jvmfield-in-kotlin).

#### 11. What is a data class in Kotlin?

Data classes are those classes which are made just to store some data. In Kotlin, it is marked as data. The following is an example of the same:

```java
data class Developer(val name: String, val age: Int)
```

When we mark a class as a  _data_  class, you don’t have to implement or create the following functions like we do in Java:  `hashCode()`,  `equals()`,  `toString()`,  `copy()`. The compiler automatically creates these internally, so it also leads to clean code. Although, there are few other requirements that data classes need to fulfill.

[Learn more about data class from MindOrks blog](https://blog.mindorks.com/learn-kotlin-data-class).

#### 12. Can we use primitive types such as int, double, float in Kotlin?

In Kotlin, we can't use primitive types directly. We can use classes like Int, Double, etc. as an object wrapper for primitives. But the compiled bytecode has these primitive types.

#### 13. What is String Interpolation in Kotlin?

If you want to use some variable or perform some operation inside a string then String Interpolation can be used. You can use the  `$`  sign to use some variable in the string or can perform some operation in between  `{}`  sign.

```java
var name = "MindOrks"
print("Hello! I am learning from $name")
```

#### 14. What do you mean by destructuring in Kotlin?

**Destructuring**  is a convenient way of extracting multiple values from data stored in(possibly nested) objects and Arrays. It can be used in locations that receive data (such as the left-hand side of an assignment). Sometimes it is convenient to d_estructure_ an object into a number of variables, for example:

```java
val (name, age) = developer
```

Now, we can use name and age independently like below:

```java
println(name)
println(age)
```

[Learn more about Kotlin Destructuring from MindOrks blog](https://blog.mindorks.com/learn-kotlin-destructuring-declarations).

#### 15. When to use the lateinit keyword in Kotlin?

`lateinit`  is late initialization.

Normally, properties declared as having a non-null type must be initialized in the constructor. However, fairly often this is not convenient.

For example, properties can be initialized through dependency injection, or in the setup method of a unit test. In this case, you cannot supply a non-null initializer in the constructor, but you still want to avoid null checks when referencing the property inside the body of a class. To handle this case, you can mark the property with the lateinit modifier.

[Learn more about lateinit from MindOrks blog](https://blog.mindorks.com/learn-kotlin-lateinit-vs-lazy).

#### 16. How to check if a lateinit variable has been initialized or not?

You can check if the lateinit variable has been initialized or not before using it with the help of  `isInitialized`  method. This method will return true if the lateinit property has been initialized otherwise it will return false. For example:

```java
class Person {
 lateinit var name: String
 fun initializeName() {
 println(this::name.isInitialized)
 name = "MindOrks" // initializing name
 println(this::name.isInitialized)
 }
}
fun main(args: Array<String>) {
 Person().initializeName()
}
```

[Learn more about it from MindOrks blog](https://blog.mindorks.com/how-to-check-if-a-lateinit-variable-has-been-initialized).

#### 17. What is the difference between lateinit and lazy in Kotlin?

-   lazy can only be used for val properties, whereas lateinit can only be applied to var because it can’t be compiled to a final field, thus no immutability can be guaranteed.
-   If you want your property to be initialized from outside in a way probably unknown beforehand, use lateinit.

[Learn more about the difference between lateinit and lazy from MindOrks blog](https://blog.mindorks.com/learn-kotlin-lateinit-vs-lazy).

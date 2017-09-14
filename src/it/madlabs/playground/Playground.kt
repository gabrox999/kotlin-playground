package it.madlabs.playground

import javax.swing.plaf.basic.BasicHTML

//fun (parName: parType, ...) : retType {
//  body
// }

// retType is optional, : let expect a retType

fun sum(a: Int, b: Int): Int {
    return a + b;
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

//code must be inside a function (or object?)
fun oldMain(args: Array<String>) {


    //val are read only variables
    val a: Int = 1 //name: Type = value
    val b = 2 //infered type
    val c: Int //NOT WORK...
    c = 3 //NOT WORKS

    var x = 5
    println("a: $a, b: $b, c: $c, x: $x")

    x += 1
    println("a: $a, b: $b, c: $c, x: $x")

    if  (a > b){
        println(" a > b!!")
    } else {
        println(" a <= b!!")
    }

    println("max from a: $a and b: $b is : ${maxOf(a,b)}")
}

class Greeter(val name: String){
    fun greet(){
        println("Hello $name")
    }
}

fun oldMain2(args: Array<String>){
    Greeter("Gabriele").greet()
}

fun oldMain3(args: Array<String>){
    val greeter = Greeter("Gabriele")
    greeter.greet()
}


fun main(args: Array<String>){
    val data = mapOf(1 to "one", 2 to "two")
    createHTML
}

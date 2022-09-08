// Created on 20 April 2022 by: Vansh
fun main(){
    println("Hello There!")
    val f: (Int, Int) -> Int = { a, b -> a+b }
    var result = f(8, 2)
    println(result)

    var arr = arrayOf(1, 2, 3, 5)
    arr.forEach {
        item -> println(item * 4)
    }

}
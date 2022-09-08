// Created by Vansh on 18 April 2022
fun main(args: Array<String>) {
    println("Enter your digit to sum: ")
    var num = readLine()!!.toInt()
    var x = 0
    while(num > 0){
        x += num%10
        num /= 10
    }
    println(x)
}

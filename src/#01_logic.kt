// Created on 22 - 06 - 2022
// By Vansh
// Lets start with simple

fun main() {
    sumOfDigits("12345")
}

fun sumOfDigits(str: String) {
    val strArray = str.toList()
    var sum = 0

    for (i in strArray) {
        sum += i.toString().toInt()
    }

    val length = strArray.size
    val avg = sum / length
    print(sum.toString() + ' ' + avg.toString())
}

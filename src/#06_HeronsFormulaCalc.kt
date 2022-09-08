import kotlin.math.sqrt

fun main(){
    println("Lets make a Herons Formula Calculator")
    println("Enter first number: ")
    val numN1 = readLine().toString()
    val num1 = ("$numN1.00").toDouble()
    println(num1)
    println("Enter second number: ")
    val numN2 = readLine().toString()
    val num2 = ("$numN2.00").toDouble()
    println(num2)
    println("Enter third number: ")
    val numN3 = readLine().toString()
    val num3 = ("$numN3.00").toDouble()
    println(num3)


    heron(num1, num2, num3)
}

fun heron(x:Double, y:Double, z:Double) {
    val a = x
    val b = y
    val c = z
    println("User input == $a, $b, $c.")
    val s = (a + b + c)/2
    println("--> Semi perimeter is $s")
    val rtIT = (s*(s-a)*(s-b)*(s-c))
    println("-->" + s*(s-a)*(s-b)*(s-c))
    println("The area of the triangle is = ${sqrt(rtIT)}")
}
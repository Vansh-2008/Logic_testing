// By Vansh on 16 April 2022

fun sum(x: Double , y: Double){
    println(x + y)
}
fun sub(x: Double, y: Double){
    println(x - y)
}
fun multi(x : Double, y: Double){
    println(x * y)
}
fun divide(x : Double, y: Double){
    println(x/y)
}

//=================|||====================\\
fun main(){
    println("What you want to do: +, -, *, /")
    val action = readLine()
    println("Enter first number: ")
    val num1 = readLine()!!.toDouble()
    println("Enter second number: ")
    val num2 = readLine()!!.toDouble()
    if (action == "+"){
        sum(num1, num2)
    }
    else if (action == "-"){
        sub(num1, num2)
    }
    else if (action == "*"){
        multi(num1, num2)
    }
    else if (action == "/"){
        divide(num1, num2)
    }
    else{
        println("Enter a valid option! ~")
    }

}
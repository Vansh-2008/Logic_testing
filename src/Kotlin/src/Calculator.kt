fun main(args: Array<String>){
    println("Hello There!")
    println("Welcome to my calculator!")
    println("What do you want to do: +, -, *, /, %    :")
    var input = readLine()
    if (input == "+") {
        // For Addition
        println("Enter first number:")
        var add1 = readLine() !!.toInt()
        println("Enter second number:")
        var add2 = readLine() !!.toInt()
        var sum = add1 + add2
        println("The result is: $sum")
    }
    else if (input == "-"){
        println("Enter first number:")
        var sub1 = readLine() !!.toInt()
        println("Enter second number:")
        var sub2 = readLine() !!.toInt()
        var result = sub1 - sub2
        println("The result is: $result")
    }
    else if (input == "*"){
        println("Enter first number:")
        var multiply1 = readLine() !!.toInt()
        println("Enter second number:")
        var multiply2 = readLine() !!.toInt()
        var product = multiply1 * multiply2
        println("The result is: $product")
    }
    else if (input == "/") {
        println("Enter first number:")
        var div1 = readLine()!!.toInt()
        println("Enter second number:")
        var div2 = readLine()!!.toInt()
        var divide = div2 / div2
        println("The result is: $divide")
    }
    else if (input == "%") {
        println("Enter first number:")
        var module1 = readLine()!!.toInt()
        println("Enter second number:")
        var module2 = readLine()!!.toInt()
        var percent = module1 % module2
        println("The result is: $percent")
    }
    else{
        println("Enter a valid number!")
    }
println("=== BY => Vansh ")

}
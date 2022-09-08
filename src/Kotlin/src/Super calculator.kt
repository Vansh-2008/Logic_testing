// --- Super Calculator --- \\

// Super calculator created on 25 April 2022 by ~ Vansh \\
// It's a very lengthy project because I can't get much time to do it and debugs!! oh my, and its 7 May btw
// It's taking long because I was not a ble to do it for last week or so..
// And NO pain == NO Gain
// Sorry future me for bad code
// code is ready debuging and editing left :)

// ---------------------------- \\
// Main funtion starts running here

fun main(){

    println("What you want to do? ")
    println("addition, subtraction, multiplication, division, small number, big number, square, cube, BMI, norp, etc")
    val userInputMain = readLine()

    //=== ==== ===\\

    if (userInputMain == "add" || userInputMain == "addition"){
        println("Enter first number: ")
        val num1 = readLine()!!.toDouble()
        println("Enter second number: ")
        val num2 = readLine()!!.toDouble()
        add(num1, num2)
    }
    else if (userInputMain == "sub" || userInputMain == "subtraction"){
        println("Enter first number: ")
        val num1 = readLine()!!.toDouble()
        println("Enter second number: ")
        val num2 = readLine()!!.toDouble()
        sub(num1, num2)
    }
    else if (userInputMain == "multiply" || userInputMain == "multi"){
        println("Enter first number: ")
        val num1 = readLine()!!.toDouble()
        println("Enter second number: ")
        val num2 = readLine()!!.toDouble()
        mutli(num1, num2)
    }
    else if (userInputMain == "divide"  || userInputMain == "division"){
        println("Enter first number: ")
        val num1 = readLine()!!.toDouble()
        println("Enter second number: ")
        val num2 = readLine()!!.toDouble()
        divid(num1, num2)
    }
    else if (userInputMain == "small number" || userInputMain == "small"){
        println("Enter first number: ")
        val num1 = readLine()!!.toDouble()
        println("Enter second number: ")
        val num2 = readLine()!!.toDouble()
        mini(num1, num2)
    }
    else if (userInputMain == "big number" || userInputMain == "big"){
        println("Enter first number: ")
        val num1 = readLine()!!.toDouble()
        println("Enter second number: ")
        val num2 = readLine()!!.toDouble()
        maxi(num1, num2)
    }
    else if (userInputMain == "square" || userInputMain == "sqr"){
        println("Enter first number: ")
        val num1 = readLine()!!.toDouble()
        sqr(num1)
    }
    else if (userInputMain == "cube" || userInputMain == "cub"){
        println("Enter first number: ")
        val num1 = readLine()!!.toDouble()
        cub(num1)
    }
    else if (userInputMain == "BMI" || userInputMain == "bmi"){
        bmi()
    }
    else if (userInputMain == "celsious" || userInputMain == "cel"){
        println("Enter first number: ")
        val num1 = readLine()!!.toDouble()
        cel(num1)
    }
    else if (userInputMain == "fahrenheit" || userInputMain == "fah"){
        println("Enter first number: ")
        val num1 = readLine()!!.toDouble()
        fah(num1)
    }
    else if (userInputMain == "norp" || userInputMain == "which int"){
        println("Enter First number: ")
        val num1 = readLine()!!.toDouble()
        norp(num1)
    }
    else {
        throw Exception("Please enter data correctly! ")
    }

    //=== ==== ===\\

    println("Thanks for using Super claculator :)")

    println("By ~ Vansh")
}

// Side functions -----

fun add(x:Double, y:Double){
    println(x + y)
}
// Function for adding

fun minus(x:Double, y:Double){
    println(x - y)
}
// Function for subtracting

fun mutli(x:Double, y:Double){
    println(x * y)
}
// Function for multiplication

fun divid(x:Double, y:Double){
    println(x / y)
}
// Function for division

fun mini(x:Double, y: Double){
    val ress = if (x < y) "$x is smaller number." else "$y is smaller."
    println(ress)
}
// Function for finding smallest number

fun maxi(x:Double, y: Double){
    val resss = if (x > y) "$x is bigger number." else "$y is bigger number."
    println(resss)
}
// Function for finding biggest number

fun sqr(x: Double) {
    println(x*x)
}
// Function for square

fun cub(x:Double) {
    println(x*x*x)
}
// Function for cube

//------------\\

fun bmii(x: Int, y: Int): Int {
    return x/(y*y)
}
fun bmi(){
    println("Welcome to my BMI calculator in Kotlin!")
    //======|||======\\
    println("Enter your Weight in KG: ")
    val weight = readLine()!!.toInt()
    println("Enter your height is Meters: ")
    val height = readLine()!!.toInt()
    //====|||====\\
    val bmi: Int = bmii(weight, height)
    println("Your BMI is : $bmi")
    if (bmi.toDouble() in 0.00..18.50){
        println("Underweight")
    }
    else if (bmi.toDouble() in 18.50..25.00){
        println("Normal")
    }
    else if (bmi.toDouble() in 25.00..30.00){
        println("Overweight")
    }
    else{
        println("An Error occur!!")
    }

}
// Function for calculating BMI

// ---------------- \\

// formula of Degree celsious to degree ferenhite: (0°C × 9/5) + 32 = 32°F
fun cel(x:Double){
    val faran = (x*9/5) + 32
    println("$x degree celsius to degree fahrenheit is : $faran")
}
// Function for degree celsius to degree fahrenheit

// formula for degree celsius to degree fahrenheit: (32°F − 32) × 5/9 = 0°C
fun fah(x: Double){
    val celsi = (x - 32) * 5/9
    println("$x in degree fahrenheit to degree celsius is : $celsi")
}
// Function for degree fahrenheit to degree celsius

fun norp(x: Double){
    val digii = when{
        x < 0 -> "Negetive"
        x > 0 -> "Positive"
        else -> "Zero"
    }
    println(digii)
}


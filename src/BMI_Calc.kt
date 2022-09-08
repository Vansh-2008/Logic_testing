fun main() {
    println("Welcome to Vansh BMI Calculator!")
    println("Ok what is your height in Meters: ")
    val length = readLine().toString()
    val height = ("$length.00").toDouble()
    println("And your weight in KGs: ")
    val mass = readLine().toString()
    val weight = ("$mass.00").toDouble()
    printTEST(height, weight)
    bmi(height, weight)
}
fun bmi(x: Double, y: Double){
    val result = y/x*x
    println("Your BMI is : $result")
    if (18.5 < result){
        println("You are - Underweight")
    }
    else if (result in 18.50..25.00){
        println("You are - Normal")
    }
    else if (result in 25.00..30.00){
        println("You are - Overweight")
    }
    else{
        println("An Error occur!!")
    }

}
fun printTEST(x: Double, y: Double){
    println("x - $x and y - $y")
}
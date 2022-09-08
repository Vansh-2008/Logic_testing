fun BMI(x: Double, y:Double): Double {
    return x*y/y
}
fun main(){
    println("Welcome to my BMI calculator in Kotlin!")
    //======|||======\\
    println("Enter your Weight in KG: ")
    var weight = readLine()!!.toDouble()
    println("Enter your height is Meters: ")
    var height = readLine()!!.toDouble()
    //====|||====\\
    var BMI = BMI(weight, height)
    println("Your BMI is : $BMI")
    if (18.5 < BMI){
        println("Underweight")
    }
    else if (BMI in 18.50..25.00){
        println("Normal")
    }
    else if (BMI in 25.00..30.00){
        println("Overweight")
    }
    else{
        println("An Error occur!!")
    }

}


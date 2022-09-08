// Created on 29 June 2022
// Created By Vansh

fun main(){
//    Lets create a car data with in blueprint class created earlier
    var car1 = car_blue_prints()
    car1.company = "Ford"
    car1.model = "Mustang GT"
    car1.color = "Yellow"
    car1.year = "2015"
    car1.electric = false
    car1.alloy_wheels = true
    var wheels : () -> Unit = {
        if (car1.alloy_wheels == true){
            println("Alloy wheels").toString()
        }else {
            println("No alloy wheels").toString()
        }
    }
    println("Hello there!")
    println("Car company is ${car1.company} and model is ${car1.model}")
    println("Car wheels are ${wheels.toString()}")

}
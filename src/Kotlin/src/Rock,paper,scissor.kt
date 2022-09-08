import kotlin.random.Random
import java.util.*

fun main() {
    println("Welcome to mt game of rock, paper, scissors.")

    // Global Variables

    println("What is your name: ")
    val username = readLine()!!.uppercase()
    var userwins = 0
    var botwins = 0

    val options = arrayOf("R", "P", "S")
    //                      0   1    2

    val start = 0
    val end = 2

    var numgene: Int = (random(start, end))
    var compchoice = (options[numgene])



// While loop ===
    var a = 0
    while (a < 3) {
        println("Type 'r' for rock, 'p' for paper and 's' for scissors OR 'Q' for quit: ")
        var userin = readLine()!!.uppercase()


        if (userin !in options){
            continue
        }
        else if (userin == "q") {
            println("<-----===----->")
            println("$username won , ${userwins}, times.")
            println("The computer won, ${botwins}, times.")

        }
        else if (userin == "r" || compchoice == "s") {
            println("$username won!")
            userwins += 1
            a+1
        }
        else if (userin == "s" || compchoice == "p") {
            println("$username won!")
            userwins += 1
            a+1
        }
        else if (userin == "p" || compchoice == "r") {
            println("$username won!")
            userwins += 1
            a+1
        }
        else if (compchoice == "s" || userin == "p") {
            println("You lost")
            botwins += 1
            a+1
        }
        else if (compchoice == "r" || userin == "s") {
            println("You lost")
            botwins += 1
            a+1
        }
        else if (compchoice == "p" || userin == "s") {
            println("You lost")
            botwins += 1
            a+1
        }

        else {
            println("You Lost!")
            botwins += 1
            a+1
        }

    }
    a+1
}
// Function for generating random numbers
fun rangen(start: Int, end: Int): Int {
    require(start <= end) {"Illegal Argument"}
    val  random = Random(System.nanoTime())
    return (start..end).random(random)
}
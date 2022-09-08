import kotlin.random.Random


fun main() {
    println("Welcome to mt game of rock, paper, scissors.")

    // Global Variables

    println("What is your name: ")
    val username = readLine()!!.uppercase()
    var userwins = 0
    var botiswinner = 0

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

        var i = userwins + 1
        var results = when {
            userin == "P" || compchoice == "R" -> {
                i
                a += 1
            }
            userin == "R" || compchoice == "S" -> {
                i
                a += 1
            }
            userin == "S" || compchoice == "P" -> {
                i
                a += 1
            }
            userin == "P" || compchoice == "S" -> {
                botiswinner+1
                a += 1
            }
            userin == "R" || compchoice == "P" -> {
                botiswinner+1
                a += 1
            }
            userin == "S" || compchoice == "R" -> {
                botiswinner+1
                a += 1
            }
            else -> {
                continue
            }
        }
        println(results)
    }
    a += 1
    if (userwins > botiswinner) println("You won!")
    else if (userwins < botiswinner) println("You lost!")
    else if (userwins == botiswinner) println("Draw")
    else println("Error!!")

}
// Function for generating random numbers
fun rangene(start: Int, end: Int): Int {
    require(start <= end) {"Illegal Argument"}
    val  random = Random(System.nanoTime())
    return (start..end).random(random)
}
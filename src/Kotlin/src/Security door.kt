fun main(args: Array<String>) {
    println("Enter time: ")
    var hour = readLine()!!.toInt()
    if (hour <= 18){
        println("Door is Open")
    }
    else{
        println("Door is Closed")
    }
}
fun main(){
    println("Hello there I am here to calculate your fees!")
    println("How much hours did your car parked?")
    val hrs = readLine()?.toInt()
    if (hrs != null) {
        totalBill(hrs)
    }
}
fun totalBill(x: Int){
//    Bill for first 3 hrs will be total of 50rs and 20rs after every hour --
    val hours = x
    hours.toInt()
    val fee = 20
    val bill = ((hours - 3) * fee) + 50
    println("Your total bill according to Hours parked is: $bill rupees")
}
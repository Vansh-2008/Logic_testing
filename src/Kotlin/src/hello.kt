fun main(args: Array<String>) {
    println("Hello World")
    val num: Int = 10
    println(num)
    val z: Int = 14
    println(num + z)
    var num1: Int = 10
    var num2: Int = 15
    println(num1 / 2)
    println(num1 * num2)
    println(num2 % num1)
    // This is a comment lets go
    /*
    This is a
    multiline
    comment
     */
    var numb1 = readLine() !!.toInt()
    var numb2 = readLine() !!.toInt()
    println(numb1 * numb2)
    val tod = -7
    val roma = if (tod > 0) "Positive" else "Negetive"
    println(roma)
    val x = 4
    val y = if (x > 6) x-2 else x+2
    println(x+y)
    println("Enter a number to check weather positive or negetive : ")
    val lol = readLine()!!.toInt()
    val loll = when{
        lol > 0 -> "Positive"
        lol < 0 -> "Negetive"
        else -> "Zero"
    }
    println(loll)
    var mun = 50
    if (mun > 10 && mun < 100){
        println("In range!")
    }
    else{
        println("Not in range")
    }

    var nama = "joly"
    var dana = if(nama == "jolo" || nama == "John" || nama == "Jol" || nama == "joly"){
        println("Hello joly")
    }
    else{
        println("?")
    }

}
class Box {
    var length = 10
    var width = 15
    var height = 5

    var boxFilled = "idk?"

//    This function will tell whether box is filled or not according to user input~
//    It could be further divide on the bases of filled with solid, liquid or gas..
    fun isFilled(){
        if(boxFilled == "yes"){
            println("Yeah box is filled!")
        }else if(boxFilled == "no"){
            println("Hmm box is not filled")
        }else{
            println("Data insufficient!")
        }
    }
//    Lets calculate it's volume
    fun volume(x:Int, y:Int, z:Int){
        val vol = x * y * z
        println("The volume of the box is: $vol")
    }
}
fun main(){
    val box1 = Box()
    println("Box1 height is: ${box1.height}")
    println("Is your box filled?")
    box1.boxFilled = readLine().toString()
    box1.isFilled()
    box1.volume(box1.length, box1.width, box1.height)
}
fun main(){
    println("Hello there!")
    var nums = arrayOf(2, 4, 6)
    for (x in nums){
        println(x)
    }
    var x = arrayOf(4, 2, 6, 7, 1)
    var sum = 0
    for (num in x) {
        sum += num
    }
    println(sum)
    var name = "James"
    for (x in name) {
        println(x)
    }
    val nama = "Obi-One Kenobi"
    println(nama[2])
    println("\\==|Ranges|==//")
    for (i in 29..35) {
        println(i)
    }
    for (z in 'a'..'g') {
        println(z)
    }
    val o = 42
    if(o in 15..100) {
        println("Yes")
    }

}
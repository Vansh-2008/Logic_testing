fun main(){
//    println("While loops")
//    //=========================================\\
//    var i = 1
//    while (i <= 10 ){
//        println("Hello there!")
//        i++
//    }
    var sum = 0
    var i = 1
        while (i <= 100){
            sum += i
            i++
            if (sum > 1000) {
                break
            }
            else if (sum%2 != 0){
                continue
            }
            else{
                continue
            }

        }
    println(sum)

}
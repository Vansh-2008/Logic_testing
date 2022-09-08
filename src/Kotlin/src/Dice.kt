import kotlin.random.Random

fun random(start: Int, end: Int): Int {
    require(start <= end) {"Illegal Argument"}
    val  random = Random(System.nanoTime())
    return (start..end).random(random)
}

fun main() {
    val start = 1
    val end = 6

    for (i in 1..1) println(random(start, end))
}
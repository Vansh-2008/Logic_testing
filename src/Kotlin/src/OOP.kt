class student() {
    //variables
    var name = "Vansh"
    var age: Int = 12

    //methods
    fun display(){
        println("My name is $name and my age is $age.")
    }
}
fun main() {
    println("This is my main method")
    var student1 = student()
    student1.name = "VANSH"
    student1.age = 13

    student1.display()

    var student2 = student()
    student2.name = "Devender"
    student2.age = 14

    student2.display()
}

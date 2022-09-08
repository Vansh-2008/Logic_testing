import kotlin.math.sqrt

fun main(){
    println("${TEXT_PURPLE}Hello world to Vansh Super calculator$TEXT_RESET")
    println("${TEXT_PURPLE}You can calculate anything you want!$TEXT_RESET")
    var condition = true

    while (condition){

        println("${TEXT_RED}So what you want to calculate? type '/help' or 'help' to see available commands$TEXT_RESET")
        println("$TEXT_BLUE'quit' or 'q' to quit.$TEXT_RESET")
        println("${TEXT_GREEN}Write your input here: $TEXT_RESET")
        val input:String = readLine().toString().lowercase()

        if (input == "/volume"){

            println("Enter it's shape: ")
            val shape: String = readLine().toString()

            fun vol() {

                when (shape) {

                    "cube" -> {
                        println("Enter Length (if needed or else enter 0): ")
                        val length:Int = readLine()!!.toInt()

                        val cubeVol = length * length * length
                        println("Volume of the cube is: $cubeVol")

                    }
                    "cuboid" -> {
                        println("Enter Length: ")
                        val length:Int = readLine()!!.toInt()
                        println("Enter Width: ")
                        val width:Int = readLine()!!.toInt()
                        println("Enter Height: ")
                        val height:Int = readLine()!!.toInt()

                        val cuboidVol = length * width * height
                        println("Volume of the cuboid is: $cuboidVol")
                    }
                    "cylinder" -> {
                        println("Enter Radius: ")
                        val radius:Int = readLine()!!.toInt()
                        println("Enter Height: ")
                        val height:Int = readLine()!!.toInt()

                        val cylinderVol = 3.14 * (radius * radius) * height
                        println("Volume of the cylinder is: $cylinderVol")
                    }
                    "cone" -> {
                        println("Enter Radius: ")
                        val radius:Int = readLine()!!.toInt()
                        println("Enter Height: ")
                        val height:Int = readLine()!!.toInt()

                        val coneVol = 3.14 * (radius * radius) * (height/3)
                        println("Volume of the cone is: $coneVol")
                    }
                    "sphere" -> {
                        println("Enter Radius: ")
                        val radius:Int = readLine()!!.toInt()

                        val sphereVol = (4/3) * 3.14 * (radius * radius)
                        println("Volume of the sphere is: $sphereVol")
                    }
                    "pyramid" -> {
                        println("Enter Length: ")
                        val length:Int = readLine()!!.toInt()
                        println("Enter Width: ")
                        val width:Int = readLine()!!.toInt()
                        println("Enter Height: ")
                        val height:Int = readLine()!!.toInt()

                        val pyramidVol = (length * width * height) / 3
                        println("Volume of the pyramid is: $pyramidVol")
                    }
                    "prism" -> {
                        println("Enter Length: ")
                        val length:Int = readLine()!!.toInt()
                        println("Enter Width: ")
                        val width:Int = readLine()!!.toInt()
                        println("Enter Height: ")
                        val height:Int = readLine()!!.toInt()

                        val prismVol = (length * width) * height
                        println("Volume of the prism is: $prismVol")
                    }
                    else -> {
                        println("Please enter a valid figure")
                    }
                }
            }
            vol()

        } else if (input == "/area"){
            println("Enter it's shape: ")

            when(readLine().toString().lowercase()){
                "square" -> {
                    println("Enter Length: ")
                    val length:Int = readLine()!!.toInt()

                    val sqArea = length * length
                    println("Area of the square is: $sqArea")
                }
                "rectangle" -> {
                    println("Enter Length: ")
                    val length:Int = readLine()!!.toInt()
                    println("Enter Width: ")
                    val width:Int = readLine()!!.toInt()

                    val reqArea = length * width
                    println("Area of the square is: $reqArea")
                }
                "triangle" -> {
                    println("Press 1 if you have base height OR Press 2 if you have all 3 sides but not height: ")
                    val triSide = readLine().toString().lowercase()
                    if (triSide == "1"){
                        println("Enter Height: ")
                        val height = readLine()!!.toInt()
                        println("Enter Base: ")
                        val base = readLine()!!.toInt()

                        val triArea = height * base * 1/2
                        println("Area of triangle is: $triArea")
                    } else if (triSide == "2"){
                        println("Enter first number: ")
                        val numN1 = readLine().toString()
                        val num1 = ("$numN1.00").toDouble()
                        println("Enter second number: ")
                        val numN2 = readLine().toString()
                        val num2 = ("$numN2.00").toDouble()
                        println("Enter third number: ")
                        val numN3 = readLine().toString()
                        val num3 = ("$numN3.00").toDouble()

                        heron(num1, num2, num3)

                    } else{
                        println("Ok no problem lets do default option - '1'")
                        println("Enter Height: ")
                        val height = readLine()!!.toInt()
                        println("Enter Base: ")
                        val base = readLine()!!.toInt()

                        val triArea = height * base * 1/2
                        println("Area of triangle is: $triArea")
                    }
                }
                "circle" -> {
                    println("Enter Radius: ")
                    val radius = readLine()!!.toInt()
                    val cirArea = 3.14 * (radius*radius)
                    println("Area of circle is: $cirArea")
                }
                "trapezium" -> {
                    println("Enter Height: ")
                    val height = readLine()!!.toInt()
                    println("Enter base a: ")
                    val sideA = readLine()!!.toInt()
                    println("Enter base b: ")
                    val sideB = readLine()!!.toInt()

                    val trapArea = ((sideA + sideB)/2) * height
                    println("Area of Trapezium is: $trapArea")
                }
                "rhombus" -> {
                    println("Enter Diagonal 1: ")
                    val d1 = readLine()!!.toInt()
                    println("Enter Diagonal 2: ")
                    val d2 = readLine()!!.toInt()

                    val romArea = (d1 * d2) / 2
                    println("Area of Rhombus is: $romArea")
                }
                "parallelogram" -> {
                    println("Enter Base: ")
                    val base = readLine()!!.toInt()
                    println("Enter Height: ")
                    val height = readLine()!!.toInt()

                    val paraArea = base * height
                    println("Area of Parallelogram is: $paraArea")
                }
            }
        }else if(input == "/acceleration" || input == "/acc"){
            println("The answer will be magnitude and make sure m or Km your self and enter all in m or km :)")
            println("Enter it's starting velocity: ")
            val u = readLine()!!.toInt()
            println("Enter it's final velocity: ")
            val v = readLine()!!.toInt()
            println("Enter time taken: ")
            val t = readLine()!!.toInt()

            val acceleration = (v - u) / t
            println("Acceleration of the object is: $acceleration")


        }else if(input == "surface area" || input == "surfacearea"){
            println("Who's surface area you want? like, cube, cuboid, cone, etc..")
            val shape: String = readLine().toString().lowercase()

            when (shape) {
                "cube" -> {
                    println("Is it fully closed or open? fully closed: Yes/No ")
                    val closed = readLine().toString().lowercase()

                    if (closed == "yes"){
                        println("Enter its one side: ")
                        val a = readLine()!!.toInt()
                        val result = 6 * (a * a)
                        println("Surface area of cube is: $result")
                    } else if(closed == "no"){
                        println("Enter its one side: ")
                        val a = readLine()!!.toInt()
                        val result = 4 * (a * a)
                        println("Surface area of cube is: $result")
                    } else{
                        println("Enter yes/no")
                    }

                }
                "cuboid" -> {
                    println("Is box fully closed? fully closed: Yes/No")
                    val open = readLine().toString().lowercase()

                    if (open == "yes"){
                        println("Enter it's Length: ")
                        val length = readLine()!!.toInt()
                        println("Enter it's Width: ")
                        val width = readLine()!!.toInt()
                        println("Enter it's Height: ")
                        val height = readLine()!!.toInt()

                        val result = 2 * (length*width + width*height + length*height)
                        println("Surface area of Cuboid is: $result")

                    } else if(open == "no"){
                        println("Ok is it closed from both up and top or only 1 side open?")
                        println("Enter '1' for 1 side open and enter '2' for two side open")
                        val openSide = readLine().toString().lowercase()
                        if(openSide == "1"){
                            println("Enter it's Length: ")
                            val length = readLine()!!.toInt()
                            println("Enter it's Width: ")
                            val width = readLine()!!.toInt()
                            println("Enter it's Height: ")
                            val height = readLine()!!.toInt()

                            val result = 2 * (length*width + width*height + length*height)
                            println("Surface area of Cuboid is: $result")

                        } else{
                            println("Enter it's Length: ")
                            val l = readLine()!!.toInt()
                            println("Enter it's Width: ")
                            val w = readLine()!!.toInt()
                            println("Enter it's Height: ")
                            val h = readLine()!!.toInt()

                            val result = 2 * h * (l + w)
                            println("Surface area of Cuboid is: $result")
                        }
                    }
                }
                "sphere" -> {
                    println("Enter it's Radius: ")
                    val radius = readLine()!!.toInt()
                    val sphereSurfaceArea = 4 * 3.14 * radius * radius
                    println("Sphere surface area is: $sphereSurfaceArea (approx).")
                }
                "cylinder" -> {
                    println("Is it closed or open? closed -> Yes/No")
                    val closed = readLine().toString().lowercase()

                    if (closed == "yes"){
                        println("Enter it's Height: ")
                        val h = readLine()!!.toInt()
                        println("Enter it's Radius: ")
                        val r = readLine()!!.toInt()

                        val result = 2 * 3.14 * r * (r + h)
                        println("It's surface area is: $result")

                    } else if (closed == "no"){
                        println("Enter it's Height: ")
                        val h = readLine()!!.toInt()
                        println("Enter it's Radius: ")
                        val r = readLine()!!.toInt()

                        val result = 2 * 3.14 * r * h
                        println("It's surface area is: $result")


                    } else{
                        println("Error!")
                    }
                }

                "cone" -> {
                    println("Does cone has a base? Yes/No: ")
                    val base = readLine().toString().lowercase()
                    if (base == "yes"){
                        println("Enter it's Height: ")
                        val h = readLine()!!.toInt()
                        println("Enter it's Radius: ")
                        val r = readLine()!!.toInt()

                        val result = 2 * 3.14 * r * (r + h)
                        println("It's surface area is: $result")
                    } else if(base == "no"){
                        println("Enter it's Height: ")
                        val h = readLine()!!.toInt()
                        println("Enter it's Radius: ")
                        val r = readLine()!!.toInt()

                        val result = h * 3.14 * r
                        println("It's surface area is: $result")
                    } else{
                        println("not valid!")
                    }
                }
                else -> {
                    println("Error")
                }
            }


        } else if(input == "speed"){
            println("Ok now what you want?  speed OR average speed")
            println("press '1' for speed OR press '2' for average speed: ")
            val oneortwo = readLine().toString()
            if (oneortwo == "1"){
                println("Enter distance travelled: ")
                val distance = readLine()!!.toInt()
                println("Enter time taken: ")
                val time = readLine()!!.toInt()

                val speed = distance/time
                println("Speed is: $speed")

            }else if (oneortwo == "2"){
                println("${TEXT_BLACK}Coming soon...")

            }else{
                println("AN error occur try again later..")
            }
        }else if(input == "/maths"){
            println("Ok what you want to do?")
            println("add, sub, multiplication, divide, square, cube, square root OR sqrt, percentage ?")
            println("${TEXT_CYAN}'add' or '+' -> for addition ; 'sub' or '-' -> for subtraction " +
                    "; 'multiply' or '*' -> for multiplication ; 'div' or '/' -> for divide ;" +
                    " 'square' or 'sq' -> for square ; 'cube' -> for cube ; 'sqrt' -> square root ; " +
                    "'percentage' or '%' or 'percent' -> for percentage $TEXT_RESET"
            )
            println("Enter your input: ")

            when (readLine().toString().lowercase()) {
                "add", "+" -> {
                    println("Enter first number: ")
                    val a = readLine()!!.toInt()
                    println("Enter second number: ")
                    val b = readLine()!!.toInt()

                    val sum = a + b
                    println("Sum of first and second number is: $sum")
                }
                "sub", "-" -> {
                    println("Enter first number: ")
                    val a = readLine()!!.toInt()
                    println("Enter second number: ")
                    val b = readLine()!!.toInt()

                    val sub = a - b
                    println("Subtract of first and second number is: $sub")
                }
                "multiply", "*" -> {
                    println("Enter first number: ")
                    val a = readLine()!!.toInt()
                    println("Enter second number: ")
                    val b = readLine()!!.toInt()

                    val product = a * b
                    println("Product of first and second number is: $product")
                }
                "divide", "/" -> {
                    println("Enter first number: ")
                    val a = readLine()!!.toInt()
                    println("Enter second number: ")
                    val b = readLine()!!.toInt()

                    val quotient = a / b
                    println("Quotient of first and second number is: $quotient")
                }
                "square", "sq" -> {
                    println("Enter the number: ")
                    val n = readLine()!!.toInt()
                    val nSQ = n * n
                    println("The squared number is: $nSQ")
                }
                "cube" -> {
                    println("Enter the number: ")
                    val n = readLine()!!.toInt()
                    val nCUBE = n * n * n
                    println("The squared number is: $nCUBE")
                }
                "sqrt" -> {
                    println("Enter the number: ")
                    val n = readLine()!!.toString()
                    val ndot = "$n.00"
                    val x = ndot.toDouble()
                    val nSQ = sqrt(x)
                    println("The squared number is: $nSQ")
                }
                "percentage", "%", "percent" -> {
                    println("Enter the number out of total whose percentage in total to be found: ")
                    val x = readLine()!!.toInt()
                    println("Enter the total number: ")
                    val y = readLine()!!.toInt()

                    val percentage = (x / y) * 100
                    println("The percentage will be: $percentage")
                }
                else -> {
                    println("${TEXT_RED}Not a valid function! Error!$TEXT_RESET")
                }
            }

        }else if(input == "/mass" || input == "mass"){
            println("Enter weight on Earth: ")
            val x = readLine().toString()
            val weight = ("$x.0").toDouble()
            val gravity = 9.8
            val mass = weight/gravity
            println("Object mass will be: $mass")
            println(TEXT_BLUE + "Fun fact weight depend on gravity and may be different place to place" +
            " but mass remain constant everywhere in the universe!" + TEXT_RESET)
        }else if(input == "/pressure" || input == "pressure"){
            println("Enter the force(in newtons): ")
            val force = readLine()!!.toInt()
            println("Enter area on acting(in meters): ")
            val area = readLine()!!.toInt()

            val pressure = force * area
            println("The pressure will be: $pressure")

        }else if(input == "/density" || input == "density"){
            println("Enter mass of the substance(in Kgs): ")
            val mass = readLine()!!.toInt()
            println("Enter Volume of the substance(in meters): ")
            val volume = readLine()!!.toInt()

            val density = mass / volume
            println("Its desity is $density")

        }else if(input == "/help" || input == "help" ){
            println(TEXT_RED + "If you want to stop it then type 'quit' or 'q' anytime." + TEXT_RESET)
            println("There are commands to access several functions listed below: ")
            println(TEXT_GREEN +
                    "-------------------- \n" +
                    " --> '/volume' for calculating volume \n" +
                    " --> '/area' for calculating area \n" +
                    " --> '/acceleration' or '/acc' for calculating acceleration \n" +
                    " --> '/surface area' for calculating surface area \n" +
                    " --> '/speed' for calculating speed \n" +
                    " --> '/maths' for basic addition, subtraction, multiplication and division..etc \n" +
                    " --> '/mass' for calculating mass with weight on Earth \n" +
                    " --> '/pressure' for calculating pressure" +
                    TEXT_RESET
            )

        } else if(input == "quit" || input == "q"){
            println("${TEXT_RED}Stopping it..$TEXT_RESET")
            condition = false
            println("${TEXT_BLUE}Project stoped!$TEXT_RESET")
        } else{
            println(TEXT_RED + "Error!" + TEXT_RESET)
            condition = false
        }
    }
}


fun heron(x:Double, y:Double, z:Double) {
    val a = x
    val b = y
    val c = z
    println("${TEXT_BLACK}User input == $a, $b, $c.$TEXT_RESET")
    val s = (a + b + c)/2
    println("--> Semi perimeter is $s")
    val sqrtResult = (s*(s-a)*(s-b)*(s-c))
    println("${TEXT_CYAN}Area of the triangle is = ${sqrt(sqrtResult)} $TEXT_RESET")
}
const val TEXT_RESET = "\u001B[0m"
const val TEXT_BLACK = "\u001B[30m"
const val TEXT_RED = "\u001B[31m"
const val TEXT_GREEN = "\u001B[32m"
const val TEXT_BLUE = "\u001B[34m"
const val TEXT_PURPLE = "\u001B[35m"
const val TEXT_CYAN = "\u001B[36m"


import kotlin.math.PI

fun main() {

    println("Enter radius of the circle:")
    val radius = readln()
    println("Area of the circle: ${circleArea(radius.toInt())}")
}

fun circleArea(radius: Int) = PI * radius * radius
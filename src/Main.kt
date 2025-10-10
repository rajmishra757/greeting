fun main() {

    println("Enter hours, minutes and seconds:")
    val hours = readln()
    val minutes = readln()
    val seconds = readln()
    println(
        "$hours hour(s) $minutes minute(s) $seconds second(s) = ${
            intervalInSeconds(
                hours.toInt(),
                minutes.toInt(),
                seconds.toInt()
            )
        } seconds"
    )
}

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0): Int {

    return ((hours * 60) + minutes) * 60 + seconds
}
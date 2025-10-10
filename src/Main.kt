//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val totalPizzaSlices = 8

    // Using while
    var sliceCount = 1
    while (sliceCount < totalPizzaSlices) {

        println("There is only $sliceCount slice/s of pizza :(")
        sliceCount++
    }
    println("There are $sliceCount slices of pizza. Hooray! We have a whole pizza! :D\n")

    // Using do-while
    sliceCount = 0
    do {

        sliceCount++
        if (sliceCount < totalPizzaSlices)
            println("There is only $sliceCount slice/s of pizza :(")
        else
            println("There are $sliceCount slices of pizza. Hooray! We have a whole pizza! :D")
    } while (sliceCount < totalPizzaSlices)
}
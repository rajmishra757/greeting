//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Enter a letter:")
    val starter = readln()

    val words = listOf<String>("dinosaur", "limousine", "magazine", "language")

    for (word in words) {

        if (word.startsWith(starter, true)) println(word)
    }
}
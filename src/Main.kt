//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.random.Random

fun main() {

    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    println("First result: $firstResult")
    println("Second result: $secondResult")
    println(if (firstResult == secondResult) "You win :)" else "You lose :(")
}
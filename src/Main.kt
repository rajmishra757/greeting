//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    for (num in 1..100) println(when {

        num % 3 == 0 && num % 5 == 0 -> "fizzbuzz"
        num % 3 == 0 -> "fizz"
        num % 5 == 0 -> "buzz"
        else -> "$num"
    })
}
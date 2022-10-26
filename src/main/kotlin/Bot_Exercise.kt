import java.util.*

fun main() {
    /**
     * This is from one of JetBrains Exercises
     * This is supposed to guess your age base on number inputs(remainders)
     * User will input his name and then enter remainders of your age
     */
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    print("> ")
    val name = scanner.nextLine()

    println("What a great name you have, $name!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // reading all remainders
    print("> ")
    val remainder3 = scanner.nextLine().toInt()
    print("> ")
    val remainder5 = scanner.nextLine().toInt()
    print("> ")
    val remainder7 = scanner.nextLine().toInt()

    val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    println("Your age is $yourAge; that's a good time to start programming!")
}
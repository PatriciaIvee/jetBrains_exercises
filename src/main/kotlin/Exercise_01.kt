fun main() {
//    This is the other Way
    val firstName = readLine()!!
    val lastName = readLine()!!
    val age = readLine()!!.toString()
    println("${firstName[0]} . $lastName, $age years old")

//    This way is turning a readLine into ArrayList
    val input = readln()
    val inputString : ArrayList<String> = input.split(" ") as ArrayList<String>
    println(inputString)
//    prints the ArrayList
    println("${inputString[0][0]}. ${inputString[1]}, ${inputString[2]} years old")
// 2 brackets on ${inputString[0]index[0]substring}
}
const val ZERO = 0
const val THOUSAND = 1000
fun main() {
    /**
     * There are numbers a, b, c, d
    a,b,c,d
    . Output in ascending order all the integers between 0
    0
    and 1000
    1000
    (inclusively), which are the roots of the equation a * x^3 + b * x^2 + c * x + d = 0

    If a specified interval does not contain any roots of the equation, do not output anything.
     */


    val int1 = readln().toInt()
    val int2 = readln().toInt()
    val int3 = readln().toInt()
    val int4 = readln().toInt()

    for (i in ZERO .. THOUSAND) {
        val result = int1 * i * i * i + int2 * i * i + int3 * i + int4
        if(result == 0) {
            println(i)
        }
    }
}
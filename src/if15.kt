import kotlin.math.max
import kotlin.math.min

fun main() {
    println("Uchta son kiriting")
    print("a = ")
    val a = readLine()!!.toInt()
    print("b = ")
    val b = readLine()!!.toInt()
    print("c = ")
    val c = readLine()!!.toInt()
    sumMax(a, b, c)
}

fun sumMax(a: Int, b: Int, c: Int) {
    val kichigi: Int = min(min(a, b), c)
    if (a > kichigi && b > kichigi)
        println("$a \n$b")
    else if (a > kichigi && c > kichigi)
        println("$a \n$c")
    else println("$b \n$c")
}

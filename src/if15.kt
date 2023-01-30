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
    val max = max(max(a, b), c)
    val min = min(min(a, b), c)
    val urta = a + b + c - max - min
    print("$max \n$urta")
}

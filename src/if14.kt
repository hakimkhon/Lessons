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
    printMaxMin(a, b, c)
}

fun printMaxMin(a: Int, b: Int, c: Int) {
    println("Min = ${min(min(a, b), c)}")
    println("Max = ${max(max(a, b), c)}")
}

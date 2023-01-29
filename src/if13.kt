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
    println("O'rtachasi = ${urtachasi(a, b, c)}")
}

fun urtachasi(a: Int, b: Int, c: Int): Int {
    val sum: Int = a + b + c
    return sum - min(min(a, b), c) - max(max(a, b), c)
}

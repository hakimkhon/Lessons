import kotlin.math.min

fun main() {
    println("Uchta son kiriting")
    print("a = ")
    val a = readLine()!!.toInt()
    print("b = ")
    val b = readLine()!!.toInt()
    print("c = ")
    val c = readLine()!!.toInt()
    println("Eng kichigi = ${fineMinRezalt(a, b, c)}")
}

fun fineMinRezalt(a: Int, b: Int, c: Int): Int {
    return min(min(a, b), c)
}

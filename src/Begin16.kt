import kotlin.math.PI
import kotlin.math.abs

fun main() {
    print("Son o'qidan ikkita nuqtani kiriting \na = ")
    val a = readLine()!!.toInt()
    print("b = ")
    val b = readLine()!!.toInt()
    println("Nuqtalar orasidagi masofa = ${abs(a - b)}")

}
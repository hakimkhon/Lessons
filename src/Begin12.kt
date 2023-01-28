import kotlin.math.sqrt

fun main() {
    print("To'g'ri to'rtburchakning tomonlarini kiriting \na = ")
    val a = readLine()!!.toFloat()
    print("b = ")
    val b = readLine()!!.toFloat()
    val c = sqrt(a * a + b * b)
    val p = a + b + c
    print("gpotinuza c = $c \nPeremtri P = $p")
}
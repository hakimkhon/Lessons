import kotlin.math.sqrt
fun main() {
    print("Ikkita manfiy bo'lmagan son kiriting \na = ")
    val a = readLine()!!.toFloat()
    print("b = ")
    val b = readLine()!!.toFloat()
    val urta = sqrt(a * b)
    print("O'rta arifmetigi = $urta")
}
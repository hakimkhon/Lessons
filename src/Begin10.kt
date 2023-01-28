import kotlin.math.abs
import kotlin.math.sqrt
fun main() {
    print("Nolga teng bo'lmagan ikkita son kiriting \na = ")
    val a = readLine()!!.toFloat()
    print("b = ")
    val b = readLine()!!.toFloat()
    val kup = a * b
    val yig = a + b
    val mod_a = a * a
    val mod_b = b * b
    println("Yig'indisi = $yig")
    println("ko'paytmasi = $kup")
    println("a kvadrat = $mod_a")
    println("b kvadrat = $mod_b")
}
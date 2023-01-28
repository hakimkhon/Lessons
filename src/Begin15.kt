import kotlin.math.PI

fun main() {
    print("Aylana yuzini kiriting S = ")
    val s = readLine()!!.toDouble()
    val d = Math.sqrt(s / PI) * 2
    println("Aylananing diametri D = $d")

}
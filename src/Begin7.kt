import kotlin.math.PI

fun main() {
    print("Doiraning radiusini kiriting \nR = ")
    val r = readLine()!!.toInt()
    val l = 2 + PI * r
    val s = PI * r * r
    print("Doiraning yuzi S = $s \nDoiraning uzunligi L = $l")
}
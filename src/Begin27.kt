fun main() {
    print("a = ")
    val a = readLine()!!.toInt()
    var b = a * a
    println("a2 = $b")
    b *= b
    println("a4 = $b")
    b *= a
    b *= a
    println("a8 = $b")
}
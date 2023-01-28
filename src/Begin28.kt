fun main() {
    print("a = ")
    val a = readLine()!!.toInt()
    var a2 = a * a
    println("a2 = $a2")
    a2 *= a
    println("a3 = $a2")
    a2 *= a2
    println("a5 = $a2")
    a2 *= a*a*a*a
    println("a10 = $a2")
}


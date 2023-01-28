fun main() {
    print("a = ")
    var a = readLine()!!.toInt()
    print("b = ")
    var b = readLine()!!.toInt()
    val c = a
    a = b
    b = c
    print("a = $a \nb = $b")
}
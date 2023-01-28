fun main() {
    print("a = ")
    var a = readLine()!!.toInt()
    print("b = ")
    var b = readLine()!!.toInt()
    print("c = ")
    var c = readLine()!!.toInt()
    val d = a
    a = b
    b = c
    c = d
    print("a = $a \nb = $b \nc = $c")
}
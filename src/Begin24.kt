fun main() {
    print("a = ")
    var a = readLine()!!.toInt()
    print("b = ")
    var b = readLine()!!.toInt()
    print("c = ")
    var c = readLine()!!.toInt()
    val d = a
    a = c
    c = b
    b = d
    print("a = $a \nb = $b \nc = $c")
}
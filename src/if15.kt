import kotlin.math.min

fun main() {
    println("Uchta son kiriting")
    print("a = ")
    val a = readLine()!!.toInt()
    print("b = ")
    val b = readLine()!!.toInt()
    print("c = ")
    val c = readLine()!!.toInt()
    var list = listOf<Int>(a, b, c)
    println(list.sorted())
    println(list)
//    funFilter(a, b, c, 3)
//    if (a == b && b == c) {
//        println(a)
//        println(b)
//    }
//    else if ((a == b && b != c) || (a == c && b != c) || (c == b && a != c)) {
//        println(a)
//        println(b)
//    }
//    else {
//        if (a > minimum) println(a)
//        if (b > minimum) println(b)
//        if (c > minimum) println(c)
//    }
}

private fun <E> List<E>.add(e: E) {

}

fun funFilter(a: Int, b: Int, c: Int, i: Int) {

}

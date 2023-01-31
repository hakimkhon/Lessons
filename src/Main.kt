fun main() {
//    val digits: IntRange = 1..99
//    for (i in digits)
    var x: Int = 20
    var y: Int = 50
    val s1 = x + y
    val s2 = x.plus(y)
    val s3 = x - y
    val s4 = x.minus(y)
    val s5 = x * y
    val s6 = x.times(y)
    val s7 = x / y
    val s8 = x.div(y)
    val s9 = x % y
    val s0 = x.rem(y)
    val max = x.coerceAtLeast(y)
    val min = x.coerceAtMost(y)
//    x.plusAssign(y) x+=y
    println(x.dec()) //x++
    println(x.inc()) //y--


    val yigindi = x + y
    val ayirma = x - y
    val kupaytma = x * y
    val bulinma: Float = x.toFloat() / y
//    println("x + y = $yigindi")
//    println("x - y = $ayirma")
//    println("x * y = $kupaytma")
//    println("x / y = $bulinma")

//    print("Ismongiz:")
//    val name = readLine()!!
//    print("Yoshingiz:")
//    val age = readLine()!!
//    println("Sizning ismingiz: $name, yoshingiz esa $age")

    val str = """
        1-qarot
        2-qator
    """.trimIndent()
    println(str)

}
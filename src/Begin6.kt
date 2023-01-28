fun main() {
    print("Paralipipedning tomonlarini kiriting a, b, c \na = ")
    val a = readLine()!!.toInt()
    print("b = ")
    val b = readLine()!!.toInt()
    print("c = ")
    val c = readLine()!!.toInt()
    val v = a * b * c
    val s = 2 * (a * b + a * c + c * b)
    print("Paralipipedning hajmi V = $v \nParalipipedning to'lasirti S = $s")
}
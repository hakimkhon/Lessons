import java.lang.reflect.Array

fun main() {
    print("n = ")
    val n = readLine()!!.toInt()
    val array =  IntArray(n)
    for (i in 0 until n){
        array[i] = readLine()!!.toInt()
    }
    for (i in 0 until n){
        print("${array[i]} ")
    }
}

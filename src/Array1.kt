import java.lang.reflect.Array

fun main() {
    var a = "sdsfs"
    println(a::class.simpleName)
// or
    println(a::class.qualifiedName) // kotlin.Int
    print("n = ")
    val n = readLine()!!.toInt()
    val array =  IntArray(n)
//    val array2 =  IntArray(1,3,4,5,6)
    for (i in 0 until n){
        array[i] = readLine()!!.toInt()
    }
//    print(IntArray.)
    for (i in 0 until n){
        print("${array[i]} ")
    }
}

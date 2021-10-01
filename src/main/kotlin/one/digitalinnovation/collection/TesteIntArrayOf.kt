package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(2, 5, 45, 30, 15, 20)

    values.forEach {
        println(it)
    }
    println("-------------------")

    values.sort()
    values.forEach {
        println(it)
    }
}
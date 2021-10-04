package one.digitalinnovation.collection

fun main() {
    val names = Array<String>(3) {""}
    names[0] = "Joana"
    names[1] = "Crésio"
    names[2] = "Vidalgo"

    for (name in names) {
        println(name)
    }

    println("______________________")
    names.sort()

    names.forEach { println(it) }

    val names2 = arrayOf("João","Jonatas","Cleusa")

    println("___________________")

    names2.sort()

    names2.forEach { println(it) }
}
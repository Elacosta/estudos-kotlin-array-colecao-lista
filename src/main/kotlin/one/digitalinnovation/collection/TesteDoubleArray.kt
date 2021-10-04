package one.digitalinnovation.collection

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 500.00
    salarios[1] = 2500.00
    salarios[2] = 2000.00

    salarios.forEach { println(it) }

    println("--------------------------------")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }

    println("--------------------------------")

    val salarios2 = doubleArrayOf(1500.00, 2500.00, 3000.00)
    salarios2.sort()
    salarios2.forEach { println(it) }

}
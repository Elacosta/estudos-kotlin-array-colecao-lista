package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(100.00, 145.00, 500.00)

    for (salario in salarios) {
        println(salario)
    }

    println("_________________________________")

    println("Maior salario:  ${salarios.maxOrNull()}")
    println("Menor salario:  ${salarios.minOrNull()}")
    println("Media Salarial:  ${salarios.average()}")


    val salariosFilter = salarios.filter { it > 250.00}
    println("_________________________________")
    salariosFilter.forEach { println(it) }

    println("_________________________________")
    println(salarios.count{it in 110.00..750.00})

    println("_________________________________")
    println(salarios.find{it == 500.00})

    println("_________________________________")
    println(salarios.find{it == 275.00})

    println("_________________________________")
    println(salarios.any{it == 275.00})

    println("_________________________________")
    println(salarios.any{it == 500.00})

}
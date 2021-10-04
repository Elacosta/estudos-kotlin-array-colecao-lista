package one.digitalinnovation.collection

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    for (valor in values) {
        println(valor)
    }
    println("------------")
    values.forEach { //recurso de lambda do Kotlin
        println(it)
    }
    println("------------")
    values.forEach { valor -> //valor se torna It
        println(valor)
    }
    println("------------")
    for (index in values.indices) { //iterar sobre os índices do array
        println(values[index])
    }
    println("------------")
    values.sort() //recurso de um array que faz o array ir do menor para o maior
    for (valor in values) {
        println(valor)
    }
}
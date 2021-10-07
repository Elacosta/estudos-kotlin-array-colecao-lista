package one.digitalinnovation.collection

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "4000".toBigDecimal(),
        "6000".toBigDecimal()
    )
    println("____________________")
    println(salarios.somatoria())

    println("____________________")
    println(salarios.media())
}
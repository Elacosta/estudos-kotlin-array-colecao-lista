package one.digitalinnovation.collection

fun main() {
    val pair: Pair<String, Double> = Pair("Jonas",1500.0)
    val map1 = mapOf(pair)

//  map1.forEach{ k, v -> println("Chave: $k - Valor: $v")}
    map1.forEach{ (k, v) -> println("Chave: $k - Valor: $v")}

    val map2 = mapOf(
        "Joana" to 2500.0,
        "Paulo" to 2750.0) //infix

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}
package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("João", 1000.0, "clt")
    val pedro = Funcionario("Pedro", 2000.0,"pj")
    val jonas = Funcionario("Jonas", 3000.0, "pj")
    val mara = Funcionario("Mara", 4000.0, "pj")

    val funcionarios = listOf(joao, pedro, jonas, mara)

    funcionarios.forEach { println(it) }

    println("___________________________")
    println(funcionarios.find { it.name == "Mara" })

    println("___________________________")
    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it)} //encadeamento

    println("___________________________")
    funcionarios
        .groupBy { it.tipo }
        .forEach{ println(it)}
}
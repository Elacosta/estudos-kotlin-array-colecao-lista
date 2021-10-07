package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("João", 1000.0, "clt")
    val pedro = Funcionario("Pedro", 2000.0,"pj")
    val jonas = Funcionario("Jonas", 3000.0, "pj")
    val mara = Funcionario("Mara", 4000.0, "pj")

    val funcionarios = mutableListOf(joao, mara)

    funcionarios.forEach{ println(it) }

    println("__________ADICIONANDO______________")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it) }

    println("___________REMOVENDO_____________")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }

    println("____________SET____________")

    val funcionariosSet = mutableSetOf(joao)

    funcionariosSet.forEach{ println(it) }

    println("__________ADICIONANDO__________")
    funcionariosSet.add(pedro)
    funcionariosSet.add(mara)
    funcionariosSet.forEach{ println(it) }

    println("__________REMOVENDO__________")
    funcionariosSet.remove(mara)
    funcionariosSet.forEach{ println(it) }
}
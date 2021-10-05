package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("João", 1000.0, "clt")
    val pedro = Funcionario("Pedro", 2000.0,"pj")
    val jonas = Funcionario("Jonas", 3000.0, "pj")
    val mara = Funcionario("Mara", 4000.0, "pj")

    val funcionarios1 = setOf(joao, mara)
    val funcionarios2 = setOf(jonas, pedro)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it) }

    println("________________")
    val funcionarios3 = setOf(pedro, mara, joao)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it) }

    println("________________")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{ println(it) }

}
package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("Joao", 1000.0, "clt")
    val pedro = Funcionario("Pedro", 2000.0,"pj")
    val jonas = Funcionario("Jonas", 3000.0, "pj")
    val mara = Funcionario("Mara", 4000.0, "pj")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.name, joao)
    repositorio.create(pedro.name, pedro)
    repositorio.create(jonas.name, jonas)
    repositorio.create(mara.name, mara)

    println(repositorio.findById(joao.name))

    println("______________________")
    repositorio.findAll().forEach{ println(it) }

    println("______________________")
    repositorio.remove(mara.name)
    repositorio.findAll().forEach{ println(it) }

}
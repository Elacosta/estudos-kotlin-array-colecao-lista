package one.digitalinnovation.collection

data class Funcionario(
    val name: String,
    val salario: Double,
    val tipo: String
) {
    override fun toString(): String =
        """
            Nome: $name
            Salário: $salario
            Tipo de contrato: $tipo
        """.trimIndent()
}

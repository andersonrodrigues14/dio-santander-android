package one.difitalInnovation.digionebank.teste

import one.difitalInnovation.digionebank.Analista
import one.difitalInnovation.digionebank.Funcionario

import java.math.BigDecimal

fun main() {
    val anderson = Analista("Anderson Almeida","12312312312",2500.00);

    imprimeRelatorio(anderson)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
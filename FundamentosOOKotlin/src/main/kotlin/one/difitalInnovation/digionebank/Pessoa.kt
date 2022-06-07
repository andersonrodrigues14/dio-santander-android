package one.difitalInnovation.digionebank

class Pessoa {
    var nome: String = "Anderson";
    var cpf: String = "026.762.156-72"
    private set;
}

fun main() {
    val anderson = Pessoa();

    println(anderson.nome);
    println(anderson.cpf);
}
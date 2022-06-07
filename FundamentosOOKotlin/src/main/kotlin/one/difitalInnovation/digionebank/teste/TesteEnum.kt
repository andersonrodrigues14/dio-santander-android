package one.difitalInnovation.digionebank.teste

import one.difitalInnovation.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

}
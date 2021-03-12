package br.senai.sp.jandira.imcapp

class imc {
    var peso = 0.0
    var altura = 0.0

    fun calcularIMC() : Double{
        return peso/(altura*altura)
    }


}
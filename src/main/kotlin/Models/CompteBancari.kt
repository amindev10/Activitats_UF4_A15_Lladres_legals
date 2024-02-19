package Models

import java.util.Date

abstract class CompteBancari {
    protected var NomCompte: String = ""
    protected var Saldo: Double = 0.0

    constructor(saldo: Double, NomCompte: String) {
        this.Saldo = saldo
        this.NomCompte = NomCompte
    }

    fun ingresar(ingreso: Double) {
        println("Ingreso de dinero: $ingreso")
        this.Saldo += ingreso
        this.consultarSaldo()
    }

    fun consultarSaldo() {
        println("Tu saldo es de: $Saldo")
    }

}
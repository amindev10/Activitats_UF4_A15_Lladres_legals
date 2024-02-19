package Models

class CompteEstalvi : CompteBancari {
    protected var Interes: Double = 0.04

    constructor(NomCompte: String, Saldo: Double, Interes: Double) : super(Saldo, NomCompte) {
        this.Interes = Interes
        this.calcularInteres()
    }

    private fun calcularInteres() {
        val interesGenerado = Saldo * Interes
        this.Saldo += interesGenerado
    }

    fun liquidar() {
        println("Liquidación de cuenta")
        this.Saldo = 0.0
        this.consultarSaldo()
    }
}

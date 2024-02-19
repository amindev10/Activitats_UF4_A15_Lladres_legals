package Models

class CompteCorrent : CompteBancari {
    protected var ComisioManteniment: Double = 20.0

    constructor(NomCompte: String, Saldo: Double, ComisioManteniment: Double) : super(Saldo, NomCompte) {
        this.ComisioManteniment = ComisioManteniment
    }

    fun retirar(Retiro: Double) {
        println("Su saldo es de $Saldo y el titular es $NomCompte")
        println("El retiro del dinero es de $Retiro")
        this.Saldo -= Retiro
        this.consultarSaldo()
    }

    fun cobrarComisio() {
        println("EL COBRAMENT DE COMISSIÓ ES DE $ComisioManteniment")
        this.Saldo -= ComisioManteniment
        this.consultarSaldo()
    }
}
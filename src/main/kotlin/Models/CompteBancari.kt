package Models

import java.sql.Date

abstract class CompteBancari {
    private var OberturaData:String="0/0/0"
    private var NomCompte:String=""
    private var Saldo:Double=0.0

    constructor(OberturaData:String, NomCompte:String, Saldo:Double){
        this.OberturaData=OberturaData
        this.NomCompte=NomCompte
        this.Saldo=Saldo
    }

    abstract fun Ingresar(Saldo: Double):Double{
        println("Haz el Ingreso")
        var pSaldo=Saldo
       var ingreso= readln().toInt()
        return ingreso+pSaldo

    }



}


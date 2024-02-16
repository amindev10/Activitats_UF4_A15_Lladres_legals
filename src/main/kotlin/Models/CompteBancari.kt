package Models

import java.sql.Date

abstract class CompteBancari {
    protected var OberturaData:String="0/0/0"
    protected var NomCompte:String=""
    protected var Saldo:Double=0.0



    abstract fun Ingresar(Saldo: Double):Double






}


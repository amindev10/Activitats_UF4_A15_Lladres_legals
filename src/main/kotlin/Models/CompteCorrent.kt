package Models

class CompteCorrent:CompteBancari{
    private var ComisioManteniment:Double=0.0


    constructor(OberturaData:String, NomCompte:String, Saldo:Double, ComisioManteniment:Double){
        this.OberturaData=OberturaData
        this.NomCompte=NomCompte
        this.Saldo=Saldo
        this.ComisioManteniment=ComisioManteniment
    }


fun retirar(){

}

fun CobrarComisió(){

}


 override fun Ingresar(Saldo: Double):Double{
        println("Haz el Ingreso")
        var pSaldo=Saldo
        var ingreso= readln().toInt()
        return ingreso+pSaldo

    }


}
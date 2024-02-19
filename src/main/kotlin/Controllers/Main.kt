package Controllers
import Models.CompteBancari
import Models.CompteCorrent
import Models.CompteEstalvi
fun main() {
var cuentas= mutableListOf<CompteBancari>()
    var C1=CompteCorrent("Amin", 1000.0, 10.0 )
    var C2=CompteEstalvi("Amin", 1900.00, 2.0)

    cuentas.add(C1)
    cuentas.add(C2)


    (cuentas[0] as CompteCorrent).retirar(50.0)
    cuentas[1].ingresar(21912.0)
    (cuentas[1] as CompteEstalvi).liquidar()


    for (cuenta in cuentas){
        if (cuenta is CompteCorrent){
            println("TU CUENTA CORRIENTE")
            cuenta.consultarSaldo()
        }else{
            println("TU CUENTA DE AHORROS")
            cuenta.consultarSaldo()
        }

    }
}
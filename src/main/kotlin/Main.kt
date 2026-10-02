import kotlin.io.encoding.Base64
import kotlin.random.Random
import atvs.atv1
import atvs.atv2
import atvs.atv3
import atvs.atv4
import atvs.atv5
import atvs.atv6
import atvs.atv7

fun main() {
    //Questão 1
    val Atv1 = atv1()
    var Produto = 30.0
    var Cupom: String? = "PROMO20"
    println(Atv1.calcularDesconto(Produto, Cupom))
    //Questão 2
    val Atv2 = atv2()
    val enderecos = listOf("Rua das Flores, 123", null, "Avenida Brasil, 456", null, "Travessa Central, 789")
    Atv2.auditarEntregas(enderecos)
    //Questão 3
    val Atv3 = atv3()
    var bio = "Bolsonaro"
    println(Atv3.validarBioInfatil(bio))
    //Questão 4
    val Atv4 = atv4()
    var total = 0.0
    for (num in Atv4.lista) {
        if (num != null) {
            total += num
        }
    }
    println(total)
    //Questão 5
    val Atv5 = atv5()
    println(Atv5.avaliarMotorista(5))
    //Questão 6
    val Atv6 = atv6()
    println(Atv6.calcularGorjeta(15.0))
    //Questão 7
    val Atv7 = atv7()
    val emails = listOf("joao@email.com", null, "", "maria@email.com", " ")
    Atv7.verificarEmails(emails)
}
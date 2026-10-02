package atvs

class atv7 {
    fun verificarEmails(emails: List<String?>) {
        var contasInvalidas = 0

        for (email in emails) {
            if (email == null || email?.length == 0) {
                contasInvalidas++
                println("Conta inválida. E-mail será deletado.")
            } else {
                println("Conta válida: $email")
            }
        }

        println("Total de contas que precisam ser apagadas: $contasInvalidas")
    }
}
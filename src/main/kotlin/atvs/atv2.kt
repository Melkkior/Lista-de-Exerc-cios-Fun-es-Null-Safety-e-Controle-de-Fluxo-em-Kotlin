package atvs

class atv2 {
    fun auditarEntregas(enderecos: List<String?>) {
        for (endereco in enderecos) {
            val enderecoValidado = endereco ?: "Endereço Desconhecido"

            if (enderecoValidado == "Endereço Desconhecido") {
                println("Entrega Pendente: Falta de dados")
            } else {
                println("Rota traçada para: $enderecoValidado")
            }
        }
    }

}
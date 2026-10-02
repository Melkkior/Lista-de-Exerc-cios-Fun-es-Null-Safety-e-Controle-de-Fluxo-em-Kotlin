package atvs

class atv1 {
    fun calcularDesconto(produto: Double, cupom: String?): Double {
        when (cupom) {
            "PROMO10" -> {
                return produto - 10
            }
            "PROMO20" -> {
                return produto - 20
            }
            else -> {return produto}
        }
    }
}
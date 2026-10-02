package atvs

class atv6 {
        val calcularGorjeta: (Double?) -> Double = {
            if (it == null || it < 0.0) 0.0 else it
        }
}
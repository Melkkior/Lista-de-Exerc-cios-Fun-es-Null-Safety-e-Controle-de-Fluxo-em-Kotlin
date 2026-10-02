package atvs

class atv5 {
    fun avaliarMotorista(nota: Int?): String{
        var Nota = nota ?: 0
        var msg = ""
        when(Nota){
            0 -> msg = "Nenhuma avaliação forneida"
            in 1..3 -> msg = "Precisamos melhorar"
            4 -> msg = "Boa corrida"
            5 -> msg = "Excelente corrida!"
        }
        return msg
    }
}
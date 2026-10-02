package atvs

class atv3 {

fun validarBioInfatil(biografia: String?): String {
    var bio: Int = biografia?.length ?: 0
    if(bio < 50){
        return "Bio aceita"
    } else{
        return "Bio muito longa"
    }
}

}
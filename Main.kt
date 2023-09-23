import java.io.*

fun main(){

    val archivo = File("itinerarios.csv")

    val buffer = archivo.bufferedReader()

    val texto = buffer.readLines()

    val parametros = texto[0].split(",") //Creamos una lista de la primera línea.

    var parametro = ""

    var campo = ""


    for(i in parametros){
        if(i.equals("RECURSO_NOMBRE")){
            parametro = i
        }
    }

    val lista2 = mutableListOf<List<String>>()



    for(s in 1..texto.size - 1){
        lista2.add(s - 1, texto[s].split(","))
    }

    for(l in lista2){
        for(p in l){
            if(p.equals("Mercado municipal de Vila Real de Santo Antonio")){
                campo = p
            }
        }
    }

    println(parametro)
    println(campo)
}
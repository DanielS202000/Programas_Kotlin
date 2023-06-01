fun main() {
    var nombre: String? = null;
    //nombre = null; 
    println ("Imprimiendo el valor nulo de nombre: ");
    println(nombre);
    //nombre = "Ginger";
    //println(nombre!!.length);
    
    // var longitud = nombre?.length ?: 0;
    // println("Longitud de nombre: ");
    // println(longitud);

    try{ 
        println("noombre: $nombre");
    }catch ( exception : NullPointerException){
        println("Ha ocurrido un error");
        println(exception);
    }finally{
        println("Lo que esté en finally, se ejecuta siempre");
    }
var longitud = -1;

    println("------------try-----------")
    try {
        var longitud = nombre?.length;
        println("longitud : $longitud");
        }catch (error : NullPointerException){
        //     //Hubo un error, no se pudo obtener la longitud del nombre
             longitud = 0;
             println("longitud : $longitud");
        }finally{
            //println("Valor longitud : $longitud");
            println("Finally!");
        }
        println("Termina prueba try");
}


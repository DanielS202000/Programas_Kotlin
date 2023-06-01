fun main (){
    println ("Valores de i: ");
    for (i in 1..10){
        println(i);
    }

    println();
    println("Letras: ");
    for (caracter in 'a'..'g' step 2){
        println(caracter);
    }
    println();
    println("Letras en reversa: ");
    for (caracter in 'g' downTo 'a'){
        println(caracter);
    }
    // Recorriendo for con una arreglo
    val mascotas = arrayOf ("Oso", "Blackie", "Nicky","Moka", "Moji");
    println();
    println("Mascotas: ");
    for (i in mascotas.indices){
        println("[$i. ${mascotas[i]}]");
    }

    println();
    println("Dividiendo un String en caracteres: ");
    for (letra in "--- Hola mundo kotlin ---"){
        println(letra);
    }


}
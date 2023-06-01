//Usando funciones que regresan valores
// y funciones que no regresan valores
fun main(){
    val numero1 = 15;
    val numero2 =40;

    border("=", 20);
    var resultado = suma(numero1, numero2);
    println(resultado);
    border("*", 35);

    // var resultador= resta (numero1, numero2);
    // println(resultador);

    //Ejemplo 1 de funcion nonima
    val slogan = {r : Int -> println("Tu puedes con $resultado problemas y mas")};

    //Invocar funcion anonima  - forma 1
    slogan(resultado);
    println("----------------------------------");

    val resta = {n1: Int, n2: Int  -> n1 - n2 };
    println ("Resta: ${resta(12, 18)}");
    println("----------------------------------");
    //Funcion anonima que encuentre el mayor de los 3 
    val max = {n1: Int, n2: Int, n3: Int -> 
        if (n1 >= n2 && n1 >= n3){ n1 } 
        else if (n2 >= n1 && n2 >= n3) { n2} 
        else {n3}};
    println("Valor maximo: ${max(10,78,21)}");
    println("----------------------------------");

    //Funcion  anonima que calcule el promedio de tres numeros
    val promedio = {n1: Int, n2: Int, n3: Int -> (n1 + n2 + n3)/3};
    println("Promedio: ${promedio(60,6,9)}");
} 

fun border(caracter : String, veces : Int){
    for (i in 1..veces){
        print(caracter);
    }
    println();
}
fun suma(n1:Int, n2:Int):Int {
    return n1 + n2;
}
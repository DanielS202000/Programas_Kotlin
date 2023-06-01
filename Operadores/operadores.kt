fun main(){

    val a = 10; //Inmutable
    val b = 5; //Inmutable
    var c = 0; //Inmutable su valor va a cambiar

    println("Operadores: ");
    
    //Suma
    //c = a + b;
    c = a.plus(b);
    println ("$c = $a + $b ");

    //Resta
    //c = a - b;
    c = a.minus(b);
    println ("$c = $a - $b ");

    //comparaciones
    println("b > a: ");
    println(b.compareTo(a) >0); //b > a
    println("a > b: ");
    println(a.compareTo(b) >0); //a > b
    //println("$a > $b = " + (a > b));

    println("b < a: ")
    println(b.compareTo(a)<0);
    println("a < b: ");
    println(a.compareTo(b)<0);

    // a ==b
    println("a==b: ");
    println(a.equals(b));

    //b != b 
    println("a != b: ");
    println(!(a.equals(b)));
}
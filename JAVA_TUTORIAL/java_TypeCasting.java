public class java_TypeCasting {
    public static void main(String []args){
        /*Java Type Casting
        La conversi¢n de tipos es cuando asigna un valor de un tipo de datos primitivo a otro tipo.
        En Java, hay dos tipos de conversi¢n:
        
            -Widening Casting (autom ticamente): conversi¢n de un tipo m s peque¤o a un tama¤o de tipo m s grande
            byte -> corto -> char -> int -> largo -> flotante -> doble

            -Narrowing Casting (manualmente): convertir un tipo m s grande en un tipo de tama¤o m s peque¤o
            doble -> flotante -> largo -> int -> char -> corto -> byte 
        
        Widening Casting:
        Se realiza autom ticamente cuando conviertes un tipo de menor tama¤o a un tipo de mayor tama¤o:*/
            int numero=8;
            double miDouble= numero; //Automaticamente convierte el int en double.
            System.out.println(numero); //imprime 8
            System.out.println(miDouble);// imprime 8.0
        /*Narrowing Casting:
        Se debe hacer manualmente colocando el tipo entre par‚ntesis delante del valor:*/
            double midouble=4.56d;
            int miEntero= (int) midouble; //Convierte manualmente de double a int
            System.out.println(midouble);
            System.out.println(miEntero);
    }
}

package Recursion;

public class recursion {


    /*
     * Recursión de Java
     * La recursividad es la técnica de hacer que una función se llame a sí misma. 
     * Esta técnica proporciona una forma de dividir problemas complicados en problemas 
     * simples que son más fáciles de resolver. La recursión puede ser un poco difícil de entender. 
     * La mejor manera de averiguar cómo funciona es experimentar con él.
     * 
     * 
     * Ejemplo de recursividad
     * Sumar dos números juntos es fácil de hacer, pero sumar un rango de números 
     * es más complicado. En el siguiente ejemplo, la recursividad se usa para 
     * sumar un rango de números al dividirlo en la simple tarea de sumar dos números:
     * 
     */
    ///Osea creamos un ejemplo quye sume del 1 al 10
    public static int sum(int a) {
        if (a > 0) {
          return a + sum(a - 1);
        } else {
          return 0;
        }
    }
    //ahora en el main
    public static void main(String[] args){
        int resultado=sum(10);
        System.out.println(resultado);

        /*

         * Cuando sum()se llama a la función, agrega un parámetro a y
         * la suma de todos los números menores que a y devuelve el resultado. 
         * Cuando a se convierten en 0, la función simplemente devuelve 0. 
         * Cuando se ejecuta, el programa sigue estos pasos:
         */


         /**
          * Condición de parada
          *Así como los bucles pueden encontrarse con el problema de los bucles infinitos, 
          las funciones recursivas pueden encontrarse con el problema de la recursividad infinita. 
          La recursión infinita es cuando la función nunca deja de llamarse a sí misma. 
          Cada función recursiva debe tener una condición de detención, que es la condición en 
          la que la función deja de llamarse a sí misma. En el ejemplo anterior, la condición 
          de detención es cuando el parámetro kse convierte en 0. Es útil ver una variedad de 
          ejemplos diferentes para comprender mejor el concepto. En este ejemplo, la función 
          agrega un rango de números entre un inicio y un final. La condición de detención para 
          esta función recursiva es cuando end no es mayor que start :

          */



          ///Ahora otro ejemplo

          int result = sum(5, 10);
          System.out.println(result);

    }

    public static int sum(int start, int end) {
        if (end > start) {
          return end + sum(start, end - 1);
        } else {
          return end;
        }
    }


//Cuidado
/**
 * El desarrollador debe tener mucho cuidado con la recursividad, 
 * ya que puede ser bastante fácil escribir una función que nunca 
 * termina, o una que usa cantidades excesivas de memoria o potencia 
 * del procesador. Sin embargo, cuando se escribe correctamente, la 
 * recursión puede ser un enfoque de programación muy eficiente y matemáticamente elegante.
 */
    
}

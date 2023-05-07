package ParametrosDelMetodo;

public class parametros {
    public static void main(String[] args){
        /*
         * Parámetros y Argumentos
         * La información se puede pasar a los métodos como parámetro. Los parámetros actúan como variables dentro 
         * del método. Los parámetros se especifican después del nombre del método, entre paréntesis.
         *  Puede agregar tantos parámetros como desee, simplemente sepárelos con una coma. El siguiente 
         * ejemplo tiene un método que toma un fnameString llamado como parámetro.
         *  Cuando se llama al método, pasamos un nombre, que se usa dentro del método 
         * para imprimir el nombre completo:
         * 
         * 
         */


		System.out.println("Division de 2 numeros");
		System.out.println("Division de 240 y 8");
        //240 y 8 son los argumentos
		double respuesta = division(240,8);
		System.out.println("La division es: : " + respuesta);
	}
    //a y b son los parametros
	public static double division(int a, int b){
		double divison=a/b;
		return divison;
	}
    /*
     * Parámetros Múltiples

     * Puede tener tantos parámetros como desee:


     * 
     */

     static void metodoSuma(int a,int b,int c){
        System.out.println("La suma de los numeros es: " + (a+b+c));
     }


/*
 * Valores devueltos
 * La voidpalabra clave, utilizada en los
 *  ejemplos anteriores, indica que el método no debe devolver un valor. Si
 *  desea que el método devuelva un valor, puede usar un tipo de datos primitivo (como int, char, etc.) en
 *  lugar de voidy usar la return palabra clave dentro del método:
 * 
 * 
 */
static int metodoSuma2(int a,int b,int c){
    System.out.println("La Suma es: ");
    return a+b+c;
}

/*
 * 
 * Un método con If...Else
 * Es común usar if...elsesentencias dentro de métodos:
 */
static int metodoSuma3(int a,int b){
    System.out.println("La Suma es: ");
    if(a<b){
        return a+b;

    }

    else{ 
        return a-b;  

    }
    return a*b;


}
















}
package Metodos;

public class metodos {

	/*Métodos de Java
	 * Un método es un bloque de código que solo se ejecuta cuando se le llama. 
	 * Puede pasar datos, conocidos como parámetros, a un método. 
	 * Los métodos se utilizan para realizar ciertas acciones y también se 
	 * conocen como funciones . ¿Por qué usar métodos? Para reutilizar 
	 * el código: defina el código una vez y utilícelo muchas veces.
	 * 
	 * Crear un método
	 * 	Un método debe declararse dentro de una clase. Se define con el nombre del método, seguido de paréntesis () . Java proporciona algunos métodos predefinidos
	 * , como System.out.println(), pero también puede crear sus propios métodos para realizar ciertas acciones:
	 */
	public static void main(String[] args) {
		metodo1();//llama al metodo1
		System.out.println("Ejecucion de metodo2 --> " +metodo2()); //llamada e impresion de metodo2
	}
	
//Este metodo vacio ejecuta una snetencia que envia un mensaje 
static void metodo1() {
	System.out.println("Este mensaje se mostrará cuando llamen al metodo 1");
}
//Este metodo muestra el numero que contiene una variable dentro del metodo
static int metodo2() {
	int numeros = 2+6;
	return numeros;
}
	
}

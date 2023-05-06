package Metodos;

public class metodos {
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

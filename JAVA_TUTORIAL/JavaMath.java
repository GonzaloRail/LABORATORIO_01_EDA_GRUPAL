public class JavaMath {
	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 3;

		System.out.println("El mayor entre " + number1 + " y " + number2 + " es: " + Math.max(number1,number2) + ".\nEl menor entre dichos numeros es: " + Math.min(number1,number2) + ".");

		System.out.println("\nLa raiz cuadrada de 36 es: " + Math.sqrt(36));

		System.out.println("\nEl valor absoluto de 7 es: " + Math.abs(7) + "\ny el valor absoluto de -7 es: " + Math.abs(-7));

		int random = (int) (Math.random() * 12) + 5;

		System.out.println("\nNumero aleatorio entre 5 y 17: " + random); //sin incluir 5 y 17
	}
}

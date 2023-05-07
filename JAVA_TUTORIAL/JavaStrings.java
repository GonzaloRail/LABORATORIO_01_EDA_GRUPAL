public class JavaStrings {
	public static void main (String args[]) {
		String mynames = "Mauricio Eduardo";
		System.out.println("La longitud del String 'mynames' es: " + mynames.length());
		System.out.println("\nUpper Case: " + mynames.toUpperCase());
		System.out.println("\nLower Case: " + mynames.toLowerCase());

		String txt = "Localiza 'duardo' en el String mynames";
		System.out.println("\nOrder: " + txt);
		System.out.println("\tPosition: " + mynames.indexOf("duardo"));

		String lastnames = "Zegarra Puma";
		System.out.println("\n" + mynames + " " + lastnames);
		
		String name = "Mauricio ";
		System.out.println(name.concat(lastnames));

		int number1 = 23;
		int number2 = 37;
		int number3 = number1 + number2;

		String string1 = "23";
		String string2 = "37";
		String string3 = string1 + string2;

		String string4 = string2 + number1; //debe de ser un string
		
		System.out.println("\nnumber3 es una variable de suma de enteros: " + number3 + ".\nstring3 es una concatenacion de dos strings: " + string3 + ".\nstring4 es la concatenacion de un string y un entero: " + string4 + ".");
	
		/*El siguiente string es incorrecto -> String txt = "Arequipa, "La ciudad Blanca"." 
El programa reconoce un cierre de comillas, excluye 'la ciudad blanca', nos arrojará un error. */

		String txt2 = "Arequipa, \"La ciudad Blanca\"."; //forma correcta, la barra invertida nos permite colocar caracteres especiales.

		System.out.println("Lo siguiente es un salto de linea.\nN\rRetroceso\b\fsalto de linea y tab.");
		//corta demostracion de los caracteres especiales que dicho sea de paso, ya fueron utilizados líneas más arriba.
	}
}

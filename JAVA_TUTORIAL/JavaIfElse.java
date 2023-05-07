public class JavaIfElse {
	public static void main(String[] args) {
		
		int x = 4;
		int y = 7;

		if (x == y) {
			System.out.println("x es igual a y");
		}
		else if (x > y) {
			System.out.println("x es mayor a y");
		}
		else {
			System.out.println("x es menor a y");
		}
	
		int time = 13;

		String booleano = (time < 12) ? "Aun no pasa el mediodia" : "Ya paso el mediodia";

		System.out.println("\n" + booleano);
	}
}

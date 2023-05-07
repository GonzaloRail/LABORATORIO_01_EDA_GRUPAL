public class JavaBooleans {
	public static void main(String[] args) {
		boolean verdadero = true;
		boolean falso = false;

		System.out.println(verdadero);
		System.out.println(falso);

		System.out.println("'4 > 10' es " + (4 > 10));

		System.out.println("'7 == 7' es " + (7 == 7));

		int miedad = 18;
		int edadvotante = 18;

		if (miedad >= edadvotante) {
			System.out.println("Puede votar!");
		}
		else {
			System.out.println("No puede votar!");
		}
	}
}

public class JavaSwitch {
	public static void main(String[] args) {
		int day = 0;

		switch (day) {
			case 1:
				System.out.println("Es lunes");
				break;
			case 2:
				System.out.println("Es martes");
				break;
			case 3:
				System.out.println("Es miercoles");
				break;
			case 4:
				System.out.println("Es jueves");
				break;
			case 5:
				System.out.println("Es viernes");
				break;
			case 6:
				System.out.println("Es sabado");
				break;
			case 7:
				System.out.println("Es domingo");
				break;
			default:
				System.out.println("Los dias solo se enumeran del 1 al 7");
		}
	}
}

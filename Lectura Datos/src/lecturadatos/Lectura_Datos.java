package lecturadatos;

import java.util.Scanner;

public class Lectura_Datos {
	public static void main(String[] args) {
		System.out.println("Input the force that has been applied to the nail: ");
		Scanner sc = new Scanner(System.in);
			double decimal = sc.nextDouble();
		System.out.println("The force applied to the nail by the hammer and given back by the nail to the hammer is "
				+ decimal + " Newtons");
		System.out.println();
		sc.close();
	}
}

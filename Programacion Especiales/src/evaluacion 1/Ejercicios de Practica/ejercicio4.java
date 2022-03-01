package ejercicioespecial;

import java.util.Scanner;

public class ejercicio4 {

	public ejercicio4() {
		// TODO Auto-generated constructor stub

		int n;

		Scanner teclado;
		teclado = new Scanner(System.in);

		System.out.println("escribe un numero ");
		n = teclado.nextInt();
		int f, p;

		for (f = 1, p = 2; p <= n; p++) {

			f = f * p;

		}

		System.out.println(+f);

		teclado.close();

	}

}

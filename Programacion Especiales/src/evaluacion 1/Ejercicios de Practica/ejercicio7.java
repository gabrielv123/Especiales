package ejercicioespecial;

import java.util.Scanner;

public class ejercicio7 {

	public ejercicio7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion1 = 0;
		int opcion2 = 0;
		int opcion3 = 0;

		int opcion = 0;

		Scanner teclado;
		teclado = new Scanner(System.in);

		double n = 0;

		while (true) {

			System.out.println("que opcion deseas");
			System.out.println("------------------");
			System.out.println("opcion 1: operaciones simples");
			System.out.println("opcion 2: operaciones complejas");
			System.out.println("opcion 3: cerrar :)");
			opcion = teclado.nextInt();

			if (opcion == 1) {
				opcion = opcion1;

				System.out.println("que opcion deseas");
				System.out.println("------------------");
				System.out.println("opcion 1: sumar");
				System.out.println("opcion 2: restar");
				System.out.println("opcion 3: multiplicar");
				System.out.println("opcion 4: division");
				opcion1 = teclado.nextInt();

				switch (opcion1) {

				case 1: {

					System.out.println("introduce n1");
					double n1 = teclado.nextDouble();

					System.out.println("introduce n2");
					double n2 = teclado.nextDouble();

					n = n1 + n2;

					System.out.println(n);

					break;

				}

				case 2: {

					System.out.println("introduce n1");
					double n1 = teclado.nextDouble();

					System.out.println("introduce n2");
					double n2 = teclado.nextDouble();

					n = n1 - n2;

					System.out.println(n);

					break;

				}

				case 3: {

					System.out.println("introduce n1");
					double n1 = teclado.nextDouble();

					System.out.println("introduce n2");
					double n2 = teclado.nextDouble();

					n = n1 * n2;

					System.out.println(n);

					break;

				}

				case 4: {

					System.out.println("introduce n1");
					double n1 = teclado.nextDouble();

					System.out.println("introduce n2");
					double n2 = teclado.nextDouble();

					n = n1 / n2;

					System.out.println(n);

					break;

				}
				}
			}

			if (opcion == 2) {
				opcion = opcion2;

				System.out.println("que opcion deseas");
				System.out.println("------------------");
				System.out.println("opcion 1: potencia");
				System.out.println("opcion 2: raiz cuadrada");
				opcion2 = teclado.nextInt();

				switch (opcion2) {

				case 1: {

					System.out.println("introduce n1");
					double n1 = teclado.nextDouble();

					n1 = n1 * n1;

					System.out.println(n1);

					break;

				}

				case 2: {

					System.out.println("introduce n1");
					double n1 = teclado.nextDouble();

					double raiz = Math.sqrt(n1);

					System.out.println(raiz);

					break;
				}

				}
			}

			if (opcion == 3) {

				switch (opcion) {

				case 3: {

					System.exit(0);

					break;
				}
				}
			}
		}
	}
}
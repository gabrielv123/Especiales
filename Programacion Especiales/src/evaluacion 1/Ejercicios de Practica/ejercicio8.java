package ejercicioespecial;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado;
		teclado = new Scanner(System.in);

		int precio1, precio2, total, opcionN, edad, dni;

		String nombre, apellido, libro, opcion;

		System.out.println("introduce el dni");
		dni = teclado.nextInt();
		
		
		System.out.println("introduce el nombre");
		nombre = teclado.next();
	
		
		System.out.println("introduce el apellido");
		apellido = teclado.next();
		
		System.out.println("introduce la edad");
		edad = teclado.nextInt();
		
		if (edad<18) {
			
			System.out.println("error debes ser mayor que 18");
			System.exit(0);
		}
		
		else {
			
			System.out.println("bievenido " +nombre+ " " +apellido+ " ");
			
		}
		

		while (true) {

			System.out.println("que opcion deseas");
			System.out.println("------------------");
			System.out.println("opcion 1: Precios");
			System.out.println("opcion 2: Stock de libro");
			System.out.println("opcion 3: cerrar :)");
			opcionN = teclado.nextInt();

			switch (opcionN) {

			case 1: {

				System.out.println("introduce el primer libro");
				precio1 = teclado.nextInt();

				while (precio1 < 0) {
					System.out.println("error el precio no puede ser negativo");

					System.out.println("introduce el segundo libro");
					precio1 = teclado.nextInt();
				}

				System.out.println("introduce el segundo libro");
				precio2 = teclado.nextInt();

				while (precio2 < 0) {
					System.out.println("error el precio no puede ser negativo");

					System.out.println("introduce el segundo libro");
					precio2 = teclado.nextInt();
				}

				total = precio1 + precio2;

				System.out.println("el total es " + total);

				System.out.println("que deseas hacer si/no");
				opcion = teclado.next();

				if (opcion.equals("si")) {
					
					break;

				}

				else {

					System.exit(0);
					break;
				}
				
			}

			case 2: {

				System.out.println("introduce el libro");
				libro = teclado.next();

				if (libro.equals("tiburon")) {

					System.out.println(" tiburon no esta en stock");

					System.out.println("que deseas hacer si/no");
					opcion = teclado.next();

					if (opcion.equals("si")) {

					}

					else {

						System.exit(0);

					}
					
					break;

				}

				else if (libro.equals("aladin")) {

					System.out.println(" aladin no esta en stock");

					System.out.println("que deseas hacer si/no");
					opcion = teclado.next();
					if (opcion.equals("si")) {

					}

					else {

						System.exit(0);
					}

					break;
				}

			}

			case 3: {
				System.exit(0);
			}
			break;
			}

		}
	}
}

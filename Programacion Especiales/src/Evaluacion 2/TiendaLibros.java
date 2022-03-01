/**
 * 
 */
package ejercicioespeciales;

import java.util.Scanner;

public class TiendaLibros {

	public TiendaLibros() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int[] precio = new int[20];
		String[] libros = new String[20];
		int opcion;

		boolean salir = false;

		libros[0] = "nada";
		libros[1] = "timidamente en la oscuridad";
		libros[2] = "pajaros a golpes";
		libros[3] = "caperucita roja";
		libros[4] = "12 cuentos clasico";
		libros[5] = "pepe y mila";
		libros[6] = "enojaos";
		libros[7] = "en casa vacia";
		libros[8] = "123";
		libros[9] = "dia negro";
		libros[10] = "el hobbit";
		libros[11] = "calle juda";

		precio[0] = 0;
		precio[1] = 15;
		precio[2] = 12;
		precio[3] = 15;
		precio[4] = 25;
		precio[5] = 19;
		precio[6] = 17;
		precio[7] = 25;
		precio[8] = 13;
		precio[9] = 11;
		precio[10] = 18;
		precio[11] = 25;
		precio[12] = 35;

		do {

			System.out.println("introduce una opcion");
			System.out.println("-------------------------------------------------------------");
			System.out.println("opcion 1: mostrar el titulo de todos los libros");
			System.out.println("opcion 2: mostrar el titulo y el precio de todos los libros");
			System.out.println("opcion 3: mostrar el precio de un libro");
			System.out.println("opcion 4: introducir un nuevo libro");
			System.out.println("opcion 5: eliminar un libro");
			System.out.println("opcion 6: modificar el precio de un libro");
			System.out.println("opcion 7: modificar el titulo de un libro");
			System.out.println("opcion 8: salir del programa");
			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				for (int li = 0; li < libros.length; li++) {

					if (!(libros[li] == null)) {
						System.out.println(" " + li + ": " + libros[li]);

					}

				}

				break;

			case 2:

				for (int li = 0; li < libros.length; li++) {

					if (!(precio[li] == 0) && !(libros[li] == null)) {
						System.out.println(" " + li + ": el libro es " + libros[li] + " precio es " + precio[li]);

					}

				}

				break;

			case 3:
				teclado.reset();
				teclado.nextLine();
				System.out.println("Cual es el titulo del libro");
				String busca = teclado.nextLine().toLowerCase();
				boolean encontrado = false;

				for (int i = 0; i < libros.length && encontrado == false; i++) {
					if (!(libros[i] == null)) {
						if (libros[i].toLowerCase().equals(busca)) {
							System.out.print("El precio del libro " + libros[i] + " son " + precio[i] + " euros");
							encontrado = true;
						}
					}

				}

				if (!encontrado) {
					System.out.println("No se a encontrado el libro");
				}

				break;
			case 4:
				teclado.reset();
				teclado.nextLine();
				System.out.println("introduce un nuevo libro ");
				String libroNuevo = teclado.nextLine().toLowerCase();

				System.out.println("introduce el precio nuevo ");
				int precionuevo = teclado.nextInt();

				int posicion = 0;

				boolean stock = false;

				for (int i = 0; i < libros.length && stock == false; i++) {

					stock = false;
					if (libros[i] == null) {
						posicion = i;
						stock = true;

					}

				}

				if (stock) {
					System.out.println("nuevo libro añadido ");
					libros[posicion] = libroNuevo;
					precio[posicion] = precionuevo;
				} else {
					System.out.println("la base de datos esta llena, elimina uno");
				}

				break;

			case 5:

				teclado.reset();
				teclado.nextLine();

				System.out.println("que libro deseas eliminar ");
				String eliminarLibro = teclado.nextLine();

				int posicionEliminar = 0;

				boolean eliminar = false;

				for (int i = 0; i < libros.length && eliminar == false; i++) {

					if (!(libros[i] == null)) {

						if (libros[i].toLowerCase().equals(eliminarLibro)) {
							eliminar = true;
							posicionEliminar = i;

						}
					}
				}
				if (eliminar) {

					for (int i = posicionEliminar; i < 19; i++) {
						precio[i] = precio[i + 1];
						libros[i] = libros[i + 1];

					}
					precio[19] = 0;
					libros[19] = null;
					System.out.println("el libro fue eliminado con exito");

				} else {
					System.out.println("el libro no se puede eliminar");
				}

				break;

			case 6:

				teclado.reset();
				teclado.nextLine();

				System.out.println("cual es el libro que desesas modificar ");
				String libroModificar = teclado.nextLine();

				int posicionLibro = 0;
				boolean Modificar = false;

				for (int i = 0; i < libros.length && Modificar == false; i++) {
					if (libros[i].toLowerCase().equals(libroModificar)) {
						Modificar = true;
						posicionLibro = i;
						System.out.println("el libro que deseas modificar es " + libros[i] + " " + precio[i]);
					}
				}
				if (Modificar) {
					System.out.println("introduce el precio nuevo del libro ");
					precio[posicionLibro] = teclado.nextInt();
					System.out.println("el precio nuevo del libro es " + precio[posicionLibro]);
					System.out
							.println("el libro " + libros[posicionLibro] + " cuesta ahora : " + precio[posicionLibro]);
				}

				else {
					System.out.println("el libro no se encuentra en la base de dato");
				}

				break;

			case 7:

				teclado.reset();
				teclado.nextLine();

				System.out.println("cual es el libro que desesas modificar ");
				String libroModificar1 = teclado.nextLine().toLowerCase();

				int posicionLibro1 = 0;
				boolean Modificar1 = false;

				for (int i = 0; i < libros.length && Modificar1 == false; i++) {
					if (!(libros[i] == null)) {
						if (libros[i].toLowerCase().equals(libroModificar1)) {
							Modificar1 = true;
							posicionLibro1 = i;
							System.out.println("el libro que deseas modificar es " + libros[i] + " " + precio[i]);
						}
					}
				}

				if (Modificar1) {
					System.out.println("introduce el nombre nuevo del libro ");
					libros[posicionLibro1] = teclado.nextLine();
					System.out.println("el nombre nuevo del libro es " + libros[posicionLibro1]);

				}

				else {
					System.out.println("el libro no se encuentra en la base de dato");
				}

				break;

			case 8:
				System.out.println("adios");
				System.exit(0);

			default:

				System.out.println("error la opcion no valida");
				break;
			}

			System.out.println("quieres continuar en el programa SI/NO");
			String Pregunta = teclado.next();

			if (Pregunta.toLowerCase().equals("no")) {
				System.out.println("adios");
				System.exit(0);
				
			}

		} while (!salir);

		teclado.close();
		System.exit(0);

	}

}

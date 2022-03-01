package evaluacion2;

import java.util.Scanner;

public class concesionario {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		boolean salir = false;

		String respuesta = "";

		int opcion = -1;
		int intentos = 3;

		// modelo del objeto
		String[] modelo = new String[3];
		modelo[0] = "focus";
		modelo[1] = "fiesta";
		modelo[2] = "mondeo";

		// array de compra donde se guardaran los datos introducidos
		String[][] compras = new String[2][3];

		// color del objeto
		String[] color = new String[6];
		color[0] = "azul";
		color[1] = "verde";
		color[2] = "morado";
		color[3] = "rojo";
		color[4] = "blanco";
		color[5] = "negro";

		// usuario tiene que ser jon y la contraseña 12345
		String[] usuario = new String[2];
		usuario[0] = "jon";
		usuario[1] = "12345";

		boolean login = false;

		do {

			// LOGIN del usuario
			System.out.println("Introduce nombre de usuario");
			String user = teclado.next();

			System.out.println("Introduce contraseña");
			String contrasena = teclado.next();

			// for para comprobar que los datos coindicen con el usuario
			for (int i = 0; i < usuario.length; i = i + 2) {

				if (user.equals(usuario[i]) && contrasena.equals(usuario[i + 1])) {

					login = true;

					break;
				}
			}

			// si los datos coinciden para al menu
			if (login) {
				System.out.println("Bienvenido");
				break;

			}
			// si los datos no coindicen le resta los intento hasta llegar a 0 y cierra el
			// programa
			else {

				System.out.println("login erroneo");
				intentos--;

				System.out.println("le quedas " + intentos + " intentos");
			}

		} while (intentos > 0);

		// para cerrar el programa si llega a 0
		if (intentos <= 0) {

			System.out.println("Intentos agotados");
			System.exit(0);
		}

		do {

			// menu
			System.out.println("Seleccione una opcion");
			System.out.println("1: añadir una compra");
			System.out.println("2: lista de compras");
			System.out.println("3: salir :)");

			opcion = teclado.nextInt();

			switch (opcion) {

			// compras
			case 1:

				boolean lleno = true;
				int posicion = 0;

				// for para comprobar si hay espacio
				for (int i = 0; i < 2; i++) {
					if (compras[i][0] == null) {

						posicion = i;

						lleno = false;

						break;
					}
				}

				// no comprueba el dni
				if (!lleno) {
					System.out.println("Introduzca dni");
					String dni = teclado.next();

					int model = 0;

					// do while para el modelo
					do {
						System.out.println("introduzca modelo");

						// for para comprobar el modelo
						for (int i = 1; i <= modelo.length; i++) {
							System.out.println(i + ": " + modelo[i - 1]);
						}

						model = teclado.nextInt();

						// fin del do while
					} while (!(model > 0 && model <= modelo.length));

					int colorElegido = 0;

					// comprobacion del color
					do {
						System.out.println("Introduzca color");

						// for para comprobar el color
						for (int i = 1; i <= color.length; i++) {
							System.out.println(i + ": " + color[i - 1]);
						}

						colorElegido = teclado.nextInt();

					} while (!(colorElegido > 0 && colorElegido <= color.length));
					// ----------------------------------------

					// ----------------------------------------
					// SECCION QUE INSERTA LOS DATOS EN EL ARRAY BIDIMENSIONAL
					// NOTA: EL NUMERO QUE INTRODUCE EL USUARIO AL ELEGIR MODELO Y COLOR ES MAYOR EN
					// 1 A SU RESPECTIVA POSICION DEL ARRAY. ESTO SE HACE PARA OCULTAR EL 0 DEL
					// USUARIO

					// añade los datos elegido al array
					compras[posicion][0] = dni;
					compras[posicion][1] = modelo[model - 1];
					compras[posicion][2] = color[colorElegido - 1];

					System.out.println("Se a comprado correctamente");

				}

				else {
					System.out.println("array lleno");
				}

				break;

			// listar las comprar
			case 2:

				for (int i = 0; i < compras.length; i++) {
					if (compras[i][0] == null) {

						break;
					}

					for (int j = 0; j < 3; j++) {

						System.out.print(" " + compras[i][j]);

					}

					System.out.println();

				}

				break;

			default:

				break;
			}

			// do while para salir del programa si para continuar y no sale
			do {

				System.out.println("¿Quieres seguir en el programa? SI/NO");

				respuesta = teclado.next();
				respuesta = respuesta.toLowerCase();

				// while para comprobar si o no
			} while (!(respuesta.equals("si") || respuesta.equals("no")));

			if (respuesta.equals("no")) {
				salir = true;
			}

			// fin del ejercicio
		} while (!salir);

		System.out.println("programa cerrado");
		
		teclado.close();

	}

}

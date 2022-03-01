package bodega;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		// variables
		int opcion = 0;
		String codigo = "";
		ListarArticulos articulos = new ListarArticulos();
		
		// ---------------------------------------------- menu ----------------------------------------------------------------//

		do {

			System.out.println("opciones : ");
			System.out.println("1 : Hacer una venta");
			System.out.println("2 : ver todos los articulos");
			System.out.println("3 : ver los articulos sanos");
			System.out.println("4 : pedir un codigo y mostar el precio equivalente");
			System.out.println("5 : mostrar los mas caros");
			System.out.println("6 : mostar los que tengan poco stock");
			System.out.println("7 : actualizar el stock");

			opcion = teclado.nextInt();

			switch (opcion) {
			
			// ---------------------------------------------- case 1 ----------------------------------------------------------------//

			case 1:
				
				// explicacion : declaro un objeto de la clase factura, llamo al metodo leer creado y al metodo imprimir

				Factura factura = new Factura();
				factura.leer(teclado, articulos);
				factura.print();

				break;
				
				// ---------------------------------------------- case 2 ----------------------------------------------------------------//

			case 2:
				
		
				
				// explicacion :  llamo al metodo imprimir que ya hace todo

				articulos.printlista();

				break;
				
				// ---------------------------------------------- case 3 ----------------------------------------------------------------//

			case 3:
				
				// explicacion : hago un for earch para obtener todos los articulo y llamo al metodo sano para solo imprimir los sanos 

				for (Articulos arti : articulos.getLista()) {
					if (arti.sano()) {
						arti.caracteristicas();
					}
				}

				break;
				
				// ---------------------------------------------- case 4 ----------------------------------------------------------------//

			case 4:
				
				// explicacion : declaro un arraylist de articulos y busco por codigo el articulo si lo encuentra compara que los otros articulos tengan el mismo precio y si lo tiene tambien lo imprime

				teclado.nextLine();
				
				ArrayList<Articulos> precio = new ArrayList<>();

				System.out.println("codigo: ");
				codigo = teclado.nextLine();

		

				precio = articulos.equivalentes(codigo);

				if (!precio.isEmpty()) {

					for (Articulos arti : precio) {
						arti.caracteristicas();
					}
				}

				else {

					System.out.println("no hay");

				}

				break;
				
				// ---------------------------------------------- case 5 ----------------------------------------------------------------//

			case 5:
				
				// explicacion : declaro arraylist y llamo al metodo mas caro y imprimo solo los que cumplen la condicion

				ArrayList<Articulos> caro = new ArrayList<>();

				caro = articulos.MasCaro();

				for (Articulos arti : caro) {
					arti.caracteristicas();
				}

				break;
				
				// ---------------------------------------------- case 6 ----------------------------------------------------------------//

			case 6:
				
				// explicacion : declaro el metodo reponer y lo imprimo solo los articulo que cumplan la condicion
				

				ArrayList<Articulos> reponer = articulos.reponer();

				for (Articulos arti : reponer) {

					arti.caracteristicas();

				}

				break;
				
				// ---------------------------------------------- case 7 ----------------------------------------------------------------//

			case 7:
				
				// explicacion : hago un for para obtener la lista y comparo con el codigo puesto
				// y si lo encuentra le pregunto cuando stock quiere poner y llamo al metodo sumar stock

				teclado.nextLine();
				
				boolean bonito = false; // solo existe para que solo salga el mensaje una vez de encontrado

				System.out.println("codigo :");
				codigo = teclado.nextLine();

				for (int i = 0; i < articulos.lista.size() && !bonito ;i++) {
					if (articulos.lista.get(i).codigo.equals(codigo)) {
						bonito = true;

						System.out.println("cuanto stock quieres ponerle");
						int Stock = teclado.nextInt();
						
						articulos.lista.get(i).sumarstock(Stock);
					}

					
				}
				
				if (!bonito) {
					
					System.out.println("no encontrado");
				}
				
				break;

			default:

				System.out.println("error");

				break;

			}
			
			// ---------------------------------------------- fin del menu ----------------------------------------------------------------//

		} while (!(opcion == 0));

	}

}

package bodega;

// esta clase contendra el contenido definido de las tres clases (articulos , refresco , vino)

import java.util.ArrayList;

public class ListarArticulos {

	ArrayList<Articulos> lista = new ArrayList<>();
	
	// hago esto para no tener que llamar en el main al metodo filldata sino que una vez nombre a la lista contenda todo

	public ListarArticulos() {

		this.lista = fillData();
	}

	public ArrayList<Articulos> fillData() {

		// -----------------------------vino ----------------------------------- //

		Vino vino_1 = new Vino("01", "Marques", "rioje", 30.00, 100, "negro", "rioja", 1990, "si");
		this.lista.add(vino_1);

		Vino vino_2 = new Vino("02", "verdejo", "blanco", 30.00, 40, "blanco", "verdejo", 2000, "no");
		this.lista.add(vino_2);

		Vino vino_3 = new Vino("03", "cosechero", "artesanal", 10.00, 200, "negro", "vino de año", 2020, "si");
		lista.add(vino_3);

		// ----------------------------- refresco ------------------------------ //

		Refresco ref1 = new Refresco("04", "cocacola", "cocacola", 5.0, 50, "coca", false, true, 70);
		this.lista.add(ref1);

		Refresco ref2 = new Refresco("05", "fanta", "cocacola", 6.0, 150, "naranga", true, true, 25);
		this.lista.add(ref2);

		Refresco ref3 = new Refresco("06", "kas limon", "kas", 3.0, 20, "coca", true, true, 55);
		this.lista.add(ref3);
		
		return lista;

	}
	
	// ----------------------------- metodo reponer ----------------------------------- //
	
	public ArrayList<Articulos> reponer() {

		// explicacion : hago un for each para recorrer el array y si su stock es menor a 50 lo agregue al arraylist de reponer
		// y lo muestre por pantalla ese nuevo arraylist
		
		ArrayList<Articulos> reponer = new ArrayList<Articulos>();
		for (Articulos arti : lista) {

			if (arti.stock < 50) {
				reponer.add(arti);
			}
		}

		return reponer;

	}
	
	// ----------------------------- metodo mas caro ----------------------------------- //

	public ArrayList<Articulos> MasCaro() {

		// explicacion : creo un arraylist, hago un for each para guardar en el array al precio mas caro y despues guardar
		// los precios que sean igual al mas caro
		
		ArrayList<Articulos> maximo = new ArrayList<Articulos>();
		
		Double caro = 0.0;

		for (Articulos arti : lista) {
			if (arti.precio > caro) {
				caro = arti.precio;
			}
		}

		for (Articulos arti : lista) {
			if (arti.precio == caro) {
				maximo.add(arti);
			}

		}

		return maximo;

	}
	
	// ----------------------------- metodo equivalente ----------------------------------- //

	public ArrayList<Articulos> equivalentes(String codigo) {
		
		// explicacion : busco por teclado el codigo de un producto y agarro su precio y lo comparo con todos los precio
		// de los productos y si tienen el mismo precio los imprimos

		double precio = 0.0;

		for (Articulos arti : lista) {

			if (arti.codigo.equals(codigo)) {
				precio = arti.precio;
			}
		}

		ArrayList<Articulos> iguales = new ArrayList<Articulos>();

		for (Articulos arti : lista) {
			if (arti.precio == precio) {
				iguales.add(arti);
			}
		}

		return iguales;

	}
	
	// ----------------------------- metodo precio ----------------------------------- //

	public double precio(String codigo) {
		
		// busca en el array por codigo y muestra el precio

		double precio = 0;

		for (Articulos arti : lista) {
			if (arti.codigo.equals(codigo)) {

				precio = arti.precio;
			}
		}

		return precio;
	}
	
	// ----------------------------- metodo print ----------------------------------- //

	public void printlista() {
		
		// imprime la lista de todos los articulos

		for (Articulos arti : lista) {
			arti.caracteristicas();
		}
	}
	
	// ----------------------------- metodo getter y setter ----------------------------------- //

	public ArrayList<Articulos> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Articulos> lista) {
		this.lista = lista;
	}

}

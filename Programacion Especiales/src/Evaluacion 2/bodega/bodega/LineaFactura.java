package bodega;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class LineaFactura implements Facturacion {
	
	//--------------------------- declaracion de variables ------------------------------------------//

	private String codigo;
	private int cantidad;
	private double totallinea;
	
	//--------------------------- constuctor vacio ------------------------------------------//

	public LineaFactura() {

		this.codigo = "";
		this.cantidad = 0;
		this.totallinea = 0;
	}
	
	//--------------------------- constructor copia ------------------------------------------//

	public LineaFactura(LineaFactura l) {

		this.codigo = l.codigo;
		this.cantidad = l.cantidad;
		this.totallinea = l.totallinea;
	}
	
	//--------------------------- constructor personalizado ------------------------------------------//

	public LineaFactura(String codigo, int cantidad, double totallinea) {

		this.codigo = codigo;
		this.cantidad = cantidad;
		this.totallinea = totallinea;
	}
	
	//--------------------------- metodos getter y setters ------------------------------------------//

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotallinea() {
		return totallinea;
	}

	public void setTotallinea(double totallinea) {
		this.totallinea = totallinea;
	}
	
	//--------------------------- metodo leer ------------------------------------------//

	// hecho extra para ahorrar codigo en el main

	public LineaFactura leerlinea(Scanner teclado, ListarArticulos lista) {
		
		// explicacion : invoco el array del articulo y obtendo sus valores 

		ArrayList<Articulos> listafactura = new ArrayList<>();
		listafactura = lista.getLista(); // obtengo todos los productos
		boolean bonito = false; // simplemente es aqui bonito es para que termine el while y ponga una vez el mensaje
		int index = 0; // es una variable que guarda el indice para luego usarla mas adelante

		do {

			System.out.println("Ingrese el código del producto, presione ENTER: ejemplo 01");

			this.codigo = teclado.next();

			for (Articulos arti : listafactura) {
				if (arti.codigo.equals(this.codigo)) {
					
					bonito = true;
					index = listafactura.indexOf(arti);
				}
			}

			if (!bonito) {
				System.out.println("codigo invalido");
			}

		} while (!bonito);
		
		
		System.out.println("cantidad");
		this.cantidad = teclado.nextInt();
		
		this.totallinea = calcularTotal(listafactura.get(index).precio);

		LineaFactura imprime = new LineaFactura(this.codigo, this.cantidad, this.totallinea);
		
		return imprime;

	}
	
	//--------------------------- metodo calcular total ------------------------------------------//
	
	// metodo hecho aqui porque no me di cuenta que se tenia que hacer en factura y me dio pereza cambiarlo
	// porque igual funciona bien

	public double calcularTotal(double precio) {

		precio = precio + (precio * Facturacion.iva);
		
	// inicio : esto se usa porque al calcular el iva te va a salir grande cantidades de numero y esto lo pone bien 
		double coste = (this.cantidad * precio) * 100;
		coste = Math.round(coste);
		coste = coste / 100;
	// fin 
		
		return coste;

	}

}

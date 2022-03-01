package bodega;

import java.util.ArrayList;
import java.util.Scanner;

//--------------------------- declaracion de variables ------------------------------------------//

public class Factura {

	int numero;
	String nombre;
	String apellido;
	private ArrayList<LineaFactura> lineasFactura;
	private double Total;


	
	//--------------------------- constuctor vacio ------------------------------------------//

	public Factura() {

		numero = 0;
		nombre = "";
		apellido = "";
		lineasFactura = new ArrayList<LineaFactura>();
		Total = 0.0;
	}
	
	//--------------------------- constructor copia ------------------------------------------//

	public Factura(Factura f) {

		numero = f.numero;
		nombre = f.nombre;
		apellido = f.apellido;
		lineasFactura = new ArrayList<LineaFactura>();
		Total = f.Total;
	}
	
	//--------------------------- constructor personalizado ------------------------------------------//

	public Factura(int n, String no, String a) {

		numero = n;
		nombre = no;
		apellido = a;
		lineasFactura = new ArrayList<LineaFactura>();
		Total = 0.0;
	}

	//--------------------------- metodo leer ------------------------------------------//
	
	// metodo extra para ahorrar lineas de codigos en el main a la hora de hacer la factura

	public void leer(Scanner teclado, ListarArticulos lista) {
		
		String finalizar = "";

		System.out.println("numero factura :");
		this.numero = teclado.nextInt();

		System.out.println("nombre :");
		this.nombre = teclado.next();

		System.out.println("apellido :");
		this.apellido = teclado.next();

	
		
		// do while hecho porque el ejercicio lo pide 

		do {

			LineaFactura lineas = new LineaFactura();
			lineas = lineas.leerlinea(teclado, lista);
			this.lineasFactura.add(lineas);

			System.out.println("para terminar escribe end");
			finalizar = teclado.next().toLowerCase();

		} while (!finalizar.equals("end"));
	}

	//--------------------------- metodo imprimir ------------------------------------------//
	
	public void print() {

		System.out.println("****************************");
		System.out.println("**  numero : " + this.numero);
		System.out.println("**  nombre : " + this.nombre);
		System.out.println("**  numero : " + this.numero);
		System.out.println("****************************");
		System.out.println("");
		System.out.println("   codigo  --  cantidad  --  subtotal");

		double total = 0;

		for (LineaFactura lineas : lineasFactura) {

			System.out.println("** " + lineas.getCodigo() + "     " + lineas.getCantidad() + "         " + lineas.getTotallinea());
			
			total += lineas.getTotallinea();
		}

		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("");
		System.out.println("**  total : " + total);
		System.out.println("");
		System.out.println("****************************");
		System.out.println();

	}

}

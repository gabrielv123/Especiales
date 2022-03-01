package bodega;

//esta clase deriva de bodega que contrendan los articulos que sean vinos

//--------------------------- declaracion de variables ------------------------------------------//

public class Vino extends Articulos {

	String Color;
	String Origen;
	int Año;
	String Uva;
	
	//--------------------------- constructor vacio ------------------------------------------//

	public Vino() {

		super();
		this.Color = "";
		this.Origen = "";
		this.Año = 0;
		this.Uva = "";

	}
	
	//--------------------------- constructor copia ------------------------------------------//

	public Vino(Vino v) {

		super(v);
		this.Color = v.Color;
		this.Origen = v.Origen;
		this.Año = v.Año;
		this.Uva = v.Uva;

	}
	
	//--------------------------- constructor personalizado ------------------------------------------//

	public Vino(String c, String n, String m, Double p, int s, String co, String or, int añ, String uv) {

		super(c, n, m, p, s);
		this.Color = co;
		this.Origen = or;
		this.Año = añ;
		this.Uva = uv;

	}
	
	//--------------------------- metodos definido de imprimir ------------------------------------------//

	@Override
	public void caracteristicas() {

		System.out.println("codigo : " + this.codigo);
		System.out.println("nombre : " + this.nombre);
		System.out.println("marca : " + this.marca);
		System.out.println("stock : " + this.stock);
		System.out.println("color : " + this.Color);
		System.out.println("año : " + this.Año);
		System.out.println("uva : " + this.Uva);
		System.out.println("origen : " + this.Origen);
		System.out.println("precio : " + this.precio);
		System.out.println();

	}
	
	//--------------------------- metodos definido de sano ------------------------------------------//

	@Override
	public boolean sano() {

		if (this.Origen.equals("rioja")) {

			return true;
		}

		else {

			return false;

		}
	}

}

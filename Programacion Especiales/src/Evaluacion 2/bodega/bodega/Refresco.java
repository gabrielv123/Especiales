package bodega;

// esta clase deriva de bodega que contrendan los articulos que sean refrescos

//--------------------------- declaracion de variables ------------------------------------------//

public class Refresco extends Articulos {

	String Sabor;
	boolean Zumo;
	boolean Gas;
	int Azucar;
	
	//--------------------------- constructor vacio ------------------------------------------//

	public Refresco() {

		super();
		this.Sabor = "";
		this.Zumo = false;
		this.Gas = false;
		this.Azucar = 0;

	}
	
	//--------------------------- constructor copia ------------------------------------------//

	public Refresco(Refresco a) {

		super(a);
		this.Sabor = a.Sabor;
		this.Zumo = a.Zumo;
		this.Gas = a.Gas;
		this.Azucar = a.Azucar;

	}
	
	//--------------------------- constructor personalizado ------------------------------------------//

	public Refresco(String c, String n, String m, Double p, int s, String sa, boolean zu, boolean g, int az) {

		super(c, n, m, p, s);
		this.Sabor = sa;
		this.Zumo = zu;
		this.Gas = g;
		this.Azucar = az;
	}
	
	//--------------------------- metodos definido de imprimir ------------------------------------------//

	@Override
	public void caracteristicas() {

		// en vez de que imprima el boleano como false o true es una condicion que lo imprima como tiene o no tiene
		
		String gasString = "no tiene gas";

		if (this.Gas) {

			gasString = "tiene gas";
		}

		System.out.println("codigo : " + this.codigo);
		System.out.println("nombre : " + this.nombre);
		System.out.println("marca : " + this.marca);
		System.out.println("Stock : " + this.stock);
		System.out.println("sabor : " + this.Sabor);
		System.out.println("Gas : " + gasString);
		System.out.println("azucar : " + this.Azucar);
		System.out.println("precio : " + this.precio);
		System.out.println("");

	}

	//--------------------------- metodos definido de sano ------------------------------------------//
	
	@Override
	
	public boolean sano() {

		if (this.Azucar > 25) {

			return false;
		}

		else

			return true;
	}

}

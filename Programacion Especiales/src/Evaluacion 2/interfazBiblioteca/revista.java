package interfazBiblioteca;

public class revista extends biblioteca {
	
	//----------------------- declaracion de variables ---------------------------//	

	private int numero;
	
	//----------------------- constructor defecto ---------------------------//	
	
	public revista () {
		super();
		numero = 0;
	}
	
	//----------------------- constructor copia ---------------------------//	
	
	public revista (revista c) {
		super(c);
		this.numero = c.numero;
	}
	
	//----------------------- constructor personalizado ---------------------------//	
	
	public revista (int codigo, String titulo, int fecha, int numero) {
		super(codigo,titulo,fecha) ;
		this.numero = numero;
	}
	
	
	//----------------------- constructor personalizado de numero ---------------------------//	
	
	public revista (int numero) {
		super();
		this.numero = numero;
	}

	//----------------------- metodo to String ---------------------------//
	
	@Override
	public String toString() {
		return "numero=" + numero + super.toString();
	}
	
	
	
}
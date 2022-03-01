package interfazBiblioteca;

public class libro extends biblioteca {
	
	//----------------------- declaracion de variables ---------------------------//	
	
	private boolean prestado;
	
	//----------------------- constructor defecto ---------------------------//	
	
	public libro() {
		
		super();
		this.prestado = false;
		
	}
	
	//----------------------- constructor copia ---------------------------//	
	
	public libro(libro l) {
		
		super(l);
		this.prestado = l.prestado;
	}
	
	//----------------------- constructor personalizado ---------------------------//	
	
	public libro(int c , String d , int f , boolean p) {
		
		super(c,d,f);
		this.prestado = p;
	}
	
	//----------------------- constructor de boleano ---------------------------//	
	
	public libro(boolean prestado) {
		
		super();
		this.prestado = prestado;
	}
	
	//----------------------- metodo prestar  ---------------------------//	
	
	public boolean prestar() {
		
		return false;
	}
	
	//----------------------- metodo devolver ---------------------------//	

	public boolean devolver() {
		
		return true;
	}
	
	//----------------------- metodo prestado ---------------------------//	
	
	public boolean prestado() {
		
		if (this.prestado == false) {
			return false;
		} 
		
		else {
			return true;
		}
	} 
	
	//----------------------- metodo to String ---------------------------//	
	
	@Override
	public String toString() {
		return "prestado=" + prestado + super.toString();
	}
	
	//----------------------- metodo cuentas prestada ---------------------------//	

	public int cuenta_prestados(libro[] lista) {
	
		// un for que cuenta los libros prestado 
		
		int contador = 0;
		
		for (int i = 0; i < lista.length; i++) {
			libro comprobador = lista[i];
			if (comprobador.prestado()) {
				contador++;
			}
			
		}
		
		return contador;
	}

}

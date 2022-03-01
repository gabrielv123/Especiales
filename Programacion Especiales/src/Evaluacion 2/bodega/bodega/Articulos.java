package bodega;

// esta clase contendra los valores base de los articulos //


//--------------------------- declaracion de variables ------------------------------------------//

public abstract class Articulos {

	String codigo;
	String nombre;
	String marca;
	double precio;
	int stock;
	
	//--------------------------- constructor vacio ------------------------------------------//

	public Articulos() {
		
		this.codigo = "";
		this.nombre = "";
		this.marca = "";
		this.precio = 0.0;
		this.stock = 0;
	}
	
	//--------------------------- constructor copia ------------------------------------------//
	
	public Articulos(Articulos a) {
		
		this.codigo = a.codigo;
		this.nombre = a.nombre;
		this.marca = a.marca;
		this.precio = a.precio;
		this.stock = a.stock;
	}
	
	//--------------------------- constructor personalizado ------------------------------------------//
	
	public Articulos( String c , String n , String m , Double p , int s ) {
		
		this.codigo = c;
		this.nombre = n;
		this.marca = m;
		this.precio = p;
		this.stock = s;
	}
	
	//--------------------------- metodos getter and setter ------------------------------------------//
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

	
//--------------------------- metodos personalizados ------------------------------------------//


	public void sumarstock(int numero) {
		
		stock += numero;
	}
	
	public void quitarstock(int numero) {
		
		stock -= numero;
	}
	
	// este metodo esta hecho para imprimir por pantalla los valores de un articulo
	
	public abstract void caracteristicas();
	
	// este metodo esta hecho para ver que articulo cumple la condicion de ser sano o no
	
	public abstract boolean sano();
	
}

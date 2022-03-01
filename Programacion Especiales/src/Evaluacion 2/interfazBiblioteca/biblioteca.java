package interfazBiblioteca;


public class biblioteca {

	//----------------------- declaracion de variables ---------------------------//	
	
	private int codigo;
	private String titulo;
	private int fecha;
	
	
	//----------------------- constructor defecto ---------------------------//	
	public biblioteca() {
		
		this.codigo = 0;
		this.titulo = "";
		this.fecha = 0;
		
	}
	
	//----------------------- constructor copia ---------------------------//
	
	public biblioteca(biblioteca b) {
		
		this.codigo = b.codigo;
		this.titulo = b.titulo;
		this.fecha = b.fecha;
		
	}
	
	//----------------------- constructor personalizado ---------------------------//
	
	public biblioteca(int c, String t , int f) {
		
		this.codigo = c;
		this.titulo = t;
		this.fecha = f;
		
	}
	
	//----------------------- metodo to String ---------------------------//

	@Override
	public String toString() {
		return "biblioteca [codigo=" + codigo + ", titulo=" + titulo + ", fecha=" + fecha + "]";
	}
	
	//----------------------- metodo publicacion ---------------------------//
	
	// cuando llamas al metodo retorna la fecha 
	public int publicacion() {
		return this.fecha;
	}
	
	//----------------------- metodo codigo ---------------------------//
	
	// cuando llamas al metodo retorna el codigo
	public int codigo() {
		return this.codigo;
	}
	
	//----------------------- metodo publicaciones anteriores ---------------------------//
	
	// este metodo es para revisar cuantas publicaciones hay del año que pongas 
	public int publicaciones_anteriores(biblioteca[] b, int año) {
		
		int contador = 0;
		
		for (int i = 0; i < b.length; i++) {
				biblioteca comprobar = b[i];
				if (comprobar.publicacion() < año) {
					contador ++;	
			}
			
		}
	
		return contador;
	}
	
}

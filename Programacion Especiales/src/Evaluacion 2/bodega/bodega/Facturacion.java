package bodega;

// esta interfaz realmente sobra pero contendra el iva y calculara el precio total con el iva 

public interface Facturacion {
	

	static final double iva = 0.21;
	
	
	public double calcularTotal(double precio);
	
			

}

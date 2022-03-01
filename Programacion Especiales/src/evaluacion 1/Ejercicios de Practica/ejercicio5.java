package ejercicioespecial;

import java.util.Scanner;

public class ejercicio5 {

	public ejercicio5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, x = 0;
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escribe un numero ");
		n = teclado.nextInt();
		
		
		for ( int z = 0; n > 1; z++ ) {
			
			n = n/10;
			x++;
		}System.out.println(+x);
	}	

}

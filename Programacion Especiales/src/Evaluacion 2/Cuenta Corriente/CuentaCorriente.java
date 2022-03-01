package clasepadre;

import java.util.Scanner;

public class CuentaCorriente {

	// declaracion de variables
	private String numero;
	private String titular;
	private Double saldo;
	Scanner teclado = new Scanner(System.in);

	// contructor por defecto
	public CuentaCorriente() {

		this.numero = "";
		this.titular = "";
		this.saldo = 0.0;
	}

	public CuentaCorriente(CuentaCorriente a) {

		this.numero = a.numero;
		this.titular = a.titular;
		this.saldo = a.saldo;
	}

	// contructor personalizado

	public CuentaCorriente(String n, String t, Double s) {

		this.numero = n;
		this.titular = t;
		this.saldo = s;
	}

	public void ingresar(Double cantidad) {

		this.saldo = this.saldo + cantidad;
	}

	public void retirar(Double cantidad) {

		this.saldo = this.saldo - cantidad;
	}

	public boolean saldoNegativo() {

		if (saldo >= 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return " CuentaCorriente numero = " + numero + " titular = " + titular + " saldo = " + saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void leer(Scanner teclado) {

		System.out.println("datos : ");

		System.out.println("dime el nombre del titular ");
		this.titular = teclado.nextLine();

		System.out.println("dime el numero del titular ");
		this.numero = teclado.nextLine();

		System.out.println("dime el saldo del titular ");
		this.saldo = teclado.nextDouble();
	}

}

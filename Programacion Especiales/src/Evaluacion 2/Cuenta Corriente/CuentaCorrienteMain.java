package especiales2;

import java.util.ArrayList;
import java.util.Scanner;

public class CuentaCorrienteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		
		//---------------- este es un arraylist que es un complemento de la clase objeto FUNCIONA TOTALMENTE DIFERENTE QUE UN ARRAYLIST NORMAL YA QUE ES CON OBJETOS Y METODOS -----------------//
		
		ArrayList<CuentaCorriente> cuenta = new ArrayList<>();
		
		//--------------------------------------------------------------------------------------------------------------------------------------------------//
		
		
		int opcion;
		boolean encontrado;

		String numero = "0", titular;
		Double saldo, total, suma, media;
	
		do {

			System.out.println("1 : añadir una cuenta corriente ");
			System.out.println("2 : ingresar dinero en una cuenta corriente ");
			System.out.println("3 : retirar dinero de una cuenta correinte ");
			System.out.println("4 : pedir el nombre de un titutlar y mostrar todas sus cuenta ");
			System.out.println("5 : pedir un saldo y mostrar las cuenta que tengan un saldo mayor ");
			System.out.println("6 : mostar las cuenta que tengan un saldo negativo ");
			System.out.println("7 : mostar la media de los saldos ");
			System.out.println("8 : mostrar la suma de los saldos ");
			System.out.println("9 : pedir un numero de cuenta y mostar la informacion de dicha cuenta ");
			System.out.println("10 : pedir un titular y mostar cuantas cuentas tiene ");
			System.out.println("11 : pedir un titular y mostrar cuantas cuentas tiene un saldo negativo ");
			System.out.println("12 : pedir un titular y mostar la suma y la media del saldo de todas sus cuentas ");
			System.out.println("13 : listar ");
			System.out.println("14 : salir ");
			System.out.println("15 :Pedir un titular y si tiene más de una cuenta corriente, sumar todo su saldo meterlo en una nueva cuenta y eliminar las demás.");

			opcion = teclado.nextInt();

			switch (opcion) {

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//		
			// añadir cliente
			case 1:
				
				//pongo esto para limpiar la informacion del teclado
				teclado.nextLine();
				
				//creo una variable de la clase padre 
				CuentaCorriente Cliente = new CuentaCorriente();

			

				// le coloco valor a la variable cliente para que lo lea por teclado y despues lo añada al array de objeto llamada cuenta
				Cliente.leer(teclado);
				cuenta.add(Cliente);

				break;

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//		

			case 2:

				// ingresar saldo

				teclado.nextLine();

				System.out.println("Introuduzca el numero de cuenta");
				numero = teclado.next();

				System.out.println("dime la cantidad que quieres ingresar ");
				saldo = teclado.nextDouble();

				encontrado = false;

				// es un for donde busco la posicion 
				for (int posicion = 0; posicion < cuenta.size() && encontrado == false; posicion++) {
					// aqui le doy como condicion que contenga la variable que escribi en la arraylist
					if (cuenta.get(posicion).getNumero().equals(numero)) {
						encontrado = true;
						// y cuando la encuentre llamo al metodo ingresar que tiene implementado el objeto saldo declarado en la clase padre
						cuenta.get(posicion).ingresar(saldo);
					}

					else {

						// si no se encuentra le sumo a la posicion
						posicion++;
					}

				}
				
				// booleano encontrado sale por mensaje que lo encontro
				if (encontrado) {
					System.out.println("el dinero se ha ingresado");

				}

				// si el boleano es falso no existe
				else {
					System.out.println("la cuenta no existe");
				}

				break;

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//		

			case 3:

				// retirar saldo
				teclado.nextLine();

				// es basicamente lo mismo que el case 2 solo que llamo a la clase retirar de la clase padre
				
				System.out.println("Introuduzca el numero de cuenta");
				numero = teclado.next();

				System.out.println("dime la cantidad que quieres ingresar ");
				saldo = teclado.nextDouble();

				encontrado = false;

				for (int posicion = 0; posicion < cuenta.size() && encontrado == false; posicion++) {
					if (cuenta.get(posicion).getNumero().equals(numero)) {
						encontrado = true;
						cuenta.get(posicion).retirar(saldo);
					}

					else {

						posicion++;
					}

				}
				if (encontrado) {
					System.out.println("el dinero se ha ingresado");

				}

				else {
					System.out.println("la cuenta no existe");
				}

				break;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//		

			case 4:

				// mostrar cuenta del titular
				teclado.nextLine();

				// es basicamente al igual que el 3 y el 2 pero sin necesidad de cambiar nada porque solo es mostrar
				System.out.println("dime el nombre del titular ");
				titular = teclado.nextLine();

				encontrado = false;

				for (int i = 0; i < cuenta.size();) {
					if (cuenta.get(i).getTitular().equals(titular)) {
						encontrado = true;
						System.out.println(cuenta.get(i));
					}
					i++;
				}

				if (!encontrado) {
					System.out.println("el titular no tiene cuenta");
				}

				break;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//		

			case 5:

				// mostrar cuenta que tengan un saldo mayor
				teclado.nextLine();

				// igual que todos los case la diferencia es que muestra los saldo mayor que piden del array
				System.out.println("dime el saldo del titular ");
				saldo = teclado.nextDouble();

				encontrado = false;

				for (int i = 0; i < cuenta.size();) {
					// lo unico que cambia en este case es que lo comparo y digo que solo muestren los saldo del arrays que sean mayor al saldo que yo puse
					if (cuenta.get(i).getSaldo() > saldo) {
						encontrado = true;
						System.out.println(cuenta.get(i));
					}
					i++;
				}

				if (!encontrado) {
					System.out.println("no hay cuenta con saldo mayor");
				}

				break;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//		

			case 6:

				// mostrar cuenta de saldo negativo 
				
				System.out.println("mostrando cuentas con un saldo negatio");

				encontrado = false;

				for (int i = 0; i < cuenta.size();) {
					// aqui le digo que consiga la informacion del objeto en la posicion del for y nombro el metodo saldo negativo que revisa si el saldo de la posicion del array es negativo o no
					if (cuenta.get(i).saldoNegativo()) {
						encontrado = true;
						System.out.println(cuenta.get(i));
					}
					i++;
				}

				if (!encontrado) {
					System.out.println("no hay cuenta con saldo negativo");
				}

				break;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//						

			case 7:

				// mostrar la media de los saldos
				media = 0.0;
				total = 0.0;

				// un for que recorre el array y consigue el saldo 
				for (int i = 0; i < cuenta.size(); i++) {
					//aqui consigue el saldo, lo suma y lo guarda en la variable total
					total = total + cuenta.get(i).getSaldo();

				}

				//calculo la media la suma de todos los saldo y dividirlo con la cantidad de indice del array
				media = total / cuenta.size();

				System.out.println(media);

				break;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//						

			case 8:

				// mostar la suma de los saldos
				suma = 0.0;
				total = 0.0;

				// igual que el case 7 la unica diferencia es que solo sumo todos los saldo y lo muestro
				for (int i = 0; i < cuenta.size(); i++) {
					total = total + cuenta.get(i).getSaldo();

				}

				System.out.println(total);

				break;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//		

			case 9:

				// mostrar la informacion de la cuenta pedida
				
				// basicamente es igual al case 4 solo que busca por numero de cuenta
				
				teclado.nextLine();

				System.out.println("dime el numero de cuenta ");
				numero = teclado.nextLine();

				encontrado = false;
				

				for (int i = 0; i < cuenta.size() && !encontrado;) {
					if (cuenta.get(i).getNumero().equals(numero)) {
						encontrado = true;
						System.out.println(cuenta.get(i));
					}
					i++;
				}

				if (!encontrado) {
					System.out.println("el titular no tiene cuenta");
				}

				break;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//		

			case 10:

				// mostrar cuantas cuentas tiene el titular
				teclado.nextLine();

				System.out.println("dime el nombre del titular ");
				titular = teclado.nextLine();

				encontrado = false;
				int contador = 0;

				// es un for que basicamente recorre el arrays a base del titular ya que un titular puede tener varias cuenta y inizializo la variable contador que va sumando cada vez
				// que encuentre el titular y lo muestra por pantalla  
				for (int i = 0; i < cuenta.size();) {
					if (cuenta.get(i).getTitular().equals(titular)) {
						encontrado = true;
						contador++;
					}

					i++;

				}

				System.out.println("el titular tiene: " + contador);

				break;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//		

			case 11:

				// mostar cuantas cuntas tiene en saldo negativo
				teclado.nextLine();

				System.out.println("dime el nombre del titular ");
				titular = teclado.nextLine();

				encontrado = false;
				int contadornegativo = 0;
				
				//basicamente igual que el case 10 solo que llamo al metodo saldo negativo que comprobara solo los saldo negativo
				for (int i = 0; i < cuenta.size();) {
					if (cuenta.get(i).getTitular().equals(titular) && cuenta.get(i).saldoNegativo()) {
						encontrado = true;
						contadornegativo++;
					}

					i++;
				}

				System.out.println("el titular tiene: " + contadornegativo);

				break;

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//			

			case 12:

				// mostar la suma y la media de la cuenta del titular
				teclado.nextLine();

				// igual que el case 7 y 8 solo que muestra la media y la suma total de un titular en concreto 
				System.out.println("dime el nombre del titular ");
				titular = teclado.nextLine();

				encontrado = false;
				media = 0.0;
				total = 0.0;

				for (int i = 0; i < cuenta.size();) {
					if (cuenta.get(i).getTitular().equals(titular)) {
						encontrado = true;
						total = total + cuenta.get(i).getSaldo();

					}

					i++;

				}

				media = total / cuenta.size();

				if (encontrado) {
					System.out.println(+total + " " + media);
				}

				else {
					System.out.println("no tiene cuenta ");
				}

				break;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//		

			case 13:
				// listar

				teclado.nextLine();

				//for que recorre el array y lo muestra
				for (int i = 0; i < cuenta.size(); i++) {
					System.out.println(cuenta.get(i));
				}

				break;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//		

			case 15:

				// transoformas las varias cuenta del titular en una sola sumando su saldo
				teclado.nextLine();

				System.out.println("dime el nombre del titular ");
				titular = teclado.nextLine();
		
				encontrado = false;

				String num = "";
				total = 0.0;

				// un for que recorre el array
				for (int i = 0; i < cuenta.size();) {
					//condicion para recorrer teniendo en cuenta el titular
					if (cuenta.get(i).getTitular().equals(titular)) {
						encontrado = true;
						//suma el saldo de todas las cuenta del titular y lo guarda
						total = total + cuenta.get(i).getSaldo();


						// condicion que comprueba si el numero no esta vacio lo obtenga y lo guarde
						if (num.isEmpty()) {
							num = cuenta.get(i).getNumero();
						}

						//borra las cuenta del titular
						cuenta.remove(i);

					}

					else {
						i++;
					}

				}

				// esto es para crear la nueva cuenta del titular con la suma de todos los saldo
				if (encontrado) {
					CuentaCorriente Clienteañadir = new CuentaCorriente(num, titular, total);
					cuenta.add(Clienteañadir);
					System.out.println("se ha creado una cuenta con el numero " + num);

				} else {

					System.out.println(" el titular no tiene cuenta");
				}

				break;
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//		

			// fin

			}
		} while (!(opcion == 14));

	}
}
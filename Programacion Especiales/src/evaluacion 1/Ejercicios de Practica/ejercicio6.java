package ejercicioespecial;

import java.util.Scanner;

public class ejercicio6 {

	public ejercicio6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1, nota2, nota3, nota;
		Scanner teclado;
		teclado = new Scanner(System.in);

		System.out.println("introduce nota 1 ");
		nota1 = teclado.nextDouble();

		while (nota1 < 0 || nota1 > 10) {

			System.out.println("nota negativa introducela otra vez");

			nota1 = teclado.nextDouble();

		}

		System.out.println("introduce nota 2 ");
		nota2 = teclado.nextDouble();

		while (nota2 < 0 || nota2 > 10) {

			System.out.println("nota negativa introducela otra vez");

			nota2 = teclado.nextDouble();

		}

		System.out.println("introduce nota 3 ");
		nota3 = teclado.nextDouble();

		while (nota3 < 0 || nota3 > 10) {

			System.out.println("nota negativa introducela otra vez");

			nota3 = teclado.nextDouble();

		}

		int suspenso = 0;

		if (nota1 < 5) {

			suspenso = suspenso + 1;
		}

		if (nota2 < 5) {

			suspenso = suspenso + 1;
		}

		if (nota3 < 5) {

			suspenso = suspenso + 1;
		}

		nota = ((nota1 + nota2 + nota3) / 3);

		System.out.println("materias suspendidas " + suspenso);

		System.out.println("la nota media es " + nota);

	}

}

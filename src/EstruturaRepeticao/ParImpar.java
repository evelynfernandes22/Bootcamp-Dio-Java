package EstruturaRepeticao;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça N números inteiros, calcule e mostre a quantidade
		 * de números pares e a quantidade de números impares.
		 */

		Scanner scan = new Scanner(System.in);

		int qtdNumeros;
		int numero;
		int qtdPares = 0, qtdImpares = 0;

		System.out.println("Quantidade de números: ");
		qtdNumeros = scan.nextInt();

		int count = 0;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();

			if (numero % 2 == 0)
				qtdPares++;
			else {
				qtdImpares++;
			}
			count++;

		} while (count < qtdNumeros);

		System.out.println("Quantidade Par: " + qtdPares);
		System.out.println("Quantidade Ímpar: " + qtdImpares);
	}

}

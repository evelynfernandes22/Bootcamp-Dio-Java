package EstruturaRepeticao;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		/*
		 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo
		 * usuário. Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
		 */

		Scanner scan = new Scanner(System.in);

		int fatorial;
		System.out.println("Entre com um número Fatorial: ");
		fatorial = scan.nextInt();

		int multiplicacao = 1;

		System.out.println("Calculando o fatorial: ");
		// inicializar, no caso com o numero indicado como fatorial; enquanto...; o que
		// fazer com o contador?...
		for (int i = fatorial; i >= 1; i--) {
			multiplicacao *= i;
		}
		System.out.println(fatorial + "! = " + multiplicacao);

	}

}

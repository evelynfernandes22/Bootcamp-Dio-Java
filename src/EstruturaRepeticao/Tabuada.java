package EstruturaRepeticao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		/*
		 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
		 * inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a
		 * tabuada. A saída deve ser conforme o exemplo abaixo: Tabuada de 5: 5 X 1 = 5
		 * 5 X 2 = 10 ... 5 X 10 = 50
		 */

		Scanner scan = new Scanner(System.in);

		int tabuada;
		int total;

		System.out.println("Entre com o número que deseja ver a tabuada: ");
		tabuada = scan.nextInt();

		System.out.println("Tabuada de: " + tabuada);
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
		}

	}
}


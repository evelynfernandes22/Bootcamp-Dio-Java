package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercList {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
		 * e armazene-as em uma lista. Após isto, calcule a média semestral das
		 * temperaturas e mostre todas as temperaturas acima desta média, e em que mês
		 * elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		List<Double> temperaturas = new ArrayList<Double>();

		for (double i = 0; i < temperaturas.size(); i++) {
			System.out.println("Entre com a temperatura: ");
			double temp = scan.nextDouble(); // colocando numa variável para facilitar
			temperaturas.add(temp); // adicionando no array o que a variável recebeu.
		}
				
		System.out.print("Temperaturas: " + temperaturas);
		System.out.println();

		Iterator<Double> iterator = temperaturas.iterator();
		double soma = 0d;
		while (iterator.hasNext()) {
			double proximo = iterator.next();
			soma += proximo;
		}
		System.out.println("Soma: " + soma);
		//Calculando a média:
		double media = soma/temperaturas.size();
		System.out.println("A média das temperaturas dos semestre é: " + media);
		
	
	}

}

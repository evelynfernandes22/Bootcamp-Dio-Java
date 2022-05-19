package Collections.List;

import java.util.Scanner;

public class DesafioDegustacaoVinho {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String T = scan.nextLine();
		String respostasCompetidores = scan.nextLine();

		String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");
		// TODO: Complete o código com uma possível solução para o problema.
		int count = 0;
		for (int i = 0; i < respostasCompetidoresSplit.length; i++) {
			if (T.equals(respostasCompetidoresSplit[i]))
				count++;
		}
		
		//tbm pode ser utilizando o forEach: 
		/*
		 * int count = 0;
		for(String resposta : respostasCompetidoresSplit ) {
			if(resposta.equalsIgnoreCase(T)) {
				count++;
			}
		}*/

		System.out.println(count);

	}

}

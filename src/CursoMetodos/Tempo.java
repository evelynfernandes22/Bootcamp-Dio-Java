package CursoMetodos;

public class Tempo {

	public String exibirHorario(int hora) {

		if (hora > 0 && hora <= 12) {
			System.out.println("Hora informada: " + hora + " hrs.");
			mensagemBomDia();
		} else if (hora > 12 && hora <= 18) {
			System.out.println("Hora informada: " + hora + " hrs.");
			mensagemBoaTarde();
		} else if (hora > 18 && hora <= 23) {
			System.out.println("Hora informada: " + hora + " hrs.");
			mensagemBoaNoite();
		} else {
			System.out.println("Horário inválido, tente novamente.");
		}
		return null;
		
	}
		//métodos de mensagens
	
		public static void mensagemBomDia() {
			System.out.println("Bom dia!");
		}

		public static void mensagemBoaTarde() {
			System.out.println("Boa tarde!");
		}

		public static void mensagemBoaNoite() {
			System.out.println("Boa noite!");
		}
	
}

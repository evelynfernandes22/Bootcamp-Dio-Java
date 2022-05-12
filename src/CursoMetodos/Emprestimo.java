package CursoMetodos;

public class Emprestimo {

	double valor;
	double juros;
	int qtdparcelas;
	double total ;
	
	public double faixaJuros(double valor) {
		if (valor < 1000) {
			juros = 0.02;
			System.out.println("Juros aplicado de 2% no valor solicitado de " + valor);
		} else if (valor > 1000 && valor < 2000) {
			juros = 0.03;
			System.out.println("Juros aplicado de 3% no valor solicitado de " + valor);
		} else if (valor >= 2000 && valor < 5000) {
			juros = 0.04;
			System.out.println("Juros aplicado de 4% no valor solicitado de " + valor);
		} else if (valor >= 5000) {
			juros = 0.06;
			System.out.println("Juros aplicado de 6% no valor solicitado de " + valor);
		}
		return juros;

	}
	
	
	public double calculo(double valor, int qtdParcelas) {
		total = (valor * juros) + valor;
		total /= qtdParcelas ;
		System.out.println("O valor de " + valor + " parcelado em " + qtdParcelas + " x  =  " + total);
		return total;
	}	
}

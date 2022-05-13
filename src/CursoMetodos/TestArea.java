package CursoMetodos;

public class TestArea {

	public static void main(String[] args) {

		// Exercicio Quadrilátero
		System.out.println("Exercício quadrilátero");
		Quadrilatero.area(3);
		Quadrilatero.area(5d, 5d);
		Quadrilatero.area(7, 8, 9);
		Quadrilatero.area(5f, 5f);

		System.out.println();
		
		// Exercicio quadrilatero2
		
		System.out.println("Exercício retornos");

		double areaQuadrado = Quadrilatero2.area(3);  //armazena dentro de uma variável.
		System.out.println("Área do quadrado: " + areaQuadrado);

		double areaRetangulo = Quadrilatero2.area(5, 5);
		System.out.println("Área do retângulo: " + areaRetangulo);

		double areaTrapezio = Quadrilatero2.area(7, 8, 9);
		System.out.println("Área do trapézio: " + areaTrapezio);
	}

}

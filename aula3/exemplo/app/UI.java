package app;

import javax.swing.JOptionPane;

import figurasGeometricas.Quadrado;
import figurasGeometricas.Retangulo;
import figurasGeometricas.Circulo;

public class UI {
	
	static Quadrado[] quadrados = new Quadrado[0];  //referencia representa a associacao MULTIPLA entre UI e Quadrado
	static Retangulo[] retangulos = new Retangulo[0];  //referencia representa a associacao MULTIPLA entre UI e Retangulo
	static Circulo[] circulos = new Circulo[0];  //referencia representa a associacao MULTIPLA entre UI e Circulo

	public static void main(String[] args) {
		int opcao;
		do { 
			//1a coisa: definir qual figura vai ser criada
			String strOpcao = JOptionPane.showInputDialog("Escolha uma opção de figura geométrica: \n"
					+ "1 - Quadrado\n"
					+ "2 - Retangulo\n"
					+ "3 - Circulo\n"
					+ "0 - Sair do programa");
			opcao = Integer.parseInt(strOpcao);

			switch (opcao) {
			case 1:
				//criar quadrado
				String strLadoQuadrado = JOptionPane.showInputDialog("Informe o lado do quadrado:");
				float ladoQuadrado = Float.parseFloat(strLadoQuadrado);
				Quadrado q = new Quadrado(ladoQuadrado);

				Quadrado[] tempQuadrado = new Quadrado[quadrados.length + 1];
				for (int i=0; i<quadrados.length; i++) {
					tempQuadrado[i] = quadrados[i];
				}
				tempQuadrado[quadrados.length] = q;
				quadrados = tempQuadrado;

				break;

			case 2:
				//criar retangulo
				String strLadoMaiorRetangulo = JOptionPane.showInputDialog("Informe o lado maior do retangulo:");
				String strLadoMenorRetangulo = JOptionPane.showInputDialog("Informe o lado menor do retangulo:");
				float ladoMaiorRetangulo = Float.parseFloat(strLadoMenorRetangulo);
				float ladoMenorRetangulo = Float.parseFloat(strLadoMaiorRetangulo);
				Retangulo r = new Retangulo(ladoMaiorRetangulo, ladoMenorRetangulo);

				Retangulo[] tempRetangulo = new Retangulo[retangulos.length + 1];
				for (int i=0; i<retangulos.length; i++) {
					tempRetangulo[i] = retangulos[i];
				}
				tempRetangulo[retangulos.length] = r;
				retangulos = tempRetangulo;
				break;

			case 3: 
				//criar circulo
				String strRaioCirculo = JOptionPane.showInputDialog("Informe o raio do circulo:");
				float raioCirculo = Float.parseFloat(strRaioCirculo);
				Circulo c = new Circulo(raioCirculo);

				Circulo[] tempCirculo = new Circulo[circulos.length + 1];
				for (int i=0; i<circulos.length; i++) {
					tempCirculo[i] = circulos[i];
				}
				tempCirculo[circulos.length] = c;
				circulos = tempCirculo;				
				break;

			case 0: 
				//sair do programa
				break;

			default:
				//Opcao invalida
				break;
			}
		} while (opcao != 0);

		//Imprimir todas as areas e perimetros das figuras geometricas criadas
		//Comecando pelos quadrados

		for (int i=0; i<quadrados.length; i++) {
			String resposta = "Quadrado " + i + "(" + quadrados[i] + ")" + ":\n"
					+ "Lado: " + quadrados[i].getLado() + "\n"
					+ "Area: " + quadrados[i].calcularArea() + "\n"
					+ "Perimetro: " + quadrados[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}


			//Fazer com as demais figuras geometricas

	}

}
















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
		//Aqui é onde tudo começa! 
		
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

				//inserir q dentro do vetor quadrados.
				//Esforco bracal! 
				Quadrado[] tempQuadrados = new Quadrado[quadrados.length + 1];
				for (int i=0; i<quadrados.length; i++) {
					tempQuadrados[i] = quadrados[i];  //copiando todas referencias de quadrados em tempQuadrados
				}
				//inserir q em tempQuadrados
				tempQuadrados[quadrados.length] = q;
				//atualizar referencia de quadrados
				quadrados = tempQuadrados;

				break;

			case 2: 
				//criar retangulo
				String strAlturaRetangulo = JOptionPane.showInputDialog("Informe a altura do retangulo:");
				String strComprimentoRetangulo = JOptionPane.showInputDialog("Informe o comprimento do retangulo:");
				float alturaRetangulo = Float.parseFloat(strAlturaRetangulo);
				float comprimentoRetangulo = Float.parseFloat(strComprimentoRetangulo);
				Retangulo r = new Retangulo(alturaRetangulo, comprimentoRetangulo);

				// inserir r dentro do vetor retangulos.
				// Esforco bracal!
				Retangulo[] tempRetangulos = new Retangulo[retangulos.length + 1];
				for (int i = 0; i < retangulos.length; i++) {
					tempRetangulos[i] = retangulos[i]; // copiando todas referencias de retangulos em tempRetangulos
				}
				// inserir r em tempRetangulos
				tempRetangulos[retangulos.length] = r;
				// atualizar referencia de retangulos
				retangulos = tempRetangulos;

				break;

			case 3: 
				//criar circulo
				String strRaioCirculo = JOptionPane.showInputDialog("Informe o lado do circulo:");
				float raioCirculo = Float.parseFloat(strRaioCirculo);
				Circulo c = new Circulo(raioCirculo);

				// inserir c dentro do vetor circulos.
				// Esforco bracal!
				Circulo[] tempCirculos = new Circulo[circulos.length + 1];
				for (int i = 0; i < circulos.length; i++) {
					tempCirculos[i] = circulos[i]; // copiando todas referencias de circulos em tempCirculos
				}
				// inserir c em tempCirculos
				tempCirculos[circulos.length] = c;
				// atualizar referencia de circulos
				circulos = tempCirculos;

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
		//Imprimir quadrados
		for (int i=0; i<quadrados.length; i++) {
			String resposta = "Quadrado " + i + "(" + quadrados[i] + ")" + ":\n"
					+ "Lado: " + quadrados[i].getLado() + "\n"
					+ "Area: " + quadrados[i].calcularArea() + "\n"
					+ "Perimetro: " + quadrados[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}

		//Imprimir retangulos
		for (int i=0; i<retangulos.length; i++) {
			String resposta = "Retangulo " + i + "(" + retangulos[i] + ")" + ":\n"
					+ "Altura: " + retangulos[i].getAltura() + "\n"
					+ "Comprimento: " + retangulos[i].getComprimento() + "\n"
					+ "Area: " + retangulos[i].calcularArea() + "\n"
					+ "Perimetro: " + retangulos[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}

		//Imprimir circulos
		for (int i=0; i<circulos.length; i++) {
			String resposta = "Circulo " + i + "(" + circulos[i] + ")" + ":\n"
					+ "Lado: " + circulos[i].getRaio() + "\n"
					+ "Area: " + circulos[i].calcularArea() + "\n"
					+ "Perimetro: " + circulos[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}

	}

}
















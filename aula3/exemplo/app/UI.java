package app;

import javax.swing.JOptionPane;

import figurasGeometricas.*;

public class UI {
	
	static Quadrado[] quadrados = new Quadrado[0];  //referencia representa a associacao MULTIPLA entre UI e Quadrado
	static Circulo[] circulos = new Circulo[0];
	static Retangulo[] retangulos = new Retangulo[0];

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
				Quadrado[] tempQ = new Quadrado[quadrados.length + 1];
				for (int i=0; i<quadrados.length; i++) {
					tempQ[i] = quadrados[i];  //copiando todas referencias de quadrados em tempQ
				}
				//inserir q em tempQ
				tempQ[quadrados.length] = q;
				//atualizar referencia de quadrados
				quadrados = tempQ;

				break;

			case 2: 
				//criar retangulo
				String strLadoA = JOptionPane.showInputDialog("Informe o primeiro lado do retangulo:");
				String strLadoB = JOptionPane.showInputDialog("Informe o segundo lado do retangulo:");
				float ladoA = Float.parseFloat(strLadoA);
				float ladoB = Float.parseFloat(strLadoB);
				Retangulo r = new Retangulo(ladoA, ladoB);

				//inserir r dentro do vetor retangulos.
				Retangulo[] tempR = new Retangulo[retangulos.length + 1];
				for (int i=0; i<retangulos.length; i++) {
					tempR[i] = retangulos[i];
				}
				//inserir q em tempR
				tempR[retangulos.length] = r;
				//atualizar referencia de retangulos
				retangulos = tempR;

				break;

			case 3: 
				//criar circulo
				String strRaio = JOptionPane.showInputDialog("Informe o raio do circulo:");
				float raioCirculo = Float.parseFloat(strRaio);
				Circulo c = new Circulo(raioCirculo);

				//inserir c dentro do vetor circulos.
				Circulo[] tempC = new Circulo[circulos.length + 1];
				for (int i=0; i<circulos.length; i++) {
					tempC[i] = circulos[i];
				}
				//inserir q em tempC
				tempC[circulos.length] = c;
				//atualizar referencia de circulos
				circulos = tempC;

				break;

			case 0: 
				//sair do programa
				break;

			default:
				//Opcao invalida
				break;
			}
		} while (opcao != 0);

		// Imprimir todas as areas e perimetros das figuras geometricas criadas
		// quadrados
		for (int i=0; i<quadrados.length; i++) {
			String resposta = "Quadrado " + i + " (" + quadrados[i] + ")" + ":\n"
					+ "Lado: " + quadrados[i].getLado() + "\n"
					+ "Area: " + quadrados[i].calcularArea() + "\n"
					+ "Perimetro: " + quadrados[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}
		// retangulos
		for (int i=0; i<retangulos.length; i++) {
			String resposta = "Retangulo " + i + " (" + retangulos[i] + ")" + ":\n"
					+ "Primeiro lado: " + retangulos[i].getLadoA() + "\n"
					+ "Segundo lado: " + retangulos[i].getLadoB() + "\n"
					+ "Area: " + retangulos[i].calcularArea() + "\n"
					+ "Perimetro: " + retangulos[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}
		// circulos
		for (int i=0; i<circulos.length; i++) {
			String resposta = "Circulo " + i + " (" + circulos[i] + ")" + ":\n"
					+ "Raio: " + circulos[i].getRaio() + "\n"
					+ "Area: " + circulos[i].calcularArea() + "\n"
					+ "Perimetro: " + circulos[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}
	}
}

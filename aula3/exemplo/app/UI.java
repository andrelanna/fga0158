package app;

import javax.swing.JOptionPane;

import figurasGeometricas.Quadrado;
import figurasGeometricas.Retangulo;
import figurasGeometricas.Circulo;


public class UI {
	
	static Quadrado[] quadrados = new Quadrado[0];  //referencia representa a associacao MULTIPLA entre UI e Quadrado

	static Retangulo[] retangulos = new Retangulo[0];

	static Circulo[] circulos = new Circulo[0];

	
	
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
				Quadrado[] temp1 = new Quadrado[quadrados.length + 1];
				for (int i=0; i<quadrados.length; i++) {
					temp1[i] = quadrados[i];  //copiando todas referencias de quadrados em temp1
				}
				//inserir q em temp1
				temp1[quadrados.length] = q;
				//atualizar referencia de quadrados
				quadrados = temp1;

				break;

			case 2: 
				//criar retangulo
				String strLadoRetangulo = JOptionPane.showInputDialog("Informe o lado do retangulo:");
				float ladoRetangulo = Float.parseFloat(strLadoRetangulo);
				String strBaseRetangulo = JOptionPane.showInputDialog("Informe a base do retangulo:");
				float baseRetangulo = Float.parseFloat(strBaseRetangulo);
				Retangulo q = new Retangulo(ladoRetangulo, baseRetangulo);

				Retangulo[] temp2 = new Retangulo[retangulos.length + 1];
				for (int i=0; i<retangulos.length; i++) {
					temp2[i] = retangulos[i];
				}
			
				temp2[retangulos.length] = q;
				
				retangulos = temp2;
				break;

			case 3: 
				//criar circulo
			
				String strRaioCirculo = JOptionPane.showInputDialog("Informe o raio do circulo:");
				float raioCirculo = Float.parseFloat(strRaioCirculo);
				
				Circulo q = new Circulo(raioCirculo);

				Circulo[] temp3 = new Circulo[circulos.length + 1];
				for (int i=0; i<circulos.length; i++) {
					temp3[i] = circulos[i];
				}
			
				temp3[circulos.length] = q;
				
				circulos = temp3;
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


		for (int i=0; i<retangulos.length; i++) {
			String resposta = "Retangulo " + i + "(" + retangulos[i] + ")" + ":\n"
					+ "Lado: " + retangulos[i].getLado() + "\n"
					+ "Base: " + retangulos[i].getBase() + "\n"
					+ "Area: " + retangulos[i].calcularArea() + "\n"
					+ "Perimetro: " + retangulos[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}


		for (int i=0; i<circulos.length; i++) {
			String resposta = "Circulo " + i + "(" + circulos[i] + ")" + ":\n"
					+ "Raio: " + circulos[i].getRaio() + "\n"
					+ "Area: " + circulos[i].calcularArea() + "\n"
					+ "Perimetro: " + circulos[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}

	}

}
















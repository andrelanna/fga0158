package app;

import javax.swing.JOptionPane;


import figurasGeometricas.Quadrado;
import figurasGeometricas.Circulo;
import figurasGeometricas.Retangulo;

public class UI {
	
	static Quadrado[] quadrados = new Quadrado[0];  //referencia representa a associacao MULTIPLA entre UI e Quadrado
	static Circulo[] circulos = new Circulo[0];
	static Retangulo[] retangulos = new Retangulo[0];
	
	
	public static void main(String[] args) {
		//Aqui √© onde tudo come√ßa! 
		
		int opcao;
		do { 
			//1a coisa: definir qual figura vai ser criada
			String strOpcao = JOptionPane.showInputDialog("Escolha uma op√ß√£o de figura geom√©trica: \n"
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
				Quadrado[] temp = new Quadrado[quadrados.length + 1];
				for (int i=0; i<quadrados.length; i++) {
					temp[i] = quadrados[i];  //copiando todas referencias de quadrados em temp
				}
				//inserir q em temp
				temp[quadrados.length] = q;
				//atualizar referencia de quadrados
				quadrados = temp;

				break;

			case 2: 
				//criar retangulo
				String strBaseRetangulo = JOptionPane.showInputDialog("Informe a base do Ret‚ngulo:");
				float baseRetangulo = Float.parseFloat(strBaseRetangulo);
				String strAlturaRetangulo = JOptionPane.showInputDialog("Informe a altura do Ret‚ngulo:");
				float alturaRetangulo = Float.parseFloat(strAlturaRetangulo);
				Retangulo r = new Retangulo(baseRetangulo,alturaRetangulo);
				

				//inserir q dentro do vetor quadrados.
				//Esforco bracal! 
				Retangulo[] temppp = new Retangulo[retangulos.length + 1];
				for (int i=0; i<retangulos.length; i++) {
					temppp[i] = retangulos[i];  //copiando todas referencias de quadrados em temp
				}
				//inserir q em temp
				temppp[retangulos.length] = r;
				//atualizar referencia de quadrados
				retangulos = temppp;
				
				break;

			case 3: 
				//criar circulo
				String strRaioCirculo = JOptionPane.showInputDialog("Informe o raio do cÌrculo:");
				float raioCirculo = Float.parseFloat(strRaioCirculo);
				Circulo c = new Circulo(raioCirculo);

				//inserir c dentro do vetor circulos. 
				Circulo[] tempp = new Circulo[circulos.length + 1];
				for (int i=0; i<circulos.length; i++) {
					tempp[i] = circulos[i];  //copiando todas referencias de quadrados em temp
				}
				//inserir c em tempp
				tempp[circulos.length] = c;
				//atualizar referencia de quadrados
				circulos = tempp;
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

		for (int i=0; i<circulos.length; i++) {
			String respostaCirculo = "circulo " + i + "(" + circulos[i] + ")" + ":\n"
					+ "Area: " + circulos[i].calcularAreaCirculo() + "\n"
					+ "Perimetro: " + circulos[i].calcularPerimetroCirculo();

			JOptionPane.showMessageDialog(null, respostaCirculo);
		}

		for (int i=0; i<retangulos.length; i++) {
			String respostaRetangulo = "retangulo " + i + "(" + retangulos[i] + ")" + ":\n"
					+ "Area: " + retangulos[i].calcularAreaRetangulo() + "\n"
					+ "Perimetro: " + retangulos[i].calcularPerimetroRetangulo();

			JOptionPane.showMessageDialog(null, respostaRetangulo);
		}

			//Fazer com as demais figuras geometricas

	}

}
















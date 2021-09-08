package app;

import javax.swing.JOptionPane;

import figurasGeometricas.Circulo;
import figurasGeometricas.Quadrado;
import figurasGeometricas.Retangulo;

public class UI {
	
	static Quadrado[] quadrados = new Quadrado[0];  //referencia representa a associacao MULTIPLA entre UI e Quadrado
	static Circulo [] circulos = new Circulo[0];
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
				String strBase = JOptionPane.showInputDialog("Informe a base do retangulo:");
				String strAltura = JOptionPane.showInputDialog("Informe a altura do retangulo:");

				float Base = Float.parseFloat(strBase);
				float Altura = Float.parseFloat(strAltura);
				Retangulo r = new Retangulo(Base,Altura);

				//Esforco bracal! 
				Retangulo[] temp2 = new Retangulo[retangulos.length + 1];
				for (int i=0; i<retangulos.length; i++) {
					temp2[i] = retangulos[i]; 
				}
				temp2[retangulos.length] = r;
				//atualizar referencia de quadrados
				retangulos = temp2;

				break;
			case 3: 
				//criar circulo
				
				
				//criar quadrado
				String strRaio= JOptionPane.showInputDialog("Informe o raio:");
				float raio = Float.parseFloat(strRaio);
				Circulo c = new Circulo(raio);

				//inserir q dentro do vetor quadrados.
				//Esforco bracal! 
				Circulo[] temp1 = new Circulo[circulos.length + 1];
				for (int i=0; i<circulos.length; i++) {
					temp1[i] = circulos[i];  //copiando todas referencias de quadrados em temp
				}
				//inserir q em temp
				temp1[circulos.length] = c;
				//atualizar referencia de quadrados
				circulos = temp1;

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
			String resposta = "circulos " + i + "(" + circulos[i] + ")" + ":\n"
					+ "Raio: " + circulos[i].getRaio() + "\n"
					+ "Area: " + circulos[i].calcularArea() + "\n"
					+ "Perimetro: " + circulos[i].calcularPerimetro();

			
			JOptionPane.showMessageDialog(null, resposta);
		}			//Fazer com as demais figuras geometricas

		
		for (int i=0; i<retangulos.length; i++) {
			String resposta = "retangulos " + i + "(" + retangulos[i] + ")" + ":\n"
					+ "Base: " + retangulos[i].getBase() + "\n"
					+ "Altura: " + retangulos[i].getAltura() + "\n"
					+ "Area: " + retangulos[i].calcularArea() + "\n"
					+ "Perimetro: " + retangulos[i].calcularPerimetro();

			
			JOptionPane.showMessageDialog(null, resposta);
		}			//Fazer com as demais figuras geometricas

	}

}
















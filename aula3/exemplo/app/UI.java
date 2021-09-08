package app;

import javax.swing.JOptionPane;

import figurasGeometricas.Quadrado;

import figurasGeometricas.Circulo;

import figurasGeometricas.Retangulo;

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
				Quadrado[] temp_q = new Quadrado[quadrados.length + 1];
				for (int i=0; i<quadrados.length; i++) {
					temp_q[i] = quadrados[i];  //copiando todas referencias de quadrados em temp
				}
				//inserir q em temp
				temp_q[quadrados.length] = q;
				//atualizar referencia de quadrados
				quadrados = temp_q;

				break;

			case 2: 
				//criar retangulo
				String strLado1Retangulo = JOptionPane.showInputDialog("Informe um dos lados do retangulo:");
				float lado_1 = Float.parseFloat(strLado1Retangulo);
				String strLado2Retangulo = JOptionPane.showInputDialog("Informe o outro lado do retangulo:");
				float lado_2 = Float.parseFloat(strLado2Retangulo);
				Retangulo r = new Retangulo(lado_1, lado_2);

				Retangulo[] temp_r = new Retangulo[retangulos.length + 1];
				for (int i=0; i<retangulos.length; i++) {
					temp_r[i] = retangulos[i];
				}

				temp_r[retangulos.length] = r;

				retangulos = temp_r;

				break;

			case 3: 
				//criar circulo
				String strCirunf = JOptionPane.showInputDialog("Informe o raio da circunferência:");
				float circunf = Float.parseFloat(strCirunf);
				Circulo c = new Circulo(circunf);

				Circulo[] temp_c = new Circulo[circulos.length + 1];
				for (int i=0; i<circulos.length; i++) {
					temp_c[i] = circulos[i];  //copiando todas referencias de quadrados em temp
				}

				temp_c[circulos.length] = c;

				circulos = temp_c;

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
					+ "Base: " + retangulos[i].getBase() + "\n"
					+ "Altura: " + retangulos[i].getAltura() + "\n"
					+ "Area: " + retangulos[i].calcularArea() + "\n"
					+ "Perimetro: " + retangulos[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}

		for (int i=0; i<circulos.length; i++) {
			String resposta = "Circulo " + i + "(" + circulos[i] + ")" + ":\n"
					+ "Raio: " + circulos[i].getLado() + "\n"
					+ "Area: " + circulos[i].calcularArea() + "\n"
					+ "Perimetro/Circunferencia: " + circulos[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}


			//Fazer com as demais figuras geometricas

	}

}
















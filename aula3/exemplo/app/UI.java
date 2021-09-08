package app;

import javax.swing.JOptionPane;

import figurasGeometricas.Circulo;
import figurasGeometricas.Quadrado;
import figurasGeometricas.Retangulo;

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
				String strLargRetangulo =  JOptionPane.showInputDialog("Informe a largura do retângulo: ");
				String strCompRetangulo = JOptionPane.showInputDialog("Informe o comprimento do retângulo: ");
				float largRet = Float.parseFloat(strLargRetangulo);
				float compRet = Float.parseFloat(strCompRetangulo);
				Retangulo ret =  new Retangulo(largRet, compRet);

				Retangulo[] tempr = new Retangulo[retangulos.length + 1];
				for (int i=0; i<retangulos.length; i++){
					tempr[i] = retangulos[i];
				}
				tempr[retangulos.length] = ret;
				retangulos = tempr;

				break;

			case 3: 
				String strRaio = JOptionPane.showInputDialog("Informe o raio do círculo: ");
				float raio = Float.parseFloat(strRaio);
				Circulo c = new Circulo(raio);

				Circulo[] temp2 = new Circulo[circulos.length + 1];
				for(int i=0; i<circulos.length; i++){
					temp2[i] = circulos[i];
				}

				temp2[circulos.length] = c;
				circulos = temp2;

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

		//Quadrados
		for (int i=0; i<quadrados.length; i++) {
			String resposta = "Quadrado " + i + "(" + quadrados[i] + ")" + ":\n"
					+ "Lado: " + quadrados[i].getLado() + "\n"
					+ "Area: " + quadrados[i].calcularArea() + "\n"
					+ "Perimetro: " + quadrados[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}

		//Circulos
		for(int i=0; i<circulos.length; i++){
			String resposta = "Círculo " + i + "(" + circulos[i] + ")" + ":\n"
					+ "Raio: " + circulos[i].getRaio() + "\n"
					+ "Area: " + circulos[i].calcularArea() + "\n"
					+ "Perimetro: " + circulos[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, String.format(resposta, "%.2f"));
		}


		//Retângulos
		for(int i=0; i<retangulos.length; i++){
			String resposta = "Retângulo " + i + "(" + retangulos[i] + ")" + ":\n"
					+ "Largura: " + retangulos[i].getLarg() + "\n"
					+ "Comprimento: " + retangulos[i].getComp() + "\n"
					+ "Área: " + retangulos[i].calcularArea() + "\n"
					+ "Perímetro: " + retangulos[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}


			//Fazer com as demais figuras geometricas

	}

}
/*João Pedro Alves Machado - 190015276 / Sidney Fernando Ferreira Lemes - 190037997*/

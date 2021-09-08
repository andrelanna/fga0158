package app;

import javax.swing.JOptionPane;

import figurasGeometricas.Quadrado;
import figurasGeometricas.Retângulo;
import figurasGeometricas.Circulo;

public class UI {
	
	static Quadrado[] quadrados = new Quadrado[0];  //referencia representa a associacao MULTIPLA entre UI e Quadrado
	static Retângulo[] retangulos = new Retângulo[0];
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
				String stralturaRetangulo = JOptionPane.showInputDialog("Informe a base do retângulo:");
				String strbaseRetangulo = JOptionPane.showInputDialog("Informe a altura do retângulo");

				float alturaRetangulo = Float.parseFloat(stralturaRetangulo);
				float baseRetangulo = Float.parseFloat(strbaseRetangulo);

				Retângulo r = new Retângulo(baseRetangulo, alturaRetangulo);

				Retângulo[] tempr = new Retângulo[retangulos.length + 1];
				for (int i = 0; i<retangulos.length; i++ ){
					tempr [i] = retangulos [i];
				}

				tempr[retangulos.length] = r;

				retangulos = tempr;

				break;

			case 3: 
				String strRaio = JOptionPane.showInputDialog("Informe o raio do círculo:");
				float Raio = Float.parseFloat(strRaio);
				Circulo c = new Circulo(Raio);

				Circulo[] tempc = new Circulo[circulos.length + 1];
				for (int i=0; i<circulos.length; i++) {
					tempc[i] = circulos[i];  //copiando todas referencias de quadrados em temp
				}

				tempc[circulos.length] = c;
				circulos = tempc;
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
		do { 
			//1a coisa: definir qual figura vai ser criada
			String strOpcao = JOptionPane.showInputDialog("Escolha forma que deseja avaliar: \n"
					+ "1 - Quadrado\n"
					+ "2 - Retangulo\n"
					+ "3 - Circulo\n"
					+ "0 - Sair do programa");
			opcao = Integer.parseInt(strOpcao);
			switch (opcao){
			case 1:
				for (int i=0; i<quadrados.length; i++) {
					String resposta = "Quadrado " + i + ":\n"
					+ "Lado: " + quadrados[i].getLado() + "\n"
					+ "Area: " + quadrados[i].calcularArea() + "\n"
					+ "Perimetro: " + quadrados[i].calcularPerimetro();

					JOptionPane.showMessageDialog(null, resposta);
					}
				break;
			case 2:
				for (int i=0; i<retangulos.length; i++){
					String resposta = "Retângulo " + i + ":\n" 
					+ "Base: " + retangulos[i].getBase() + "\n"
					+ "Altura: " + retangulos[i].getAltura() + "\n"
					+ "Perímetro: " + retangulos[i].calcularPerimetro() + "\n"
					+ "Area: " + retangulos[i].calcularArea() + "\n";
					
					JOptionPane.showMessageDialog(null, resposta);
				}		
				break;
			case 3:
			for (int i=0; i<circulos.length; i++) {
				String resposta = "Círculo " + i + ":\n"
				+ "Raio: " + circulos[i].getRaio() + "\n"
				+ "Área: " + circulos[i].calcularArea() + "\n"
				+ "Perímetro: " + circulos[i].calcularPerimetro();

				JOptionPane.showMessageDialog(null, resposta);
				}
				break;
			}
		}while (opcao != 0);
			//Fazer com as demais figuras geometricas

	}

}
















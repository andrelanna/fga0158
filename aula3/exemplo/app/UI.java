package app;

import javax.swing.JOptionPane;

import figurasGeometricas.Quadrado;
import figurasGeometricas.Circulo;
import figurasGeometricas.Retangulo;

public class UI {
	
	static Quadrado[] quadrados = new Quadrado[0];  //referencia representa a associacao MULTIPLA entre UI e Quadrado
	static Circulo[] circulos = new Circulo[0];		//referencia representa a associacao MULTIPLA entre UI e Circulo
	static Retangulo[] retangulos = new Retangulo[0];  //referencia representa a associacao MULTIPLA entre UI e Retangulo
	
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
				String strLarguraRetangulo = JOptionPane.showInputDialog("Informe a largura do retangulo:");
				float larguraRetangulo = Float.parseFloat(strLarguraRetangulo);

				String strAlturaRetangulo = JOptionPane.showInputDialog("Informe a altura do retangulo:");
				float alturaRetangulo = Float.parseFloat(strAlturaRetangulo);

				Retangulo r = new Retangulo(alturaRetangulo, larguraRetangulo);

				//inserir r dentro do vetor retangulos.
				//Esforco bracal! 
				Retangulo[] tempR = new Retangulo[retangulos.length + 1];

				for (int i=0; i<retangulos.length; i++) {
					tempR[i] = retangulos[i];  //copiando todas referencias de retangulos em tempR
				}
				//inserir r em tempR
				tempR[retangulos.length] = r;
				//atualizar referencia de retangulos
				retangulos = tempR;
				break;

			case 3: 
				//criar circulo
				String strRaioCirculo = JOptionPane.showInputDialog("Informe o raio do círculo:");
				float raioCirculo = Float.parseFloat(strRaioCirculo);
				Circulo c = new Circulo(raioCirculo);

				//inserir c dentro do vetor circulos.
				//Esforco bracal! 
				Circulo[] temp = new Circulo[circulos.length + 1];
				for (int i=0; i<circulos.length; i++) {
					temp[i] = circulos[i];  //copiando todas referencias de quadrados em temp
				}
				//inserir q em temp
				temp[circulos.length] = q;
				//atualizar referencia de quadrados
				circulos = temp;
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
















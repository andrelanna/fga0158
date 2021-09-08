package exemplo.app;

import javax.swing.JOptionPane;

import exemplo.figurasGeometricas.Circulo;
import exemplo.figurasGeometricas.Quadrado;
import exemplo.figurasGeometricas.Retangulo;

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
                String strLado1Retangulo = JOptionPane.showInputDialog("Informe a altura do retângulo:");
				float lado1Retangulo = Float.parseFloat(strLado1Retangulo);
                String strLado2Retangulo = JOptionPane.showInputDialog("Informe o comprimento lado do retângulo:");
				float lado2Retangulo = Float.parseFloat(strLado2Retangulo);
				Retangulo r = new Retangulo(lado1Retangulo, lado2Retangulo);
                Retangulo[] tempor = new Retangulo[retangulos.length + 1];
				for (int i=0; i<retangulos.length; i++) {
					tempor[i] = retangulos[i];  
				}
                tempor[retangulos.length] = r;
				retangulos = tempor;
				break;

			case 3: 
				//criar circulo
                String strRaioCiruclo = JOptionPane.showInputDialog("Informe o raio do círculo:");
				float raioCirculo = Float.parseFloat(strRaioCiruclo);
				Circulo c = new Circulo(raioCirculo);
                Circulo[] tempo = new Circulo[circulos.length + 1];
				for (int i=0; i<circulos.length; i++) {
					tempo[i] = circulos[i];  
				}
                tempo[circulos.length] = c;
				
				circulos = tempo;
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
			String resposta = "Retângulo " + i + "(" + retangulos[i] + ")" + ":\n"
					+ "Altura: " + retangulos[i].getLado1() + "\n"
                    + "Comrpimento: " + retangulos[i].getLado2() + "\n"
					+ "Área: " + retangulos[i].calcularArea() + "\n"
					+ "Perimetro: " + retangulos[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}

        for (int i=0; i<circulos.length; i++) {
			String resposta = "Circulo " + i + "(" + circulos[i] + ")" + ":\n"
					+ "raio: " + circulos[i].getRaio() + "\n"
					+ "Area: " + circulos[i].calcularArea() + "\n"
					+ "Perimetro: " + circulos[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}


			//Fazer com as demais figuras geometricas

	}

}
package app;

import javax.swing.JOptionPane;

import figurasGeometricas.Quadrado;
import figurasGeometricas.Circulo;
import figurasGeometricas.Retangulo;

public class UI {
	static Quadrado[] quadrados = new Quadrado[0];
	static Retangulo [] retangulos = new Retangulo[0];

	static Circulo [] circulos = new Circulo[0];
	
	
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
			String strBaseRetangulo = JOptionPane.showInputDialog("Informe a Base do Retangulo:");
			float BaseRetangulo = Float.parseFloat(strBaseRetangulo);
			String strAlturaRetangulo = JOptionPane.showInputDialog("Informe a Altura do Retangulo:");
			float AlturaRetangulo = Float.parseFloat(strAlturaRetangulo);
			
			Retangulo r = new Retangulo(BaseRetangulo, AlturaRetangulo);

			Retangulo[] temp1 = new Retangulo[retangulos.length + 1];
			for (int i=0; i<retangulos.length; i++) {
				temp1[i] = retangulos[i];  
			}
			temp1[retangulos.length] = r;
			retangulos= temp1;
			
			break; 

			case 3: 
			String strraiocirculo = JOptionPane.showInputDialog("Informe o  Raio do Circulo:");
			float raiocirculo = Float.parseFloat(strraiocirculo);
			Circulo c = new Circulo(raiocirculo);

			Circulo[] temp2 = new Circulo[circulos.length + 1];
			for (int i=0; i<circulos.length; i++) {
				temp2[i] = circulos[i];  
			}
			temp2[circulos.length] = c;
			circulos= temp2;
			
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
					+ "Raio: " + circulos[i].getRaio() + "\n"
					+ "Area: " + circulos[i].calcularArea() + "\n"
					+ "Perimetro: " + circulos[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}
	
	}

}














package app;

import figurasGeometricas.Circulo;
import figurasGeometricas.Quadrado;
import figurasGeometricas.Retangulo;

import javax.swing.*;
import java.util.Vector;

public class UI {
	
	static Quadrado[] quadrados = new Quadrado[0];  //referencia representa a associacao MULTIPLA entre UI e Quadrado
	static Vector<Circulo> circulos = new Vector<>();
	static Vector<Retangulo> retangulos = new Vector<>();

	
	
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
				String strBaseRetangulo = JOptionPane.showInputDialog("Informe a base do retangulo:");
				float base = Float.parseFloat(strBaseRetangulo);
				String strAlturaRetangulo = JOptionPane.showInputDialog("Informe a altura do retangulo:");
				float altura = Float.parseFloat(strAlturaRetangulo);
				Retangulo retangulo = new Retangulo(base, altura);

				retangulos.add(retangulo);
				break;

			case 3:
				String strRaioCirculo = JOptionPane.showInputDialog("Informe o raio do circulo:");
				float raio = Float.parseFloat(strRaioCirculo);
				Circulo circulo = new Circulo(raio);

				circulos.add(circulo);
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

		var circuloCounter = 0;
		for (var circulo : circulos) {
			String resposta = "Circulo " + circuloCounter + ":\n"
					+ "Raio: " + circulo.getRaio() + "\n"
					+ "Area: " + circulo.calcularArea() + "\n"
					+ "Perimetro: " + circulo.calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
			circuloCounter++;
		}

		var retanguloCounter = 0;
		for (var retangulo : retangulos) {
			String resposta = "Retangulo " + retanguloCounter + ":\n"
					+ "Base: " + retangulo.getBase() + "\n"
					+ "Altura: " + retangulo.getAltura() + "\n"
					+ "Area: " + retangulo.calcularArea() + "\n"
					+ "Perimetro: " + retangulo.calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
			retanguloCounter++;
		}


			//Fazer com as demais figuras geometricas

	}

}
















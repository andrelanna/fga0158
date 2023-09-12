package exercicio2;

import javax.swing.JOptionPane;

/**
 * Crie um programa que leia um polígono do teclado. A partir dessa leitura, 
 * leia os lados do polígono, calcule sua área e perímetro, e os imprima.
 * @author andre
 */
public class Exercicio2 {

	public static void main(String[] args) {
		
		//----- DECLARACAO DE VARIAVEIS: 
		String[] poligonos = new String[] {   //tipos de polígonos que vou calcular area e perimetro.
				"Triângulo retângulo", 
				"Triângulo equilátero", 
				"Retângulo", 
				"Trapézio", 
				"Círculo", 
				"Quadrado"
		};
		
		String poligonoEscolhido;  //polígono escolhido pelo usuário
		float base, altura, basemenor, raio, lado,  //medidas necessarias para realizar os calculos 
		      area, perimetro;   //medidas calculadas
		
		
		
		//----- ALGORITMO:
		//1o. passo: escolher o polígono
		
		poligonoEscolhido = (String)JOptionPane.showInputDialog(null,                //entrada através de caixa de entrada com combobox 
				                    "Informe o tipo do polígono na caixa abaixo:",   //mensagem para o usuário
				                    "FGA-0158: Orientação a objetos",                //titulo da caixa de entrada
				                    JOptionPane.INFORMATION_MESSAGE,                 //icone da caixa de entrada
				                    null,                                            
				                    poligonos,                                       //lista de opções do combobox
				                    null);
		
		//2o. passo: ler os valores das medidas, conforme o poligono escolhido, e calcular area e perimetro
		switch (poligonoEscolhido) {
		case "Triângulo retângulo": {
			String strBase = JOptionPane.showInputDialog("Informe a base do triangulo retangulo");
			String strAltura = JOptionPane.showInputDialog("Informe a altura do triangulo retangulo");
			base = Float.parseFloat(strBase);
			altura = Float.parseFloat(strAltura);
			float hipotenusa = (float) Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
			
			area = (base*altura) / 2;
			perimetro = base + altura + hipotenusa;
			
			imprimirResultado(poligonoEscolhido, area, perimetro);
			break;
		}
		
		case "Triângulo equilátero": {
			String strLado = JOptionPane.showInputDialog("Informe o lado do triangulo equilatero");
			lado = Float.parseFloat(strLado);
			altura = (float) (lado * (Math.sqrt(3))/2); 
			
			area = 2 * (lado/2) * altura;
			perimetro = 3 * lado; 
			
			imprimirResultado(poligonoEscolhido, area, perimetro);
			break;
		}
		
		
		case "Retângulo": {
			String strBase = JOptionPane.showInputDialog("Informe a base do retangulo");
			String strAltura = JOptionPane.showInputDialog("Informe a altura do retangulo");
			base = Float.parseFloat(strBase);
			altura = Float.parseFloat(strAltura);
			
			area = base * altura; 
			perimetro = 2*base + 2*altura;
			
			imprimirResultado(poligonoEscolhido, area, perimetro);
			break;
		}	
		
		
		case "Trapézio": {
			String strBase = JOptionPane.showInputDialog("Informe a base maior do Trapezio");
			String strBaseMenor = JOptionPane.showInputDialog("Informe a base menor do Trapezio");
			String strAltura = JOptionPane.showInputDialog("Informe a altura do Trapezio");
			base = Float.parseFloat(strBase);
			basemenor = Float.parseFloat(strBaseMenor);
			altura = Float.parseFloat(strAltura);
			
			area = ((base + basemenor) * altura) / 2;
			
			imprimirResultado(poligonoEscolhido, area, 0);
			break;
		}
		case "Círculo": {
			String strRaio= JOptionPane.showInputDialog("Informe o raio do Círculo");
			raio = Float.parseFloat(strRaio);
			
			area = (float) (Math.PI * raio * raio); 
			perimetro = (float) (2 * Math.PI * raio);
			
			imprimirResultado(poligonoEscolhido, area, perimetro);
			break;
		}
		case "Quadrado": {
			String strLado= JOptionPane.showInputDialog("Informe o lado do Quadrado");
			lado = Float.parseFloat(strLado);
			
			area = lado * lado; 
			perimetro = 4 * lado; 
			
			imprimirResultado(poligonoEscolhido, area, perimetro);
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Nenhum poligono foi escolhido");
		}
		
	}

	
	/**
	 * Metodo (funcao ou procedimento) auxiliar para realizar a impressão do resultado dos calculos
	 * @param poligonoEscolhido nome do poligono selecionado
	 * @param area valor da area
	 * @param perimetro valor do perimetro
	 */
	private static void imprimirResultado(String poligonoEscolhido, float area, float perimetro) {
		String resposta = "Poligono escolhido: " + poligonoEscolhido + "\n" + 
	                      "Area: " + area + "\n" + 
				          "Perimetro: " + perimetro + ".";
		
		JOptionPane.showMessageDialog(null, resposta);
	}

	
}

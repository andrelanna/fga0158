import java.util.Scanner;

import figurasGeometricas.Circulo;
import figurasGeometricas.Medida;
import figurasGeometricas.Triangulo;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	private static Circulo[] circs = new Circulo[0];
	private static Triangulo[] triangs = new Triangulo[0];
	
	public static void main(String[] args) {
		int opcao = 0;
		
		do {
			opcao = imprimirMenu(); 
			
			switch (opcao) {
			case 1:
				lerCirculo(); 
				break;
				
			case 2: 
				lerTriangulo(); //ler os dados e armazenar em triangs
				break;
			}
			
		} while (opcao != 0);
		
		String resposta = imprimirTriangulos();
		resposta += imprimirCirculos(); 
		
		System.out.println(resposta);
		
	}

	private static String imprimirCirculos() {
		String resposta = "";
		for (Circulo c : circs) {
			resposta += "Circulo: " + c + "\n";
			resposta += "Area: " + c.calcularArea().getValor() + c.calcularArea().getUnidade() + "\n";
			resposta += "Perimetro: " + c.calcularPerimetro().getValor() + c.calcularPerimetro().getUnidade() + "\n";
			resposta += "-----\n";
		}
		return resposta;
	}

	private static void lerCirculo() {
		System.out.println("Informe o valor do raio: ");
		int valor = sc.nextInt();
		System.out.println("Informe a unidade da medida");
		String unidade = sc.next();
		Medida raio = new Medida(valor, unidade);
		Circulo c = new Circulo(raio);
		
		Circulo temp[] = new Circulo[circs.length + 1];
		for (int i=0; i<circs.length; i++) {
			temp[i] = circs[i];
		}
		temp[circs.length] = c;
		circs = temp;
		
	}

	private static String imprimirTriangulos() {
		String resposta = "";
		for (Triangulo t : triangs) {
			resposta += "Triangulo: " + t + "\n";
			resposta += "Area: " + t.calcularArea() + "\n";
			resposta += "Perimetro: " + t.calcularPerimetro() + "\n";
			resposta += "-----\n";
		}
		return resposta; 
	}

	private static void lerTriangulo() {
		
		System.out.println("Informe o valor de A");
		int a = sc.nextInt();
		System.out.println("Informe o valor de B");
		int b = sc.nextInt();
		System.out.println("Informe o valor de C");
		int c = sc.nextInt();
		
		Triangulo t = new Triangulo(a, b, c);  //criei o obj triang
		
		Triangulo temp[] = new Triangulo[triangs.length + 1];
		for (int i=0; i < triangs.length; i++) {
			temp[i] = triangs[i];
		}
		temp[triangs.length] = t;
		
		triangs = temp;
		
	}

	private static int imprimirMenu() {
		
		
		String menu = "";
		menu += "Informe a figura desejada: \n";
		menu += "1 - Circulo\n";
		menu += "2 - Triangulo\n";
		menu += "0 - Sair";
		
		System.out.println(menu);
		int opcao = sc.nextInt();
		
		return opcao;
	}
	

}

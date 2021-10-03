package app;

import javax.swing.*;

import figurasGeometricas.*;
import figurasGeometricasIrregulares.*;

public class UI {
	
	static FigurasGeometricas[] fgs = new FigurasGeometricas[0];
	static FigGeometricaIrregular[] fgIrregular = new FigGeometricaIrregular[0];
	/* static Quadrado[] quadrados = new Quadrado[0];  //referencia representa a associacao MULTIPLA entre UI e Quadrado
	static Retangulo[] retangulos = new Retangulo[0]; // referencia representa a associação multiplas de retangulos 
    static Circulo[] circulos = new Circulo[0]; // referencia representa a associação multiplas de circulos */
	
	
	public static void main(String[] args) {
		//Aqui é onde tudo começa! 
		
		int opcao = 0;
		do { 
			//1a coisa: definir qual figura vai ser criada
			opcao = ApresentarMenu();
			switch (opcao) {
			case 1:
				InserirTriangulo();
				break;
			case 2: 
				InserirQuadrado();
				break;
			case 3: 
				InserirPentagono();
				break;
			case 4:
				InserirHexagono();
				break;
			case 5:
				InserirRetangulo();
				break;
			case 6:
				InserirLosango();
				break;
			case 7:
				InserirTrapezio();
				break;
			case 0: 
				JOptionPane.showMessageDialog(null, " Obrigado por utilizar o programa! Volte Sempre!");
				break;
			default:
				JOptionPane.showMessageDialog(null, " Opção Inválida!!");
				break;
			}
		} while (opcao != 0);

		ImprimirFigurasGeometricas();
		ImprimirFigGeoIrregular();
	}

	private static int ApresentarMenu(){
		int opcao;
		String menu = "Escolha uma opção de figura geométrica: \n"
					+ "1 - Triangulo\n"
					+ "2 - Quadrado\n"
					+ "3- Pentagono\n"
					+ "4 - Hexagono\n"
					+ "5 - Retangulo\n"
					+ "6 - Losango\n"
					+ "7 - Trapezio\n"
					+ "0 - Sair do programa";
		String Stropcao = JOptionPane.showInputDialog(menu);
		opcao = Integer.parseInt(Stropcao);
		return opcao;
	}

	private static void cadastrarFigGeo(FigurasGeometricas f){
		FigurasGeometricas[] temp = new FigurasGeometricas[fgs.length + 1];
		for (int i=0; i<fgs.length; i++) {
			temp[i] = fgs[i];  //copiando todas referencias de fgs em temp
		}
		//inserir f em temp
		temp[fgs.length] = f;
		//atualizar referencia de Figuras Geometricas
		fgs = temp;
	}

	private static void cadastrarFigGeoIrregular(FigGeometricaIrregular f){
		FigGeometricaIrregular[] temp = new FigGeometricaIrregular[fgIrregular.length + 1];
		for (int i=0; i<fgIrregular.length; i++) {
			temp[i] = fgIrregular[i];  //copiando todas referencias de fgIrregular em temp
		}
		//inserir f em temp
		temp[fgIrregular.length] = f;
		//atualizar referencia de Figuras Geometricas
		fgIrregular = temp;
	}


	private static void InserirTriangulo(){
		String strLado = JOptionPane.showInputDialog("Informe o lado do triângulo:");
		float lado= Float.parseFloat(strLado);
		String strAltura = JOptionPane.showInputDialog("Informe a altura do triângulo:");
		float altura = Float.parseFloat(strAltura);
		Triangulo t = new Triangulo(lado, altura , 3);

		cadastrarFigGeo(t);
	}

	private static void InserirQuadrado(){
		String strLadoQuadrado = JOptionPane.showInputDialog("Informe o lado do quadrado:");
		float ladoQuadrado = Float.parseFloat(strLadoQuadrado);
		Quadrado q = new Quadrado(ladoQuadrado, 4);

		cadastrarFigGeo(q);
	}

	private static void InserirPentagono(){
		String strLado = JOptionPane.showInputDialog("Informe o lado do pentagono:");
		float lado = Float.parseFloat(strLado);
		String strApotema = JOptionPane.showInputDialog("Informe a apótema do pentagono:");
		float apotema = Float.parseFloat(strApotema);
		Pentagono p = new Pentagono(lado, apotema ,5);

		cadastrarFigGeo(p);
	}

	private static void InserirHexagono(){
		String strLado = JOptionPane.showInputDialog("Informe o lado do hexágono:");
		float lado = Float.parseFloat(strLado);
		Hexagono h = new Hexagono(lado, 4);

		cadastrarFigGeo(h);
	}

	private static void InserirRetangulo(){
		// Criar painel para receber tanto altura quanto a base do retangulo
		JTextField baseField = new JTextField(5);
		JTextField alturaField = new JTextField(5);
		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("base: "));
		myPanel.add(baseField);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(new JLabel("altura: "));
		myPanel.add(alturaField);
		/* int result =  */JOptionPane.showConfirmDialog(null, myPanel, "Informe os valores do retangulo ", JOptionPane.OK_CANCEL_OPTION  );
		float baseRetangulo = Float.parseFloat(baseField.getText());
		float alturaRetangulo = Float.parseFloat(alturaField.getText());
		
		// Inserir 'r' dentro do vetor dos retangulos
		Retangulo r = new Retangulo(baseRetangulo, alturaRetangulo);

		cadastrarFigGeoIrregular(r);
	}

	private static void InserirLosango(){
		String strLado1 = JOptionPane.showInputDialog(null, "Informe o lado 1 do losango");
		float lado1 = Float.parseFloat(strLado1);
		String strLado2 = JOptionPane.showInputDialog(null, "Informe o lado 2 do losango");
		float lado2 = Float.parseFloat(strLado2);
		String strLado3 = JOptionPane.showInputDialog(null, "Informe o lado 3 do losango");
		float lado3 = Float.parseFloat(strLado3);
		String strLado4 = JOptionPane.showInputDialog(null, "Informe o lado 4 do losango");
		float lado4 = Float.parseFloat(strLado4);
		String strDiagMenor = JOptionPane.showInputDialog(null, "Informe a menor diagonal do losango");
		float diagMenor = Float.parseFloat(strDiagMenor);
		String strDiagMaior = JOptionPane.showInputDialog(null, "Informe a maior diagonal do losango");
		float diagMaior = Float.parseFloat(strDiagMaior);

		Losango l = new Losango(lado1, lado2, lado3, lado4, diagMenor, diagMaior);

		cadastrarFigGeoIrregular(l);
	}

	private static void InserirTrapezio(){
		String strLado1 = JOptionPane.showInputDialog(null, "Informe o lado 1 do trapezio");
		float lado1 = Float.parseFloat(strLado1);
		String strLado2 = JOptionPane.showInputDialog(null, "Informe o lado 2 do trapezio");
		float lado2 = Float.parseFloat(strLado2);
		String strBaseMenor = JOptionPane.showInputDialog(null, "Informe a menor base do trapezio");
		float baseMenor = Float.parseFloat(strBaseMenor);
		String strBaseMaior = JOptionPane.showInputDialog(null, "Informe a maoir base do trapezio");
		float baseMaior = Float.parseFloat(strBaseMaior);
		String strAltura = JOptionPane.showInputDialog(null, "Informe a altura do trapezio");
		float altura = Float.parseFloat(strAltura);
		
		Trapezio t = new Trapezio(lado1, lado2, baseMenor, baseMaior, altura);

		cadastrarFigGeoIrregular(t);
	}

	/* private static void InserirCirculo(){
		// CRIAR CIRCULO
		String strRaioCirculo = JOptionPane.showInputDialog(null, "Informe o valor do raio do círculo");
		float raioCirculo = Float.parseFloat(strRaioCirculo);
		Circulo c = new Circulo(raioCirculo);

		// Inserir 'c' dentro do vetor dos circulos
		Circulo[] temp2 = new Circulo[circulos.length + 1];
		for (int i=0; i<circulos.length; i++){
			temp2[i]= circulos[i]; // temp2 está recebendo todas as referencias de circulos 
		}
		temp2[circulos.length] = c; // temp2, em sua ultima posição, recebe a nova referencia de circulos instanciado na linha 78

		circulos = temp2; // circulos aponta para a vetor temp2, o qual possui as ref dos circulos atualizadas
	} */

	private static void ImprimirFigurasGeometricas(){
		/* int i=0; i<quadrados.length; i++ */

		for (FigurasGeometricas fgs: fgs ) {
			String resposta = fgs + ")" + ":\n"
					+ "Lado: " + fgs.getLado();
			switch(fgs.getQteLado()){
				case 3:
					resposta = resposta + "\n" + "Altura: "+ ((Triangulo)fgs).getAltura() 
										+ "\n" + "Area: "  + ((Triangulo)fgs).calcularArea();
					break;
				case 4:
					resposta = resposta + "\n" + "Area: " + ((Quadrado)fgs).calcularArea();
					break;
				case 5:
					resposta = resposta + "\n" + "Apótema" + ((Pentagono)fgs).getApotema()
										+ "\n" + "Area: "  + ((Pentagono)fgs).calcularArea();
					break;
				case 6:
					resposta = resposta + "\n" + "Area: " + ((Hexagono)fgs).calcularArea();
					break;
			}
			resposta = resposta + "\n" + "Perimetro: " + fgs.calcularPerimetro();
			JOptionPane.showMessageDialog(null, resposta);
		}
	}

	private static void ImprimirFigGeoIrregular(){

		for (FigGeometricaIrregular fgIrregular: fgIrregular ) {
			String resposta = fgIrregular + ")" + ":\n"
					+ "Lado1: " + fgIrregular.getLado1() + ":\n"
					+ "Lado2: " + fgIrregular.getLado2() + ":\n"
					+ "Lado3: " + fgIrregular.getLado3() + ":\n"
					+ "Lado4: " + fgIrregular.getLado4() + ":\n"
					+ "Perimetro: " + fgIrregular.calcularPerimetro();
			
			if(fgIrregular instanceof Losango){
				Losango l = (Losango)fgIrregular;
				resposta = resposta + "\n" + "Diagonal Menor: " + l.getDiagMenor()
									+ "\n" + "Diagonal Maior: " + l.getDiagMaior()
									+ "\n" + "Área: " + l.calcularArea();
			} else if (fgIrregular instanceof Trapezio){
				Trapezio t = (Trapezio)fgIrregular;
				resposta = resposta + "\n" + "Diagonal Menor: " + t.getAltura()
									+ "\n" + "Área: " + t.calcularArea();
			} else {
				Retangulo r = (Retangulo)fgIrregular;
				resposta = resposta + "\n" + "Área: " + r.calcularArea();
			}
			JOptionPane.showMessageDialog(null, resposta);
		}

	}
}
















package app;

import javax.swing.*;

import figurasGeometricas.*;

public class UI {
	
	static Quadrado[] quadrados = new Quadrado[0];  //referencia representa a associacao MULTIPLA entre UI e Quadrado
	static Retangulo[] retangulos = new Retangulo[0]; // referencia representa a associação multiplas de retangulos 
    static Circulo[] circulos = new Circulo[0]; // referencia representa a associação multiplas de circulos
	
	
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
				// Criar painel para receber tanto altura quanto a base do retangulo
				JTextField baseField = new JTextField(5);
				JTextField alturaField = new JTextField(5);
				JPanel myPanel = new JPanel();
				myPanel.add(new JLabel("base: "));
				myPanel.add(baseField);
				myPanel.add(Box.createHorizontalStrut(15));
				myPanel.add(new JLabel("altura: "));
				myPanel.add(alturaField);

				int result = JOptionPane.showConfirmDialog(null, myPanel, "Informe os valores do retangulo ", JOptionPane.OK_CANCEL_OPTION  );
				float baseRetangulo = Float.parseFloat(baseField.getText());
				float alturaRetangulo = Float.parseFloat(alturaField.getText());
				
				// Inserir 'r' dentro do vetor dos retangulos
				Retangulo r = new Retangulo(baseRetangulo, alturaRetangulo);

				Retangulo[] temp1 = new Retangulo[retangulos.length + 1];

				for (int i=0; i<retangulos.length ; i++){
					temp1[i] = retangulos[i]; // temp1 está recebendo todas as referencias de retangulos
				}

				temp1[retangulos.length] = r; // temp1, em sua ultima posição, recebe a nova referencia de circulos instanciado na linha 61 
				retangulos = temp1;
				break;

			case 3: 
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
				break;

			case 0: 
				JOptionPane.showMessageDialog(null, " Obrigado por utilizar o programa! Volte Sempre!");
				break;

			default:
				JOptionPane.showMessageDialog(null, " Opção Inválida!!");
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
		
		
        for (int i=0; i<retangulos.length; i++){
            String resposta1 = "Retangulo " +i+1 + "(" + retangulos[i] + ")" + ":\n"
                    + "Base: "      + retangulos[i].getBase() +                 "\n"
                    + "Alura: "     + retangulos[i].getAltura() +               "\n"
                    + "Area: "      + retangulos[i].calcularArea() +            "\n"
                    + "Perimetro: " + retangulos[i].calcularPerimetro();

            JOptionPane.showMessageDialog(null, resposta1);
        }

        for (int i=0; i<circulos.length; i++){
            String resposta2 = "Circulo " +i+1 + "(" + circulos[i] + ")" + ":\n"
                    + "Raio: "      + circulos[i].getRaio() +                 "\n"
                    + "Area: "      + circulos[i].calcularArea() +            "\n"
                    + "Perimetro: " + circulos[i].calcularPerimetro();

            JOptionPane.showMessageDialog(null, resposta2);
        }

	}

}
















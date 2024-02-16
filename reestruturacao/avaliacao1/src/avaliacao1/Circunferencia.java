package avaliacao1;

import javax.swing.JOptionPane;

public class Circunferencia {
	public static void main(String[] args) {
		final double PI = 3.1415;  //definicao de constante em JAVA
		int raio;
		float comprimento;
		double area;
		
		String strRaio = JOptionPane.showInputDialog("Informe o valor do raio");
		raio = ...............;  //Integer.parseInt(strRaio);
		
		comprimento = ...............; //(float)2 * PI * raio;

		area = ...............;  //PI * raio * raio
		
		String resposta = "Comprimento da circunferencia: " + comprimento + "\n"; 
		resposta += "Area da circunferencia: " + area + "\n";
		
		JOptionPane.showMessageDialog(null, resposta);
	}
}


Type casting
Avaliacao de algoritmo
entrada e saida de valores
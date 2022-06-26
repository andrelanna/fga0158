package fga0158;

import javax.swing.JOptionPane;

public class OperadorRelacionalUnario {
	
	public static void main (String[] args) {
		String strA, strB, strC;
		int a, b, c;
		
		strA = JOptionPane.showInputDialog("Informe o valor de A:");
		strB = JOptionPane.showInputDialog("Informe o valor de B:");
		strC = JOptionPane.showInputDialog("Informe o valor de C:");
		
		//down-casting vvvvv
		a = Integer.parseInt(strA);
		b = Integer.parseInt(strB);
		c = Integer.parseInt(strC);
		
		String resposta = "Os valores " + a + ", " + b + " e " + c + 
				          ((a*a == b*b + c*c) ? " formam " : " não formam") + 
				          " os lados de um triângulo retângulo.";
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}
}

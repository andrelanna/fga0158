package fga0158;

import javax.swing.JOptionPane;

public class Principal {
	
	static Calculadora c;
	
	private static int lerInteiro(String operando) throws NumberFormatException{
		String str = JOptionPane.showInputDialog("Informe o valor de " + operando);
		int i = Integer.parseInt(str);
		return i;
	}
	
	public static void main(String[] args) {
		
		int a=0 , b=0; 
		int quociente ; 
		
		boolean valoresOK = true;
		do {
			try {
				a = lerInteiro("A");
				b = lerInteiro("B");
				
				c = new Calculadora(a, b);
				quociente = c.divisao();
				JOptionPane.showMessageDialog(null, "Quociente = " + quociente);

				valoresOK = true;
			} catch (NumberFormatException e) {
				valoresOK = false; 
			} catch (ArithmeticException e) {
				if (a >= 0) {
					quociente = Integer.MAX_VALUE;
				} else {
					quociente = Integer.MIN_VALUE; 
				}
				JOptionPane.showInputDialog(quociente);
				
			}
		} while (!valoresOK);
		
		
		
	}
}

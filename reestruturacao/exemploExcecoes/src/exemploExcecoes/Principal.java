package exemploExcecoes;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String strBase = JOptionPane.showInputDialog("Informe a base");
		String strExp = JOptionPane.showInputDialog("Informe o expoente");
		
		float base = Float.parseFloat(strBase);
		float exp = Float.parseFloat(strExp);
		
		float raiz = 0; 
		try {
			raiz = Calculadora.raiz(base, exp);
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Houve um erro!" + 
		                                         e.getMessage());
			e.printStackTrace();
//			System.out.println("numerador = " + e.getNum());
//			System.out.println("denominador = " + e.getDen());
		}
		
		JOptionPane.showMessageDialog(null, "O resultado é igual a " + raiz);
	}

}

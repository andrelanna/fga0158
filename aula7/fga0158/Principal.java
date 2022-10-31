package fga0158;

import javax.swing.JOptionPane;

public class Principal {

	
	public static void main(String[] args) throws InterruptedException {
		//referencia para objeto Calculadora
		Calculadora calc;
		
		boolean opcao;
		do {
			String strOp1 = JOptionPane.showInputDialog("Informe o valor do operando1:");
			String strOp2 = JOptionPane.showInputDialog("Informe o valor do operando2:");
			
			int operando1 = Integer.parseInt(strOp1);
			int operando2 = Integer.parseInt(strOp2);
			
			//instanciacao do objeto Calculadora
			calc = new Calculadora(operando1, operando2);
			
			//Calcular o resultado
			int resultado = calc.calcularSoma();
			JOptionPane.showMessageDialog(null, "A soma de " + calc.operando1 + 
					                            " e " + calc.operando2 + " e igual a "
					                            + resultado); 
			
			calc = null;
			Thread.sleep(1000);
			System.gc(); //Chamada explicita ao coletor de lixo.
			
			String strOpcao = JOptionPane.showInputDialog("Deseja realizar outra operacao? (S/N");
			opcao = (strOpcao.equalsIgnoreCase("Sim") ? true : false);
			
			
		} while (opcao);
	}

}

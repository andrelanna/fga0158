import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int opcao; 
		do { 
			String strOp1 = JOptionPane.showInputDialog("Informe operando 1");
			String strOp2 = JOptionPane.showInputDialog("Informe operando 2");

			try {
				int op1 = Integer.parseInt(strOp1);
				int op2 = Integer.parseInt(strOp2);
				
				Calculadora c = new Calculadora(op1, op2);
				String operacao = JOptionPane.showInputDialog("Qual é a operacao?");
				
				String resposta = "A divisao de " + op1 + " por " + op2 + " e igual a " + 
						c.operacao(operacao);
				JOptionPane.showMessageDialog(null, resposta);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor errado informado para algum operando");
				e.printStackTrace();
			} catch (DivisaoPorZeroException e) {
				JOptionPane.showMessageDialog(null, "Foi informado zero para denominador");
				e.printStackTrace();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Capturei excecao *GENERICA* ");
				e.printStackTrace();
			}
			
			opcao = JOptionPane.showConfirmDialog(null, 
					               "Deseja calcular novamente?", 
					               "FGA0158", 
					               JOptionPane.YES_NO_OPTION);
			
		}while (opcao == JOptionPane.YES_OPTION);
	}
}

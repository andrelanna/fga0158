package fga0158;

import javax.swing.JOptionPane;

public class HelloWorldGrafico {

	public static void main(String[] args) {
		String nome;
		String strAnoNascimento;
		int anoNascimento;
		
		//Entrada grafica
		nome = JOptionPane.showInputDialog(null, "Informe o nome do cidadão:");
		strAnoNascimento = JOptionPane.showInputDialog(null, "Informe ano de nascimento");

		//Down-casting vvvvvvv
		anoNascimento = Integer.parseInt(strAnoNascimento);
		
		String resposta = "Olá " + nome + ".\n";
		resposta += "Você tem " + (2022 - anoNascimento) + " anos de idade.";
		
		JOptionPane.showMessageDialog(null, resposta);
	}

}

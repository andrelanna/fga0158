import java.time.Year;

import javax.swing.JOptionPane;

/**
 * HelloWorld em modo grafico
 * @author andre
 *
 */
public class HelloWorldGrafico {

	public static void main(String[] args) {
		/*
		 * Declaracao de variaveis a serem utilizadas pelo metodo main
		 *  
		 */
		String nome;
		String strAnoNascimento;
		int anoNascimento;
		int anoAtual;
		
		/*
		 * Atribuicao de valores para as variaveis, seja pela entrada padrao 
		 * em modo grafico, seja pela chamada de métodos em Java.
		 */
		nome = JOptionPane.showInputDialog(null, "Informe o nome do cidadão:");
		strAnoNascimento = JOptionPane.showInputDialog(null, "Informe ano de nascimento");
		anoAtual = Year.now().getValue();

		//Down-casting vvvvvvv
		anoNascimento = Integer.parseInt(strAnoNascimento);
		
		String resposta = "Olá " + nome + ".\n";
		resposta += "Você tem " + (anoAtual - anoNascimento) + " anos de idade.";
		
		JOptionPane.showMessageDialog(null, resposta);
	}

}

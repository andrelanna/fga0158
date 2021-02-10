package exemplo1_hello_world;

/*
 * Importação de pacotes
 */
import javax.swing.JOptionPane;

/*
 * Inicio do algoritmo
 */
public class HelloWorldGrafico {

	/*
	 * Metodo que define e executa o algoritmo.
	 */
	public static void main(String[] args) {
		/*
		 * Declaracao de variaveis
		 */
		String nome, sobrenome; 

		String strAnoNascimento;
		int anoNascimento;
		
		String saudacao;
		
		/*
		 * Instrucoes do algoritmo
		 */
		
		//Entrada de dados grafica!!! 
		nome = JOptionPane.showInputDialog("Informe seu nome: "); 
		sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome: "); 
		
		//ler ano de nascimento! 
		strAnoNascimento = JOptionPane.showInputDialog("Informe seu ano de nascimento: ");
		anoNascimento = Integer.parseInt(strAnoNascimento);  //conversao de um objeto String em um int! 
		
		//construir saudacao
		saudacao = "Olá " + nome + " " + sobrenome + "!"; 
		saudacao += "Você tem " + (2021 - anoNascimento) + " anos de idade.";
		
		//Imprimir saudação em modo grafico
		JOptionPane.showMessageDialog(null, saudacao);
	}

}

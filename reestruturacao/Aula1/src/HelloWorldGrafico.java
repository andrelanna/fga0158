import java.util.Scanner;

import javax.swing.JOptionPane;

public class HelloWorldGrafico {
	public static void main(String[] args) {

		//Variaveis do programa. 
		String nome, sobreNome; 
		float peso, altura, imc;
		int anoNascimento, idade; 
		
		String strPeso, strAltura, strAnoNascimento;
		nome = JOptionPane.showInputDialog("Informe o seu nome");
		sobreNome = JOptionPane.showInputDialog("Informe seu sobrenome");
		strPeso = JOptionPane.showInputDialog("Informe o peso da pessoa:");
		peso = Float.parseFloat(strPeso);
		strAltura = JOptionPane.showInputDialog("Informe a altura da pessoa:");
		altura = Float.parseFloat(strAltura);
		strAnoNascimento = JOptionPane.showInputDialog("Informe o ano de nascimento");
		anoNascimento = Integer.parseInt(strAnoNascimento);
		
		imc = peso / (altura*altura);
		idade = 2023 - anoNascimento;
		
		String resposta = "Nome do cidadao: " + nome + " " + sobreNome + "\n";
		resposta += "Peso: " + peso + "\n"; 
		resposta += "Altura: " + altura + "\n";
		resposta += "IMC: " + imc + "\n";
		resposta += "Idade: " + idade + " anos de idade";
		
		JOptionPane.showMessageDialog(null, resposta);
		           
	}
}

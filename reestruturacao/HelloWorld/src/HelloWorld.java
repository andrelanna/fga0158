import java.util.Scanner;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		String nome; 
		int idade, anoNascimento; 
		
		Scanner sc = new Scanner(System.in); //Cria o scanner
		System.out.println("Informe o seu nome: ");
		nome = sc.next();  //le uma string do teclado
		
		//Em modo grafico
		String strAno = JOptionPane.showInputDialog("Informe o ano de nascimento");
		anoNascimento = Integer.parseInt(strAno);
		
		idade = 2022 - anoNascimento; //calculo da idade
		JOptionPane.showMessageDialog(null, "Olá " + nome + ". Você tem "
				+ idade + " anos de idade.");
	}

}

package fga0158;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		String nome; 
		int anoNascimento;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do cidadao: ");
		nome = sc.nextLine();
		System.out.println("Informe o ano de nascimento: ");
		anoNascimento = sc.nextInt();
		
		String resposta = "Olá " + nome + "\n"; 
		resposta += "Você tem " + (2022 - anoNascimento) + " anos de idade. ";
		
		System.out.println(resposta);

	}

}

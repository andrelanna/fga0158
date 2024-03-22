import java.time.Year;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 * Hello world em modo texto. 
 * @author andre
 *
 */
public class HelloWorld {

	public static void main(String[] args) {

		/*
		 * Declaracao de variaveis a serem utilizadas pelo metodo main
		 *  
		 */
		String nome; 
		int anoNascimento;
		int anoAtual; 
		Scanner sc = new Scanner(System.in);

		/*
		 * Atribuicao de valores para as variaveis, seja pela entrada padrao 
		 * em modo texto, seja pela chamada de métodos em Java.
		 */
		System.out.println("Informe o nome do cidadao: ");
		nome = sc.nextLine();
		System.out.println("Informe o ano de nascimento: ");
		anoNascimento = sc.nextInt();
		
		anoAtual = Year.now().getValue(); //obtem o valor do ano atual

		/*
		 * Construcao da string de resposta ao usuario
		 */
		String resposta = "Olá " + nome + "\n"; 
		resposta += "Você tem " + (anoAtual - anoNascimento) + " anos de idade. ";

		System.out.println(resposta);

	}

}

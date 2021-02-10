package exemplo1_hello_world;

/*
 * Importação de pacotes
 */
import java.util.Scanner;

/*
 * Inicio do algoritmo
 */
public class HelloWorldTextual {

	/*
	 * Metodo que define e executa o algoritmo.
	 */
	public static void main(String[] args) { 
		/*
		 * Declaracao de variaveis
		 */
		String nome, 
		       sobrenome;
		int anoNascimento;
		
		/*
		 * Instrucoes do algoritmo
		 */

		//Ler nome, sobrenome e ano de nascimento do teclado
		Scanner sc = new Scanner(System.in); //criei um scanner com a entrada padrao atribuida
		System.out.println("Informe seu nome: ");
		nome = sc.next();
		System.out.println("Informe seu sobrenome: ");
		sobrenome = sc.next();
		System.out.println("Informe seu ano de nascimento: ");
		anoNascimento = sc.nextInt();
		
		//Imprimir saudação!
		String saudacao = "Olá " + nome + " " + sobrenome + "!";
		saudacao = saudacao + "Você tem " + (2021 - anoNascimento) + " anos de idade. ";
		System.out.println(saudacao);
	}

}

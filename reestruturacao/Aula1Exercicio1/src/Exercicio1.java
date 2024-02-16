import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String nome; //variavel para armazenar nome
		System.out.println("informe seu nome");
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();  //leitura do teclado
		
		System.out.println("Olá " + nome);
		sc.close();
	}

}

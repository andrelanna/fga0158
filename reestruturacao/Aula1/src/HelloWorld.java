import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		//Variaveis do programa. 
		String nome, sobreNome; 
		float peso, altura, imc;
		int anoNascimento;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome, seguido pelo sobrenome:");
		nome = sc.next();
		sobreNome = sc.next();
		System.out.println("Informe o peso do cidadao:");
		peso = sc.nextFloat();
		System.out.println("Informe a altura do cidadao:");
		altura = sc.nextFloat();
		
		imc = peso / (altura*altura);
		
		System.out.println("Nome do cidadao: " + nome + " " + sobreNome + "\n" +
		                   "Peso: " + peso + "\n" + 
				           "Altura: " + altura + 
				           "IMC: " + imc);

	}

}

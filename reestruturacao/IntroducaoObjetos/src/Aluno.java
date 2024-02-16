import java.util.Scanner;

public class Aluno {

	String nome;   //atributo nome
	int matricula; //atributo matricula
	String curso;  //atributo curso
	float ira;     //atributo ira
	String email;  //atributo email
	
	/**
	 * Metodo calcular IRA: le os valores das notas e calcula media
	 * @return
	 */
	float calcularIRA() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int somaNotas = 0; 
		
		String opcao = "Sim"; 
		do {
			i++;
			System.out.println("Informe o valor da nota " + i);
			int nota = sc.nextInt();
			somaNotas = somaNotas + nota;
			
			System.out.println("Deseja informar nova nota? (S/N)");
			opcao = sc.next();
		} while (opcao.equalsIgnoreCase("Sim"));
		
		ira = somaNotas / i; 
		return ira; 
	}
	
	
	String mostrarEstado() {
		String resposta = "";
		resposta += "Nome: " + nome + '\n';
		resposta += "Matricula: " + matricula + '\n';
		resposta += "Curso: " + curso + '\n';
		resposta += "IRA: " + ira + '\n';
		resposta += "Email: " + email + '\n';
		
		return resposta; 
		
	}

}

























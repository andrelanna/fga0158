package exercicio2.modelos;

public class Aluno {
	String nome;
	String email; 
	Matricula matricula;
	
	public Aluno(String nome, String email, int ano, int sequencial) {
		this.nome = nome; 
		this.email = email;
		this.matricula = new Matricula(ano, sequencial);
	}
	
	public String relatorio() {
		String relatorio = ""; 
		relatorio += "NOME: " + nome + '\n';
		relatorio += "EMAIL: " + email + '\n'; 
		relatorio += "MATRICULA: " + matricula.getAno() + '/' + 
				                     matricula.getSequencial() + '\n';
		return relatorio; 
	}
	
	protected void finalize() throws Throwable {
		System.out.println(nome + " vai ser destruido!");
	}
}

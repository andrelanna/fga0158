package exemploPolimorfismoParametrico;

public class Aluno {
	private int matricula; 
	private String nome; 
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String toString() {
		return matricula + " - " + nome;
	}
}

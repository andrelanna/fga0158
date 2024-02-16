package exemploPolimorfismoParametrico;

public class Aluno {

	private String nome; 
	private int matricula; 
	
	public Aluno() {
	}
	
	public Aluno (String nome, int matricula ) {
		this.nome = nome; 
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}
}

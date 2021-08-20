package app;

public class Aluno {
	
	/**
	 * Atributos da classe Aluno
	 */
	String nome, 
	       matricula,
	       contato;
	
	/**
	 * Metodos construtores
	 */
	public Aluno() {  //metodo construtor padrao
		
	}
	
	public Aluno(String nome, String matricula, String contato) { //construtor alternativo
		this.nome = nome;
		this.matricula = matricula; 
		this.contato = contato;
	}
	
	
	public String getMatricula() {
		return matricula; 
	}

	public String getNome() {
		return nome;
	}

	public String getContato() {
		return contato;
	}
}

package modelos;

public class Professor {
	private String nome; 
	private int matriculaFub;
	
	public Professor(String nome, int matriculaFub) {
		this.nome = nome; 
		this.matriculaFub = matriculaFub;
	}

	public String getNome() {
		return nome;
	}

	public int getMatriculaFub() {
		return matriculaFub;
	}
	
	public String toString() {
		String resposta = "NOME: " + getNome() + "\n"; 
		resposta += "MATRICULA: " + getMatriculaFub();
		return resposta;
	}
}

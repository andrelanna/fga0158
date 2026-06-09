package fga0158.artistas;

public class Artista {
	
	private String nome;
	private int idade; 
	
	public Artista(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public int getIdade() {
		return idade;
	}



	public String imprimir() {
		String resposta = "";
		
		resposta += "Artista: " + this + '\n';
		resposta += "Nome: " + this.nome + '\n';
		resposta += "Idade: " + this.idade + '\n';
		
		return resposta;
	}
}

package fga0158.producoes;

public class Album {
	
	private String nome;
	private int anoLancamento;
	private String gravadora;
	
	public Album() {
		this.nome = nome; 
		this.anoLancamento = anoLancamento;
		this.gravadora = gravadora;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public String getGravadora() {
		return gravadora;
	}

	public String imprimir() {
		String resposta = ""; 
		
		resposta += "Album: "+ this + '\n';
		resposta += "Nome: " + this.nome + '\n';
		resposta += "Ano de Lancamento: " + this.anoLancamento + '\n'; 
		resposta += "Gravadora: " + this.gravadora + '\n'; 
		
		return resposta;
	}
	
}

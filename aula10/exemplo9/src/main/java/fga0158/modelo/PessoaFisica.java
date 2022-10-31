package fga0158.modelo;

public abstract class PessoaFisica {
	private String nome, 
	               dataDeNascimento, 
	               email;
	
	public PessoaFisica(String nome,
			 			String dataDeNascimento, 
			 			String email) {
		this.nome = nome; 
		this.dataDeNascimento = dataDeNascimento;
		this.email = email;
	}
	
	public String relatorio() {
		String resposta = ""; 
		resposta += "NOME: " + nome + "\n";
		resposta += "DATA NASCIMENTO: " + dataDeNascimento + "\n";
		resposta += "EMAIL: " + email + "\n";
		
		return resposta; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

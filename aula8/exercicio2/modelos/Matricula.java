package exercicio2.modelos;

public class Matricula {
	int ano; 
	int sequencial; 
	
	Matricula (int ano, int sequencial) {
		this.ano = ano; 
		this.sequencial = sequencial;
	}

	public int getAno() {
		return ano;
	}

	public int getSequencial() {
		return sequencial;
	}
}

package app;

public class Turma {

	String disciplina, 
	       codigoDisciplina;
	
	int creditos, 
	    totalVagas,
	    vagasLivres,
	    vagasOcupadas;
	
	//associacao Turma --> Aluno
	Aluno alunos[];
	
	/**
	 * Métodos construtores
	 */
	public Turma() {  //metodo construtor padrao
		
	}
	
	public Turma(String disciplina, String codigoDisciplina, int creditos, int totalVagas) {
		this.disciplina = disciplina; 
		this.codigoDisciplina = codigoDisciplina; 
		this.creditos = creditos;
		if (totalVagas > 40) {
			this.totalVagas = 40; 
			alunos = new Aluno[40];
		} else {
			this.totalVagas = totalVagas;
			alunos = new Aluno[totalVagas];
		}
		this.vagasLivres = totalVagas;
		this.vagasOcupadas = 0;
	}
	
	/**
	 * Métodos da classe Turma
	 */
	
	//matricularAluno(a: Aluno): boolean
	public boolean matricularAluno(Aluno a) {
		/**
		 * alunos --> | a | a | N | N | N |
		 */
		
		//Encontrar posicao vazia
		int posicaoLivre= -1;
		for (int i=0; i < alunos.length; i++) {
			if (alunos[i] == null) { //encontrei 
				posicaoLivre = i; 
				break;
			}
		}
		
		//Matricular, se possível...
		if (posicaoLivre != -1) { //tem espaco vazio 
			alunos[posicaoLivre] = a; 
			vagasLivres--; //uma vaga a menos! 
			vagasOcupadas++; //uma nova posicao ocupada
		} else {  //turma está cheia!!!!  
			return false;
		}
		
		//Consegui matricular!!
		return true;  //consegui matricular aluno!
	}
	
	
	
	//desmatricularAluno(a: Aluno): boolean
	public boolean desmatricularAluno(Aluno a) {
		/**
		 * alunos --> | a1 | a3 | a4 | N | N | N |
		 */
		//encontrar posicao do aluno no vetor
		int posicaoOcupada = -1; 
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].getMatricula().equalsIgnoreCase(a.getMatricula())) { //achei o aluno no vetor!
				posicaoOcupada = i; 
				break;
			}
		}
		
		//retirar o aluno procurado do vetor
		if (posicaoOcupada != -1) {  //tem aluno para retirar
			for (int i = posicaoOcupada; i < alunos.length-1; i++) {
				alunos[i] = alunos[i+1];
			}
			alunos[totalVagas-1] = null;
			return true; 
		} else {
			return false;  //nao consegui desmatricular ninguem
		}
	}
	
	
	
	
	//pesquisarAluno(matricula: String): Aluno
	public Aluno pesquisarAluno(String matricula) {
		/**
		 * alunos --> | a1 | a2 | a3 | a4 | N | N | 
		 */
		
		Aluno resposta = null; 
		for (Aluno a : alunos) {
			if (a.getMatricula().equalsIgnoreCase(matricula)) { //encontrei o aluno procurado!
				resposta = a; 
				break;
			}
		}
		
		return resposta;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public String getCodigo() {
		return codigoDisciplina;
	}

	public int getVagasOcupadas() {
		return vagasOcupadas;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

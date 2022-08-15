package app;

import exceptions.CampoEmBrancoException;

public class Aluno {
	private String nome; 
	private int matricula;
	
	private Aluno(String n, int m) {
		nome = n;
		matricula = m;
	}
	
	
	public static Aluno criarAluno(String n, int m) throws CampoEmBrancoException {
		if (n.equalsIgnoreCase("") || m <= 0) {
			throw new CampoEmBrancoException(); 
		}
		
		Aluno a = new Aluno(n, m); 
		return a;
	}
	
	public String getNome() {
		return nome;
	}


	public int getMatricula() {
		return matricula;
	}
}

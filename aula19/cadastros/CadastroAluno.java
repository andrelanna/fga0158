package cadastros;

import modelos.Aluno;

public class CadastroAluno {
	private Aluno[] alunos; 
	
	public CadastroAluno() {
		alunos = new Aluno[0];
	}
	
	public boolean addAluno(Aluno p) {
		Aluno[] temp = new Aluno[alunos.length + 1]; 
		
		for (int i=0; i<alunos.length; i++) {
			temp[i] = alunos[i];
		}
		
		int index = alunos.length;
		temp[index] = p; 
		
		alunos = temp; 
		
		if (alunos[index] == p) 
			return true; 
		else 
			return false; 
	}
	
	public Aluno buscarAluno (String nome) {
		Aluno resposta = null; 
		
		for (Aluno a: alunos) {
			if (a.getNome().equalsIgnoreCase(nome))
				resposta = a; 
		}
		
		return resposta; 
	}
	
	public Aluno buscarAluno (int matricula) {
		Aluno resposta = null; 
		
		for (Aluno a: alunos) {
			if (a.getMatricula() == matricula) 
				resposta = a;
		}
		
		return resposta; 
	}
	
	public boolean delAluno (Aluno p) {
		boolean apaguei = false; 
		
		int posicaoApagar = -1;
		for (int i=0; i<alunos.length; i++) {
			if (alunos[i] == p) { 
				posicaoApagar = i; 
			}
		}
		
		if (posicaoApagar == -1) {
			apaguei = false; 
			return apaguei;
		}
		
		Aluno[] temp = new Aluno[alunos.length - 1];
		//copiar todos os elementos antes do elemento a ser apagado
		for (int i=0; i<posicaoApagar; i++) {
			temp[i] = alunos[i];
		}
		//copiar os elementos posteriores ao elemento a apagar
		for (int i=posicaoApagar+1; i<alunos.length; i++) {
			temp[i-1] = alunos[i];
		}
		
		alunos = temp; 
		apaguei = true;
		return apaguei; 
	}
	
}

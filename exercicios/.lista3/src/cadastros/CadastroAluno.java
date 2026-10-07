package cadastros;

import app.Aluno;

public class CadastroAluno {
	int numAlunos; 
	private Aluno[] alunos; 
	
	public CadastroAluno() {
		numAlunos = 0;
		alunos = new Aluno[0];
	}
	
	public int cadastrarAluno(Aluno a) {
		Aluno[] temp = new Aluno[numAlunos + 1];
		for (int i=0; i < alunos.length; i++) {
			temp[i] = alunos[i];
		}
		temp[temp.length -1] = a; 
		alunos = temp;
		numAlunos++; 
		return numAlunos;
	}
	
	public Aluno pesquisarAluno(String matriculaAluno) {
		Aluno resposta =  null;
		for (int i=0; i < alunos.length; i++) {
			Aluno a = alunos[i];
			String mat = a.getMatricula(); 
			if (mat.equalsIgnoreCase(matriculaAluno)) {
				return alunos[i];
			}
		}
		return resposta;
	}
	
	public boolean removerAluno(Aluno a) {
		Aluno remover = null; 
		if (a != null)
			remover = pesquisarAluno(a.getMatricula());
		
		if (remover == null) {
			return false;
		} 
		
		Aluno[] temp = new Aluno[numAlunos - 1];
		int j=0;
		for (int i=0; i<numAlunos; i++) {
			if (alunos[i] != remover) {
				temp[j] = alunos[i];
				j++;
			} else {
				alunos[i] = null;
			}
		}
		alunos = temp; 
		numAlunos--;
		return true;
	}
	
	public boolean atualizarAluno(String matricula, Aluno a) {
		int i;
		for (i=0; i< 11; i++) {
			if (alunos[i].getMatricula().equalsIgnoreCase(matricula)) {
				break;
			}
		}
		if (i > numAlunos) {
			return false;
		} else {
			alunos[i] = a;
		}
		return true;
	}
}

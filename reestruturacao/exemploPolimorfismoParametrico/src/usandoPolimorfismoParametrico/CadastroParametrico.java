package usandoPolimorfismoParametrico;

import java.util.LinkedList;
import java.util.List;

import exemploPolimorfismoParametrico.Aluno;

public class CadastroParametrico {
	
	private List<Aluno> alunos;
	
	public CadastroParametrico() {
		alunos = new LinkedList<Aluno>();
	}
	
	public boolean cadastrarAluno(Aluno a) {
		boolean resposta = alunos.add(a);
		return resposta;
	}
	
	public Aluno pesquisarAluno(int matricula) {
		for (Aluno a: alunos) {
			if (a.getMatricula() == matricula)
				return a;
		}
		return null;
	}
	
	public boolean removerAluno(Aluno a) {
		boolean resposta = false; 
		resposta = alunos.remove(a);
		return resposta; 
	}
	
}











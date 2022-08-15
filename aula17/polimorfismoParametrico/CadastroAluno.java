package polimorfismoParametrico;
import java.util.LinkedList;
import java.util.List;

import modelos.Aluno;

public class CadastroAluno {
	
	private List<Aluno> alunos;
	
	public CadastroAluno() {
		alunos = new LinkedList<Aluno> (); 
	}
	
	public boolean addAluno(Aluno a) {
		return alunos.add(a);
	}
}

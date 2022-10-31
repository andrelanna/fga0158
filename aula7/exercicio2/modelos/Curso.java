package exercicio2.modelos;

public class Curso {
	private Aluno alunos[];
	
	public Curso() {
		alunos = new Aluno[0];
	}

	public void cadastrarAluno(Aluno a) {
		Aluno temp[] = new Aluno[alunos.length + 1];
		for (int i=0; i<alunos.length; i++) {
			temp[i] = alunos[i];
		}
		temp[alunos.length] = a; 
		
		alunos = temp;
	}

	public Object relatorio() {
		String resposta = "RELATORIO DO CURSO \n";
		resposta += "Alunos matriculados: \n\n";
		for (Aluno a : alunos) {
			resposta += a.relatorio();
		}
		return resposta;
	}
}
